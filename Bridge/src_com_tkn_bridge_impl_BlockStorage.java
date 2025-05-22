package com.tkn.bridge.impl;
/* This is concrete implementor. StorageRepository is of type Block
Implements the below method
store(BaseEntity entity)
 */
public class BlockStorage implements StorageRepository{
    @Override
    public void store(BaseEntity entity) {
        System.out.println("Stored it in Block Storage");
    }
}
