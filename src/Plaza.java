public class Plaza {
    private int idPlaza;
    private Vuelo vuelo;
    private categoria Categoria;
    private int numeroPlazas;
    private double tarifa;

    public Plaza(int idPlaza, Vuelo vuelo, categoria categoria, int numeroPlazas, double tarifa) {
        this.idPlaza = idPlaza;
        this.vuelo = vuelo;
        Categoria = categoria;
        this.numeroPlazas = numeroPlazas;
        this.tarifa = tarifa;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(categoria categoria) {
        Categoria = categoria;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
