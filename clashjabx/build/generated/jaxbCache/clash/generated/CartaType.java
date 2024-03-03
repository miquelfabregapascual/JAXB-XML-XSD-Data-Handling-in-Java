//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.03.29 a las 09:22:22 AM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cartaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cartaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomcart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nivellcart">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="raresa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="comuna"/>
 *               &lt;enumeration value="rara"/>
 *               &lt;enumeration value="epica"/>
 *               &lt;enumeration value="llegendaria"/>
 *               &lt;enumeration value="heroi"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="idCart" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartaType", propOrder = {
    "nomcart",
    "nivellcart",
    "raresa"
})
public class CartaType {

    @XmlElement(required = true)
    protected String nomcart;
    protected int nivellcart;
    @XmlElement(required = true)
    protected String raresa;
    @XmlAttribute(name = "idCart", required = true)
    protected BigInteger idCart;

    /**
     * Obtiene el valor de la propiedad nomcart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomcart() {
        return nomcart;
    }

    /**
     * Define el valor de la propiedad nomcart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomcart(String value) {
        this.nomcart = value;
    }

    /**
     * Obtiene el valor de la propiedad nivellcart.
     * 
     */
    public int getNivellcart() {
        return nivellcart;
    }

    /**
     * Define el valor de la propiedad nivellcart.
     * 
     */
    public void setNivellcart(int value) {
        this.nivellcart = value;
    }

    /**
     * Obtiene el valor de la propiedad raresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaresa() {
        return raresa;
    }

    /**
     * Define el valor de la propiedad raresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaresa(String value) {
        this.raresa = value;
    }

    /**
     * Obtiene el valor de la propiedad idCart.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdCart() {
        return idCart;
    }

    /**
     * Define el valor de la propiedad idCart.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdCart(BigInteger value) {
        this.idCart = value;
    }

}
