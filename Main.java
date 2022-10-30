public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        System.out.println(cliente.getEdad());
        cliente.setNombre("Kevin");
        System.out.println(cliente.getNombre());
        cliente.setTeléfono(30434834);
        System.out.println(cliente.getTeléfono());
        cliente.setCrédito("Vehiculo");
        System.out.println(cliente.getCrédito());
    }

    class Persona {
        int edad;
        String nombre;
        int teléfono;
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getTeléfono() {
            return teléfono;
        }
        public void setTeléfono(int teléfono) {
            this.teléfono = teléfono;
        }
    }


    class Cliente extends Persona {
        String crédito;
        public String getCrédito() {
            return crédito;
        }
        public void setCrédito(String crédito) {
            this.crédito = crédito;
        }
    }

    class Trabajador extends Persona {
        int salario;
    }

}