describe("Array permutation", () => {
    const buildArray = require("../easy/array/buildArrayFromPermutation");
    test("checking is an array permutation", () => {
        const nums = [0, 2, 1, 5, 3, 4];
        const expected = [0, 1, 2, 4, 5, 3];
        expect(buildArray(nums)).toEqual(expected);
    });
    test("checking is an array permutation", () => {
        const nums = [0, 0, 0, 0];
        const expected = [0, 0, 0, 0];
        expect(buildArray(nums)).toEqual(expected);
    });
})