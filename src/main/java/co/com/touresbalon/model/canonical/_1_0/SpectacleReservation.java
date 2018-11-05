
package co.com.touresbalon.model.canonical._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpectacleReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpectacleReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="spectacleId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="spectacleDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpectacleReservation", propOrder = {
    "available",
    "ticketNumber",
    "spectacleId",
    "spectacleDate"
})
public class SpectacleReservation {

    protected boolean available;
    @XmlElement(required = true)
    protected String ticketNumber;
    @XmlElement(required = true)
    protected String spectacleId;
    @XmlElement(required = true)
    protected String spectacleDate;

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
     * Obtiene el valor de la propiedad ticketNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Define el valor de la propiedad ticketNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad spectacleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpectacleId() {
        return spectacleId;
    }

    /**
     * Define el valor de la propiedad spectacleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpectacleId(String value) {
        this.spectacleId = value;
    }

    /**
     * Obtiene el valor de la propiedad spectacleDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpectacleDate() {
        return spectacleDate;
    }

    /**
     * Define el valor de la propiedad spectacleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpectacleDate(String value) {
        this.spectacleDate = value;
    }

}
