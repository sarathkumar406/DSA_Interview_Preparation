import java.util.Arrays;

public class Sort_Colors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int second = 0;

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0)
                zeros++;
            else if(nums[i] == 1)
                ones++;
            else
                second++;
        }
        int count = 0;
        while(zeros > 0)
        {
            nums[count++] = 0;
            zeros--;
        }
        while(ones > 0)
        {
            nums[count++] = 1;
            ones--;
        }
        while(second > 0)
        {
            nums[count++] = 2;
            second--;
        }

        System.out.println( Arrays.toString (nums));
    }
}
