package juego;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Functions {

    // ------------------------------ Variables ----------------------------------
    // Array that contains the initial words from the game
    private final String Words[] = {
        "hola",
        "adios",
        "vivo",
        "danny",
        "muerto",
        "items",
        "programacion",
        "lenguajes",
        "mario",
        "java"
    };
    // Words List 
    private WordsList wordsList = null;

    // ------------------------ Functions ----------------------------------------
    // Get the word list size
    private int getWordsListLengh() {
        int cont = 0;

        WordsList temp = wordsList;
        while (temp != null) {
            cont++;
            temp = temp.next;
        }

        return cont;
    }

    // function to get the element from the list
    public String getRandomWord() {
        int rand = (int) (Math.random() * getWordsListLengh() + 1);
        int cont = 0;
        String word = "";
        WordsList temp = wordsList;
        while (cont != rand) {
            word = temp.word;
            temp = temp.next;
            cont++;
        }

        return word;
    }

    // -------------------------- Methods -----------------------------------------------
    // Add new data to the Words List
    public void Insetar(String dato) {
        WordsList nuevo = new WordsList();
        nuevo.word = dato;
        nuevo.next = null;

        // Ver si la lista esta vacia o no
        if (wordsList == null) {
            wordsList = nuevo;
        } else {
            // Puntero apunta a lista, enlazando el nuevo nodo
            nuevo.next = wordsList;
            wordsList = nuevo;
        }
    }

    // Add the Words Array to the Words List
    public void anadirVector() {
        int size = Words.length;

        for (int i = 0; i < size; i++) {
            Insetar(Words[i]);
        }

    }

    // Look if the Word contains the 
    public boolean comprobar(
            // Word and letter
            String word,
            String data,
            // Current counter
            int letterCounter,
            int failsCounter,
            // body labels
            JLabel middle,
            JLabel upper,
            JLabel head,
            JLabel body,
            JLabel RightArm,
            JLabel LeftArm,
            JLabel RightLeg,
            JLabel LeftLeg,
            // Letters
            JLabel letter1,
            JLabel letter2,
            JLabel letter3,
            JLabel letter4,
            JLabel letter5,
            JLabel letter6,
            JLabel letter7,
            JLabel letter8
    ) {
        System.out.println("Palabra: " + word);
        // Find if the word contains the letter that was introduced by the user
        if (word.contains(data)) {
            JOptionPane.showMessageDialog(null, "La letra es correcta!");
            letterCounter++;
            if (letterCounter == word.length()) {
                JOptionPane.showMessageDialog(null, "Haz ganado!!!");
            }
            
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "La letra es incorrecta");
            failsCounter--;
            // Change data on screen
            switch (failsCounter) {
                case 7:
                    letter1.setText(data);
                    middle.setVisible(true);
                    break;
                case 6:
                    letter2.setText(data);
                    upper.setVisible(true);
                    break;
                case 5:
                    letter3.setText(data);
                    head.setVisible(true);
                    break;
                case 4:
                    letter4.setText(data);
                    body.setVisible(true);
                    break;
                case 3:
                    letter5.setText(data);
                    LeftArm.setVisible(true);
                    break;
                case 2:
                    letter6.setText(data);
                    RightArm.setVisible(true);
                    break;
                case 1:
                    letter7.setText(data);
                    LeftLeg.setVisible(true);
                    break;
                case 0:
                    letter8.setText(data);
                    RightLeg.setVisible(true);
                    break;
            }

        }
        
        return false;
    }

}
