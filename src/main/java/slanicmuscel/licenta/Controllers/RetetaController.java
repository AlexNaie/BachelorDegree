package slanicmuscel.licenta.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.Model.Reteta;
import slanicmuscel.licenta.bazadedate.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/reteta")
public class RetetaController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<Reteta> getAll() throws SQLException {
        return DatabaseClient.getAllReteta();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addReteta(@RequestBody Reteta reteta) throws SQLException {
        DatabaseClient.insertReteta(reteta);
    }
}
