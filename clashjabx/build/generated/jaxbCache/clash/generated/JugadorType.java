//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.03.29 a las 09:22:22 AM CEST 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para jugadorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="jugadorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nivell">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="carta" type="{}cartaType" maxOccurs="unbounded"/>
 *         &lt;element name="clan" type="{}clanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jugadorType", propOrder = {
    "nom",
    "copes",
    "nivell",
    "carta",
    "clan"
})
public class JugadorType {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected BigInteger copes;
    protected int nivell;
    @XmlElement(required = true)
    protected List<CartaType> carta;
    @XmlElement(required = true)
    protected ClanType clan;

    /**
     * Obtiene el valor de la propiedad nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Define el valor de la propiedad nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtiene el valor de la propiedad copes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopes() {
        return copes;
    }

    /**
     * Define el valor de la propiedad copes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopes(BigInteger value) {
        this.copes = value;
    }

    /**
     * Obtiene el valor de la propiedad nivell.
     * 
     */
    public int getNivell() {
        return nivell;
    }

    /**
     * Define el valor de la propiedad nivell.
     * 
     */
    public void setNivell(int value) {
        this.nivell = value;
    }

    /**
     * Gets the value of the carta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartaType }
     * 
     * 
     */
    public List<CartaType> getCarta() {
        if (carta == null) {
            carta = new ArrayList<CartaType>();
        }
        return this.carta;
    }

    /**
     * Obtiene el valor de la propiedad clan.
     * 
     * @return
     *     possible object is
     *     {@link ClanType }
     *     
     */
    public ClanType getClan() {
        return clan;
    }

    /**
     * Define el valor de la propiedad clan.
     * 
     * @param value
     *     allowed object is
     *     {@link ClanType }
     *     
     */
    public void setClan(ClanType value) {
        this.clan = value;
    }

}
