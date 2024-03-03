//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.03.29 a las 09:22:22 AM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Clash_QNAME = new QName("", "clash");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClashType }
     * 
     */
    public ClashType createClashType() {
        return new ClashType();
    }

    /**
     * Create an instance of {@link ClanType }
     * 
     */
    public ClanType createClanType() {
        return new ClanType();
    }

    /**
     * Create an instance of {@link JugadorType }
     * 
     */
    public JugadorType createJugadorType() {
        return new JugadorType();
    }

    /**
     * Create an instance of {@link CartaType }
     * 
     */
    public CartaType createCartaType() {
        return new CartaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClashType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "clash")
    public JAXBElement<ClashType> createClash(ClashType value) {
        return new JAXBElement<ClashType>(_Clash_QNAME, ClashType.class, null, value);
    }

}
