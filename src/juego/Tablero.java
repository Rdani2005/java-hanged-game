package juego;

import javax.swing.JLabel;

public class Tablero {

    // Words List
    private final String Palabras1[] = {
        "hola",
        "java",
        "mario",
        "dario",
        "eres",
        "traer",
        "ruth",
        "amor",
        "vida",
        "luis"
    };
    // Middle dificult list
    private final String Palabras2[] = {
        "amores",
        "python",
        "daniel",
        "traeras",
        "seremos",
        "mortales",
        "unicos",
        "dificil",
        "intruso",
        "mariana"
    };

    // Hard list
    private final String Palabras3[] = {
        "complicadisimo",
        "javascript",
        "esternocleidomastoideo",
        "parangaracutirimicuaro",
        "idiosincrasia",
        "desoxirribonucleico",
        "paralelepipedo",
        "ovoviviparo",
        "caleidoscopio",
        "electroencefalografista"
    };

    // Wich is the word?
    public String[] palabra;
    // What are the letters that the user has given us?
    public String[] palabraUsuario;

    // Some definitions
    public Tablero(int dificulty) {

        palabra = NuevaPalabra(dificulty).split("");
        palabraUsuario = new String[palabra.length];
    }

    // Get a label as a parameter, and set its text into the letters that the user has guessed
    public void showUserWord(JLabel label) {

        String output = "";

        for (String palabraUsuario1 : palabraUsuario) {
            if (palabraUsuario1 == null) {
                output += " _ ";
            } else {
                output += " " + palabraUsuario1 + " ";
            }
            System.out.println(palabraUsuario1);
        }

        label.setText(output);
    }

    // Is the letter correct?
    public boolean Verifica(String letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                palabraUsuario[i] = letra;
                contador++;
                System.out.println(" [ " + palabra[i] + " ] ");
            }
        }

        System.out.println(letra);
        return contador != 0;
    }

    public boolean Ganado() {
        boolean ganar = true;
        for (String palabraUsuario1 : palabraUsuario) {
            if (palabraUsuario1 == null) {
                ganar = false;
            }
        }
        return ganar;
    }

    private String NuevaPalabra(int dificulty) {

        String word = "";

        int rand;
        
        switch (dificulty) {
            case 1:
                rand = (int) (Math.random() * Palabras1.length + 1);
                word = Palabras1[rand - 1];
                break;
            case 2:
                rand = (int) (Math.random() * Palabras2.length + 1);
                word = Palabras2[rand - 1];
                break;
            case 3:
                rand = (int) (Math.random() * Palabras3.length + 1);
                word = Palabras3[rand - 1];
        }

        return word;
    }

}
