import java.util.Set; 
import java.util.HashSet; 
/**
 * What is the value of following code snippet
 * Set<Integer> naturalNumber = new HashSet<Integer>();
        naturalNumber.add(1);
        naturalNumber.add(new Integer(1));
        int a = 1;
        Integer ab = new Integer(1);
        naturalNumber.add(ab);
        naturalNumber.add(a);
        naturalNumber.add(Integer.valueOf(a));
 */
public class SetQ1 {
    public Set<Integer> getNumbers() {
        Set<Integer> naturalNumber = new HashSet<Integer>();
        naturalNumber.add(1);
        naturalNumber.add(new Integer(1));
        int a = 1;
        Integer ab = new Integer(1);
        naturalNumber.add(ab);
        naturalNumber.add(a);
        naturalNumber.add(Integer.valueOf(a));
        return naturalNumber;
    }

    public static void main(String[] args) {
        SetQ1 val = new SetQ1();
        Set<Integer> naturalNumber = val.getNumbers();
        System.out.println(naturalNumber);
    }
    
}