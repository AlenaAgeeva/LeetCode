package easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BuildArrayFromPermutationTest {

    @Test
    void buildArrayWhenEqual() {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] expected = {0, 1, 2, 4, 5, 3};
        assertThat(new BuildArrayFromPermutation().buildArray(nums).equals(expected));
    }

    @Test
    void buildArrayWhenEqual2() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertThat(new BuildArrayFromPermutation().buildArray(nums).equals(expected));
    }
}