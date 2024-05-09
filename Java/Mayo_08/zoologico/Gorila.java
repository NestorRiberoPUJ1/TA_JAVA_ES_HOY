package Mayo_08.zoologico;

public class Gorila extends Mamifero {

    public void lanzarAlgo() {
        int energia= this.getNivelEnergia();//Capturo la energia actual
        energia-=5;//Disminuyo la energia en 5
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("LANZANDO PIEDRAS");
    }
    public void comerBananas() {
        int energia= this.getNivelEnergia();//Capturo la energia actual
        energia+=10;//Aumento la energia 10
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("DELICIOSAS BANANAS");
    }
    public void trepar() {
        int energia= this.getNivelEnergia();//Capturo la energia actual
        energia-=10;//Disminuye la energia 10
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("TREPANDO ARBOL");
    }

}
