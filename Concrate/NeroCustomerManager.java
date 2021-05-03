package Concrate;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) {
        super.save(customer);
        System.out.println("Nero Coffee Sistemine Kayıt Oldu :  " + customer.getFirstName() + " " + customer.getLastName());

    }
}
