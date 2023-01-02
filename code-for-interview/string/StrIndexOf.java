package string;

public class StrIndexOf {
    String strValue;
    StrIndexOf(String strValue) {
        this.strValue = strValue;
    }
    public int getIndexOf(String str) {
        return strValue.indexOf(str);
    }
    public static void main(String args[]) {
        StrIndexOf str = new StrIndexOf("ijharansari");
        System.out.println("Index of =>"+ str.getIndexOf("ijhar"));
    }
}
