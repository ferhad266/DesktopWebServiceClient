
package desktopwebservicesclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWorkerById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWorkerById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workerId" type="{http://webservice.hotel/}reqWorkerId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWorkerById", propOrder = {
    "workerId"
})
public class GetWorkerById {

    protected ReqWorkerId workerId;

    /**
     * Gets the value of the workerId property.
     * 
     * @return
     *     possible object is
     *     {@link ReqWorkerId }
     *     
     */
    public ReqWorkerId getWorkerId() {
        return workerId;
    }

    /**
     * Sets the value of the workerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqWorkerId }
     *     
     */
    public void setWorkerId(ReqWorkerId value) {
        this.workerId = value;
    }

}
