//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.03.29 a las 09:22:22 AM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clashType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jugador" type="{}jugadorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clashType", propOrder = {
    "versio",
    "jugador"
})
public class ClashType {

    @XmlElement(required = true)
    protected String versio;
    @XmlElement(required = true)
    protected List<JugadorType> jugador;

    /**
     * Obtiene el valor de la propiedad versio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersio() {
        return versio;
    }

    /**
     * Define el valor de la propiedad versio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersio(String value) {
        this.versio = value;
    }

    /**
     * Gets the value of the jugador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jugador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJugador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JugadorType }
     * 
     * 
     */
    public List<JugadorType> getJugador() {
        if (jugador == null) {
            jugador = new ArrayList<JugadorType>();
        }
        return this.jugador;
    }

}
