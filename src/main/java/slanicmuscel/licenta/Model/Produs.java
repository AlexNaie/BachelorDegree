package slanicmuscel.licenta.Model;

public class Produs {

    private int idProdus;
    private String produsNume;
    private int produsValabilitateLuni;
    private int produsIdReteta;

    public Produs() {
        //bin
    }

    public int getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(int idProdus) {
        this.idProdus = idProdus;
    }

    public String getProdusNume() {
        return produsNume;
    }

    public void setProdusNume(String produsNume) {
        this.produsNume = produsNume;
    }

    public int getProdusValabilitateLuni() {
        return produsValabilitateLuni;
    }

    public void setProdusValabilitateLuni(int produsValabilitateLuni) {
        this.produsValabilitateLuni = produsValabilitateLuni;
    }

    public int getProdusIdReteta() {
        return produsIdReteta;
    }

    public void setProdusIdReteta(int produsIdReteta) {
        this.produsIdReteta = produsIdReteta;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "idProdus=" + idProdus +
                ", produsNume='" + produsNume + '\'' +
                ", produsValabilitateLuni=" + produsValabilitateLuni +
                ", produsIdReteta=" + produsIdReteta +
                '}';
    }
}
