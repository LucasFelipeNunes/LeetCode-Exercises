/**
 * @param {string} val
 * @return {Object}
 */

var expect = function(val) {
    return{
        toBe(val2){
            if(val !== val2) throw "Not Equal"
            return val === val2
        },
        notToBe(val2){
            if(val === val2) throw "Equal"
            return val !== val2
        }
    }
};

console.log(expect(5).toBe(5)) // true
console.log(expect(5).notToBe(5)) // throws "Equal"
