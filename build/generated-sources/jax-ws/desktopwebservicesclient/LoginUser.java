
package desktopwebservicesclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqLogin" type="{http://webservice.hotel/}reqLogin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginUser", propOrder = {
    "reqLogin"
})
public class LoginUser {

    protected ReqLogin reqLogin;

    /**
     * Gets the value of the reqLogin property.
     * 
     * @return
     *     possible object is
     *     {@link ReqLogin }
     *     
     */
    public ReqLogin getReqLogin() {
        return reqLogin;
    }

    /**
     * Sets the value of the reqLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqLogin }
     *     
     */
    public void setReqLogin(ReqLogin value) {
        this.reqLogin = value;
    }

}
