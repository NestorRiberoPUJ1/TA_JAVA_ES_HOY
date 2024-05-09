package Mayo_08.zoologico;

public class MurcielagoTest {
    public static void main(String[] args) {

        Murcielago copito = new Murcielago();

        copito.atacarPueblo();
        copito.atacarPueblo();
        copito.atacarPueblo();
        copito.mostrarEnergia();
        
        copito.comerHumanos();
        copito.comerHumanos();
        copito.mostrarEnergia();
        
        copito.volar();
        copito.volar();
        copito.mostrarEnergia();

    }
}
