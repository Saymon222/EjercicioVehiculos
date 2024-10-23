public class Carro extends Vehiculo{

    public Carro() {
    }

    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    public void encender(){
        System.out.println("Carro encendido");
    }
    public void apagar(){
        System.out.println("Carro apagado");
    }

    public void mostrarInfo(){
        System.out.println("Carro - Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
}
}
