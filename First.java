import java.util.Scanner;
public class First {
    public static void main(String[] args) {
      System.out.println("Please enter scale=");  
     Scanner scan= new Scanner(System.in);
     double scale= scan.nextDouble();
     if ( scale>=8) {
         System.out.println("Most structures fall");
     }
     else if ( scale>=7) {
         System.out.println("Many building destroyed");
     }
     else if ( scale>=6 ) {
         System.out.println("Many building considerably damaged, some collapse");
     }
     else {
         System.out.println("Damage to poorly constructed buildings");
     }
    }
}