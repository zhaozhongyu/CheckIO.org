/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    nums.sort(function (a, b) {return a-b;});
    var sum = 0;
    for(var i = 0; i < nums.length; i += 2){
        sum += nums[i];
    }
    return sum;
};
