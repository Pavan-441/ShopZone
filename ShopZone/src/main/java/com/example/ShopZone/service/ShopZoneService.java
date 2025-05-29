package com.example.ShopZone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.ShopZone.model.Products;
import com.example.ShopZone.model.User;
import com.example.ShopZone.repository.ProductRepository;
import com.example.ShopZone.repository.UserRepository;


@Service
@ControllerAdvice
public class ShopZoneService {

    @Autowired
    UserRepository userrepo;

    @Autowired
    ProductRepository productrepo;
    

    // User CRUD Operations
    // All CRUD Logics
    // For Post the user data logic 
    public String postUsers(User user){
        try{
            return userrepo.save(user) != null ? "Successfully added user details" : "error occured";
        }catch(Exception e){
            return e.getMessage();
        }
    }

    // For Get the user logic
    public List<User> getAllUsers(){
        try{
            return userrepo.findAll();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // For Get the user by Id
    public User getAllUsersById(Long id){
        try{
            return userrepo.findById(id).orElse(null);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // For updating the user by id 
    public String updateUserById(Long id, User updatedUser) {
        try{
            return userrepo.findById(id).map(existingUser -> {
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        
        userrepo.save(existingUser);
        return "Updated successfully";
    }).orElse("User with ID " + id + " not found");
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    
    }

    // For deleting user by Id
    public String deleteUserById(Long id){
        try{
            userrepo.deleteById(id);
            return "Deleted Successfully";
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    //Products CRUD Operations
    public String postProducts(Products products){
        try{
             return productrepo.save(products) != null ? "Product added Successfully" : "error occured while adding product";         
        }catch(Exception e){
            return e.getMessage();
        }
    }

    public List<Products> getAllProducts(){
        try{
            return productrepo.findAll();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Products getProductById(Long id){
        try{
            return productrepo.findById(id).orElse(null);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public String updateProductById(Long id, Products UpdatedProduct){
        try{
            return productrepo.findById(id).map(existingProduct ->{
                existingProduct.setName(UpdatedProduct.getName());
                existingProduct.setDescription(UpdatedProduct.getDescription());
                existingProduct.setPrice(UpdatedProduct.getPrice());
                existingProduct.setImageUrl(UpdatedProduct.getImageUrl());
                existingProduct.setCategory(UpdatedProduct.getCategory());

                productrepo.save(existingProduct);
                return "Updated Successfully";
            }).orElse("Product with ID " + id + " is not found.");
        }catch(Exception e){
            e.printStackTrace();
            return "Error occured";
        }
    }

    public String deleteProductById(Long id){
        try{
            productrepo.deleteById(id);
            return "Deleted Successfully";
        }catch(Exception e){
            return e.getMessage();
        }
    }

    

}
