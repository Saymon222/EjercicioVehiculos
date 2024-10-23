//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Ford", "fiesta", "Gasolina");
        Camion camion = new Camion("Mercedes-Benz", "AMG A35", "Diesel");
        Moto moto = new Moto("Yamaha", "MT-09", "Gasolina");
        carroElectrico carroElectrico = new carroElectrico("Tesla", "Model X", "Electrico", 100);

        System.out.println("\n--- Información de Vehículos ---\n");

        carro.mostrarInfo();
        carro.encender();
        carro.abastecerCombustible();
        carro.apagar();

        System.out.println("--------------------------------");

        camion.mostrarInfo();
        camion.encender();
        camion.abastecerCombustible();
        camion.apagar();

        System.out.println("---------------------------------");

        moto.mostrarInfo();
        moto.encender();
        moto.abastecerCombustible();
        moto.apagar();

        System.out.println("-----------------------------------");

        carroElectrico.mostrarInfo();
        carroElectrico.encender();
        System.out.println("--------------------------------------");
        carroElectrico.cargarBateria();
        carroElectrico.mostrarInfo();
        carroElectrico.apagar();
    }
}


