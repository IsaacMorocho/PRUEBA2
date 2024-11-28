public class Terrestre extends TRANSPORTES{
    //Atributos
    int nAsientos;
    String tipoServicio;
    //Constructores
    public Terrestre() {
    }
    public Terrestre(double longitud, String tipo, int nAsientos, String tipoServicio) {
        super(longitud, tipo);
        this.nAsientos = nAsientos;
        this.tipoServicio = tipoServicio;
    }

    //Getters
    public int getnAsientos() {
        return nAsientos;
    }
    public String gettipoServicio() {
        return tipoServicio;
    }

    //Setters
    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    //Personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de asientos de asientos: " + nAsientos);
        System.out.println("Servicio del transporte: " + tipoServicio);

    }
}
