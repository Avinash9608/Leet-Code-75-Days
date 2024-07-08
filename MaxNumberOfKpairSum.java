package LeetCode75;
import java.util.Arrays;

public class MaxNumberOfKpairSum {
    public static  void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right= nums.length-1;
        while (left<right)
        {
            if(nums[left]+nums[right]==k)
            {
                left++;
                right--;
                count++;
            }else if(nums[left]+nums[right]>k)
            {
                right--;
            }else
            {
                left++;
            }
        }
        System.out.println(count);
    }
}





















































































































/*int count = 0;
        ArrayList<Integer> store = new ArrayList<>();
        for (int x : arr) {
            store.add(x);
        }
        System.out.println(store);
        for (int i = 0; i < store.size(); i++) {

                int curr = store.get(i);
                int rem = k - curr;
                if (store.contains(rem)) {
                    count++;
                    // Remove both elements from the ArrayList
                    store.remove(Integer.valueOf(curr)); // Remove by object, not by index
                    store.remove(Integer.valueOf(rem)); // Remove by object, not by index
                    i--; // Adjust index due to removal
                }
            }

        System.out.println(count);*/