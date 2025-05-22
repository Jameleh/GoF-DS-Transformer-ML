package com.tkn.bridge.impl;
/* This is concrete implementor. StorageRepository is of type File
Implements the below method
store(BaseEntity entity)
 */
public class FileStorage implements StorageRepository{
    @Override
    public void store(BaseEntity entity) {
        System.out.println("Stored it in File Storage");
    }
}
