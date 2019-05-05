public class ReverseString
{
    public static void main(String[] args)
    {
        String str1 = "wubbba";
        String test1 = reverseString(str1);
        System.out.println(test1);
    }

    public static String reverseString(String s)
    {
        StringBuilder newString = new StringBuilder(s);
        for(int i = 0; i < s.length()/2; i++) {
            newString.setCharAt(i, s.charAt(s.length() - (i+1)));
            newString.setCharAt(s.length() - (i+1), s.charAt(i));
        }

        return String.valueOf(newString);
    }
}
