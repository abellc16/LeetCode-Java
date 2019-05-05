public class TwoSum
{

    public static void main(String[] args)
    {
        int tar = 6;
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 3;

        int[] answer = new int[2];
        answer = twoSum(arr, tar);

        System.out.print("Target: " + tar + "\n");
        System.out.print("Given nums: [");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]\n");

        System.out.print("Answer is: [");
        for(int j = 0; j < answer.length; j++) {
            System.out.print(answer[j] + ",");
        }
        System.out.println("]\n");
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int sum = 0;
        int[] x = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    x[0] = i;
                    x[1] = j;
                }
            }
        }
        return  x;
    }
}
