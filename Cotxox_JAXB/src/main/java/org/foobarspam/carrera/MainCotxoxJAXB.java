package org.foobarspam.carrera;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

//import org.foobarspam.carrera.Conductor;
//import org.foobarspam.carrera.Carrera;

public class MainCotxoxJAXB {
	public static void main(String[] args) {
		try {
			/* 1 - JAXB CONTEXT
			 * 
			 * https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/JAXBContext.html
			 * 
			 * The JAXBContext class provides the client's entry point to the JAXB API. 
			 * It provides an abstraction for managing the XML/Java binding information necessary
			 * to implement the JAXB binding framework operations: unmarshal, marshal and validate.
			 * The JAXBContext object allows the merging of global elements and type definitions across
			 * a set of schemas (listed in the contextPath). 
			 * */
			
			// A JAXBContext instance is created for handling classes
			// https://docs.oracle.com/javaee/5/tutorial/doc/bnbay.html
			// el nombre de la clase ha de resultar de la forma: com.acme.foo.Foo.class => .class.getPackage().getName()
			
			JAXBContext jc = JAXBContext.newInstance(Carrera.class.getPackage().getName());
			
			/* 2 - UNMARSHALLER
			 * 
			 * https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/JAXBContext.html
			 * https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Unmarshaller.html
			 * 
			 * The Unmarshaller class provides the client application the ability to convert XML data
			 * into a tree of Java content objects. 
			 * The unmarshal method allows for any global XML element declared in the schema to be unmarshalled
			 * as the root of an instance document.
			 * A client application is able to unmarshal XML documents that are instances of any of the schemas
			 * listed in the contextPath. 
			 * Unmarshalling can deserialize XML data that represents either an entire XML document or 
			 * a subtree of an XML document. Typically, it is sufficient to use the unmarshalling methods described 
			 * by Unmarshal root element that is declared globally. These unmarshal methods utilize JAXBContext's 
			 * mapping of global XML element declarations and type definitions to JAXB mapped classes to initiate 
			 * the unmarshalling of the root element of XML data.
			 * The JAXBContext instance is the one that was used to create this Unmarshaller. The JAXBContext 
			 * instance maintains a mapping of globally declared XML element and type definition names to JAXB mapped classes.
			 */
			
			// An Unmarshaller instance is created, and estacion.xml is unmarshalled.
			
			Unmarshaller u = jc.createUnmarshaller();
			// Con Maven: acceso a la abstraccion del directorio resources en Maven
			//InputStream in = MainCotxoxJAXB.class.getResourceAsStream("schemas/Cotxox.xml");
			// Sin Maven:
			InputStream in = new FileInputStream("src/main/resources/org/foobarspam/cotxox_JAXB/schemas/Cotxox.xml");
			
			JAXBElement<Carrera> objetoCarrera = (JAXBElement<Carrera>)u.unmarshal(in);

			/* JAXBElement<Element> JAXB representation of an Xml Element.
			 * This class represents information about an Xml Element from both the element declaration 
			 * within a schema and the element instance value within an xml document
			 * */
			
			System.out.println(objetoCarrera.getName() + " : ");
			// value represents the element instance's atttribute(s) and content model
			
			System.out.println("Tarjeta Credito: " + objetoCarrera.getValue().getTarjetaCredito());
			System.out.println("Origen: " + objetoCarrera.getValue().getOrigen());
			System.out.println("Destino: " + objetoCarrera.getValue().getDestino());
			System.out.println("Distancia: " + objetoCarrera.getValue().getDistancia());
			System.out.println("Tiempo esperado: " + objetoCarrera.getValue().getTiempoEsperadoMinutos());
			System.out.println("Tiempo carrera: " + objetoCarrera.getValue().getTiempoCarrera());
			System.out.println("Coste esperado: " + objetoCarrera.getValue().getCosteEsperado());
			System.out.println("Propina: " + objetoCarrera.getValue().getPropina());
			System.out.println("Coste total: " + objetoCarrera.getValue().getCosteTotal());			
			System.out.println("Conductor: " + objetoCarrera.getValue().getConductor().getNombre());
			System.out.println("Matricula vehículo: " + objetoCarrera.getValue().getConductor().getMatricula());
			System.out.println("Modelo vehículo: " + objetoCarrera.getValue().getConductor().getModelo());
			System.out.println("Valoraciones: " + objetoCarrera.getValue().getConductor().getValoraciones());
			System.out.println("Estado conductor ocupado: " + objetoCarrera.getValue().getConductor().isOcupado());
			System.out.println("Valoracion media conductor: " + objetoCarrera.getValue().getConductor().getValoracionMedia());
						
			/* 3 - MARSHALLER
			 * 
			 * https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Marshaller.html
			 * https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/JAXBContext.html
			 * 
			 * The Marshaller class provides the client application the ability to convert
			 * a Java content tree back into XML data. There is no difference between marshalling 
			 * a content tree that is created manually using the factory methods and marshalling 
			 * a content tree that is the result an unmarshal operation.
			 * */
			
			/* OTROS EJEMPLOS DE MARSHALLING */
			
			// Marshalling to a java.io.OutputStream == a consola:
			
			System.out.println("Objeto en memoria marshalled a XML: ");
			
			Marshaller m = jc.createMarshaller(); 			
			m.marshal( objetoCarrera, System.out );
			
			// Marshalling to a File:
			
			
			File fichero = new File("marshalizado.xml");
			fichero.createNewFile();
			// createNewFile() atomically creates a new, empty file named by this abstract pathname 
			// if and only if a file with this name does not yet exist.
			
			m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "https://api.mobipalma.mobi/docs/ Cotxox.xsd");
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal( objetoCarrera, fichero );
			System.out.println("\n Objeto en memoria marshalled a fichero: " + fichero.getPath());
			
		} 
		catch (JAXBException  ex) {
			ex.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}

	}
	
	
}


