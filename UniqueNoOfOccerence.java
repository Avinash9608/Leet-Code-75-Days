package LeetCode75;

import java.util.HashMap;

public class UniqueNoOfOccerence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        System.out.println(freq);
        HashMap<Integer, Integer> freqOfFreq = new HashMap<>();
        for (int count : freq.values()) {
            freqOfFreq.put(count, freqOfFreq.getOrDefault(count, 0) + 1);
        }
        for (int freqCount : freqOfFreq.keySet()) {
            System.out.println(freqCount + ": " + freqOfFreq.get(freqCount));
        }
        System.out.println(freqOfFreq);
    }
}
