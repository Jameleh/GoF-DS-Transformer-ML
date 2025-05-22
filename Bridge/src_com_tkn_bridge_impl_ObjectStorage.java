package com.tkn.bridge.impl;
/* This is concrete implementor. StorageRepository is of type Object
Implements the below method
store(BaseEntity entity)
 */
public class ObjectStorage implements StorageRepository{
    @Override
    public void store(BaseEntity entity) {
        System.out.println("Stored it in Object Storage");
    }
}
