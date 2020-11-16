package slanicmuscel.licenta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.models.RetetaCant;
import slanicmuscel.licenta.repository.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/retetacant")
public class RetetaCantController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<RetetaCant> getAll() throws SQLException {
        return DatabaseClient.getAllRetetaCant();
    }
}
