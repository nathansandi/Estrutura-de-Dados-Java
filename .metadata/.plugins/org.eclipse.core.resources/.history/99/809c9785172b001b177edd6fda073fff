/**
 * ChangePasswordRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.ScarService;

public class ChangePasswordRequest  extends pt.victoria.hub.b2c.ws.common.AbstractWebRequest  implements java.io.Serializable {
    private pt.victoria.hub.Model.User.User user;

    private java.lang.String currentPassword;

    private java.lang.String newPassword;

    private java.lang.String newPasswordConfirmation;

    public ChangePasswordRequest() {
    }

    public ChangePasswordRequest(
           java.lang.String webUser,
           java.lang.String applicationCode,
           pt.victoria.hub.Model.User.User user,
           java.lang.String currentPassword,
           java.lang.String newPassword,
           java.lang.String newPasswordConfirmation) {
        super(
            webUser,
            applicationCode);
        this.user = user;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.newPasswordConfirmation = newPasswordConfirmation;
    }


    /**
     * Gets the user value for this ChangePasswordRequest.
     * 
     * @return user
     */
    public pt.victoria.hub.Model.User.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this ChangePasswordRequest.
     * 
     * @param user
     */
    public void setUser(pt.victoria.hub.Model.User.User user) {
        this.user = user;
    }


    /**
     * Gets the currentPassword value for this ChangePasswordRequest.
     * 
     * @return currentPassword
     */
    public java.lang.String getCurrentPassword() {
        return currentPassword;
    }


    /**
     * Sets the currentPassword value for this ChangePasswordRequest.
     * 
     * @param currentPassword
     */
    public void setCurrentPassword(java.lang.String currentPassword) {
        this.currentPassword = currentPassword;
    }


    /**
     * Gets the newPassword value for this ChangePasswordRequest.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ChangePasswordRequest.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the newPasswordConfirmation value for this ChangePasswordRequest.
     * 
     * @return newPasswordConfirmation
     */
    public java.lang.String getNewPasswordConfirmation() {
        return newPasswordConfirmation;
    }


    /**
     * Sets the newPasswordConfirmation value for this ChangePasswordRequest.
     * 
     * @param newPasswordConfirmation
     */
    public void setNewPasswordConfirmation(java.lang.String newPasswordConfirmation) {
        this.newPasswordConfirmation = newPasswordConfirmation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePasswordRequest)) return false;
        ChangePasswordRequest other = (ChangePasswordRequest) obj;
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
            ((this.currentPassword==null && other.getCurrentPassword()==null) || 
             (this.currentPassword!=null &&
              this.currentPassword.equals(other.getCurrentPassword()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.newPasswordConfirmation==null && other.getNewPasswordConfirmation()==null) || 
             (this.newPasswordConfirmation!=null &&
              this.newPasswordConfirmation.equals(other.getNewPasswordConfirmation())));
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
        if (getCurrentPassword() != null) {
            _hashCode += getCurrentPassword().hashCode();
        }
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getNewPasswordConfirmation() != null) {
            _hashCode += getNewPasswordConfirmation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePasswordRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/ScarService/", ">ChangePasswordRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/User/", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPasswordConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewPasswordConfirmation"));
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
