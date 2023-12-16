import java.util.Scanner;
public class Chess {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String word= scan.next();
    String fl= word.substring(0,1);
    System.out.println(fl);
    int num = 0;
    String nums= word.substring(1,2); // "2"
    num = Integer.parseInt(nums);
    if ( fl == "a" || fl == "c" || fl == "e" || fl == "g" ) {
        System.out.println("birinci if çalıştı");
        if (num % 2 ==0) {
            System.out.print("white");
        }
        else 
            System.out.print("black");
    }
    else {
        System.out.println("2. if çalıştı");
        if (num % 2 ==0) {
            System.out.print("black");
        }
        else 
            System.out.print("white");
    }
}
} 