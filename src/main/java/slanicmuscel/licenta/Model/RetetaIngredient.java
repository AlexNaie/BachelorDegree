package slanicmuscel.licenta.Model;

public class RetetaIngredient {
    private int idRetetaIngredient;
    private int retetaIngredientIdRetetaCant;
    private int retetaIngredientIdRetetaUnitMas;
    private int retetaIngredientIdMateriePrima;
    private int retetaIngredientIdReteta;

    public RetetaIngredient() {
        //bin
    }

    public int getIdRetetaIngredient() {
        return idRetetaIngredient;
    }

    public void setIdRetetaIngredient(int idRetetaIngredient) {
        this.idRetetaIngredient = idRetetaIngredient;
    }

    public int getRetetaIngredientIdRetetaCant() {
        return retetaIngredientIdRetetaCant;
    }

    public void setRetetaIngredientIdRetetaCant(int retetaIngredientIdRetetaCant) {
        this.retetaIngredientIdRetetaCant = retetaIngredientIdRetetaCant;
    }

    public int getRetetaIngredientIdRetetaUnitMas() {
        return retetaIngredientIdRetetaUnitMas;
    }

    public void setRetetaIngredientIdRetetaUnitMas(int retetaIngredientIdRetetaUnitMas) {
        this.retetaIngredientIdRetetaUnitMas = retetaIngredientIdRetetaUnitMas;
    }

    public int getRetetaIngredientIdMateriePrima() {
        return retetaIngredientIdMateriePrima;
    }

    public void setRetetaIngredientIdMateriePrima(int retetaIngredientIdMateriePrima) {
        this.retetaIngredientIdMateriePrima = retetaIngredientIdMateriePrima;
    }

    public int getRetetaIngredientIdReteta() {
        return retetaIngredientIdReteta;
    }

    public void setRetetaIngredientIdReteta(int retetaIngredientIdReteta) {
        this.retetaIngredientIdReteta = retetaIngredientIdReteta;
    }

    @Override
    public String toString() {
        return "RetetaIngredient{" +
                "idRetetaIngredient=" + idRetetaIngredient +
                ", retetaIngredientIdRetetaCant=" + retetaIngredientIdRetetaCant +
                ", retetaIngredientIdRetetaUnitMas=" + retetaIngredientIdRetetaUnitMas +
                ", retetaIngredientIdMateriePrima=" + retetaIngredientIdMateriePrima +
                ", retetaIngredientIdReteta=" + retetaIngredientIdReteta +
                '}';
    }
}
