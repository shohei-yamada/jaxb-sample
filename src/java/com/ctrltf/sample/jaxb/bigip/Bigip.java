package com.ctrltf.sample.jaxb.bigip;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

@XmlRootElement
public class Bigip {
    @XmlElementWrapper
    @XmlElement(name="node")
    private List<Node> nodes;

    public Bigip() {
        nodes = new ArrayList<Node>();
    }

    public void add(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return Collections.unmodifiableList(nodes);
    }
}
