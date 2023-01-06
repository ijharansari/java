package string;

public class StringUtil {
    private String words[];

    public String[] getWords() {
        return words;
    }
    public void setWords(String words[]) {
        this.words = words;
    }

    public String createLargestString(String words){
        //guarding for null or empty
        if(words == null || words.isEmpty()){
            return null;
        }

        char wordChar[] = {};
        String largerWord = "";
        for(String word: this.words) {
            wordChar = word.toCharArray();
            boolean isWordAvailable = true;
            for(char ch: wordChar) {
                if(words.indexOf(ch)== -1) {
                    isWordAvailable = false;
                    break;
                }
            }
            if(largerWord.length() < word.length() && isWordAvailable) {
                largerWord = word;
            }
        }
        return largerWord;
    }

    public String longestCommonPrefix(String strs[]) {
        if(strs == null || strs.length == 0) return "";

        String pref = strs[0];
        int i = 1;

        while (i < strs.length) {
            while (strs[i].indexOf(pref) != 0)
                pref = pref.substring(0,pref.length()-1);
               i++; 
        }
        return pref;
    }
    
    public static void main(String args[]) {
        StringUtil util = new StringUtil();
        util.setWords(new String[]{"ijhar","ijharansari","ijh"});
        String name = "iamijhar";
        char c = 'm';
        String str = util.createLargestString("thisisijharansar");
        String longestStr = util.longestCommonPrefix(util.getWords());
        System.out.println(str);
        System.out.println(longestStr);
    }
}
