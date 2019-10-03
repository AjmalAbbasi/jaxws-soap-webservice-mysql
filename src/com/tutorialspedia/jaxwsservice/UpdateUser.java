
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
 *         &lt;element name="UpdateUserRequest" type="{http://www.tutorialspedia.com/UserSchema}UserType"/>
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
    "updateUserRequest"
})
@XmlRootElement(name = "UpdateUser")
public class UpdateUser {

    @XmlElement(name = "UpdateUserRequest", required = true)
    protected UserType updateUserRequest;

    /**
     * Gets the value of the updateUserRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUpdateUserRequest() {
        return updateUserRequest;
    }

    /**
     * Sets the value of the updateUserRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUpdateUserRequest(UserType value) {
        this.updateUserRequest = value;
    }

}
