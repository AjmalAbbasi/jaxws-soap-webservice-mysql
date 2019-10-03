
package com.tutorialspedia.jaxwsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserLevel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UserActiveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", namespace = "http://www.tutorialspedia.com/UserSchema", propOrder = {
    "userID",
    "userName",
    "userCategory",
    "userLevel",
    "userActiveStatus"
})
public class UserType {

    @XmlElement(name = "UserID", namespace = "http://www.tutorialspedia.com/UserSchema")
    protected int userID;
    @XmlElement(name = "UserName", namespace = "http://www.tutorialspedia.com/UserSchema", required = true)
    protected String userName;
    @XmlElement(name = "UserCategory", namespace = "http://www.tutorialspedia.com/UserSchema", required = true)
    protected String userCategory;
    @XmlElement(name = "UserLevel", namespace = "http://www.tutorialspedia.com/UserSchema")
    protected double userLevel;
    @XmlElement(name = "UserActiveStatus", namespace = "http://www.tutorialspedia.com/UserSchema")
    protected boolean userActiveStatus;

    /**
     * Gets the value of the userID property.
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCategory() {
        return userCategory;
    }

    /**
     * Sets the value of the userCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCategory(String value) {
        this.userCategory = value;
    }

    /**
     * Gets the value of the userLevel property.
     * 
     */
    public double getUserLevel() {
        return userLevel;
    }

    /**
     * Sets the value of the userLevel property.
     * 
     */
    public void setUserLevel(double value) {
        this.userLevel = value;
    }

    /**
     * Gets the value of the userActiveStatus property.
     * 
     */
    public boolean isUserActiveStatus() {
        return userActiveStatus;
    }

    /**
     * Sets the value of the userActiveStatus property.
     * 
     */
    public void setUserActiveStatus(boolean value) {
        this.userActiveStatus = value;
    }

}
