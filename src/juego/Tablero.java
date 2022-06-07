package juego;

import javax.swing.JLabel;

public class Tablero {

    private String Palabras[] = {
        "hola",
        "java",
        "mario",
        "miranda",
        "eres",
        "traeme",
        "ruth",
        "amor",
        "trueno",
        "admiracion"
    };

    public String[] palabra;

    public String[] palabraUsuario;

    public Tablero() {
        palabra = NuevaPalabra().split("");
        palabraUsuario = new String[palabra.length];
    }

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

    public boolean Verifica(String letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                palabraUsuario[i] = letra;
                contador++;
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

    private String NuevaPalabra() {
        int rand = (int) (Math.random() * Palabras.length + 1);
        return Palabras[rand];
    }

}
