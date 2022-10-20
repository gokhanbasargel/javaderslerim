import bussiness.ProductManager;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        // Encapsulation : Bir nesneyi bulunduğu bloğa özel yapma işlemidir.

        // hatalı kodun kullanımı eğer kodu böyle yazarsak ekleme durumunda yeni özellik ekleme durumunda kendini fazlasıyla tekrarlamış olursun
        ProductManager productManager = new ProductManager();
        productManager.add(1,"","",1,2345);
        // en doğru kullanım getter setter ve constractor kullanmaktır.

        Product product = new Product();
        product.setName("Laptop");
        product.setId(9);
        System.out.println(product.getKod());

    }
}