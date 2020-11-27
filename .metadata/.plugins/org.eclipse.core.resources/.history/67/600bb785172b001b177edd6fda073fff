/**
 * ValidateAuthenticationKeyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class ValidateAuthenticationKeyRequest  extends pt.victoria.hub.b2c.ws.common.AbstractWebRequest  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.User user;

    private java.lang.String authenticationKey;

    public ValidateAuthenticationKeyRequest() {
    }

    public ValidateAuthenticationKeyRequest(
           java.lang.String webUser,
           java.lang.String applicationCode,
           pt.victoria.hub.Model.User.User user,
           java.lang.String authenticationKey) {
        super(
            webUser,
            applicationCode);
        this.user = user;
        this.authenticationKey = authenticationKey;
    }


    /**
     * Gets the user value for this ValidateAuthenticationKeyRequest.
     * 
     * @return user
     */
    public pt.victoria.hub.Model.User.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this ValidateAuthenticationKeyRequest.
     * 
     * @param user
     */
    public void setUser(pt.victoria.hub.Model.User.User user) {
        this.user = user;
    }


    /**
     * Gets the authenticationKey value for this ValidateAuthenticationKeyRequest.
     * 
     * @return authenticationKey
     */
    public java.lang.String getAuthenticationKey() {
        return authenticationKey;
    }


    /**
     * Sets the authenticationKey value for this ValidateAuthenticationKeyRequest.
     * 
     * @param authenticationKey
     */
    public void setAuthenticationKey(java.lang.String authenticationKey) {
        this.authenticationKey = authenticationKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateAuthenticationKeyRequest)) return false;
        ValidateAuthenticationKeyRequest other = (ValidateAuthenticationKeyRequest) obj;
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
            ((this.authenticationKey==null && other.getAuthenticationKey()==null) || 
             (this.authenticationKey!=null &&
              this.authenticationKey.equals(other.getAuthenticationKey())));
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
        if (getAuthenticationKey() != null) {
            _hashCode += getAuthenticationKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateAuthenticationKeyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">ValidateAuthenticationKeyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
