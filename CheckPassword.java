import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class CheckPassword {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CheckPassword() {
    }

    /**
     * Checks whether the given String satisfies the OSU criteria for a valid
     * password. Prints an appropriate message to the given output stream.
     *
     * @param s
     *            the String to check
     * @param out
     *            the output stream
     */
    private static void checkPassword(String s, SimpleWriter out) {
        boolean length = false;
        final int eight = 8;
        if (s.length() < eight) {
            out.println("This password doesn't satisfies length criteria");
        } else {
            out.println("This password satisfies length criteria");
            length = true;
        }
        int conditions = 0;
        if (length) {
            if (containsUpperCaseLetter(s)) {
                conditions++;
            }
            if (containsLowerCaseLetter(s)) {
                conditions++;
            }
            if (containsDigit(s)) {
                conditions++;
            }
            if (conditions < 2) {
                out.println("password is not valid");
            } else {
                out.println("password is valid");
            }
        }
    }

    /**
     * Checks if the given String contains an upper case letter.
     *
     * @param s
     *            the String to check
     * @return true if s contains an upper case letter, false otherwise
     */
    private static boolean containsUpperCaseLetter(String s) {
        boolean containsUpperCaseLetter = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                containsUpperCaseLetter = true;
            }
        }
        return containsUpperCaseLetter;
    }

    /**
     * This methods checks if letter is lower case in a string.
     *
     * @param s
     * @return containsLowerCaseLetter
     */

    private static boolean containsLowerCaseLetter(String s) {
        boolean containsLowerCaseLetter = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                containsLowerCaseLetter = true;
            }
        }
        return containsLowerCaseLetter;
    }

    /**
     * This methods checks if digit is containted in a string.
     *
     * @param s
     * @return containsDigit
     */
    private static boolean containsDigit(String s) {
        boolean containsDigit = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                containsDigit = true;
            }
        }
        return containsDigit;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        out.println("Enter a password");
        String s = in.nextLine();
        checkPassword(s, out);
        /*
         * Put your main program code here; it may call myMethod as shown
         */
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
