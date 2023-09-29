/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isMonotonic = function(nums) {
    if (nums.length < 3) {
        return true;
    }

    let firstDiff = nums[1] - nums[0];
    for (let i = 1; i < nums.length; i++) {
        const diff = nums[i] - nums[i - 1];

        if (firstDiff === 0) {
            firstDiff = diff;
            continue;
        }

        if (diff * firstDiff < 0) {
            return false;
        }
    }

    return true;
};
