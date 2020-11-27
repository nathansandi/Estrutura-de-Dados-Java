/**
 * ActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.Model.User;

public class ActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CHANGE_DATA = "CHANGE_DATA";
    public static final java.lang.String _CHANGE_EMAIL = "CHANGE_EMAIL";
    public static final java.lang.String _CHANGE_PHONE = "CHANGE_PHONE";
    public static final java.lang.String _LOGIN = "LOGIN";
    public static final java.lang.String _LOGOUT = "LOGOUT";
    public static final java.lang.String _ACTIVATION = "ACTIVATION";
    public static final java.lang.String _INACTIVATION = "INACTIVATION";
    public static final java.lang.String _CREATION = "CREATION";
    public static final java.lang.String _REMOVAL = "REMOVAL";
    public static final ActionType CHANGE_DATA = new ActionType(_CHANGE_DATA);
    public static final ActionType CHANGE_EMAIL = new ActionType(_CHANGE_EMAIL);
    public static final ActionType CHANGE_PHONE = new ActionType(_CHANGE_PHONE);
    public static final ActionType LOGIN = new ActionType(_LOGIN);
    public static final ActionType LOGOUT = new ActionType(_LOGOUT);
    public static final ActionType ACTIVATION = new ActionType(_ACTIVATION);
    public static final ActionType INACTIVATION = new ActionType(_INACTIVATION);
    public static final ActionType CREATION = new ActionType(_CREATION);
    public static final ActionType REMOVAL = new ActionType(_REMOVAL);
    public java.lang.String getValue() { return _value_;}
    public static ActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionType enumeration = (ActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "ActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
