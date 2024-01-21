package org.example;

public class Main {
    public static boolean canJump(int[] nums) {
        if (nums.length < 2) return true;

        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 0) {
                int j = i-1;
                while ((j >= 0 &&
                        nums[j] + j < i + 1) &&
                        nums[j] + j != nums.length - 1) {
                    j--;
                }
                if (j < 0) return false;
                else i = j;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,1,4}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));
        System.out.println(canJump(new int[]{2,0,0}));
    }
}