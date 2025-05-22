package org.example;

public class FactoryMethod {

    public SerializeInterface getStudent (String student) {
        if(student==null || student.isEmpty())
            return null;
            switch (student) {
                case "JSON":
                    return new JSONSerialize();
                case "XML":
                    return new XMLSerialize();
                default:
                    throw new IllegalArgumentException("Unknown Serializer");
            }
        }
}
