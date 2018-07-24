/**
 * TwoSum solutions
 */
package com.codersmart.algorithms.trainings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class TwoSum {
    public int[] getTwoSum(final int[] input, int target) {
        int[] ret = new int[]{};
        Map<Integer, Integer> hashValueIndex = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if (hashValueIndex.containsKey(complement)) {
                return new int[]{hashValueIndex.get(complement), i};
            }
            hashValueIndex.put(input[i], i);
        }
        return ret;
    }
    public int[] getTwoSumBest(int[] nums, int target) {
        final int il = nums.length;
        int il2 = (il >> 2) - 1;

        int pot = 2;
        while((il2 >>= 1) > 0) pot <<= 1;
        final int bitMod = pot - 1;
        final int[] bucket = new int[pot];
        final int[] linked = new int[il];

        final int firstVal = nums[0];

        for (int i = 1; i < il; i++) {
        int currNum = nums[i];
            int complement = target - currNum;

            if (complement == firstVal) {
                return new int[] { 0, i };
            }

            int complementLLIndex = bucket[complement & bitMod];
            while (complementLLIndex != 0) {
                if (nums[complementLLIndex] == complement) {
                    //Found
                    return new int[] { complementLLIndex, i };
                }
                complementLLIndex = linked[complementLLIndex];
            }
            int currNumLLIndex = currNum & bitMod;
            linked[i] = bucket[currNumLLIndex];
            bucket[currNumLLIndex] = i;
        }
        return new int[]{};
    }
}

