import java.util.List;

public class ArrayPrinter {

    public void print(List<Integer> integers,boolean flag){

       if(flag){
           for(Integer integer:integers){
               System.out.println(integer);
           }
       }else {
           for (int i=integers.size()-1;i>=0;i--){
               System.out.println(integers.get(i));
           }
       }
    }
}
