import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortColorTest {


    private final Solution solution = new Solution();

    @Test
    public void testSortColors_Example1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        int[] expected = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortColors_Example2() {
        int[] nums = {2, 0, 1};
        solution.sortColors(nums);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, nums);
    }


    @Test
    public void testSortColors_AllZeros() {
        int[] nums = {0, 0, 0};
        solution.sortColors(nums);
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortColors_AllOnes() {
        int[] nums = {1, 1, 1};
        solution.sortColors(nums);
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortColors_AllTwos() {
        int[] nums = {2, 2, 2};
        solution.sortColors(nums);
        int[] expected = {2, 2, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortColors_EmptyArray() {
        int[] nums = {};
        solution.sortColors(nums);
        int[] expected = {};
        assertArrayEquals(expected, nums);
    }

    class Solution {
        public void sortColors(int[] nums) {
            //去掉()
            int n = nums.length;
            //添加分号
            int ptr = 0;
            for (int i = 0; i < n; ++i) {
                //数组表示方式错误
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[ptr];
                    nums[ptr] = temp;
                    ++ptr;
                }
            }
            //{}更改为()
            for (int i = ptr; i < n; ++i) {
                if (nums[i] == 1) {
                    int temp = nums[i];
                    nums[i] = nums[ptr];
                    nums[ptr] = temp;
                    ++ptr;
                }
            }
        }
    }
}
