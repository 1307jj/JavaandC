// Ch14 - 3.4 SequenceInputStream
import java.io.*;
import java.util.*;

class Ex88 {
    public static void main(String[] args) {
        byte[] arr1 = {0, 1, 2};
        byte[] arr2 = {3, 4, 5};
        byte[] arr3 = {6, 7, 8, 9};
        byte[] outSrc = null;

        Vector<ByteArrayInputStream> v = new Vector<>();
        v.add(new ByteArrayInputStream(arr1));
        v.add(new ByteArrayInputStream(arr2));
        v.add(new ByteArrayInputStream(arr3));

        SequenceInputStream  input  = new SequenceInputStream(v.elements());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = 0;
        try {
            while ((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (IOException e) {
        }

        outSrc = output.toByteArray();
        System.out.println("Output Source : " + java.util.Arrays.toString(outSrc));
    }
}
