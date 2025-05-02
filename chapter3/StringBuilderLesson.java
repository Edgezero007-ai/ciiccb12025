package chapter3;

public class StringBuilderLesson {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello ");
        System.out.println(sb1);
        String greetMe = "Hello ";
        System.out.println(sb1.toString()==greetMe);
    }
}
