package com.team5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.team5.models.Collections;
import com.team5.services.CollectionsService;

@RestController
@RequestMapping("/api/collections") // common prefix for all endpoints
public class CollectionsController {

    @Autowired
    private CollectionsService service;

    // GET all collections
    @GetMapping
    public ResponseEntity<List<Collections>> getAllCollections() {
        List<Collections> collections = service.getAllCollections();
        return ResponseEntity.ok(collections); // 200 OK
    }

    // GET collection by ID
    @GetMapping("/{id}")
    public ResponseEntity<Collections> getByCollectionId(@PathVariable("id") String id) {
        Collections collection = service.getByCollectionId(id);
        if (collection == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.ok(collection); // 200 OK
    }

    // POST add new collection
    @PostMapping
    public ResponseEntity<Collections> addCollection(@RequestBody Collections collections) {
        Collections created = service.addCollection(collections);
        return ResponseEntity.status(HttpStatus.CREATED).body(created); // 201 Created
    }

    // PUT update collection by ID
    @PutMapping("/{id}")
    public ResponseEntity<Collections> updateCollection(
            @PathVariable("id") String id,
            @RequestBody Collections collections) {

        Collections updated = service.updateCollection(id, collections);
        if (updated == null) {
            return ResponseEntity.notFound().build(); // 404 if not found
        }
        return ResponseEntity.ok(updated); // 200 OK
    }

    // DELETE collection by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollection(@PathVariable("id") String id) {
        boolean deleted = service.deleteCollection(id);
        if (!deleted) {
            return ResponseEntity.notFound().build(); // 404 if not found
        }
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}



// package com.team5.controllers;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import java.util.List;
// import com.team5.models.AdminUsers;
// import com.team5.services.AdminUserService;
// @RestController


// public class AdminUserController {
//     @Autowired
//     AdminUserService service;  

//     @GetMapping("/adminusers")
//     public List<AdminUsers> getAllAdminUsers(){
//         return service.getAllAdminUsers();
//     }

//     @GetMapping("/adminusers/{id}")
//     public AdminUsers getByAdminUserId(@PathVariable("id") String id){
//         return service.getByAdminUserId(id);
//     }

//     @PostMapping("/adminusers")
//     public AdminUsers addAdminUser(@RequestBody AdminUsers adminUser){
//         return service.addAdminUser(adminUser);
//     }

//     @PutMapping("/adminusers/{id}")
//     public AdminUsers updateAdminUser(@PathVariable("id") String id, @RequestBody AdminUsers adminUser){
//         return service.updateAdminUser(id,adminUser);
//     }

//     @DeleteMapping("/adminusers/{id}")
//     public void deleteAdminUser(@PathVariable("id") String id){
//         service.deleteAdminUser(id);
//     }


// }






