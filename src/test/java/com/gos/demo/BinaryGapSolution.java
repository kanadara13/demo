package com.gos.demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BinaryGapSolution {

    @Test
    void testForBinaryGap(){
        System.out.println(solution(1041));
    }

    int solution(int n) {
        return findLargestGap(Integer.toBinaryString(n), 0);
    }

    private int findLargestGap(String binary, int nextStartIndex) {
        System.out.println(binary);
        List<Integer> gaps = new ArrayList<>();
        while (true) {
            int mappedIndex = getMappedIndex(binary, "10", nextStartIndex);
            if (mappedIndex == -1) {
                return  gaps.stream().max(Integer::compare).orElse(0);
            }
            int nextOneIndex = getMappedIndex(binary,"1", mappedIndex+1);
            if (nextOneIndex == -1) {
                return gaps.stream().max(Integer::compare).orElse(0);
            }
            gaps.add(nextOneIndex-mappedIndex+1);
            nextStartIndex = nextOneIndex;
        }
    }

    private int getMappedIndex(String binary, String target , int nextStartIndex) {
        return binary.indexOf(target, nextStartIndex);
    }
}
