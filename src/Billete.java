import java.util.Date;
import java.util.List;

public class Billete {
    private int idBillete;
    private Date fechaEmision;
    private double precioTotal;
    private Cliente cliente;
    private Ciudad origen;
    private Ciudad destino;
    private categoria Categoria;
    private List<Vuelo> vuelos;

    public Billete(int idBillete, Date fechaEmision, double precioTotal, Cliente cliente, Ciudad origen, Ciudad destino, categoria categoria, List<Vuelo> vuelos) {
        this.idBillete = idBillete;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.origen = origen;
        this.destino = destino;
        Categoria = categoria;
        this.vuelos = vuelos;
    }

    public int getIdBillete() {
        return idBillete;
    }

    public void setIdBillete(int idBillete) {
        this.idBillete = idBillete;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(categoria categoria) {
        Categoria = categoria;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
