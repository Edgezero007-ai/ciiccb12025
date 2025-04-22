package chapter1;
import java.util.Arrays; // will compile
import otherFolder.SunFlower;
public class ReferenceLesson {
    public ReferenceLesson(){
        
    }
    public static void main(String[] args) {
        java.util.Date today = new java.util.Date();
        String greeting = "How are you?";
        int x = Integer.parseInt(args[0]);
        System.out.println(x+100);
    }
}
