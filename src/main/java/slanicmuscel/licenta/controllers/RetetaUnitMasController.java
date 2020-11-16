package slanicmuscel.licenta.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.models.RetetaUnitMas;
import slanicmuscel.licenta.repository.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/retetaum")
public class RetetaUnitMasController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<RetetaUnitMas> getAll() throws SQLException {

        return DatabaseClient.getAllRetetaUnitMas();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addRetetaUnitMas(@RequestBody RetetaUnitMas retetaUnitMas) throws SQLException {
        DatabaseClient.insertRetetaUnitMas(retetaUnitMas);
    }
}
