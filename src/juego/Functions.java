package juego;

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
    private void Insetar(String dato) {
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


}
