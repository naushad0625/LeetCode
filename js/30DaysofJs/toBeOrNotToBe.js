/**
 * @param {string} val
 * @return {Object}
 */
let expect = (val) => {
  return {
    toBe: (v1) => {
      if (val === v1) return true;
      throw new Error("Not Equal");
    },
    notToBe: (v1) => {
      if (val !== v1) return true;
      throw new Error("Equal");
    },
  };
};

expect(5).toBe(5); 
expect(5).notToBe(6);
