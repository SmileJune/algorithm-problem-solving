var maxSubarraySumCircular = function(nums) {
    let sum = nums.reduce((acc, current) => {
        return acc + current;
    });

    let minSum = nums[0];
    let maxSum = nums[0];

    for (let i = 0 ; i < nums.length; i++) {
        let currentSum = 0;
        for (let j = i; j < nums.length; j++) {
            currentSum += nums[j];
            minSum = Math.min(minSum, currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
    }

    return minSum === sum ? maxSum : Math.max(sum - minSum, maxSum);
};
