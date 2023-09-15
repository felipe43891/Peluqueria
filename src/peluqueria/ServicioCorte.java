package peluqueria;

/**
 *
 * @author Lenovo
 */
public class ServicioCorte {

    protected int cantidad;
    protected double precioUnitario;

    public ServicioCorte(int cantidad, double precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularCostoTotal() {
        return cantidad * precioUnitario;
    }
}
