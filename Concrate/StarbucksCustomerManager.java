package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.isValid(customer)){
            super.save(customer);
            System.out.println("Starbucks Coffee Sistemine Kayıt Oldu :  " + customer.getFirstName() + " " + customer.getLastName());

        }
        else{
            System.out.println("HATA: Kullanici Dogrulamadi");
            System.out.println("Kayit Basarisiz Oldu !!");
        }

    }
}
