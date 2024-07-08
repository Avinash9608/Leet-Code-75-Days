package LeetCode75;

import java.util.*;

public class FindDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
//        List<List<Integer>> store = new ArrayList<>();
//        HashMap<Integer, Integer> freqNum1 = new HashMap<>();
//        for (int num : nums1) {
//            freqNum1.put(num, freqNum1.getOrDefault(num, 0) + 1);
//        }
//        HashMap<Integer, Integer> freqNum2 = new HashMap<>();
//        for (int num : nums2) {
//            freqNum2.put(num, freqNum2.getOrDefault(num, 0) + 1);
//        }
//        List<Integer> diff = new ArrayList<>();
//        for (int num : nums1) {
//            if (!freqNum2.containsKey(num)) {
//                diff.add(num);
//            }
//        }
//        if (!diff.isEmpty()) {
//            store.add(diff);
//        }
//        diff = new ArrayList<>();
//        for (int num : nums2) {
//            if (!freqNum1.containsKey(num)) {
//                diff.add(num);
//            }
//        }
//        if (!diff.isEmpty()) {
//            store.add(diff);
//        }
        List<List<Integer>> store = new ArrayList<>();
        Set<Integer> freqNum1 = new HashSet<>();
        for (int num : nums1) {
            freqNum1.add(num);
        }
        System.out.println(freqNum1);
        Set<Integer> freqNum2 = new HashSet<>();
        for (int num : nums2) {
            freqNum2.add(num);
        }
        System.out.println(freqNum2);
        List<Integer> diff1 = new ArrayList<>(freqNum1);
        System.out.println(diff1);
        diff1.removeAll(freqNum2);
        System.out.println(diff1);
        List<Integer> diff2 = new ArrayList<>(freqNum2);
        System.out.println(diff2);
        diff2.removeAll(freqNum1);
        System.out.println(diff2);
        store.add(diff1);
        System.out.println(diff1);
        store.add(diff2);
        System.out.println(diff2);
        System.out.println(store);
    }
}
