public class MOTOCICLETA extends Personal{
    //Atributos
    String placa;
    String modelo;

    //Constructores
    public MOTOCICLETA(){
    }
    public MOTOCICLETA(double longitud, String tipo, double kilometraje, double precio, String placa, String modelo) {
        super(longitud, tipo, kilometraje, precio);
        this.placa = placa;
        this.modelo = modelo;
    }

    //Getters

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }

    //Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Placa de la moto: " + placa);
        System.out.println("Modelo de la moto: " + modelo);
    }
}
