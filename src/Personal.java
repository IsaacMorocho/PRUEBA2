public class Personal extends TRANSPORTES{
    //Atributos
    double kilometraje;
    double precio;

    //Constructores
    public Personal(){
    }
    public Personal(double longitud, String tipo,double kilometraje, double precio) {
        super(longitud, tipo);
        this.kilometraje = kilometraje;
        this.precio = precio;
    }

    //Getters
    public double getKilometraje() {
        return kilometraje;
    }
    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Precio: " + precio);
    }
}
