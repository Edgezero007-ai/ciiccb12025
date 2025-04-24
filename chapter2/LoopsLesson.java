package chapter2;

import java.util.Scanner;

public class LoopsLesson {
   public static void main(String[] args) {
        byte a = 1;
        while(a<=10)
            System.out.println("a = "+a++);
       

        do
            System.out.println("do while : a = "+a--);
        while (a<10);
        System.out.println("end of program");
        int b = 0;
        boolean bol = true;
        for( ;b<10;b++)
            System.out.println("b = "+b++);

      
        for(int x=1;x<9;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }
        String[] colors ={"black","red","pink","yellow","white","blue"}; 
        for(String color: colors)
            System.out.println("Color: "+color);
   } 
}
