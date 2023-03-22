package com.itself.example.xmlAnalysis.case2;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlRootElement(name = "soap-env:Envelope")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {"Body"})
public class RequestBean {

    @XmlAttribute(name="xmlns:soap-env")
    protected String soapenv="http://schemas.xmlsoap.org/soap/envelope/";

    @XmlAttribute(name="xmlns:soap")
    protected String soap="http://schemas.xmlsoap.org/wsdl/soap/";

    @XmlAttribute(name="xmlns:xsi")
    protected String xsi="http://www.w3.org/2001/XMLSchema-instance";

    @XmlElement(name="soap-env:Body")
    protected BodyBean Body;
}



