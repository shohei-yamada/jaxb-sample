package com.ctrltf.sample.jaxb.bigip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bigip {
    
    @XmlElementWrapper
    @XmlElement(name="node")
    private static List<Node> nodes;

    public Bigip() {
        nodes = new ArrayList<Node>();
    }

    public void add(Node node) {
        nodes.add(node);
    }

    public static List<Node> getNodes() {
        return Collections.unmodifiableList(nodes);
    }
}
