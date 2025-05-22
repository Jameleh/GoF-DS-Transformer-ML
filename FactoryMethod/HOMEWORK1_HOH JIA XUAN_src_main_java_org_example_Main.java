package org.example;

/*
STUDENT ID     : B221202904
NAME           : HOH
SURNAME        : JIA XUAN
COURSE CODE    : SWE 303
COURSE NAME    : DESIGN PATTERNS
HOMEWORK NUMBER: HOMEWORK 1
*/

import javax.xml.bind.JAXBException;

    public class Main {
        public static void main(String[] args) throws JAXBException {

            StudentInfo studentInfo = new StudentInfo ("2022","HOH","JIA XUAN");
            FactoryMethod factoryMethod = new FactoryMethod ();

            SerializeInterface serializeInterface1 = factoryMethod.getStudent("JSON");
            serializeInterface1.perpareData(studentInfo);
            SerializeInterface serializeInterface2 = factoryMethod.getStudent("XML");
            serializeInterface2.perpareData(studentInfo);

        }
}