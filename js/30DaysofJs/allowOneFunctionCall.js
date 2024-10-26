/**
 * @param {Function} fn
 * @return {Function}
 */
const once = function (fn) {
  let onecCalled = false;

  return function (...args) {
    if (onecCalled) return undefined;
    onecCalled = true;
    return fn(...args);
  };
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
let fn = (a, b, c) => (a + b + c);
let fnToCallOnce = once(fn);

console.log(fnToCallOnce(1, 2, 3));
console.log(fnToCallOnce(4, 5, 6));
