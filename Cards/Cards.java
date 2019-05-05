public class Cards
{
    public static void main(String[] args) {

    }

    public static boolean hasGroupsSizeX(int[] deck) {
        Boolean bool;
        int count = 1;

        if(deck.length < 2) {
            bool = false;
        }
        else {
            for(int i = 0; i < deck.length; i++) {
                for (int j = i + 1; j < deck.length; j++) {
                    if (deck[i] == deck[j]) {
                        count++;
                    }
                }
            }
            if(count%2 == 0) {
                bool = true;
            }
            else {
                bool = false;
            }
        }

        return bool;
    }
}
