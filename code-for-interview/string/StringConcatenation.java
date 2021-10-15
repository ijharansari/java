import java.util.StringJoiner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringConcatenation{
    public static void main(String[] args) {
        String fname = "Ijhar";
        String lname = "Ansari";

        //method 1
        String fullName1 = String.format("%s %s",fname,lname);
        System.out.println(fullName1);

        //method 2
        String fullName2 = String.join(" ",fname,lname);
        System.out.println(fullName2);

        //method3
        StringJoiner fullName3 = new StringJoiner(" ");
        fullName3.add(fname);
        fullName3.add(lname);
        System.out.println(fullName3);

        //method4
        List<String> employeeName = Arrays.asList("Ijhar ansari","Tabrez ansari","Javed Ansari");
        String commaSeparated = employeeName.stream().collect(Collectors.joining(", "));
        System.out.println(commaSeparated);

        List<String> empNameList = Arrays.asList("Tabrez ansari", "Ijhar ansari");
        System.out.println(empNameList.stream().collect(Collectors.joining(": ")));
    }
}