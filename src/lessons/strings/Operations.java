package lessons.strings;

import java.text.MessageFormat;

public class Operations {
    public static void main(String[] args) {

        // --- Concatenazione di stringhe

        String firstName = "Jhon";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


        // --- Parsing in String

        String number1 = "10";
        int number2 = 20;
        var sum = number1 + number2;
        System.out.println("Somma "  + sum + " di tipo: "); // "1020"

        if (sum instanceof String)
            System.out.println("La variabile sum è di tipo String");


        // --- Sequenze di escape

        String escapes = """
                Riga 1\n
                Riga 2\tCella 2\t\rCella3\n
                Riga3\b
                \f
            """;
        System.out.println(escapes);

        System.out.println("Lui ha detto \"ciao\"");


        // --- Argomenti main()

        for (String s: args)
                System.out.println(s);


        // --- StringBuilder e StringBuffer

        StringBuilder sb = new StringBuilder();
        sb.append("Ciao");
        sb.append(" ");
        sb.append("Mondo");

        String result = sb.toString();
        System.out.println(result); // "Ciao Mondo"

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i).append(", ");
        }
        String built = builder.toString();
        System.out.println(built.substring(0, built.length() / 5));
        System.out.println("\n\n");


        // --- Formattazione

        String formattedString = String.format("Formato di stringa: %s, Numero: %d", "esempio", 123);
        System.out.println(formattedString);

        int age = 30;
        String name = "Mario";
        String formattedString2 = String.format("Nome: %s, Età: %d", name, age);
        System.out.println(formattedString2);  // Output: Nome: Mario, Età: 30

        System.out.printf("Formato di stringa: %s, Numero: %d%n", "Test", 5132);


        // --- MessageFormat

        String formattedMessage = MessageFormat.format("Nome: {0}, Età: {1}", "Mario", 30);
        System.out.println(formattedMessage);  // Output: Nome: Luca, Età: 25

    }
}
