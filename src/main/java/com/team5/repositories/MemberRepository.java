package com.team5.repositories;
import org.springframework.stereotype.Repository;
import com.team5.models.Members;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface MemberRepository extends MongoRepository<Members, String> {

}



