/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

let answer;
let visited;

function calculateDiffFromTarget(target, current) {
    return Math.abs(target - current);
}

var threeSumClosest = function(nums, target) {
   nums.sort((a, b) => a - b);
   answer = nums[0] + nums[1] + nums[2];

   for (let i = 0; i < nums.length - 2; i++) {
       let [second, third] = [i + 1, nums.length - 1];
       while (second < third) {
           let sum = nums[i] + nums[second] + nums[third];
           if (sum === target) {
               return target;
           }

           if (calculateDiffFromTarget(target, sum) < calculateDiffFromTarget(target, answer)) {
               answer = sum;
           }

           if (sum < target) {
               second += 1;
           } else {
               third -= 1;
           }
       }
   }

   return answer;
};
