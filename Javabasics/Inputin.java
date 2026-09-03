import java.util.*;

public class Inputin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int i = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        System.out.println("\nValues Entered:");
        System.out.println("Integer = " + i);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Short = " + s);

        sc.close();
    }
}

