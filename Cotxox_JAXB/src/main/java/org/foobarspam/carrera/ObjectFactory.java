//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.25 a las 07:00:15 PM CEST 
//


package org.foobarspam.carrera;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.foobarspam.carrera package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Carrera_QNAME = new QName("https://api.mobipalma.mobi/docs/", "carrera");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.foobarspam.carrera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carrera }
     * 
     */
    public Carrera createCarrera() {
        return new Carrera();
    }

    /**
     * Create an instance of {@link Conductor }
     * 
     */
    public Conductor createConductor() {
        return new Conductor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Carrera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.mobipalma.mobi/docs/", name = "carrera")
    public JAXBElement<Carrera> createCarrera(Carrera value) {
        return new JAXBElement<Carrera>(_Carrera_QNAME, Carrera.class, null, value);
    }

}
