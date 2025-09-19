package com.team5.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team5.models.Members;
import com.team5.services.MemberService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MemberController {

    @Autowired
    MemberService service;  
    
    @GetMapping("/members")
    public List<Members> getAllMembers(){
        return service.getAllMembers();
    }

    @GetMapping("/members/{id}")
    public Members getByMemberId(@PathVariable("id") String id){
        return service.getByMemberId(id);
    }   

    @PostMapping("/members")
    public Members addMember(@RequestBody Members members){
        return service.addMember(members);
    }

    @PutMapping("/members/{id}")
    public Members updateMember(@PathVariable("id") String id, @RequestBody Members members){
        return service.updateMember(id,members);
        
    }   

    @DeleteMapping("/members/{id}")
    public void deleteMember(@PathVariable("id") String id){
        service.deleteMember(id);
    }

}



