/**
 * GetActionsByUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class GetActionsByUserResponse  extends pt.victoria.hub.b2c.ws.common.AbstractWebResponse  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.UserAction[] actions;

    private pt.victoria.hub.Model.System.PageInfo pageInfo;

    public GetActionsByUserResponse() {
    }

    public GetActionsByUserResponse(
           pt.victoria.hub.Model.System.ReturnInfo returnInfo,
           pt.victoria.hub.Model.User.UserAction[] actions,
           pt.victoria.hub.Model.System.PageInfo pageInfo) {
        super(
            returnInfo);
        this.actions = actions;
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the actions value for this GetActionsByUserResponse.
     * 
     * @return actions
     */
    public pt.victoria.hub.Model.User.UserAction[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this GetActionsByUserResponse.
     * 
     * @param actions
     */
    public void setActions(pt.victoria.hub.Model.User.UserAction[] actions) {
        this.actions = actions;
    }

    public pt.victoria.hub.Model.User.UserAction getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, pt.victoria.hub.Model.User.UserAction _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the pageInfo value for this GetActionsByUserResponse.
     * 
     * @return pageInfo
     */
    public pt.victoria.hub.Model.System.PageInfo getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this GetActionsByUserResponse.
     * 
     * @param pageInfo
     */
    public void setPageInfo(pt.victoria.hub.Model.System.PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetActionsByUserResponse)) return false;
        GetActionsByUserResponse other = (GetActionsByUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetActionsByUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">GetActionsByUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "UserAction"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "PageInfo"));
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
