package com.example.demo.Repo;
import com.example.demo.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepo extends JpaRepository<Products, Long> {
}
