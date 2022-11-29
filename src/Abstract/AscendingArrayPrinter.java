package Abstract;

import java.util.List;

public class AscendingArrayPrinter extends ArrayPrinter{
    @Override
    public void print(List<Integer> integers) {
        for (Integer integer:integers){
            System.out.println(integer);
        }
    }
}
