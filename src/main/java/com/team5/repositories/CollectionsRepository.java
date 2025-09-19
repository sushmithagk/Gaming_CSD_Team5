package com.team5.repositories;
import org.springframework.stereotype.Repository;
import com.team5.models.Collections;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository

public interface CollectionsRepository extends MongoRepository<Collections, String> {


}

// package com.team5.repositories;
// import org.springframework.stereotype.Repository;
// import com.team5.models.AdminUsers;
// import org.springframework.data.mongodb.repository.MongoRepository;
// @Repository


// public interface AdminUserRepository extends MongoRepository<AdminUsers, String> {


// }


