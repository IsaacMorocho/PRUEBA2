import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables locales para luego aplicar los setters
        double longitud;
        System.out.println("Ingrese la longitud del transporte");
        longitud = sc.nextDouble();
        String tipo;
        System.out.println("Ingrese el tipo del transporte");
        tipo = sc.nextLine();

        //***** CLASE TRANSPORTES *****
        System.out.println("***** NUEVOS VALORES TRANSPORTE *****");
        TRANSPORTES transporte1 = new TRANSPORTES(longitud, tipo);
        transporte1.cambiarDatos();
        transporte1.mostrarDatos();

        //***** CLASE AEREO *****
        System.out.println("***** NUEVOS VALORES AEREO *****");
        Aereo aereo1= new Aereo(40,"Aereo",50,"Diesel");
        aereo1.cambiarDatos();
        aereo1.mostrarDatos();

        //***** CLASE AVION ****
        System.out.println("***** NUEVOS VALORES AVION *****");
        AVION avion= new AVION(130.2,"Aereo",8000,"Gasolina",120,"Latam Airlines");
        avion.cambiarDatos();
        avion.mostrarDatos();

        //***** CLASE TERRESTRE ******
        System.out.println("***** NUEVOS VALORES TERRESTRE *****");
        Terrestre terrestre1=new Terrestre(24.4,"Terrestre",40,"Escolar");
        terrestre1.cambiarDatos();
        terrestre1.mostrarDatos();

        //***** CLASE AUTOBUS
        System.out.println("***** NUEVOS VALORES AUTOBUS *****");
        AUTOBUS autobus1=new AUTOBUS(32,"Terrestre",32,"Viajes",6,"Reino de Quito");
        autobus1.cambiarDatos();
        autobus1.mostrarDatos();

        //***** CLASE SUBTERRANEO
        System.out.println("***** NUEVOS VALORES SUBTERRANEO *****");
        Subterraneo subterraneo1=new Subterraneo(256.4,"Subterraneo",530.4,"Tarjeta");
        subterraneo1.cambiarDatos();
        subterraneo1.mostrarDatos();

        //***** CLASE METRO *****
        System.out.println("***** NUEVOS VALORES METRO *****");
        METRO metro1=new METRO(86,"Subterraneo privado",450.2,"Efectivo",12,25);
        metro1.cambiarDatos();
        metro1.mostrarDatos();

        //***** CLASE PERSONAL
        System.out.println("***** NUEVOS VALORES TRANSPORTE PERSONAL *****");
        Personal personal1=new Personal(2.5,"Transporte personal",1002.4,850);
        personal1.cambiarDatos();
        personal1.mostrarDatos();

        //**** CLASE MOTOCICLETA
        System.out.println("***** NUEVOS VALORES MOTOCICLETA *****");
        MOTOCICLETA motocicleta1=new MOTOCICLETA(2.4,"Uber",1005.24,1200,"ABC-156","Tundra XM");
        motocicleta1.cambiarDatos();
        motocicleta1.mostrarDatos();
    }
}