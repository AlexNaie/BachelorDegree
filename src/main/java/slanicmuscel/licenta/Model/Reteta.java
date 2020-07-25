package slanicmuscel.licenta.Model;

public class Reteta {

    private int idReteta;
    private String retetaNume;

    public Reteta() {
        //bin
    }

    public int getIdReteta() {
        return idReteta;
    }

    public void setIdReteta(int idReteta) {
        this.idReteta = idReteta;
    }

    public String getRetetaNume() {
        return retetaNume;
    }

    public void setRetetaNume(String retetaNume) {
        this.retetaNume = retetaNume;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "idReteta=" + idReteta +
                ", retetaNume='" + retetaNume + '\'' +
                '}';
    }


}
