//package com.example.demo.repositories;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.entities.Cart;
//
//@Repository
//public interface CartRepository extends JpaRepository<Cart,Integer>{
////	@Query("select c from cart c where c.cust_id= ?1")
////	 public List<Cart> findbyCustomer(int cid);
//
//	 @Modifying
//	    @Query(value = "insert into Cart (quantity,cust_id,prod_id) VALUES (?1,?2,?3)", nativeQuery = true)
//	    @Transactional
//	    public void addtoCart(int quantity,int cust_id, int prod_id);
//
//}
//
