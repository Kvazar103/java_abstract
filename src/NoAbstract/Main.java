package NoAbstract;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> integers= Arrays.asList(1,2,30,4);
       ArrayPrinter arrayPrinter=new ArrayPrinter();

       showListInfo(integers,arrayPrinter,true);
    }
    public static void showListInfo(List<Integer> numbers, ArrayPrinter arrayPrinter, boolean flag){
        arrayPrinter.print(numbers,flag);
    }
}
