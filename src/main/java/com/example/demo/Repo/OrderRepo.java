package com.example.demo.Repo;
import com.example.demo.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepo extends JpaRepository<Order, Long> {
}
