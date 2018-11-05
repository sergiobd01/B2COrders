
package co.com.touresbalon.model.canonical._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransportReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="travelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chairNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="travelDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportReservation", propOrder = {
    "available",
    "travelNumber",
    "chairNumber",
    "travelDate"
})
public class TransportReservation {

    protected boolean available;
    @XmlElement(required = true)
    protected String travelNumber;
    @XmlElement(required = true)
    protected String chairNumber;
    @XmlElement(required = true)
    protected String travelDate;

    /**
     * Obtiene el valor de la propiedad available.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Define el valor de la propiedad available.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Obtiene el valor de la propiedad travelNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelNumber() {
        return travelNumber;
    }

    /**
     * Define el valor de la propiedad travelNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelNumber(String value) {
        this.travelNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad chairNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChairNumber() {
        return chairNumber;
    }

    /**
     * Define el valor de la propiedad chairNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChairNumber(String value) {
        this.chairNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad travelDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * Define el valor de la propiedad travelDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDate(String value) {
        this.travelDate = value;
    }

}
