describe("Palindrome function", () => {
    const isPalindrome = require("../easy/array/isPalindrome");
    test("checking if the input number ia a palindrome", () => {
        const input = 121;
        const output = true;
        expect(isPalindrome(input)).toEqual(output);
    });
    test("checking if the input number ia a palindrome", () => {
        const input = -55;
        const output = false;
        expect(isPalindrome(input)).toEqual(output);
    });
    test("checking if the input number ia a palindrome", () => {
        const input = 0;
        const output = true;
        expect(isPalindrome(input)).toEqual(output);
    });
});
