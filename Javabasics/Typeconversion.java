import java.util.*;

public class Typeconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       float number = sc.nextInt();   //Type Conversion (int → float)
       System.out.println(number);

       long number2 = sc.nextInt();   // int automatically converts to long
        System.out.println(number2);

        sc.close();
    }
}
