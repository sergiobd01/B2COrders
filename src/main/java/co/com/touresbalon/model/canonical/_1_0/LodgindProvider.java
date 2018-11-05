
package co.com.touresbalon.model.canonical._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lodgindProvider.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="lodgindProvider"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HILTON"/&gt;
 *     &lt;enumeration value="DANN_CARLTON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "lodgindProvider")
@XmlEnum
public enum LodgindProvider {

    HILTON,
    DANN_CARLTON;

    public String value() {
        return name();
    }

    public static LodgindProvider fromValue(String v) {
        return valueOf(v);
    }

}
