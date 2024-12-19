/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 *
 * @author Alena Ageeva
 */
const isPalindrome = function (x) {
    if (x == null || x == undefined) {
        throw new Error("Null or undefined value");
    }
    if (typeof (x) == "number") {
        return x == x.toString().split('').reverse().join('');
    } else return "Not a number";
};
module.exports = isPalindrome;