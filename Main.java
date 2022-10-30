public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Kevin";
        cliente.edad = 30;
        cliente.teléfono = 30434834;
        cliente.crédito = 240.210;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi teléfono es " + cliente.teléfono
                + " y mi crédito disponible es " + cliente.crédito + "€");

        trabajador.nombre = "Jose";
        trabajador.edad = 30;
        trabajador.teléfono = 30433590;
        trabajador.salario = 2000.32;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi teléfono es " + trabajador.teléfono
                + " y mi salario es de " + trabajador.salario + "€");

    }
}

class Persona{
    int edad;
    int teléfono;
    String nombre;
}

class Cliente extends Persona{
    double crédito;
}

class Trabajador extends Persona {
    double salario;
}
