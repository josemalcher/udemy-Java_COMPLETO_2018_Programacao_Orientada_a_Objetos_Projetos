package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInteger = Arrays.asList(1, 2, 3);
        List<Double> myDouble = Arrays.asList(2.22, 3.44);
        List<Object> myobject = new ArrayList<Object>();

        copy(myInteger, myobject);
        printList(myobject);

        copy(myDouble, myobject);
        printList(myobject);


    }

    public static void copy(List<? extends Number> source, List<? super Number> distiny) {
        for (Number number : source) {
            distiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();

    }
}
