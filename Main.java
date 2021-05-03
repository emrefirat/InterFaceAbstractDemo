import Abstract.BaseCustomerManager;
import Concrate.NeroCustomerManager;
import Validators.InternalValidator;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;
import Validators.MernisValidator;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1,"Emre","FIRAT","1997","13213");
        Customer customer2 = new Customer(2,"Emre","FIRAT","1993","13213");
        Customer customer3 = new Customer(3,"Emre","FIRAT","1997","12345678900");

        System.out.println("********* STARBUCKS KAYIT ISLEMI (InternalValidator) *********");
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new InternalValidator());
        starbucksCustomerManager.save(customer1);
        System.out.println("--------------------------------------------------------");
        System.out.println("********* NERO COFFEE KAYIT ISLEMI *********");
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
        neroCustomerManager.save(customer2);
        System.out.println("--------------------------------------------------------");
        System.out.println("********* STARBUCKS KAYIT ISLEMI (MernisValidator) *********");
        BaseCustomerManager starbucksCustomerManager2 = new StarbucksCustomerManager(new MernisValidator());
        starbucksCustomerManager2.save(customer3);


    }
}
