public class Moto extends Vehiculo{

    public Moto() {
    }

    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }
    public void encender(){
        System.out.println("Moto encendida");
    }
    public void apagar(){
        System.out.println("Moto apagada");
    }

    public void mostrarInfo(){
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }
}

