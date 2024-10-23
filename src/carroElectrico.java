public class carroElectrico extends Vehiculo implements vehiculoElectrico{

    protected int bateria;


    public carroElectrico(int bateria) {
        this.bateria = bateria;
    }

    public carroElectrico(String marca, String modelo, String combustible, int bateria) {
        super(marca, modelo, combustible);
        this.bateria = bateria;
    }


    @Override
    public void cargarBateria() {
        bateria=100;
        System.out.println(" Cargando bateria del carro electrico..... ");
    }

    @Override
    public int nivelBateria() {
        return bateria;
    }

    public void mostrarInfo(){
        System.out.println("Carro Eléctrico - Marca: " + marca + ", Modelo: " + modelo);
        System.out.println("Nivel de batería: " + nivelBateria() + "%");
    }
    public void encender() {
        if (bateria > 0) {
            System.out.println("Carro electrico Encendido");
        } else {
            System.out.println("La batería está descargada, no se puede encender.");
        }
    }
    public void apagar () {
        System.out.println("Carro electrico apagago");

    }
    }

