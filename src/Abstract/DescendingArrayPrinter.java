package Abstract;

import java.util.List;

public class DescendingArrayPrinter extends ArrayPrinter{
    @Override
    public void print(List<Integer> integers) {
        for (int i=integers.size()-1;i>=0;i--){
            System.out.println(integers.get(i));
        }
    }
}
