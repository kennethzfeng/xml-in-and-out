package me.kfeng.demo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Person Class
 *
 */
@XmlRootElement(name="Person")
public class Person
{
    @XmlElement(name="Name")
    public Name name;

    @XmlElement(name="PhoneNumber")
    @XmlElementWrapper(name="PhoneNumbers")
    public List<PhoneNumber> phoneNumbers;


    @Override
    public String toString()
    {
        return "Person: " + name.firstName + " " + name.lastName + " " +
                "PhoneNumbers: " + phoneNumbers.size() + "\n" +
                phoneNumbers.get(0).toString();
    }
}


class Name
{
    @XmlElement(name="FirstName")
    public String               firstName;

    @XmlElement(name="LastName")
    public String               lastName;

}
