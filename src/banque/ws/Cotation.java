
package banque.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeSociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotation", propOrder = {
    "codeSociete",
    "dateCotation",
    "valAction"
})
public class Cotation {

    protected String codeSociete;
    protected String dateCotation;
    protected double valAction;

    /**
     * Gets the value of the codeSociete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSociete() {
        return codeSociete;
    }

    /**
     * Sets the value of the codeSociete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSociete(String value) {
        this.codeSociete = value;
    }

    /**
     * Gets the value of the dateCotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCotation() {
        return dateCotation;
    }

    /**
     * Sets the value of the dateCotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCotation(String value) {
        this.dateCotation = value;
    }

    /**
     * Gets the value of the valAction property.
     * 
     */
    public double getValAction() {
        return valAction;
    }

    /**
     * Sets the value of the valAction property.
     * 
     */
    public void setValAction(double value) {
        this.valAction = value;
    }

}
