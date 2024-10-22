/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */

let createCounter = (init) => {
    let updatedVal = init;
    return {
        increment: () => {
            updatedVal += 1;
            return updatedVal;
        },
        decrement: () => {
            updatedVal -= 1;
            return updatedVal;
        },
        reset: () => {
            updatedVal = init;
            return updatedVal;
        }
    }
}

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */

const counter = createCounter(5);
counter.increment();
counter.reset();
counter.decrement();