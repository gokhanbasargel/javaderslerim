public class Main {
    public static void main(String[] args) {
                                                 //TAM SAYILAR

        int sayi = 12;
        sayi = 13;

        // integer type : tam sayı tutar bellkete 4 byte alan kullanır.
        // - 2milyar dan küçük + 2 milyardanm büyük sayı tutmaz

        byte sayi1 = 127;
        sayi1 = -127;

        // byte type : tam sayı tutar bellekte 1 byte alan kullanır.
        // -127 den + 127 arasında sayı tutar.

        long sayi2 =999999999;
        sayi2 = -999999999;

        // long type : tam sayı tutar bellekte 8 byte alan kullanır.
        //örnekteki kadar sayı tutabilirler.

                                              //ONDALIKLI SAYILAR
        double sayi3 = 1.33333333333333333;
        //sayi3 = -1213123242.5;

        // double type : onldalıklı sayı tutar bellekte 8 byte alan kullanır.
        // örnekteki aralıkta kullanılır.

        float sayi4 = (float) 1.333333333333;
        // 3.40282347x10.38 ile -1.40239846x10.-45 arasında tutulur.
        // 8byte yer kaplar.

                                            //METİNSEL VERİ TİPLERİ
        char karakter = 'A';

        // karakter tutar bir harf ile sınırlıdır. 2 byte yer kaplar

        String metin = "Metin tutar";

        // Stringler metin tutar sınırları yoktur. kapladıkları alan değişkendir.

                                              //BOOLEAN VERİ TİPİ
        boolean dogruMU = true;

        // karşılığı doğru veya yanlıştır. aslında karşılığı 0 veya 1 dir.

    }
}