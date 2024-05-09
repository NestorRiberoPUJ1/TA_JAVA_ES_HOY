package Mayo_08.zoologico;

public class Murcielago extends Mamifero {
    

    public Murcielago(){
        this.setNivelEnergia(300);
    }

    public void volar() {
        int energia= this.getNivelEnergia();//Capturo la energia actual
        energia-=50;//Disminuyo la energia en 50
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("*SONIDO DE MURCIELAGO VOLANDO*");
    }
    public void comerHumanos() {
        int energia= this.getNivelEnergia();//Capturo la energia actual
        energia+=25;//Aumento la energia 25
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("DELICIOSOS HUMANOS");
    }
    public void atacarPueblo() {
        int energia= this.getNivelEnergia();//Capturo la energia actual
        energia-=100;//Disminuye la energia 100
        this.setNivelEnergia(energia);//actualizo el valor a la nueva energia
        System.out.println("*SONIDO DE PUEBLO EN LLAMAS*");
    }

}
