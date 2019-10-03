
package com.tutorialspedia.jaxwsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUsersResponse" type="{http://www.tutorialspedia.com/UserSchema}UsersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUsersResponse"
})
@XmlRootElement(name = "GetAllUsersResponse")
public class GetAllUsersResponse {

    @XmlElement(name = "GetUsersResponse", required = true)
    protected UsersType getUsersResponse;

    /**
     * Gets the value of the getUsersResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UsersType }
     *     
     */
    public UsersType getGetUsersResponse() {
        return getUsersResponse;
    }

    /**
     * Sets the value of the getUsersResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersType }
     *     
     */
    public void setGetUsersResponse(UsersType value) {
        this.getUsersResponse = value;
    }

}
