/**
 * AbstractWebResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ws.common;

public abstract class AbstractWebResponse  implements java.io.Serializable {
    private pt.victoria.hub.Model.System.ReturnInfo returnInfo;

    public AbstractWebResponse() {
    }

    public AbstractWebResponse(
           pt.victoria.hub.Model.System.ReturnInfo returnInfo) {
           this.returnInfo = returnInfo;
    }


    /**
     * Gets the returnInfo value for this AbstractWebResponse.
     * 
     * @return returnInfo
     */
    public pt.victoria.hub.Model.System.ReturnInfo getReturnInfo() {
        return returnInfo;
    }


    /**
     * Sets the returnInfo value for this AbstractWebResponse.
     * 
     * @param returnInfo
     */
    public void setReturnInfo(pt.victoria.hub.Model.System.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractWebResponse)) return false;
        AbstractWebResponse other = (AbstractWebResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnInfo==null && other.getReturnInfo()==null) || 
             (this.returnInfo!=null &&
              this.returnInfo.equals(other.getReturnInfo())));
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
        if (getReturnInfo() != null) {
            _hashCode += getReturnInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractWebResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/b2c/ws/common/", "AbstractWebResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReturnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "ReturnInfo"));
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
