package me.kfeng.demo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by kennethfeng on 4/3/15.
 */
@XmlType
public class PhoneNumber
{

    @XmlValue
    public String           number;

    @XmlAttribute(name="type")
    public String           type;


    @Override
    public String toString()
    {
        return "PhoneNumber: " + number + " " + type;

    }

}
