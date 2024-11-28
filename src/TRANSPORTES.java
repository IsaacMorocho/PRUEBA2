import java.util.Scanner;
public class TRANSPORTES {
    //Atributos
    private double longitud;
    private String tipo;
    //Constructores
    public TRANSPORTES() {
    }
    public TRANSPORTES(double longitud, String tipo) {
        this.longitud = longitud;
        this.tipo = tipo;
    }
    //Getters
    private double getLongitud() {
        return longitud;
    }
    private String getTipo() {
        return tipo;
    }

    //Setters
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Personalizado
    public void mostrarDatos(){
        System.out.println("Longitud del transporte: " + longitud);
        System.out.println("Tipo de transporte: " + tipo);
    }
    //Para modificar los datos ingresados
    public void cambiarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del transporte: ");
        this.longitud = sc.nextDouble();
        System.out.println("Ingrese el tipo de transporte: ");
        this.tipo=sc.nextLine();
    }
}

