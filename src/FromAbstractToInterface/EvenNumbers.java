package FromAbstractToInterface;

import java.util.List;

public class EvenNumbers extends EmptyClass implements ArrayPrinter{
    @Override
    public void print(List<Integer> integers) {
        for (Integer integer:integers){
            if (integer%2==0){
                System.out.println(integer);
            }
        }
    }
}
