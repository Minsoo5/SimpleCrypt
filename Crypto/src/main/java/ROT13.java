import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String simpleString =  "abcd";
        StringBuilder sb = new StringBuilder();

        int asciiNumA = alphabet.charAt(0);
        int asciiNumZ = alphabet.charAt(alphabet.length()-1);
        char asciiB = 98;

        System.out.println("ASCII for letter a: " + asciiNumA);
        System.out.println("ASCII for letter z: " + asciiNumZ);
        System.out.println(asciiB);

        //Encryption
        for (int i = 0; i < simpleString.length(); i++) {
            //grab the number associated with the base alphabet
            int asciiNum = alphabet.charAt(i);
            //grab the number associated with the text-to-encrypt char
            int stringAscii = simpleString.charAt(i);

            //encrpt the char by mutating the associated ascii number
            char asciiChar = (char) (stringAscii + 3);
            sb.append(asciiChar);
        }
        System.out.println("-----------------------");
        System.out.println(simpleString);
        System.out.println(sb.toString());

    }

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        //W = J
        //H = U
        //Y = L

        StringBuilder processedString =  new StringBuilder();



        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }





}
