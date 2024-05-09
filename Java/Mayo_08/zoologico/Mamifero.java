package Mayo_08.zoologico;

public class Mamifero {

    private int nivelEnergia = 100; // Darle un valor por defecto

    public Mamifero() {
    }

    public int mostrarEnergia() {
        System.out.println(this.nivelEnergia);
        return this.nivelEnergia;
    }

    /* GETTER Y SETTERS */
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

}
