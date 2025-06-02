package com.example.ShopZone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShopZone.model.Cart;
import com.example.ShopZone.model.CartItem;
import com.example.ShopZone.model.Products;
import com.example.ShopZone.model.User;
import com.example.ShopZone.service.ShopZoneService;

@RestController
public class ShopZoneController {
    
    @Autowired
    ShopZoneService service;


    // Users API's
    @PostMapping("/users")
    public String postUserDetails(@RequestBody User user){
        return service.postUsers(user);
    }

    @GetMapping("/users")
    public List<User> getAllUserDetails(){
        return service.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getAllUserDetailsById(@PathVariable Long id){
        return service.getAllUsersById(id);
    }

    @PutMapping("/users/{id}")
    public String updateUserDetailsById(@PathVariable Long id, @RequestBody User user){
        return service.updateUserById(id, user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserDetailsById(@PathVariable Long id){
        return service.deleteUserById(id);
    }


    // Products table API's

    @PostMapping("/products")
    public String postProductDetails(@RequestBody Products product){
        return service.postProducts(product);
    }

    @GetMapping("/products")
    public List<Products> getAllProductDetails(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Products getProductDetailsById(@PathVariable Long id){
        return service.getProductById(id);
    }

    @PutMapping("/products/{id}")
    public String updateProductDetailsById(@PathVariable Long id, @RequestBody Products product){
        return service.updateProductById(id, product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductDetailsById(@PathVariable Long id){
        return service.deleteProductById(id);
    }


    //CRUD operations for Cart Table

    @PostMapping("/cart")
    public String postCartDetails(@RequestBody Cart cart){
        return service.postCart(cart);
    }

    @GetMapping("/cart")
    public List<Cart> getAllCartDetails(){
        return service.getAllCart();
    }

    @GetMapping("/cart/{id}")
    public Cart getCartDetailsById(@PathVariable Long id){
        return service.getCartById(id);
    }

    @PutMapping("/cart/{id}")
    public String updateCartDetailsById(@PathVariable Long id, @RequestBody Cart cart){
        return service.updateCartById(id, cart);
    }

    @DeleteMapping("/cart/{id}")
    public String deleteCartDetailsById(@PathVariable Long id){
        return service.deleteCartById(id);
    }


        //CRUD operations for CartItem Table

    @PostMapping("/cartitem")
    public String postCartItemDetails(@RequestBody CartItem cartitem){
        return service.postCartItem(cartitem);
    }

    @GetMapping("/cartitem")
    public List<CartItem> getAllCartItemDetails(){
        return service.getAllCartItem();
    }

    @GetMapping("/cartitem/{id}")
    public CartItem getCartItemDetailsById(@PathVariable Long id){
        return service.getCartItemById(id);
    }

    @PutMapping("/cartitem/{id}")
    public String updateCartItemDetailsById(@PathVariable Long id, @RequestBody CartItem cartitem){
        return service.updateCartItemById(id, cartitem);
    }

    @DeleteMapping("/cartitem/{id}")
    public String deleteCartItemDetailsById(@PathVariable Long id){
        return service.deleteCartItemById(id);
    }


}
