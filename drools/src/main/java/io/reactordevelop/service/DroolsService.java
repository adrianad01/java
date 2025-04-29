package io.reactordevelop.service;

import io.reactordevelop.config.DroolsBeanFactory;
import io.reactordevelop.dto.Customer;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {

    @Autowired
    DroolsBeanFactory droolsBeanFactory;

    public Customer applyCategoryToCustomer(Customer customer) {
        KieSession kieSession = droolsBeanFactory.getKieSession();
        try {
            kieSession.insert(customer);
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }
        System.out.println(customer);
        return customer;
    }
}
