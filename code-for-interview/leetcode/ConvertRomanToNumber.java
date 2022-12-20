package leetcode;

import java.util.Map;
import java.util.HashMap;

public class ConvertRomanToNumber {
    public int romanToNumber(String romanStr) {
        Map<Character,Integer> romanToNumberMap = new HashMap<>();

        romanToNumberMap.put('i', 1);
        romanToNumberMap.put('v', 5);
        romanToNumberMap.put('x', 10);
        romanToNumberMap.put('l', 50);
        romanToNumberMap.put('c', 100);
        romanToNumberMap.put('d', 500);
        romanToNumberMap.put('m', 1000);

        char strToChar[] = romanStr.toCharArray();
        int num[] = new int[strToChar.length];
        int sum = 0;
        for(int i=0; i<strToChar.length; i++) num[i] = romanToNumberMap.get(strToChar[i]);

        for(int i=0; i<strToChar.length; i++) sum = i == strToChar.length-1 || num[i]>= num[i+1]?sum+num[i]:sum-num[i];
        return sum;
    }
}
