/**
 * UserStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.Model.User;

public class UserStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PENDING_EMAIL_CONFIRMATION = "PENDING_EMAIL_CONFIRMATION";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final UserStatus PENDING_EMAIL_CONFIRMATION = new UserStatus(_PENDING_EMAIL_CONFIRMATION);
    public static final UserStatus PENDING = new UserStatus(_PENDING);
    public static final UserStatus ACTIVE = new UserStatus(_ACTIVE);
    public static final UserStatus INACTIVE = new UserStatus(_INACTIVE);
    public static final UserStatus EXPIRED = new UserStatus(_EXPIRED);
    public java.lang.String getValue() { return _value_;}
    public static UserStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserStatus enumeration = (UserStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "UserStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
