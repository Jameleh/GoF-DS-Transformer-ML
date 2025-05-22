package com.tkn.bridge.abs;
/* This is refined abstraction for BaseRepository
Repository is for executives. It has a storage repository.
Implements the below methods
Save()
GetRepository()
 */
import com.tkn.bridge.impl.BaseEntity;
import com.tkn.bridge.impl.Executive;
import com.tkn.bridge.impl.StorageRepository;

import java.util.UUID;

public class ExecutiveRepository implements BaseRepository{
    private final StorageRepository repository;
    private final Executive objExecutive;

    public ExecutiveRepository(StorageRepository repository, Executive objExecutive) {
        this.repository = repository;
        this.objExecutive = objExecutive;
    }

    @Override
    public BaseEntity save() {
        if(objExecutive != null || objExecutive.getName() != null){
            objExecutive.setId(UUID.randomUUID().toString());
            repository.store(objExecutive);
        }
        return objExecutive;
    }

    @Override
    public StorageRepository getRepository() {
        return repository;
    }
}
