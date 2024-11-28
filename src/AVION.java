public class AVION extends Aereo{
    //Atributos
    int capacidadPasajeros;
    String Aerolinea;

    //Constructores
    public AVION() {
    }

    public AVION(double longitud, String tipo, double altitud, String tipoMotor, int capacidadPasajeros, String aerolinea) {
        super(longitud, tipo, altitud, tipoMotor);
        this.capacidadPasajeros = capacidadPasajeros;
        Aerolinea = aerolinea;
    }

    //Getters
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    public String getAerolinea() {
        return Aerolinea;
    }

    //Setters
    private void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    private void setAerolinea(String aerolinea) {
        Aerolinea = aerolinea;
    }
    //Personalizado
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Aerolinea: " + Aerolinea);
    }

}
