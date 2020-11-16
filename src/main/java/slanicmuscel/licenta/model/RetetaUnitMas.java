package slanicmuscel.licenta.model;

import java.io.Serializable;

public class RetetaUnitMas implements Serializable {

    private int idRetetaUnitMas;
    private String retetaUnitMasUnitate;

    public RetetaUnitMas() {
        //bin
    }

    public int getIdRetetaUnitMas() {
        return idRetetaUnitMas;
    }

    public void setIdRetetaUnitMas(int idRetetaUnitMas) {
        this.idRetetaUnitMas = idRetetaUnitMas;
    }

    public String getRetetaUnitMasUnitate() {
        return retetaUnitMasUnitate;
    }

    public void setRetetaUnitMasUnitate(String retetaUnitMasUnitate) {
        this.retetaUnitMasUnitate = retetaUnitMasUnitate;
    }

    @Override
    public String toString() {
        return "RetetaUnitMas{" +
                "idRetetaUnitMas=" + idRetetaUnitMas +
                ", RetetaUnitMasUnitate='" + retetaUnitMasUnitate + '\'' +
                '}';
    }
}
