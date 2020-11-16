package slanicmuscel.licenta.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.model.Produs;
import slanicmuscel.licenta.repository.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/produs")
public class ProdusController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<Produs> getAll() throws SQLException {
        return DatabaseClient.getAllProdus();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addRetetaUnitMas(@RequestBody Produs produs) throws SQLException {
        DatabaseClient.insertProdus(produs);
    }
}
