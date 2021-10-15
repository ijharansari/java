import java.util.Set; 
import java.util.HashSet; 
/**
 * What is the value of following code snippet
 * Set<Integer> naturalNumber = new HashSet<Integer>();
        naturalNumber.add(1);
        naturalNumber.add("1");
 */
public class SetQ2 {
    public Set<Integer> getNumbers() {
        Set<Integer> naturalNumber = new HashSet<Integer>();
        naturalNumber.add(1);
        naturalNumber.add("1");
        return naturalNumber;
    }

    public static void main(String[] args) {
        SetQ1 val = new SetQ1();
        Set<Integer> naturalNumber = val.getNumbers();
        System.out.println(naturalNumber);
    }
    
}