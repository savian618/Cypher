
/**
 * A decoding class based off a caesar cipher where you know one word
 * present in the encoded string
 * 
 * @author Savian Elam
 * @version March 1, 2021
 */
public class Cypher {

    /**
     * This method receives the message to translate and the known word and
     * returns the translated message
     * 
     * @param text an encrypted message
     * @param known a word that is present in the decrypted message
     * @return the decrypted message
     */
    public static String process(String text, String known) {
        String[] values = text.split(" ");
        String ans = "";
        int skip = 0;
        known = known.toUpperCase();
        boolean proceed = false;
        for (int j = 0; j < values.length; j++) {
            String s = values[j];
            if (s.length() == known.length()) {
                int[] lst = new int[s.length()];
                for (int i = 0; i < s.length(); i++) {
                    int one = s.charAt(i);
                    int two = known.charAt(i);
                    lst[i] = count(one, two);
                }
                if (equal(lst) == true) {
                    proceed = true;
                    skip = lst[0];
                    break;
                }

            }
        }
        if (proceed == true) {
            ans = convert(text, skip);

        }

        return ans;

    }


    /**
     * Finds the count between chars
     * 
     * @param one an integer based off a char
     * @param two an integer based off a char
     * @return the count
     */
    public static int count(int one, int two) {
        int counter = 0;
        while (one != two) {
            if (one == 90) {
                one = 65;
            }
            else {
                one++;
            }
            counter++;
        }
        return counter;

    }


    /**
     * checks if values in list are equal
     * 
     * @param v a list of char counts
     * @return a boolean
     */
    public static boolean equal(int[] v) {
        int first = v[0];
        boolean chk = true;
        for (int i : v) {
            if (i != first) {
                chk = false;
                break;
            }
        }
        return chk;
    }


    /**
     * Converts the string into a legible sentence
     * 
     * @param word the encrypted message
     * @param count the difference between encrypted and decrypted chars
     * @return decrypted message
     */
    public static String convert(String word, int count) {
        String con = "";
        for (char x : word.toCharArray()) {
            int val = x;
            if (val > 90 || val < 65) {
                con += (char)val;
            }
            else {
                for (int i = 0; i < count; i++) {
                    if (val == 90) {
                        val = 65;
                    }
                    else {
                        val++;
                    }
                }
                char end = (char)val;
                con += end;
            }
        }

        return con.toLowerCase();

    }
}

