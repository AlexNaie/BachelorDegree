package slanicmuscel.licenta.model;

import java.sql.Date;

public class MagazieMP {

    private int idMagazieMP;
    private String magazieMPUnitMas;
    private java.sql.Date magazieMPDataAchiz;
    private String magazieMPFurnizor;
    private int magazieMPDocAchiz;
    private int magazieMPIdMateriePrima; //fk
    private String magazieMPUtilizat;
    private int magazieMPCant;


    public MagazieMP() {
        //bin
    }

    public int getIdMagazieMP() {
        return idMagazieMP;
    }

    public void setIdMagazieMP(int idMagazieMP) {
        this.idMagazieMP = idMagazieMP;
    }

    public int getMagazieMPDocAchiz() {
        return magazieMPDocAchiz;
    }

    public void setMagazieMPDocAchiz(int magazieMPDocAchiz) {
        this.magazieMPDocAchiz = magazieMPDocAchiz;
    }

    public String getMagazieMPUnitMas() {
        return magazieMPUnitMas;
    }

    public void setMagazieMPUnitMas(String magazieMPUnitMas) {
        this.magazieMPUnitMas = magazieMPUnitMas;
    }

    public Date getMagazieMPDataAchiz() {
        return magazieMPDataAchiz;
    }

    public void setMagazieMPDataAchiz(Date magazieMPDataAchiz) {
        this.magazieMPDataAchiz = magazieMPDataAchiz;
    }

    public String getMagazieMPFurnizor() {
        return magazieMPFurnizor;
    }

    public void setMagazieMPFurnizor(String magazieMPFurnizor) {
        this.magazieMPFurnizor = magazieMPFurnizor;
    }

    public int getMagazieMPIdMateriePrima() {
        return magazieMPIdMateriePrima;
    }

    public void setMagazieMPIdMateriePrima(int magazieMPIdMateriePrima) {
        this.magazieMPIdMateriePrima = magazieMPIdMateriePrima;
    }

    public String getMagazieMPUtilizat() {
        return magazieMPUtilizat;
    }

    public void setMagazieMPUtilizat(String magazieMPUtilizat) {
        this.magazieMPUtilizat = magazieMPUtilizat;
    }

    public int getMagazieMPCant() {
        return magazieMPCant;
    }

    public void setMagazieMPCant(int magazieMPCant) {
        this.magazieMPCant = magazieMPCant;
    }

    @Override
    public String toString() {
        return "MagazieMP{" +
                "idMagazieMP=" + idMagazieMP +
                ", magazieMPUnitMas='" + magazieMPUnitMas + '\'' +
                ", magazieMPDataAchiz=" + magazieMPDataAchiz +
                ", magazieMPFurnizor='" + magazieMPFurnizor + '\'' +
                ", magazieMPDocAchiz=" + magazieMPDocAchiz +
                ", magazieMPIdMateriePrima=" + magazieMPIdMateriePrima +
                ", magazieMPUtilizat='" + magazieMPUtilizat + '\'' +
                ", magazieMPCant=" + magazieMPCant +
                '}';
    }
}
