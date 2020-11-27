/**
 * GetActionsByUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class GetActionsByUserRequest  extends pt.victoria.hub.b2c.ws.common.AbstractWebRequest  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.UserAction[] userActions;

    private java.lang.String text;

    private pt.victoria.hub.Model.User.ActionQuery actionQuery;

    private pt.victoria.hub.Model.System.Pageable pageable;

    public GetActionsByUserRequest() {
    }

    public GetActionsByUserRequest(
           java.lang.String webUser,
           java.lang.String applicationCode,
           pt.victoria.hub.Model.User.UserAction[] userActions,
           java.lang.String text,
           pt.victoria.hub.Model.User.ActionQuery actionQuery,
           pt.victoria.hub.Model.System.Pageable pageable) {
        super(
            webUser,
            applicationCode);
        this.userActions = userActions;
        this.text = text;
        this.actionQuery = actionQuery;
        this.pageable = pageable;
    }


    /**
     * Gets the userActions value for this GetActionsByUserRequest.
     * 
     * @return userActions
     */
    public pt.victoria.hub.Model.User.UserAction[] getUserActions() {
        return userActions;
    }


    /**
     * Sets the userActions value for this GetActionsByUserRequest.
     * 
     * @param userActions
     */
    public void setUserActions(pt.victoria.hub.Model.User.UserAction[] userActions) {
        this.userActions = userActions;
    }

    public pt.victoria.hub.Model.User.UserAction getUserActions(int i) {
        return this.userActions[i];
    }

    public void setUserActions(int i, pt.victoria.hub.Model.User.UserAction _value) {
        this.userActions[i] = _value;
    }


    /**
     * Gets the text value for this GetActionsByUserRequest.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this GetActionsByUserRequest.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the actionQuery value for this GetActionsByUserRequest.
     * 
     * @return actionQuery
     */
    public pt.victoria.hub.Model.User.ActionQuery getActionQuery() {
        return actionQuery;
    }


    /**
     * Sets the actionQuery value for this GetActionsByUserRequest.
     * 
     * @param actionQuery
     */
    public void setActionQuery(pt.victoria.hub.Model.User.ActionQuery actionQuery) {
        this.actionQuery = actionQuery;
    }


    /**
     * Gets the pageable value for this GetActionsByUserRequest.
     * 
     * @return pageable
     */
    public pt.victoria.hub.Model.System.Pageable getPageable() {
        return pageable;
    }


    /**
     * Sets the pageable value for this GetActionsByUserRequest.
     * 
     * @param pageable
     */
    public void setPageable(pt.victoria.hub.Model.System.Pageable pageable) {
        this.pageable = pageable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetActionsByUserRequest)) return false;
        GetActionsByUserRequest other = (GetActionsByUserRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userActions==null && other.getUserActions()==null) || 
             (this.userActions!=null &&
              java.util.Arrays.equals(this.userActions, other.getUserActions()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.actionQuery==null && other.getActionQuery()==null) || 
             (this.actionQuery!=null &&
              this.actionQuery.equals(other.getActionQuery()))) &&
            ((this.pageable==null && other.getPageable()==null) || 
             (this.pageable!=null &&
              this.pageable.equals(other.getPageable())));
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
        if (getUserActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getActionQuery() != null) {
            _hashCode += getActionQuery().hashCode();
        }
        if (getPageable() != null) {
            _hashCode += getPageable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetActionsByUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">GetActionsByUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userActions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "UserAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActionQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "ActionQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pageable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Pageable"));
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
