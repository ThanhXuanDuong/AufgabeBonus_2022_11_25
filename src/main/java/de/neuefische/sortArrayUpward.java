package de.neuefische;

public class sortArrayUpward {
    public static int[] sortUpward(int[] nums){
        int j=0;
        while (j<nums.length - 1){
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int num = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = num;
                }
            }
            j++;
        }
        return nums;
    }
}
