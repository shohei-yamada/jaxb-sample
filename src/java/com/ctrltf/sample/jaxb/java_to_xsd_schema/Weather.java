package com.ctrltf.sample.jaxb.java_to_xsd_schema;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

@XmlRootElement
public class Weather {
    @XmlElementWrapper
    @XmlElement(name="measure")
    private List<Measure> measures;

    public Weather() {
        measures = new ArrayList<Measure>();
    }

    public void add(Measure measure) {
        measures.add(measure);
    }

    public List<Measure> getMeasures() {
        return Collections.unmodifiableList(measures);
    }
}
