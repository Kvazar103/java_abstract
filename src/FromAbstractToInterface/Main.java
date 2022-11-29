package FromAbstractToInterface;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(11,22,33,44);
        showListInfo(integers,new DescendingArrayPrinter());
        System.out.println("****");
        showListInfo(integers,new EvenNumbers());
    }
    public static void showListInfo(List<Integer> integers,ArrayPrinter arrayPrinter){
        arrayPrinter.print(integers);
    }
}
