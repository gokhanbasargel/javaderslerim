public class Main {
    public static void main(String[] args){
       int sayi1 = 50;
       int sayi2 = 55;
       int sayi3 = 50;

       int enBuyuk = sayi1;


       if (enBuyuk<sayi2) {
           enBuyuk = sayi2;

       }
       else if (enBuyuk<sayi3) {
           enBuyuk = sayi3 ;

       }
       if(sayi1==sayi2&&sayi3==sayi2){
           System.out.println("Sayılar eşittir.");
        }
       else{
           System.out.println("En Büyük Sayı : " + enBuyuk);
       }





    }
}