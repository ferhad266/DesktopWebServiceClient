
package desktopwebservicesclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respWorkerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respWorkerList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workerList" type="{http://webservice.hotel/}respWorker" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.hotel/}respStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respWorkerList", propOrder = {
    "workerList",
    "status"
})
public class RespWorkerList {

    @XmlElement(nillable = true)
    protected List<RespWorker> workerList;
    protected RespStatus status;

    /**
     * Gets the value of the workerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespWorker }
     * 
     * 
     */
    public List<RespWorker> getWorkerList() {
        if (workerList == null) {
            workerList = new ArrayList<RespWorker>();
        }
        return this.workerList;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RespStatus }
     *     
     */
    public RespStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespStatus }
     *     
     */
    public void setStatus(RespStatus value) {
        this.status = value;
    }

}
