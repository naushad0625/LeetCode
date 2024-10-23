/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let tArr = [];
    arr.forEach((elem, index) => {
            elem = fn(elem, index);
            tArr.push(elem)
        });
    return tArr;
};
