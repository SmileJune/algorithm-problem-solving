/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function(nums) {
    let answer = [];
    if (nums.length === 0) {
        return nums;
    }
    let beforeNum = nums[0];
    let startNum = nums[0];
    for (let i = 1; i < nums.length; i++) {
        if (beforeNum + 1 !== nums[i]) {
            const forAdded = startNum === beforeNum ? `${beforeNum}` : `${startNum}->${beforeNum}`;
            answer = [...answer, forAdded];
            startNum = nums[i];
        }
        beforeNum = nums[i];
    }

    const last = startNum === beforeNum ? `${beforeNum}` : `${startNum}->${beforeNum}`;
    return [...answer, last];
};
