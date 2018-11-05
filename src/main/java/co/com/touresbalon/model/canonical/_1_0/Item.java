
package co.com.touresbalon.model.canonical._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Item complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemDescriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportType" type="{http://touresbalon.com.co/model/canonical/1.0.0}Transport" minOccurs="0"/&gt;
 *         &lt;element name="spectacleType" type="{http://touresbalon.com.co/model/canonical/1.0.0}Spectacle" minOccurs="0"/&gt;
 *         &lt;element name="lodgingType" type="{http://touresbalon.com.co/model/canonical/1.0.0}Lodging" minOccurs="0"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "itemId",
    "itemName",
    "itemDescriptions",
    "transportType",
    "spectacleType",
    "lodgingType",
    "arrivalDate",
    "departureDate",
    "sourceCity",
    "targetCity",
    "price",
    "quantity"
})
public class Item {

    protected long itemId;
    protected String itemName;
    protected String itemDescriptions;
    protected Transport transportType;
    protected Spectacle spectacleType;
    protected Lodging lodgingType;
    @XmlElement(required = true)
    protected String arrivalDate;
    @XmlElement(required = true)
    protected String departureDate;
    @XmlElement(required = true)
    protected String sourceCity;
    @XmlElement(required = true)
    protected String targetCity;
    protected BigDecimal price;
    protected long quantity;

    /**
     * Obtiene el valor de la propiedad itemId.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Define el valor de la propiedad itemId.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Obtiene el valor de la propiedad itemName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Define el valor de la propiedad itemName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescriptions() {
        return itemDescriptions;
    }

    /**
     * Define el valor de la propiedad itemDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescriptions(String value) {
        this.itemDescriptions = value;
    }

    /**
     * Obtiene el valor de la propiedad transportType.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTransportType() {
        return transportType;
    }

    /**
     * Define el valor de la propiedad transportType.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTransportType(Transport value) {
        this.transportType = value;
    }

    /**
     * Obtiene el valor de la propiedad spectacleType.
     * 
     * @return
     *     possible object is
     *     {@link Spectacle }
     *     
     */
    public Spectacle getSpectacleType() {
        return spectacleType;
    }

    /**
     * Define el valor de la propiedad spectacleType.
     * 
     * @param value
     *     allowed object is
     *     {@link Spectacle }
     *     
     */
    public void setSpectacleType(Spectacle value) {
        this.spectacleType = value;
    }

    /**
     * Obtiene el valor de la propiedad lodgingType.
     * 
     * @return
     *     possible object is
     *     {@link Lodging }
     *     
     */
    public Lodging getLodgingType() {
        return lodgingType;
    }

    /**
     * Define el valor de la propiedad lodgingType.
     * 
     * @param value
     *     allowed object is
     *     {@link Lodging }
     *     
     */
    public void setLodgingType(Lodging value) {
        this.lodgingType = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Define el valor de la propiedad arrivalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Define el valor de la propiedad departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCity() {
        return sourceCity;
    }

    /**
     * Define el valor de la propiedad sourceCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCity(String value) {
        this.sourceCity = value;
    }

    /**
     * Obtiene el valor de la propiedad targetCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCity() {
        return targetCity;
    }

    /**
     * Define el valor de la propiedad targetCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCity(String value) {
        this.targetCity = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

}
