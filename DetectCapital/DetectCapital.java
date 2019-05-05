public class DetectCapital
{
    public static void main(String[] args)
    {
        String str1 = "USAAA";
        String str2 = "FlaG";
        String str3 = "Google";

        Boolean test1 = detectCapitalUse(str1);
        System.out.println(test1 + "\n");

        Boolean test2 = detectCapitalUse(str2);
        System.out.println(test2 + "\n");

        Boolean test3 = detectCapitalUse(str3);
        System.out.println(test3 + "\n");
    }

    public static boolean detectCapitalUse(String word)
    {
        Boolean bool;
        int upper = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                upper++;
            }
        }

        if(word.charAt(0) >= 65 && word.charAt(0) <=90 && upper == 1) {
            System.out.println("Im in if");
            bool = true;
        }
        else if(upper == word.length()) {
            System.out.println("Im in else if");
            bool = true;
        }
        else if(word.length() == 1) {
            bool = true;
        }
        else if(upper == 0) {
            bool = true;
        }
        else {
            System.out.println("Im in else");
            bool = false;
        }

        System.out.println(upper);
        return bool;
    }
}
