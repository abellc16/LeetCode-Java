public class JewelsAndStones
{

    public static void main(String[] args)
    {
        String str1 = "aA";
        String str2 = "aAAbbbb";
        String str3 = "z";
        String str4 = "ZZ";

        int test1 = numJewelsInStones(str1, str2);
        int test2 = numJewelsInStones(str3, str4);

        System.out.println("Num: " + test1);
        System.out.println("Num: " + test2);
    }


    public static int numJewelsInStones(String J, String S)
    {
        int count = 0;
        if(J.length() > S.length()) {
            for(int i = 0; i < J.length(); i++) {
                for(int j = 0; j < S.length(); j++) {
                    if(J.charAt(i) == S.charAt(j)) {
                        count++;
                    }
                }
            }
        }
        else {
            for(int i = 0; i < S.length(); i++) {
                for(int j = 0; j < J.length(); j++) {
                    if(S.charAt(i) == J.charAt(j)) {
                        count++;
                    }
                }
            }
        }


        return count;
    }
}
