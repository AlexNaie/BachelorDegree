package slanicmuscel.licenta.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.Model.MagaziePF;
import slanicmuscel.licenta.bazadedate.DatabaseClient;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/magaziepf")
public class MagaziePFController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody ArrayList<MagaziePF> getAll() throws SQLException {
        return DatabaseClient.getAllMagaziePF();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addMagaziePF(@RequestBody MagaziePF magaziePF) throws SQLException {
        DatabaseClient.insertMagaziePF(magaziePF);
    }
}
