package slanicmuscel.licenta.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.Model.MateriePrima;
import slanicmuscel.licenta.bazadedate.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/materieprima")
public class MateriePrimaController {
    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<MateriePrima> getAll() throws SQLException {
        return DatabaseClient.getAllMateriePrima();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addMateriePrima(@RequestBody MateriePrima materiePrima) throws SQLException {
        DatabaseClient.insertMateriePrima(materiePrima);
    }
}
