/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
const argumentsLength = function (...args) {
  return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */

console.log(argumentsLength(1, 2, 3));
