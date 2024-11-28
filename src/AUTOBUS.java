public class AUTOBUS extends Terrestre{
    //Atributos
    int nLlantas;
    String cooperativa;

    //Constructores
    public AUTOBUS() {
    }
    public AUTOBUS(double longitud, String tipo, int nAsientos, String tipoServicio, int nLlantas, String cooperativa) {
        super(longitud, tipo, nAsientos, tipoServicio);
        this.nLlantas = nLlantas;
        this.cooperativa = cooperativa;
    }

    //Getters
    public int getnLlantas() {
        return nLlantas;
    }
    public String getCooperativa() {
        return cooperativa;
    }

    //Setters
    public void setnLlantas(int nLlantas) {
        this.nLlantas = nLlantas;
    }
    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    //Personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de llantas: " + nLlantas);
        System.out.println("Cooperativa a la que pertenece: " + cooperativa);
    }

}
