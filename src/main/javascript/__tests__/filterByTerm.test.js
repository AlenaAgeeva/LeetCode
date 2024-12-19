describe("Palindrome function", () => {
    const isPalindrome = require("../easy/array/isPalindrome");
    beforeAll(() => console.log("Testing started – before all tests"));
    afterAll(() => console.log("Testing finished – after all tests"));
    test("checking if 121 is a palindrome", () => {
        const input = 121;
        const output = true;
        expect(isPalindrome(input)).toEqual(output);
    });
    test("checking if -55 is a palindrome", () => {
        const input = -55;
        const output = false;
        expect(isPalindrome(input)).toEqual(output);
    });
    test("checking if 0 is a palindrome", () => {
        const input = 0;
        const output = true;
        expect(isPalindrome(input)).toEqual(output);
    });
    test("checking when an argument is null", () => {
        expect(() => isPalindrome(null)).toThrow("Null or undefined value");
    });
    test("checking when an argument is undefined", () => {
        expect(() => isPalindrome(undefined)).toThrow("Null or undefined value");
    });
});
