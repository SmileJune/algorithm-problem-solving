package iljun.programmers;

import java.util.Arrays;

public class Q_폰켓몬 {
    public int solution(int[] nums) {

        int possibleMaxNumber = nums.length/2;

        return checkMaxNumber(possibleMaxNumber, nums);
    }

    int checkMaxNumber(int possibleMaxNumber, int[] nums){

        Arrays.sort(nums);
        int lastNumberChecked = nums[0];
        int maxNumber = 1;

        for(int i=1; i<nums.length; i++){
            if(possibleMaxNumber == maxNumber){
                return possibleMaxNumber;
            }

            if(nums[i] != lastNumberChecked){
                lastNumberChecked = nums[i];
                maxNumber++;
            }
            else{
                continue;
            }
        }
        return maxNumber;
    }

}
