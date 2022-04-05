package com.example.demo.Controller;

import com.example.demo.Models.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Models.Products;
import com.example.demo.Repo.ProductRepo;
import com.example.demo.Models.Order;
import com.example.demo.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ApiControllers(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome. You can navigate to Users / Orders / Products ";
    }
    @GetMapping(value= "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    @GetMapping(value= "/orders")
    public List<Order> getOrders(){
        return orderRepo.findAll();
    }
    @GetMapping(value= "/products")
    public List<Products> getProducts(){
        return productRepo.findAll();
    }

    @PostMapping(value="/saveuser")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "User Saved...";
    }
        @PostMapping(value="/saveorder")
        public String saveOrder(@RequestBody Order order) {
           orderRepo.save(order);
            return "Order Saved...";
    }
        @PostMapping(value="/saveproduct")
        public String saveProduct(@RequestBody Products product) {
            productRepo.save(product);
            return "Product Saved...";}


    @PutMapping(value="updateuser/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setOccupation(user.getOccupation());

        userRepo.save(updatedUser);
        return "User Updated...";
    }
        @PutMapping(value="updateorder/{id}")
        public String updateOrder(@PathVariable long id, @RequestBody Order order){
            Order updatedOrder = orderRepo.findById(id).get();
            updatedOrder.setUserId(order.getUserId());
            updatedOrder.setOrderDate(order.getOrderDate());
            updatedOrder.setTotalOrder(order.getTotalOrder());

            orderRepo.save(updatedOrder);
            return "Order Updated...";
        }

        @PutMapping(value="updateproduct/{id}")
        public String updateProduct(@PathVariable long id, @RequestBody Products product){
            Products updatedProduct = productRepo.findById(id).get();
            updatedProduct.setProductName(product.getProductName());
            updatedProduct.setProductQuantity(product.getProductQuantity());
            updatedProduct.setProductPrice(product.getProductPrice());
            updatedProduct.setTotalSales(product.getTotalSales());
            productRepo.save(updatedProduct);
            return "Product Updated...";
        }


    @DeleteMapping (value = "/deleteuser/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted User with id "+id;
    }
        @DeleteMapping (value = "/deleteorder/{id}")
        public String deleteOrder(@PathVariable long id){
            Order deleteOrder = orderRepo.findById(id).get();
            orderRepo.delete(deleteOrder);
            return "Deleted User with id "+id;
        }

        @DeleteMapping (value = "/deleteproduct/{id}")
        public String deleteProduct(@PathVariable long id){
            Products deleteProduct = productRepo.findById(id).get();
            productRepo.delete(deleteProduct);
            return "Deleted Product with id "+id;
        }

}
