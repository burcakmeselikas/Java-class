public class Second {
    public static void main(String[] args) {
     double ocak=18.2;
     double şubat=22.6;
     double mart=26.4;
     double nisan=31.1;
     double mayıs=36.6;
     double haziran=42.2;
     double temmuz=45.7;
     double ağustos=44.5;
     double eylül=40.2;
     double ekim=33.1;
     double kasım=24.2;
     double aralık=17.6;
     
     if ( ocak>şubat) {
         System.out.print("En sıcak ay Ocak");
     }
      else if ( şubat>mart) {
         System.out.print("En sıcak ay Şubat");
     }
      else if ( mart>nisan ) {
         System.out.print("En sıcak ay Mart");
     }
     else if  ( nisan>mayıs) {
         System.out.print("En sıcak ay Nisan");
     }
     else if (mayıs>haziran) {
         System.out.print("En sıcak ay Mayıs");
     }
     else if ( haziran>temmuz) {
         System.out.print("En sıcak ay Haziran");
     }
     else if ( temmuz>ağustos) {
         System.out.print("En sıcak ay Temmuz");
     }
     else if ( ağustos>eylül) {
         System.out.print("En sıcak ay Ağustos");
     }
     else if ( eylül>kasım) {
         System.out.print("En sıcak ay Eylül");
     }
     else if ( kasım>aralık) {
         System.out.print("En sıcak ay Kasım");
     }
    }
}