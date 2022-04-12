import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int val = 2;
        List<Integer> ans = targetIndices(nums, val);

        // Loop to print indices
        for (Integer an : ans) {
            System.out.println(an + " ");
        }
        targetIndices(nums, val);

    }

    // Function to find indices
    // of val in array after sorting
    static List<Integer> targetIndices(int[] nums, int val) {
        int count_less = 0;
        int count_target = 0;

        // Loop to count smaller elements and val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count_target++;
            if (nums[i] < val)
                count_less++;

        }

        // List to store indeices
        List<Integer> ans = new ArrayList<>();
        while (count_target > 0) {
            ans.add(count_less++);
            count_target--;
        }
        return ans;
    }
}
