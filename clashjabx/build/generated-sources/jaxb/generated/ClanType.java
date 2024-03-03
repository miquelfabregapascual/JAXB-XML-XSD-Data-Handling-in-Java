


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clanType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomclan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copesclan" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="tipusclan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="privat"/>
 *               &lt;enumeration value="public"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="idClan" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clanType", propOrder = {
    "nomclan",
    "copesclan",
    "tipusclan"
})
public class ClanType {

    @XmlElement(required = true)
    protected String nomclan;
    @XmlElement(required = true)
    protected BigInteger copesclan;
    @XmlElement(required = true)
    protected String tipusclan;
    @XmlAttribute(name = "idClan", required = true)
    protected BigInteger idClan;

    /**
     * Obtiene el valor de la propiedad nomclan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomclan() {
        return nomclan;
    }

    /**
     * Define el valor de la propiedad nomclan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomclan(String value) {
        this.nomclan = value;
    }

    /**
     * Obtiene el valor de la propiedad copesclan.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopesclan() {
        return copesclan;
    }

    /**
     * Define el valor de la propiedad copesclan.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopesclan(BigInteger value) {
        this.copesclan = value;
    }

    /**
     * Obtiene el valor de la propiedad tipusclan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipusclan() {
        return tipusclan;
    }

    /**
     * Define el valor de la propiedad tipusclan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipusclan(String value) {
        this.tipusclan = value;
    }

    /**
     * Obtiene el valor de la propiedad idClan.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdClan() {
        return idClan;
    }

    /**
     * Define el valor de la propiedad idClan.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdClan(BigInteger value) {
        this.idClan = value;
    }

}
