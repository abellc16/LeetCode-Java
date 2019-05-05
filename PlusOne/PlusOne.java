public class PlusOne {

    public static void main(String[] args)
    {
        int[] origArr = new int[3];
        origArr[0] = 3;
        origArr[1] = 2;
        origArr[2] = 9;

        int[] newArr = plusOne(origArr);

        System.out.print("Original: [");
        for(int i = 0; i < origArr.length; i++) {
            System.out.print(origArr[i] + ", ");
        }
        System.out.print("\n New: [");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
        }
        else {
            digits[digits.length - 1] = 0;
            digits[digits.length - 2]++;
        }
        return digits;
    }
}
