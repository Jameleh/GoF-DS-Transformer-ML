package com.tkn.bridge.abs;
/* This is refined abstraction for BaseRepository
Repository is for faculty. It has a storage repository.
Implements the below methods
Save()
GetRepository()
 */
import com.tkn.bridge.impl.BaseEntity;
import com.tkn.bridge.impl.Faculty;
import com.tkn.bridge.impl.StorageRepository;

import java.util.UUID;

public class FacultyRepository implements BaseRepository {
    private final StorageRepository repository;
    private final Faculty objFaculty;

    public FacultyRepository(StorageRepository repository, Faculty objFaculty) {
        this.repository = repository;
        this.objFaculty = objFaculty;
    }


    @Override
    public BaseEntity save() {
        if(objFaculty != null || objFaculty.getName() != null){
            objFaculty.setId(UUID.randomUUID().toString());
            repository.store(objFaculty);
        }
        return objFaculty;
    }

    @Override
    public StorageRepository getRepository() {
        return repository;
    }
}
