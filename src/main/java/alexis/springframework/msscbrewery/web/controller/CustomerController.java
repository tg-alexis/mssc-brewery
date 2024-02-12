package alexis.springframework.msscbrewery.web.controller;

import alexis.springframework.msscbrewery.services.CustomerService;
import alexis.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

   private final CustomerService customerService;

   public CustomerController(CustomerService customerService) {
       this.customerService = customerService;
   }

   @GetMapping("/{customerId}")
   public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
       return ResponseEntity.ok(customerService.getCustomerById(customerId));
   }
}
