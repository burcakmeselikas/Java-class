import java.util.Scanner;
public class Smaller {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Enter two integers seperated by one or more spaces");
        int a = oku.nextInt();
        int b =oku.nextInt();
        System.out.println("The larger integer is " + Math.max(a, b));
    }
}