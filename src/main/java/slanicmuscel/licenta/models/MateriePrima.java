package slanicmuscel.licenta.models;


public class MateriePrima {

    private int idMateriePrima;
    private String materiePrimaNume;

    public MateriePrima(){
        //bin
    }


    public int getIdMateriePrima() {
        return idMateriePrima;
    }

    public void setIdMateriePrima(int idMateriePrima) {
        this.idMateriePrima = idMateriePrima;
    }

    public String getMateriePrimaNume() {
        return materiePrimaNume;
    }

    public void setMateriePrimaNume(String materiePrimaNume) {
        this.materiePrimaNume = materiePrimaNume;
    }

    @Override
    public String toString() {
        return "MateriePrima{" +
                "idMateriePrima=" + idMateriePrima +
                ", MateriePrimaNume='" + materiePrimaNume + '\'' +
                '}';
    }

}
