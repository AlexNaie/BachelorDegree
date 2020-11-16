package slanicmuscel.licenta.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.models.*;
import slanicmuscel.licenta.utils.Util;
import slanicmuscel.licenta.repository.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(path = "/lot")

public class LotController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<Lot> getAll() throws SQLException {
        return DatabaseClient.getAllLot();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addLot(@RequestBody Lot lot) throws SQLException {
        int lotIdReteta = lot.getLotIdReteta();
        ArrayList<Reteta> ListaRetete = DatabaseClient.getAllReteta();
        Reteta reteta = null;
        for(Reteta r: ListaRetete) {
            if(r.getIdReteta() == lotIdReteta){
                reteta = r;
            }
        }
        ArrayList<RetetaIngredient> ListaIngrediente = DatabaseClient.getAllRetetaIngredient();
        ArrayList<RetetaIngredient> ListaIngredienteNecesare = new ArrayList<>();
        for(RetetaIngredient ri: ListaIngrediente)  {
            if(ri.getRetetaIngredientIdReteta() == reteta.getIdReteta()){
                ListaIngredienteNecesare.add(ri);
            }
        }

        ArrayList<Util> utilList = new ArrayList<>();
        for(RetetaIngredient r: ListaIngredienteNecesare){

            Util utilex = new Util();
            utilex.setIdMateriePrima(r.getRetetaIngredientIdMateriePrima());
            utilex.setIdRetetaCant(r.getRetetaIngredientIdRetetaCant());
            utilex.setIdRetetaUnitMas(r.getRetetaIngredientIdRetetaUnitMas());
            utilex.setLotCantitate(lot.getLotCantitate());
            utilex.setResCantitate(r.getRetetaIngredientIdRetetaCant() * lot.getLotCantitate());
            utilex.setIdProdus(lot.getLotIdProdus());
            utilex.setIdReteta(lot.getLotIdReteta());

            utilList.add(utilex);
        }

        Map<Integer, ArrayList<MagazieMP>> hashMap = new HashMap<>();

        utilList.forEach((util -> {
            ArrayList<MagazieMP> matPR = new ArrayList<>();

            try {
                matPR = DatabaseClient.getUpdateUtilizat(util.getResCantitate()/100, util.getIdMateriePrima());
                hashMap.put(util.getIdMateriePrima(), matPR);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }));

        DatabaseClient.insertLot(lot);
    }
}
