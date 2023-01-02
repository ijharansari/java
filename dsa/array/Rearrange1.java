package dsa.array;

import java.util.HashSet;

public class Rearrange1 {
    public int[] rearrangeArr(int[] arr) {
        if(arr.length == 0) {
            return arr;
        }

        int newArr[] = new int[arr.length];
        HashSet<Integer> hashes = new HashSet<>();
        for(int data: arr) {
            hashes.add(data);
        }

        //main logic
        for(int i=0; i<arr.length; i++) {
            if(hashes.contains(i)) {
                newArr[i] = i;
            }else {
                newArr[i] = -1;
            }
        }
        return newArr;
    }

    public static void main(String args[]) {
        Rearrange1 r = new Rearrange1();
        int[] newArr = r.rearrangeArr(new int[]{19, 7, 0, 3, 18, 15, 12, 6, 1, 8,11, 10, 9, 5, 13, 16, 2, 14, 17, 4});

        for(int data:newArr) {
            System.out.println(data+", ");
        }
    }
}
