package com.team5.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.team5.models.AdminUsers;
import com.team5.services.AdminUserService;
@RestController


public class AdminUserController {
    @Autowired
    AdminUserService service;  

    @GetMapping("/adminusers")
    public List<AdminUsers> getAllAdminUsers(){
        return service.getAllAdminUsers();
    }

    @GetMapping("/adminusers/{id}")
    public AdminUsers getByAdminUserId(@PathVariable("id") String id){
        return service.getByAdminUserId(id);
    }

    @PostMapping("/adminusers")
    public AdminUsers addAdminUser(@RequestBody AdminUsers adminUser){
        return service.addAdminUser(adminUser);
    }

    @PutMapping("/adminusers/{id}")
    public AdminUsers updateAdminUser(@PathVariable("id") String id, @RequestBody AdminUsers adminUser){
        return service.updateAdminUser(id,adminUser);
    }

    @DeleteMapping("/adminusers/{id}")
    public void deleteAdminUser(@PathVariable("id") String id){
        service.deleteAdminUser(id);
    }


}






