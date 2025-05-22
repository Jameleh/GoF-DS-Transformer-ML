package com.tkn.bridge.abs;
/* This is abstraction interface */
import com.tkn.bridge.impl.BaseEntity;
import com.tkn.bridge.impl.StorageRepository;

public interface BaseRepository {
    public BaseEntity save();
    public StorageRepository getRepository();
}
