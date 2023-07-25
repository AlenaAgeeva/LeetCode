package easy.array;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void whenMiddle() {
        TwoSum twoSum = new TwoSum();
        int[] test = {1,3,34,2,6,7};
        int target = 36;
        int[] exp = {2,3};
        int[] rsl = twoSum.twoSum(test,target);
        Assert.assertArrayEquals(rsl,exp);
    }
    @Test
    public void whenBeginning() {
        TwoSum twoSum = new TwoSum();
        int[] test = {1,2,34,2,6,7};
        int target = 3;
        int[] exp = {0,1};
        int[] rsl = twoSum.twoSum(test,target);
        Assert.assertArrayEquals(rsl,exp);
    }
    @Test
    public void whenEnding() {
        TwoSum twoSum = new TwoSum();
        int[] test = {1,2,34,2,6,7};
        int target = 13;
        int[] exp = {4,5};
        int[] rsl = twoSum.twoSum(test,target);
        Assert.assertArrayEquals(rsl,exp);
    }
}