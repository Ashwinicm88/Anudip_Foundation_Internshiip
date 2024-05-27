package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.model.Cart;
import com.example.model.Item;
import com.example.repository.CartRepository;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class JpaOneToManyBidirectionalApplication{
	public static void main(String args[]) {
		ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(JpaOneToManyBidirectionalApplication.class, args);
		CartRepository cartRepsotory= configurableApplicationContext.getBean(CartRepository.class);
		
		Cart cart= new Cart("c9999");
		Item chocolate = new Item("S123",cart);
		Item shampoo = new Item("S321",cart);
		List<Item> items= Arrays.asList(chocolate,shampoo);
		cart.setItems(items);
		cartRepsotory.save(cart);
	}
}