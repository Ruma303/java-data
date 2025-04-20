package lessons;
public class Primitives {
    public static void main(String[] args) {

        // --- Primitive Types

        // -- Byte

        byte myByte = 100;
        System.out.println(myByte); // 100
        

        // - Overflow

        // byte overflow = 200;


        // -- Short
        short myShort = 10000;
        System.out.println(myShort); // 10000


        // -- Integer

        int number1 = 10;
        System.out.println(number1);

        int number2 = 123_456_789;
        System.out.println(number2);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Int min val: " + minInt + '\n');
        System.out.println("Int max val: " + maxInt + '\n');

        /*
	        minInt = minInt - 1;
	        maxInt = maxInt + 1;
	        System.out.println(minInt + '\n');
	        System.out.println(maxInt + '\n');
        */


        // -- Long
        
        long number3 = 15L;
        System.out.println(number3); // 15

        
        // -- Float

        float myFloat = 3.14f;
        System.out.println(myFloat); // 3.14


        // -- Double

        double myDouble1 = 70;
        double myDouble2 = 3.14D;
        System.out.println(myDouble1); // 70.0
        System.out.println(myDouble2); // 3.14


        // -- Boolean

        boolean isJavaFun = true;
        if (isJavaFun) {
            System.out.println("Yes, Java is fun!");
        } else {
            System.out.println("No, Java is not fun...");
        }

        
        // -- Char

        char myChar = 'a';
        System.out.println(myChar); // a

        char myChar2 = 100;
        System.out.println(myChar2); // d
    }
}