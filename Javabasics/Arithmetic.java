import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("add =" + (a+b));
        System.out.println("sud =" + (a-b));
        System.out.println("mul =" + (a*b));
        System.out.println("div =" + (a/b));
        System.out.println("modulo =" + (a%b));

        sc.close();
    }
}

