package com.codersmart.algorithms.trainings;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] getTwoSum(int[] input, int target){
        int[] ret = new int[]{};
        Map<Integer, Integer> hashValueIndex = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if(hashValueIndex.containsKey(complement)){
                return new int[]{hashValueIndex.get(complement), i};
            }
            hashValueIndex.put(input[i], i);
        }
        return ret;
    }
}

