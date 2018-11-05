
package co.com.touresbalon.model.canonical._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transportProvider.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="transportProvider"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVIANCA"/&gt;
 *     &lt;enumeration value="AMERICAN_AIRLINES"/&gt;
 *     &lt;enumeration value="BOLIVARIANO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transportProvider")
@XmlEnum
public enum TransportProvider {

    AVIANCA,
    AMERICAN_AIRLINES,
    BOLIVARIANO;

    public String value() {
        return name();
    }

    public static TransportProvider fromValue(String v) {
        return valueOf(v);
    }

}
