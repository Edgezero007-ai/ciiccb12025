package chapter2;

public class OperatorsLesson{
    public static void main(String[] args){
        int a = +9;
        int b = 5;
        boolean pass = true;
        System.out.println(10 - a++ + --b);
        System.out.println(!pass);
        pass = !pass;
        System.out.println(a);
        System.out.println(b);
        System.out.println(pass);
        System.out.println(5%3);
        System.out.println(6<<1);
        // 0011
        // 0110
        // 1100
        System.out.println(12>>4);
        System.out.println(1<=1);
        System.out.println(b==4);
        double x = 39.21D;
        float y = 2.1F;
        short l  = 10;
        short p = 10;
        short sum =(short) (l+p);
        String chair, table = "metal";
        // chair = chair+table;
        System.out.println((x<y)||true);


    }
}