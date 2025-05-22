package com.tkn.bridge;

import com.tkn.bridge.abs.ExecutiveRepository;
import com.tkn.bridge.abs.FacultyRepository;
import com.tkn.bridge.abs.StudentRepository;
import com.tkn.bridge.impl.*;

public class Client {
    public static void main(String... args){
        // To Store it in Block
        Student objStud = new Student();
        objStud.setName("John Doe");
        StudentRepository objStudRepo = new StudentRepository(new ObjectStorage(), objStud);
        objStudRepo.save();

        // To Store it in File
        Faculty objFac = new Faculty();
        objFac.setName("Steve Smith");
        objFac.setDepartment("CIS");
        FacultyRepository objFacRepo = new FacultyRepository(new FileStorage(), objFac);
        objFacRepo.save();

        Executive objExec = new Executive();
        objExec.setName("Maria Smith");
        objExec.setDesignation("Vice Chancellor");
        ExecutiveRepository objExeRepo = new ExecutiveRepository(new BlockStorage(), objExec);
        objExeRepo.save();
    }
}
