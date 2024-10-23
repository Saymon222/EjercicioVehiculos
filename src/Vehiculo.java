abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String combustible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    abstract void encender();
    abstract void apagar();
    abstract void mostrarInfo();

    public void abastecerCombustible(){
        System.out.println("Abasteciendo combustible " + combustible);;
    }


}
