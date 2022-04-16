package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
 @Query("select o from Order o where o.ship_id like %?1")
 public List<Order> getShipperOrders();

 @Query("select o from Order o where o.cust_id =?1")
 public List<Order> getOrderByCustId(int cust_id);

}
