package Abril_24;

public class Test {

    public static void saludar() {
        System.out.println("HOLA");
    }

    public static void saludar(String nombre) {
        System.out.print("HOLA ");
        System.out.println(nombre);

    }

    public static void saludar(String nombre, Double hora) {
        String saludo = "";
        if (hora > 0 && hora < 12) {
            saludo = saludo.concat("Buenos dias ");
        } else if (hora < 19) {
            saludo = saludo.concat("Buenos tardes ");
        } else {
            saludo = saludo.concat("Buenos Noches ");
        }
        saludo = saludo.concat(nombre);
        System.out.println(saludo);
    }

    public static void main(String[] args) {

        /* Variables Primitivas */
        int edad = 28; // Int -> numerico entero
        double estatura = 1.85; // double -> numerico decimal
        char genero = 'M'; // char -> caracter sencillo
        boolean casado = true; // boolean -> valor lógico true/false;
        long nit = 1234567891; // long numero grande

        /* Variables no Primitivas */
        Integer edad2 = 28; // Int -> numerico entero
        Double estatura2 = 1.85; // double -> numerico decimal
        String genero2 = "M"; // String -> cadena de caracteres
        Boolean casado2 = true; // Boolean -> valor lógico true/false;
        Long nit2 = (long) 123456; // Long numero grande

        /* OBJETIVO ES REDUCIR CUALQUIER PROCESO A UNA SERIE DE INSTRUCCIONES */

        /* PARA COMPRAR HUEVOS */
        Integer numeroHuevos = -4;

        /* CONDICIONALES */
        if (numeroHuevos < 4 && numeroHuevos >= 0) {
            /* Si la condicion es verdadera ejecuta el codigo de acá */
            System.out.println("Hay que comprar más huevos");
        } else if (numeroHuevos >= 8) {
            System.out.println("Hay que cocinarlos pronto");
        } else if (numeroHuevos < 0) {
            System.out.println("Estas debiendo huevos?");
        } else {
            /* Cuando la condicion del if no se cumple se ejecuta el codigo del else */
            System.out.println("Hay suficientes huevos");
        }

        /* SWITCH */
        String saludo = "Hola ";
        System.out.println(saludo);
        switch (edad) {
            case 7:
                System.out.println("Niño");
                break;
            case 17:
                System.out.println("Joven");
                break;
            case 27:
                System.out.println("Señor");
                break;
            default:
                System.out.println("mister");
                break;
        }

        System.out.println("HOLA");
        System.out.println(genero == 'M' ? "Señor" : "Señora");

        /* String */

        String greetings = "Hi There";
        System.out.println(greetings.length());
        greetings = greetings.concat(" Mr Nestor");
        System.out.println(greetings);

        String ninja = String.format("Hola %s, me debes $%.2f !", "Jack", 25.0);
        System.out.println(ninja);

        String a = "Nestor";
        String b = new String("Nestor");

        saludar("Jennifer", 20.5);
        saludar("Jennifer", 8.5);
        saludar();
        saludar("Fransheska");
        saludar("Fransheska", 8.5);
        saludar("Fransheska", 14.5);
    }

}