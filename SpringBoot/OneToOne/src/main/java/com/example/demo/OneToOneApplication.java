package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Repository.CustomerRepository;
import com.example.Repository.ItemRepository;
import com.example.model.Customer;
import com.example.model.Item;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer("Raj");
		Item item1=new Item("Narrato Bag");
		
		customer.setItem(item1);
		customerRepository.save(customer);
	}

}
