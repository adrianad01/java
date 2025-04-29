package io.reactordevelop;
import io.reactordevelop.dto.Customer;
import io.reactordevelop.service.DroolsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = App.class) //
public class DroolsTest {

    @Autowired
    private DroolsService customerService; // <- No final, no constructor

    @Test
    public void whenCustomer_ThenApplyVIPCategory() {
        Customer customer = new Customer("1234", "Jimena Ruiz", 25, 12000);
        customerService.applyCategoryToCustomer(customer);
        assertEquals("VIP", customer.getCategory());
    }
    @Test
    public void whenCustomer_ThenApplyRegularCategory() {
        Customer customer = new Customer("1234", "Jimena Ruiz", 18, 3500);
        customerService.applyCategoryToCustomer(customer);
        assertEquals("Regular", customer.getCategory());
    }
    @Test
    public void whenCustomer_ThenApplyOccasionalCategory() {
        Customer customer = new Customer("1234", "Jimena Ruiz", 8, 1000);
        customerService.applyCategoryToCustomer(customer);
        assertEquals("Occasional", customer.getCategory());
    }
}