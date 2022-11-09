package java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Example of converting Array to stream
 */
public class ArrayToStream {
    public static void main(String []args) {
       String names[] = {"Man","August","Den","Jorge","Marco"};

       //Converting array to stream using Arrays
       Stream<String> stream1 = Arrays.stream(names);

       //converting array to stream using Stream.of() method
       Stream<String> stream2 = Stream.of(names);

       stream1.forEach(elem->System.out.println(elem));
       stream2.forEach(System.out::println);
    }
}