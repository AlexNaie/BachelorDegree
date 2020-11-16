package slanicmuscel.licenta.models;


public class Lot {

    private int idLot;
    private int lotCantitate;
    private int lotIdProdus;
    private int lotIdReteta;

    public Lot() {}

    public int getIdLot() {
        return idLot;
    }

    public void setIdLot(int idLot) {
        this.idLot = idLot;
    }

    public int getLotCantitate() {
        return lotCantitate;
    }

    public void setLotCantitate(int lotCantitate) {
        this.lotCantitate = lotCantitate;
    }

    public int getLotIdProdus() {
        return lotIdProdus;
    }

    public void setLotIdProdus(int lotIdProdus) {
        this.lotIdProdus = lotIdProdus;
    }

    public int getLotIdReteta() {
        return lotIdReteta;
    }

    public void setLotIdReteta(int lotIdReteta) {
        this.lotIdReteta = lotIdReteta;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "idLot=" + idLot +
                ", lotCantitate=" + lotCantitate +
                ", lotIdProdus=" + lotIdProdus +
                ", lotIdReteta=" + lotIdReteta +
                '}';
    }
}
