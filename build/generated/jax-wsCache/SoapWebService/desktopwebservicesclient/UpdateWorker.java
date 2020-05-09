
package desktopwebservicesclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateWorker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateWorker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqWorker" type="{http://webservice.hotel/}reqWorker" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateWorker", propOrder = {
    "reqWorker"
})
public class UpdateWorker {

    protected ReqWorker reqWorker;

    /**
     * Gets the value of the reqWorker property.
     * 
     * @return
     *     possible object is
     *     {@link ReqWorker }
     *     
     */
    public ReqWorker getReqWorker() {
        return reqWorker;
    }

    /**
     * Sets the value of the reqWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqWorker }
     *     
     */
    public void setReqWorker(ReqWorker value) {
        this.reqWorker = value;
    }

}
