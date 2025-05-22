package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XMLSerialize implements SerializeInterface {

    @Override
    public void perpareData(StudentInfo studentInfo) throws JAXBException {
        JAXBContext jaxbContext= JAXBContext.newInstance(new Class[]{StudentInfo.class});
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(studentInfo, sw);
        String xmlContent = sw.toString();

        System.out.println("\n---------------XML---------------");
        System.out.println("XML Format: " +xmlContent);
    }
}
