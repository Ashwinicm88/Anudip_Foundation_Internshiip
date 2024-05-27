package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
