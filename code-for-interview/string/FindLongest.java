package string;

public class FindLongest {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String firstStr = strs[0];

        for(int i=0; i<strs.length; i++) {
            while (strs[i].indexOf(firstStr)!=0){
                firstStr = firstStr.substring(0,firstStr.length()-1);
            }
        }

        return firstStr;
    }
}
