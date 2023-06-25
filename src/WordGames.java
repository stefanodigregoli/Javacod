/**
 * Questa classe fornisce metodi per word-related game.
 * Include l'aggiunta di "Hello" a una parola e la concatenazione di un nome completo.
 * Autore: Stefano Di Gregoli.
 */
public class WordGames {
    /**
     *
     * @param word la parola aggiunto "Hello".
     * @return una stringa con " Hello " seguito dalla parola.
     */
    public String addHelloWord(String word){
        return "Hello" + word;
    }

    /**
     *
     * @param name il nome dato.
     * @param surname il cognome.
     * @return il nome completo concatenato.
     */
    public String getFullName(String name , String surname){
        return name + " " + surname;
    }
}