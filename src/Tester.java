/**
 * la classe tester la usiamo per testare la funzionalità della classe WordGames.
 * Contiene il metodo principale per eseguire i test.
 *Autore : Stefano Di Gregoli.
 */
public class Tester {
    public static void main(String [] args){
        WordGames wordGames = new WordGames();
        String helloWord = wordGames.addHelloWord("World");
        System.out.println("helloWorld");
        String fullName = wordGames.getFullName("Stefano" , " Rossi");
        System.out.println(fullName);

    }
}
