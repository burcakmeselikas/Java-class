import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        System.out.print("Enter the price: ");
        Scanner scan=new Scanner(System.in);
        double originalPrice=scan.nextDouble();
        double discountedAmount = 0;
        if( originalPrice<128) {
            discountedAmount= originalPrice * 8 / 100;
        }
        else if(originalPrice>=128) {
            discountedAmount= originalPrice * 16 / 100;
        }
        System.out.println("Original Price:" + originalPrice);
        System.out.println("Discount Amount:" + discountedAmount);
        System.out.println("Discount Price:" + (originalPrice - discountedAmount));
        }
            
        }
    
    
