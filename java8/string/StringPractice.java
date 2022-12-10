package java8.string;

public class StringPractice {
    //convert char to string
    public String convertToString(char[] charVal) {
        if(charVal.length == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();

        for(char data: charVal) {
            stringBuilder.append(data);
        }

        return stringBuilder.toString();
    }

    public static void main(String args[]){
        StringPractice sp = new StringPractice();
        System.out.println(sp.convertToString(new char[]{'a','b','c'}));
    }
}
