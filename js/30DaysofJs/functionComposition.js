/**
 * @param {Function[]} functions
 * @return {Function}
 */
const compose = function (funcs) {
    
    return function (x) {
      for (let i = funcs.length - 1; i >= 0; i--) {
        x = funcs[i](x);
      }
  
      return x;
    };
  };

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */

const fnc = compose([(x) => x + 1, (x) => 2 * x]);
console.log(fnc(4));
