var sortArrayByParity = function(nums) {
    let evenArray = [];
    let oddArray = [];
    for (let num of nums) {
        if (num % 2 === 0) {
            evenArray = [...evenArray, num];
        } else {
            oddArray = [...oddArray, num];
        }
    }

    return [...evenArray, ...oddArray];
};
