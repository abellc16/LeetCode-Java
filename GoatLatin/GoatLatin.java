import java.lang.*;

public class GoatLatin
{
    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        String ans = toGoatLatin(s);
        System.out.println(ans);
    }

    public static String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String[] newWords = new String[words.length];
        StringBuffer word;
        int numA = 1;

        for (int i = 0; i < words.length; i++) {
            word = new StringBuffer(words[i]);
            if (words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") ||
                    words[i].startsWith("o") || words[i].startsWith("u") ||
                    words[i].startsWith("A") || words[i].startsWith("E") || words[i].startsWith("I") ||
                    words[i].startsWith("O") || words[i].startsWith("U")) {
                word.append("ma");
                word.append(numAs(numA));
                numA++;
                newWords[i] = word.toString();
            }
            else {
                word.append(word.charAt(0));
                word.append("ma");
                word.append(numAs(numA));
                numA++;
                newWords[i] = word.toString().substring(1);
            }
        }
        return String.join(" ", newWords);
    }

    public static StringBuffer numAs(int x) {
        StringBuffer a = new StringBuffer("");
        for (int i = 1; i <= x; i++) {
            a.append("a");
        }

        return a;
    }
}
