public class Main {
    public static void main(String[] args) {
        //FOR DÖNGÜSÜ
        // 1 arttırmak için i++
        // diğer katları kadar arttırmak için i+=2,3,4,5
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti.");

    //WHILE DÖNGÜSÜ
    // infinite loop sonsuz döngÜ
        int x = 1;
        while(x<10) {
        System.out.println("Loglandı");
        System.out.println(x);
        x++;
        }
        System.out.println("While Döngüsü Bitti");

        int s = 1;
                                        //Do While Döngüsü
        do {
            System.out.println(s);
            s++;
        }while (s<10);

        System.out.println("Do While Döngüsü Bitti");
}
}
