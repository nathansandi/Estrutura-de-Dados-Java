/**
 * AbstractWebRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ws.common;

public abstract class AbstractWebRequest  implements java.io.Serializable {
    private java.lang.String webUser;

    private java.lang.String applicationCode;

    public AbstractWebRequest() {
    }

    public AbstractWebRequest(
           java.lang.String webUser,
           java.lang.String applicationCode) {
           this.webUser = webUser;
           this.applicationCode = applicationCode;
    }


    /**
     * Gets the webUser value for this AbstractWebRequest.
     * 
     * @return webUser
     */
    public java.lang.String getWebUser() {
        return webUser;
    }


    /**
     * Sets the webUser value for this AbstractWebRequest.
     * 
     * @param webUser
     */
    public void setWebUser(java.lang.String webUser) {
        this.webUser = webUser;
    }


    /**
     * Gets the applicationCode value for this AbstractWebRequest.
     * 
     * @return applicationCode
     */
    public java.lang.String getApplicationCode() {
        return applicationCode;
    }


    /**
     * Sets the applicationCode value for this AbstractWebRequest.
     * 
     * @param applicationCode
     */
    public void setApplicationCode(java.lang.String applicationCode) {
        this.applicationCode = applicationCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractWebRequest)) return false;
        AbstractWebRequest other = (AbstractWebRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webUser==null && other.getWebUser()==null) || 
             (this.webUser!=null &&
              this.webUser.equals(other.getWebUser()))) &&
            ((this.applicationCode==null && other.getApplicationCode()==null) || 
             (this.applicationCode!=null &&
              this.applicationCode.equals(other.getApplicationCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWebUser() != null) {
            _hashCode += getWebUser().hashCode();
        }
        if (getApplicationCode() != null) {
            _hashCode += getApplicationCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractWebRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/b2c/ws/common/", "AbstractWebRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WebUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationCode"));
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
