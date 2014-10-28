package com.ctrltf.sample.jaxb.bigip;

import java.io.File;

import javax.xml.bind.JAXB;

public class ParseXmlSample {
    public static void main(String[] args) {
        Bigip bigip = JAXB.unmarshal(new File("assets/xml/bigip.xml"), Bigip.class);
        
        for (Node node: bigip.getNodes()) {
            System.out.println(node.getIdentifier() + ", " + node.getName());
        }
    }
}

