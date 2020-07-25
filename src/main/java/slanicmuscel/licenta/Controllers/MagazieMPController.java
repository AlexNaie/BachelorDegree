package slanicmuscel.licenta.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import slanicmuscel.licenta.Model.MagazieMP;
import slanicmuscel.licenta.bazadedate.DatabaseClient;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/magaziemp")
public class MagazieMPController {

    @Autowired
    private DatabaseClient databaseClient;

    @GetMapping(path = "/all")
    public @ResponseBody
    ArrayList<MagazieMP> getAll() throws SQLException {
        return DatabaseClient.getAllMagazieMP();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addMagazieMP(@RequestBody MagazieMP magazieMP) throws SQLException {
        try {
            DatabaseClient.insertMagazieMp(magazieMP);
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("ID deja folosit");
        }
    }
}