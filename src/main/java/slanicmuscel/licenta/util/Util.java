package slanicmuscel.licenta.util;

public class Util {
    Integer idMateriePrima;
    Integer idRetetaUnitMas;
    Integer idRetetaCant;
    Integer lotCantitate;
    Integer resCantitate;
    Integer idReteta;
    Integer idProdus;

    public Util() {
        //bin
    }

    public Integer getResCantitate() {
        return resCantitate;
    }

    public void setResCantitate(Integer resCantitate) {
        this.resCantitate = resCantitate;
    }

    public Integer getIdMateriePrima() {
        return idMateriePrima;
    }

    public void setIdMateriePrima(Integer idMateriePrima) {
        this.idMateriePrima = idMateriePrima;
    }

    public Integer getIdRetetaUnitMas() {
        return idRetetaUnitMas;
    }

    public void setIdRetetaUnitMas(Integer idRetetaUnitMas) {
        this.idRetetaUnitMas = idRetetaUnitMas;
    }

    public Integer getIdRetetaCant() {
        return idRetetaCant;
    }

    public void setIdRetetaCant(Integer idRetetaCant) {
        this.idRetetaCant = idRetetaCant;
    }

    public Integer getLotCantitate() {
        return lotCantitate;
    }

    public void setLotCantitate(Integer lotCantitate) {
        this.lotCantitate = lotCantitate;
    }

    public Integer getIdReteta() {
        return idReteta;
    }

    public void setIdReteta(Integer idReteta) {
        this.idReteta = idReteta;
    }

    public Integer getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(Integer idProdus) {
        this.idProdus = idProdus;
    }

    @Override
    public String toString() {
        return "Util{" +
                "idMateriePrima=" + idMateriePrima +
                ", idRetetaUnitMas=" + idRetetaUnitMas +
                ", idRetetaCant=" + idRetetaCant +
                ", lotCantitate=" + lotCantitate +
                ", resCantitate=" + resCantitate +
                ", idReteta=" + idReteta +
                ", idProdus=" + idProdus +
                '}';
    }
}
