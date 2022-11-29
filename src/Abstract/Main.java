package Abstract;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<Integer> integers= Arrays.asList(1,2,3,4);
         showListInfo(integers,new DescendingArrayPrinter());
         System.out.println("******");
        showListInfo(integers,new AscendingArrayPrinter());
    }
    public static void showListInfo(List<Integer> integers,ArrayPrinter arrayPrinter){
        arrayPrinter.print(integers);
    }
}
