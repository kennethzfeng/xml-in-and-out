package me.kfeng.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File file = new File("../../sample.xml");

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Person person = (Person) unmarshaller.unmarshal(file);
            System.out.println(person);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
