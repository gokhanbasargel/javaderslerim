public class Main {
    public static void main(String[] args) {
        // Overriding : Aynı imza ile inherite edilen methodlar farklı şekillerde inheritance işlemini bozmadan çalışır.
        BaseCreditManager[] CreditManager = new BaseCreditManager[]{new GardenerCreditManager(),new TeacherCreditManager(),new StudentCreditManager()};
        for (BaseCreditManager creditManager : CreditManager){
            System.out.println(creditManager.calculate(1000));
        }
    }
}