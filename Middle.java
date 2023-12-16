import java.util.Scanner;
public class Middle {
    public static void main(String[] args) {
        System.out.print("Bir kelime yazınız:");
        Scanner scan=new Scanner(System.in);
        String word= scan.next();
        int len= word.length();
        //System.out.print();
        if ( len % 2 == 0){
            int mid= len / 2 - 1;
            String result = word.substring(mid,mid+2);
            System.out.print(result);
        }
        else {
            int mid= len / 2;
             System.out.print(word.substring(mid,mid+1));
        }
    }
}