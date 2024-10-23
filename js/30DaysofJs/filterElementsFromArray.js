/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */

let filter = (arr, fn) => {
  let filteredArr = [];

  for (let i = 0; i < arr.length; i++) {
    if (fn(arr[i], i)) filteredArr.push(arr[i]);
  }
  return filteredArr;
};

let greaterThan10 = function (n) {
  return n > 10;
};

console.log(filter([1, 10, 20, 16], greaterThan10));
