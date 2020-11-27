/**
 * ConcludeCreateClientUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class ConcludeCreateClientUserRequest  extends pt.victoria.hub.b2c.ws.common.AbstractWebRequest  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.User user;

    private java.lang.String password;

    private java.lang.String confirmationPassword;

    private java.lang.String tokenKey;

    public ConcludeCreateClientUserRequest() {
    }

    public ConcludeCreateClientUserRequest(
           java.lang.String webUser,
           java.lang.String applicationCode,
           pt.victoria.hub.Model.User.User user,
           java.lang.String password,
           java.lang.String confirmationPassword,
           java.lang.String tokenKey) {
        super(
            webUser,
            applicationCode);
        this.user = user;
        this.password = password;
        this.confirmationPassword = confirmationPassword;
        this.tokenKey = tokenKey;
    }


    /**
     * Gets the user value for this ConcludeCreateClientUserRequest.
     * 
     * @return user
     */
    public pt.victoria.hub.Model.User.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this ConcludeCreateClientUserRequest.
     * 
     * @param user
     */
    public void setUser(pt.victoria.hub.Model.User.User user) {
        this.user = user;
    }


    /**
     * Gets the password value for this ConcludeCreateClientUserRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConcludeCreateClientUserRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the confirmationPassword value for this ConcludeCreateClientUserRequest.
     * 
     * @return confirmationPassword
     */
    public java.lang.String getConfirmationPassword() {
        return confirmationPassword;
    }


    /**
     * Sets the confirmationPassword value for this ConcludeCreateClientUserRequest.
     * 
     * @param confirmationPassword
     */
    public void setConfirmationPassword(java.lang.String confirmationPassword) {
        this.confirmationPassword = confirmationPassword;
    }


    /**
     * Gets the tokenKey value for this ConcludeCreateClientUserRequest.
     * 
     * @return tokenKey
     */
    public java.lang.String getTokenKey() {
        return tokenKey;
    }


    /**
     * Sets the tokenKey value for this ConcludeCreateClientUserRequest.
     * 
     * @param tokenKey
     */
    public void setTokenKey(java.lang.String tokenKey) {
        this.tokenKey = tokenKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConcludeCreateClientUserRequest)) return false;
        ConcludeCreateClientUserRequest other = (ConcludeCreateClientUserRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.confirmationPassword==null && other.getConfirmationPassword()==null) || 
             (this.confirmationPassword!=null &&
              this.confirmationPassword.equals(other.getConfirmationPassword()))) &&
            ((this.tokenKey==null && other.getTokenKey()==null) || 
             (this.tokenKey!=null &&
              this.tokenKey.equals(other.getTokenKey())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getConfirmationPassword() != null) {
            _hashCode += getConfirmationPassword().hashCode();
        }
        if (getTokenKey() != null) {
            _hashCode += getTokenKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConcludeCreateClientUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">ConcludeCreateClientUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "User"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConfirmationPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TokenKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
