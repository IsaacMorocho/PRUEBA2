public class Subterraneo extends TRANSPORTES{
    //Atributos
    double distanciaRecorrida;
    String formaPago;

    //Constructores
    public Subterraneo(){
    }
    public Subterraneo(double longitud, String tipo, double distanciaRecorrida, String formaPago) {
        super(longitud, tipo);
        this.distanciaRecorrida = distanciaRecorrida;
        this.formaPago = formaPago;
    }

    //Getters
    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    public String getFormaPago() {
        return formaPago;
    }

    //Setters
    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    //Personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Distancia recorrida del transporte: " + distanciaRecorrida);
        System.out.println("Forma de pago: " + formaPago);
    }
}
