/**
 * PageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.Model.System;

public class PageInfo  implements java.io.Serializable {
    private int currentPage;

    private int totalNumberOfPages;

    private int totalNumberOfRecords;

    private java.util.Calendar modificationDate;

    public PageInfo() {
    }

    public PageInfo(
           int currentPage,
           int totalNumberOfPages,
           int totalNumberOfRecords,
           java.util.Calendar modificationDate) {
           this.currentPage = currentPage;
           this.totalNumberOfPages = totalNumberOfPages;
           this.totalNumberOfRecords = totalNumberOfRecords;
           this.modificationDate = modificationDate;
    }


    /**
     * Gets the currentPage value for this PageInfo.
     * 
     * @return currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }


    /**
     * Sets the currentPage value for this PageInfo.
     * 
     * @param currentPage
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * Gets the totalNumberOfPages value for this PageInfo.
     * 
     * @return totalNumberOfPages
     */
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }


    /**
     * Sets the totalNumberOfPages value for this PageInfo.
     * 
     * @param totalNumberOfPages
     */
    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }


    /**
     * Gets the totalNumberOfRecords value for this PageInfo.
     * 
     * @return totalNumberOfRecords
     */
    public int getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }


    /**
     * Sets the totalNumberOfRecords value for this PageInfo.
     * 
     * @param totalNumberOfRecords
     */
    public void setTotalNumberOfRecords(int totalNumberOfRecords) {
        this.totalNumberOfRecords = totalNumberOfRecords;
    }


    /**
     * Gets the modificationDate value for this PageInfo.
     * 
     * @return modificationDate
     */
    public java.util.Calendar getModificationDate() {
        return modificationDate;
    }


    /**
     * Sets the modificationDate value for this PageInfo.
     * 
     * @param modificationDate
     */
    public void setModificationDate(java.util.Calendar modificationDate) {
        this.modificationDate = modificationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageInfo)) return false;
        PageInfo other = (PageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.currentPage == other.getCurrentPage() &&
            this.totalNumberOfPages == other.getTotalNumberOfPages() &&
            this.totalNumberOfRecords == other.getTotalNumberOfRecords() &&
            ((this.modificationDate==null && other.getModificationDate()==null) || 
             (this.modificationDate!=null &&
              this.modificationDate.equals(other.getModificationDate())));
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
        _hashCode += getCurrentPage();
        _hashCode += getTotalNumberOfPages();
        _hashCode += getTotalNumberOfRecords();
        if (getModificationDate() != null) {
            _hashCode += getModificationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "PageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalNumberOfPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalNumberOfRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ModificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
