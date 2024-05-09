package Mayo_08.zoologico;

public class GorilaTest {
    public static void main(String[] args) {

        System.out.println("");
        Gorila carlos = new Gorila();
        carlos.mostrarEnergia();

        carlos.lanzarAlgo();
        carlos.lanzarAlgo();
        carlos.lanzarAlgo();
        carlos.mostrarEnergia();

        
        carlos.comerBananas();
        carlos.comerBananas();
        carlos.mostrarEnergia();
        
        
        carlos.trepar();
        carlos.mostrarEnergia();


    }
}
