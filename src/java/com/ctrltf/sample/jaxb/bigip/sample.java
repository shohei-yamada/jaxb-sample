package com.ctrltf.sample.jaxb.bigip;

import javax.xml.bind.JAXB;

public class sample {
    public static void main(String[] args) {
        Bigip bigip = new Bigip();
        Node node = new Node();
        node.setIdentifier("0000000001");
        node.setName("server01");
        bigip.add(node);
        
        node = new Node();
        node.setIdentifier("0000000002");
        node.setName("server02");
        bigip.add(node);
        
        JAXB.marshal(bigip, System.out);
    }
}

