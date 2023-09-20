/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    let sum = nums.reduce((acc, current) => acc + current);
    const notDuplicatedNumberCount = new Set(nums).size;
    const notDuplicatedNumberSum = Array.from(new Set(nums)).reduce((acc, reduce) => acc + reduce);

    return (sum - notDuplicatedNumberSum) / (nums.length - notDuplicatedNumberCount);
};
