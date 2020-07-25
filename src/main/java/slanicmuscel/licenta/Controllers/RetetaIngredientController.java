package slanicmuscel.licenta.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.Model.RetetaIngredient;
import slanicmuscel.licenta.bazadedate.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/retetaingredient")
public class RetetaIngredientController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<RetetaIngredient> getAll() throws SQLException {
        return DatabaseClient.getAllRetetaIngredient();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addRetetaIngredient(@RequestBody RetetaIngredient retetaIngredient) throws SQLException {
        DatabaseClient.insertRetetaIngredient(retetaIngredient);
    }
}
