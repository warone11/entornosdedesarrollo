public class productoDigital extends producto {
    private Double tamanyoDescarga;
    private Double licencia;
    public productoDigital(String nombre, Double precio, Double tamanyoDescarga, Double licencia) {
        super(nombre,precio);
        this.tamanyoDescarga=tamanyoDescarga;
        this.licencia=licencia;
    }
    public Double getTamanyoDescarga() {
        return tamanyoDescarga;
    }
    public void setTamanyoDescarga(Double tamanyoDescarga) {
        this.tamanyoDescarga=tamanyoDescarga;
    }
    public Double getLicencia() {
        return licencia;
    }
    public void setLicencia(Double licencia) {
        this.licencia=licencia;
    }
    @Override
    public Double calcularPrecioFinal() {
        return this.getPrecio()+this.licencia;
    }
}
