
package co.com.touresbalon.model.canonical._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancelrOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CancelOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelrOrderStatus",
    "cancelOrderDate"
})
@XmlRootElement(name = "CancelOrderResponse")
public class CancelOrderResponse {

    @XmlElement(required = true)
    protected String cancelrOrderStatus;
    @XmlElement(name = "CancelOrderDate", required = true)
    protected String cancelOrderDate;

    /**
     * Obtiene el valor de la propiedad cancelrOrderStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelrOrderStatus() {
        return cancelrOrderStatus;
    }

    /**
     * Define el valor de la propiedad cancelrOrderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelrOrderStatus(String value) {
        this.cancelrOrderStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelOrderDate() {
        return cancelOrderDate;
    }

    /**
     * Define el valor de la propiedad cancelOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelOrderDate(String value) {
        this.cancelOrderDate = value;
    }

}
