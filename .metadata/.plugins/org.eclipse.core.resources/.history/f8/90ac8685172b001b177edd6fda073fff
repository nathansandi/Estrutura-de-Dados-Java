/**
 * GetUsersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class GetUsersResponse  extends pt.victoria.hub.b2c.ws.common.AbstractWebResponse  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.User[] users;

    private pt.victoria.hub.Model.System.PageInfo pageInfo;

    public GetUsersResponse() {
    }

    public GetUsersResponse(
           pt.victoria.hub.Model.System.ReturnInfo returnInfo,
           pt.victoria.hub.Model.User.User[] users,
           pt.victoria.hub.Model.System.PageInfo pageInfo) {
        super(
            returnInfo);
        this.users = users;
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the users value for this GetUsersResponse.
     * 
     * @return users
     */
    public pt.victoria.hub.Model.User.User[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this GetUsersResponse.
     * 
     * @param users
     */
    public void setUsers(pt.victoria.hub.Model.User.User[] users) {
        this.users = users;
    }

    public pt.victoria.hub.Model.User.User getUsers(int i) {
        return this.users[i];
    }

    public void setUsers(int i, pt.victoria.hub.Model.User.User _value) {
        this.users[i] = _value;
    }


    /**
     * Gets the pageInfo value for this GetUsersResponse.
     * 
     * @return pageInfo
     */
    public pt.victoria.hub.Model.System.PageInfo getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this GetUsersResponse.
     * 
     * @param pageInfo
     */
    public void setPageInfo(pt.victoria.hub.Model.System.PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsersResponse)) return false;
        GetUsersResponse other = (GetUsersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              java.util.Arrays.equals(this.users, other.getUsers()))) &&
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
        if (getUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsers(), i);
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
        new org.apache.axis.description.TypeDesc(GetUsersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">GetUsersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "User"));
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
