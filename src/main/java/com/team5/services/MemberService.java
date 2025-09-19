package com.team5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.models.Members;
import com.team5.repositories.MemberRepository;

@Service
public class MemberService {

    @Autowired
    MemberRepository repository;

    public List<Members> getAllMembers() {
        return repository.findAll();
    }

    public Members getByMemberId(String id) {
        return repository.findById(id).get();
    }

    public Members addMember(Members members) {
        return repository.save(members);
    }

    public Members updateMember(String id, Members members) {
        Members existingmember=repository.findById(id).get();
   
        if(existingmember!=null){
          existingmember.setName(members.getName());
          existingmember.setPhone(members.getPhone());
          existingmember.setBalance(members.getBalance());
          return repository.save(existingmember);
        }

        return repository.save(members);
    }

    public void deleteMember(String id) {
        Members existingmember=repository.findById(id).get();
        if(existingmember!=null){
            repository.delete(existingmember);
            System.out.println("Member deleted successfully");
        }
        else{
            System.out.println("Member not found");
        }
    }
}
            



