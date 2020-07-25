package slanicmuscel.licenta.Model;

import java.io.Serializable;

public class RetetaCant implements Serializable {

    private int idRetetaCant;
    private int retetaCantCantitate;

    public RetetaCant() {
        ///bin
    }

    public int getIdRetetaCant() {
        return idRetetaCant;
    }

    public void setIdRetetaCant(int idRetetaCant) {
        this.idRetetaCant = idRetetaCant;
    }

    public int getRetetaCantCantitate() {
        return retetaCantCantitate;
    }

    public void setRetetaCantCantitate(int retetaCantCantitate) {
        this.retetaCantCantitate = retetaCantCantitate;
    }


    @Override
    public String toString() {
        return "RetetaCant{" +
                "idRetetaCant=" + idRetetaCant +
                ", RetetaCantCantitate=" + retetaCantCantitate +
                '}';
    }
}
