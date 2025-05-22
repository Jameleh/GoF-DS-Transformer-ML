package com.tkn.bridge.abs;
/* This is refined abstraction for BaseRepository
Repository is for executives. It has a storage repository.
Implements the below methods
Save()
GetRepository()
 */

import com.tkn.bridge.impl.BaseEntity;
import com.tkn.bridge.impl.StorageRepository;
import com.tkn.bridge.impl.Student;

import java.util.UUID;

public class StudentRepository implements BaseRepository{
    private final StorageRepository repository;
    private final Student objStudent;

    public StudentRepository(StorageRepository repository, Student objStud) {
        this.repository = repository;
        this.objStudent = objStud;
    }

    @Override
    public BaseEntity save() {
        if(objStudent != null || objStudent.getName() != null){
            objStudent.setId(UUID.randomUUID().toString());
            repository.store(objStudent);
        }
        return objStudent;
    }

    @Override
    public StorageRepository getRepository() {
        return repository;
    }
}
