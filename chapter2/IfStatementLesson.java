package chapter2;

public class IfStatementLesson {
    public static void main(String[] args) {
        int hourOfDay=22;
        if(hourOfDay<11)
            System.out.println("Good Morning");
        System.out.println("Kumain kana ba?");

        //if else
        if(hourOfDay<11)
            System.out.println("Good Morning");
        else
            System.out.println("Good Afternoon");
        System.out.println("Good Afternoon");

        //if, else if, else
        if(hourOfDay>=18)
            System.out.println("Good Eve");
        else if(hourOfDay>=12)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Morning");
        // (boolean expression) T : F;
    }
}
