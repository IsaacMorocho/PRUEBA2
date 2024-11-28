public class Aereo extends TRANSPORTES{
    //Atributos
    public double altitud;
    public String tipoMotor;

    //Constructores
    public Aereo(){

    }
    public Aereo(double longitud, String tipo, double altitud, String tipoMotor) {
        super(longitud, tipo);
        this.altitud = altitud;
        this.tipoMotor = tipoMotor;
    }
    //Getters
    public double getAltitud() {
        return altitud;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }

    //Setters
    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    //Personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Altitud del transporte aereo: " + altitud);
        System.out.println("Tipo de motor: " + tipoMotor);
    }
}
