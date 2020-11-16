package slanicmuscel.licenta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        return "index";
    }

//Meniu---------------------------------------------------------------------------------
    @RequestMapping("/meniu/administrator")
    public String meniuadmin(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administator");
        return "meniuadmin";
    }
    @RequestMapping("/meniu/depeconomic")
    public String meniuaeconomic(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        return "meniueconomic";
    }
    @RequestMapping("/meniu/depproductie")
    public String meniuproductie(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul de productie");
        return "meniuproductie";
    }
    @RequestMapping("/meniu/depcomercial")
    public String meniucomercial(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        return "meniucomercial";
    }
//Magazie MP-----------------------------------------------------------------------------
    @RequestMapping("ad/magaziemp")
    public String magaziempAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administator");
        model.addAttribute("dep", "administrator");
        model.addAttribute("id", "ad");
        return "magaziemp";
    }
    @RequestMapping("/ec/magaziemp")
    public String magaziempEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("dep", "depeconomic");
        model.addAttribute("id", "ec");
        return "magaziemp";
    }
    @RequestMapping("/co/magaziemp")
    public String magaziempCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("dep", "depcomercial");
        model.addAttribute("id", "co");
        return "magaziemp";
    }

    // Magazie MP adaugare =====================================================

    @RequestMapping("/ad/magaziemp/adauga")
    public String magaziempaddAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administator");
        model.addAttribute("id", "ad");
        return "magaziempadd";
    }
    @RequestMapping("/ec/magaziemp/adauga")
    public String magaziempaddEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("id", "ec");
        return "magaziempadd";
    }
    @RequestMapping("/co/magaziemp/adauga")
    public String magaziempaddCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("id", "co");
        return "magaziempadd";
    }
    //materii prime ========================================================================================
    @RequestMapping("/ad/materiiprime")
    public String materieprimaAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administator");
        model.addAttribute("dep", "administrator");
        model.addAttribute("id", "ad");
        return "materieprima";
    }
    @RequestMapping("/ec/materiiprime")
    public String materieprimaEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("dep", "depeconomic");
        model.addAttribute("id", "ec");
        return "materieprima";
    }
    @RequestMapping("/co/materiiprime")
    public String materieprimaCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("dep", "depcomercial");
        model.addAttribute("id", "co");
        return "materieprima";
    }
//Materii prime adaugare==========================================================================================
    @RequestMapping("/ad/materiiprime/adauga")
    public String materieprimaaddAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administator");
        model.addAttribute("dep", "administrator");
        model.addAttribute("id", "ad");
        return "materieprimaadd";
    }

    @RequestMapping("/ec/materiiprime/adauga")
    public String materieprimaaddEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("dep", "depeconomic");
        model.addAttribute("id", "ec");
        return "materieprimaadd";
    }

    @RequestMapping("/co/materiiprime/adauga")
    public String materieprimaaddCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("dep", "depcomercial");
        model.addAttribute("id", "co");
        return "materieprimaadd";
    }

    //Magazie PF======================================================

    @RequestMapping("/ad/magaziepf")
    public String magaziepfAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administator");
        model.addAttribute("dep", "administrator");
        model.addAttribute("id", "ad");
        return "magaziepf";
    }
    @RequestMapping("/ec/magaziepf")
    public String magaziepfEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("dep", "depeconomic");
        model.addAttribute("id", "ec");
        return "magaziepf";
    }
    @RequestMapping("/co/magaziepf")
    public String magaziepfCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("dep", "depcomercial");
        model.addAttribute("id", "co");
        return "magaziepf";
    }

    // Lot ====================================================

    @RequestMapping("/ad/lot")
    public String lotAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administrator");
        model.addAttribute("id", "ad");
        return "lot";
    }
    @RequestMapping("/ec/lot")
    public String lotEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("id", "ec");
        return "lot";
    }
    @RequestMapping("/co/lot")
    public String lotCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("id", "co");
        return "lot";
    }
    @RequestMapping("/pr/lot")
    public String lotPR(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul de productie");
        model.addAttribute("id", "pr");
        return "lot";
    }
    // Proces Lot -> MagaziePF

    @RequestMapping("/lot/adauga")
    public String lotadd(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administrator");
        return "lotadd";
    }

    //Verificare mp

    @RequestMapping("/pr/verificaremp")
    public String verificareMPPR(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul de productie");
        model.addAttribute("id", "pr");
        return "verificaremp";
    }

    //Proces fabricare

    @RequestMapping("/pr/procesfabricare")
    public String procesFabricarePR(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul de productie");
        model.addAttribute("id", "pr");
        return "procesfabricare";
    }

    //Verificare pf
    @RequestMapping("/pr/verificarepf")
    public String verificarePFPR(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul de productie");
        model.addAttribute("id", "pr");
        return "verificarepf";
    }

    //Adaugare produse finite
    @RequestMapping("/pr/magaziepf/adauga")
    public String magaziePFAddPR(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul de productie");
        model.addAttribute("id", "pr");
        return "magaziepfadd";
    }

    //Produse
    @RequestMapping("/ad/produs")
    public String produsAD(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Administrator");
        model.addAttribute("id", "ad");
        return "produs";
    }
    @RequestMapping("/ec/produs")
    public String produsEC(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul economic");
        model.addAttribute("id", "ec");
        return "produs";
    }
    @RequestMapping("/co/produs")
    public String produsCO(Model model) {
        model.addAttribute("data", new Date());
        model.addAttribute("user", "Departamentul comercial");
        model.addAttribute("id", "co");
        return "produs";
    }
}
