package com.ctrltf.sample.jaxb;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

public class ListSample {
    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\"?>"
                   + "<Strings>"
                   + "  <string>20</string>"
                   + "</Strings>";

        List<String> list = JAXB.unmarshal(new StringReader(xml), ArrayList.class);
        
        System.out.println(list.size());
        
        for (String s: list) {
            System.out.println(s);
        }
    }
}

