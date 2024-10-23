public class Camion extends Vehiculo{

    public Camion() {
    }

    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }
    public void encender(){
        System.out.println("Camion encendido");
    }
    public void apagar(){
        System.out.println("Camion apagado");
    }

    public void mostrarInfo(){
        System.out.println("Camión - Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }
}


