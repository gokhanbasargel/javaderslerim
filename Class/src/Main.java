import business.*;
import entities.CompanyCustomers;
import entities.Customer;

public class Main {
    public static void main(String[] args) {

        // IOC Container : Birbirine bağımlılığı az olan nesneler geliştirme prensibidir.
        // Polymorfism : Çok biçimlilik kavramıdır, bir işe farklı biçimlerde davranış sergiletme prensibidir.
        // Abstract class : metodları tekrarlamamak için oluşturduğumuz ortak metodları tutan sınıflardır. Bir sınıf sadece bir abstract classı inherite edebilir.
        // abstract classlar newlenemez.
                                        //SOLID
        // S - Single Responsibility Principle
        //Bir sınıfın değiştirmek için sadece bir nedeni olmalıdır. Yani bir sınıf sadece tek bir sorumluluğa sahip olmalıdır.
        // O - Open Closed Principle
        //Bir sınıfın davranışını değiştirmeden genişletebilmeniz gerekir.
        // L - Liskov Substitution Principle
        //Türetilmiş sınıflar temel sınıflarının yerine geçmelidir. Türeyen sınıf yani alt sınıflar ana sınıfın tüm özelliklerini,
        // tüm metotlarını aynı işlevi gösterecek şekilde kullanabilme ve kendine ait yeni özellikler barındırabilmelidir.
        // I - Interface Segregation Principle
        //Interface’ler sınıfların anlaşmalarıdır. Haliyle bir sınıfa uygulanan bir Interface zorunlu şekilde ilgili sınıfa uygulanmaktadır.
        // Bu durumda söz konusu Interface yetersiz ya da fazla geliyorsa, o sınıfı dağıtmak yerine yeni bir Interface oluşturmak daha iyi olacaktır.
        // Interface Segregation prensibindeki mantık budur.
        // D - Dependency Inversion Principle
        //Üst ve alt sınıfların birbirlerine bağımlı olmalarına karşı çıkan bir prensiptir.
        //Bir sınıfın, metodun ya da özelliğin, onu kullanan diğer sınıflara karşı olan bağımlılığı en aza indirgenmesini öneren bir prensiptir.
        // Alt sınıfta yapılan değişiklikler üst sınıfları etkilememelidir.

        // Contstrackter Bloğu yapıcı bloklardır.


        CompanyCustomers companyCustomers = new CompanyCustomers();
        CreditManager creditManager = new CreditManager();
        IcreditManager icreditManager = new IcreditManager() {
            @Override
            public void save() {

            }

            @Override
            public void claculate() {

            }
        };

        creditManager.Save();
        creditManager.Calculate();


        Customer customer = new Customer();

        customer.setFirstName("Engin");
        customer.setLastName("Demiroğ");
        customer.setId(1);
        customer.setNationalIdentity("123234");



        CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());





        }

    }





