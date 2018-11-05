
package co.com.touresbalon.model.canonical._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LodgingReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LodgingReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lodgingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lodgingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingReservation", propOrder = {
    "available",
    "roomNumber",
    "lodgingId",
    "lodgingDate"
})
public class LodgingReservation {

    protected boolean available;
    @XmlElement(required = true)
    protected String roomNumber;
    @XmlElement(required = true)
    protected String lodgingId;
    @XmlElement(required = true)
    protected String lodgingDate;

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
     * Obtiene el valor de la propiedad roomNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Define el valor de la propiedad roomNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad lodgingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLodgingId() {
        return lodgingId;
    }

    /**
     * Define el valor de la propiedad lodgingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLodgingId(String value) {
        this.lodgingId = value;
    }

    /**
     * Obtiene el valor de la propiedad lodgingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLodgingDate() {
        return lodgingDate;
    }

    /**
     * Define el valor de la propiedad lodgingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLodgingDate(String value) {
        this.lodgingDate = value;
    }

}
