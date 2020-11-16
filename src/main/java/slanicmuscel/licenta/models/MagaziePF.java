package slanicmuscel.licenta.models;

import java.sql.Date;

public class MagaziePF {

    private int idMagaziePF;
    private Date magaziePFDataProd;
    private int magaziePFIdLot;
    private int magaziePFIdProdus;
    private int magaziePFIdReteta;

    public MagaziePF() {
        //bin
    }

    public int getIdMagaziePF() {
        return idMagaziePF;
    }

    public void setIdMagaziePF(int idMagaziePF) {
        this.idMagaziePF = idMagaziePF;
    }

    public Date getMagaziePFDataProd() {
        return magaziePFDataProd;
    }

    public void setMagaziePFDataProd(Date magaziePFDataProd) {
        this.magaziePFDataProd = magaziePFDataProd;
    }

    public int getMagaziePFIdLot() {
        return magaziePFIdLot;
    }

    public void setMagaziePFIdLot(int magaziePFIdLot) {
        this.magaziePFIdLot = magaziePFIdLot;
    }

    public int getMagaziePFIdProdus() {
        return magaziePFIdProdus;
    }

    public void setMagaziePFIdProdus(int magaziePFIdProdus) {
        this.magaziePFIdProdus = magaziePFIdProdus;
    }

    public int getMagaziePFIdReteta() {
        return magaziePFIdReteta;
    }

    public void setMagaziePFIdReteta(int magaziePFIdReteta) {
        this.magaziePFIdReteta = magaziePFIdReteta;
    }

    @Override
    public String toString() {
        return "MagaziePF{" +
                "idMagaziePF=" + idMagaziePF +
                ", magaziePFDataProd=" + magaziePFDataProd +
                ", magaziePFIdLot=" + magaziePFIdLot +
                ", magaziePFIdProdus=" + magaziePFIdProdus +
                ", magaziePFIdReteta=" + magaziePFIdReteta +
                '}';
    }
}
