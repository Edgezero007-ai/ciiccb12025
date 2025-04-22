package chapter1;
import java.util.Date;
// import java.sql.Date;

import otherFolder.SunFlower;

public class NamingConflictLesson {
    java.sql.Date SqlDate;
    // java.util.Date Date;
    Date date;
    
    public static void main(String[] args) {
        otherFolder.SunFlower s1 = new SunFlower();
        // System.out.println(s1.message);    
    }
}
