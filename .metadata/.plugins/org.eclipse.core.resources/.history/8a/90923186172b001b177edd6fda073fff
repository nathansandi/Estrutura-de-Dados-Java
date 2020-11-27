/**
 * GetUsersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class GetUsersRequest  extends pt.victoria.hub.b2c.ws.common.AbstractWebRequest  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.User user;

    private java.lang.String text;

    private pt.victoria.hub.Model.User.UserQuery userQuery;

    private pt.victoria.hub.Model.User.UserStatus[] excludedStatus;

    private pt.victoria.hub.Model.User.UserType[] excludedTypes;

    private pt.victoria.hub.Model.System.Pageable pageable;

    public GetUsersRequest() {
    }

    public GetUsersRequest(
           java.lang.String webUser,
           java.lang.String applicationCode,
           pt.victoria.hub.Model.User.User user,
           java.lang.String text,
           pt.victoria.hub.Model.User.UserQuery userQuery,
           pt.victoria.hub.Model.User.UserStatus[] excludedStatus,
           pt.victoria.hub.Model.User.UserType[] excludedTypes,
           pt.victoria.hub.Model.System.Pageable pageable) {
        super(
            webUser,
            applicationCode);
        this.user = user;
        this.text = text;
        this.userQuery = userQuery;
        this.excludedStatus = excludedStatus;
        this.excludedTypes = excludedTypes;
        this.pageable = pageable;
    }


    /**
     * Gets the user value for this GetUsersRequest.
     * 
     * @return user
     */
    public pt.victoria.hub.Model.User.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this GetUsersRequest.
     * 
     * @param user
     */
    public void setUser(pt.victoria.hub.Model.User.User user) {
        this.user = user;
    }


    /**
     * Gets the text value for this GetUsersRequest.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this GetUsersRequest.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the userQuery value for this GetUsersRequest.
     * 
     * @return userQuery
     */
    public pt.victoria.hub.Model.User.UserQuery getUserQuery() {
        return userQuery;
    }


    /**
     * Sets the userQuery value for this GetUsersRequest.
     * 
     * @param userQuery
     */
    public void setUserQuery(pt.victoria.hub.Model.User.UserQuery userQuery) {
        this.userQuery = userQuery;
    }


    /**
     * Gets the excludedStatus value for this GetUsersRequest.
     * 
     * @return excludedStatus
     */
    public pt.victoria.hub.Model.User.UserStatus[] getExcludedStatus() {
        return excludedStatus;
    }


    /**
     * Sets the excludedStatus value for this GetUsersRequest.
     * 
     * @param excludedStatus
     */
    public void setExcludedStatus(pt.victoria.hub.Model.User.UserStatus[] excludedStatus) {
        this.excludedStatus = excludedStatus;
    }

    public pt.victoria.hub.Model.User.UserStatus getExcludedStatus(int i) {
        return this.excludedStatus[i];
    }

    public void setExcludedStatus(int i, pt.victoria.hub.Model.User.UserStatus _value) {
        this.excludedStatus[i] = _value;
    }


    /**
     * Gets the excludedTypes value for this GetUsersRequest.
     * 
     * @return excludedTypes
     */
    public pt.victoria.hub.Model.User.UserType[] getExcludedTypes() {
        return excludedTypes;
    }


    /**
     * Sets the excludedTypes value for this GetUsersRequest.
     * 
     * @param excludedTypes
     */
    public void setExcludedTypes(pt.victoria.hub.Model.User.UserType[] excludedTypes) {
        this.excludedTypes = excludedTypes;
    }

    public pt.victoria.hub.Model.User.UserType getExcludedTypes(int i) {
        return this.excludedTypes[i];
    }

    public void setExcludedTypes(int i, pt.victoria.hub.Model.User.UserType _value) {
        this.excludedTypes[i] = _value;
    }


    /**
     * Gets the pageable value for this GetUsersRequest.
     * 
     * @return pageable
     */
    public pt.victoria.hub.Model.System.Pageable getPageable() {
        return pageable;
    }


    /**
     * Sets the pageable value for this GetUsersRequest.
     * 
     * @param pageable
     */
    public void setPageable(pt.victoria.hub.Model.System.Pageable pageable) {
        this.pageable = pageable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsersRequest)) return false;
        GetUsersRequest other = (GetUsersRequest) obj;
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
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.userQuery==null && other.getUserQuery()==null) || 
             (this.userQuery!=null &&
              this.userQuery.equals(other.getUserQuery()))) &&
            ((this.excludedStatus==null && other.getExcludedStatus()==null) || 
             (this.excludedStatus!=null &&
              java.util.Arrays.equals(this.excludedStatus, other.getExcludedStatus()))) &&
            ((this.excludedTypes==null && other.getExcludedTypes()==null) || 
             (this.excludedTypes!=null &&
              java.util.Arrays.equals(this.excludedTypes, other.getExcludedTypes()))) &&
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getUserQuery() != null) {
            _hashCode += getUserQuery().hashCode();
        }
        if (getExcludedStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageable() != null) {
            _hashCode += getPageable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUsersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">GetUsersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "UserQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExcludedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "UserStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExcludedTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "UserType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
