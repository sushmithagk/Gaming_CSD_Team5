package com.team5.services;

import com.team5.models.Collections;
import com.team5.repositories.CollectionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionsService {

    @Autowired
    private CollectionsRepository repository;

    public List<Collections> getAllCollections() {
        return repository.findAll();
    }

    public Collections getByCollectionId(String id) {
        return repository.findById(id).orElse(null);
    }

    public Collections addCollection(Collections collections) {
        return repository.save(collections);
    }

    public Collections updateCollection(String id, Collections collections) {
        Optional<Collections> existing = repository.findById(id);
        if (existing.isPresent()) {
            Collections updated = existing.get();
            
            // update only the fields that exist
            updated.setDate(collections.getDate());
            updated.setAmount(collections.getAmount());

            return repository.save(updated);
        }
        return null; // not found
    }

    public boolean deleteCollection(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
