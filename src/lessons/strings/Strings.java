package lessons.strings;

public class Strings {

    public static void main(String[] args) {

        // --- Creazione Stringhe

        // 1. Litteral
        String litteral = "Hello, World";
        System.out.println(litteral);


        // 2. Costruttore
        String constructor1 = new String(); // Dichiariamo la variabile
        constructor1 = "Hello from String Constructor 1"; // Poi la riassegnamo
        System.out.println(constructor1);

        // Inizializziamo direttamente la variabile
        String constructor2 = new String("Hello from String Constructor 2");
        System.out.println(constructor2);


        // 3. Da array di caratteri
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String fromChars = new String(chars);
        System.out.println(fromChars);


        //--- Codifica UTF-16

        String emoji = "𝄞"; // simbolo musicale U+1D11E
        System.out.println(emoji.length()); // Output: 2 (due char da 16 bit)
        System.out.println(emoji.codePointCount(0, emoji.length())); // Output: 1


        // --- Immutabilità stringhe

        String originale = "ciao";
        String modificata = originale.toUpperCase();
        System.out.println(originale); // Output: ciao
        System.out.println(modificata); // Output: CIAO


        // --- Stringhe multilinea

        String json = """
                {
                  "nome": "Mario",
                  "età": 30
                }
                """;
        System.out.println(json);


        // ---  String pool e internamenti

        String s1 = "java";
        String s2 = "java"; // Intern implicito
        String s3 = new String("java"); // Intern forzato
        String s4 = new String(s3).intern(); // Intern esplicito


        // -- Confronti

        System.out.println(s1 == s2); // true - stesso riferimento
        System.out.println(s1.equals(s2)); // true - stesso contenuto


    }
}
