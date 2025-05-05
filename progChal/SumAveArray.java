package progChal;
import java.util.*;
public class SumAveArray {
    public static void main(String[] args) {
        int[] arr =  {91,82,93,84,75};
    int sum = Arrays.stream(arr).sum(); // 0
    float average = 0;
    // for(int i:arr)
    //     sum+=i;
    average = sum/arr.length;
    System.out.println("sum = "+sum+"\naverage = "+average); 

    
    }
}
