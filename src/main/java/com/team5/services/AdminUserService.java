package com.team5.services;

import com.team5.repositories.AdminUserRepository;
import com.team5.models.AdminUsers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService {
    @Autowired
    AdminUserRepository repository;

    public List<AdminUsers> getAllAdminUsers() {
        return repository.findAll();
    }

    public AdminUsers getByAdminUserId(String id) {
        return repository.findById(id).orElse(null);
    }

    public AdminUsers addAdminUser(AdminUsers adminUser) {
        return repository.save(adminUser);
    }

    public AdminUsers updateAdminUser(String id, AdminUsers adminUser) {
        AdminUsers existingAdminUser = repository.findById(id).orElse(null);
        if (existingAdminUser != null) {
            existingAdminUser.setUsername(adminUser.getUsername());
            existingAdminUser.setPassword(adminUser.getPassword());
            return repository.save(existingAdminUser);
        }
        return repository.save(adminUser);
    }

    public void deleteAdminUser(String id) {
        AdminUsers existingAdminUser = repository.findById(id).orElse(null);
        if (existingAdminUser != null) {
            repository.delete(existingAdminUser);
            System.out.println("Admin user deleted successfully");
        } else {
            System.out.println("Admin user not found");
        }
    }
}



            




