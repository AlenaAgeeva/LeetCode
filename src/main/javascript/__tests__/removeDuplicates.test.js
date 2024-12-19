describe("Count unique elements in array:", () => {
    const removeDuplicates = require("../easy/array/removeDuplicatesfromSortedArray");

    test("counting unique elements in sorted array", () => {
        const arr = [0, 2, 2, 5, 3, 3];
        const expected = 4;
        expect(removeDuplicates(arr)).toEqual(expected);
    });

    test("counting unique elements in sorted array", () => {
        const arr = [0, 0, 0, 0];
        const expected = 1;
        expect(removeDuplicates(arr)).toEqual(expected);
    });

    test("counting unique elements in sorted array", () => {
        const arr = [1];
        const expected = 1;
        expect(removeDuplicates(arr)).toEqual(expected);
    });

    test('handles an empty array', () => {
        expect(() => removeDuplicates([])).toThrow("Array is empty");
    });
});