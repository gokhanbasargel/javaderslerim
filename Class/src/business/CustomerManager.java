package business;

import entities.Customer;

public class CustomerManager {
    private Customer customer;
    private IcreditManager creditManager;

    public CustomerManager(Customer customer, IcreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void Save(Customer customer){
        System.out.println("Meşteri Kaydedildi : " + customer.getFirstName());
    }
    public void Delete(Customer customer){
        System.out.println("Meşteri Siilindi : " + customer.getFirstName());
    }
    public void GiveCredit(){
        creditManager.claculate();
        System.out.println("Kredi Verildi");
    }
}
