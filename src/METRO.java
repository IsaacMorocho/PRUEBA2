public class METRO extends Subterraneo{
    //Atributos
    int nEstaciones;
    int nPuertas;

    //Constructores
    public METRO(){
    }

    public METRO(double longitud, String tipo, double distanciaRecorrida, String formaPago, int nEstaciones, int nPuertas) {
        super(longitud, tipo, distanciaRecorrida, formaPago);
        this.nEstaciones = nEstaciones;
        this.nPuertas = nPuertas;
    }

    //Getter

    public int getnEstaciones() {
        return nEstaciones;
    }
    public int getnPuertas() {
        return nPuertas;
    }

    //Setter
    public void setnEstaciones(int nEstaciones) {
        this.nEstaciones = nEstaciones;
    }
    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    //Personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de Estaciones: " + nEstaciones);
        System.out.println("Numero de puertas: " + nPuertas);
    }
}
