/**
 * City.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tworks.domain;

public class City  implements java.io.Serializable {
    private int circle_code;

    private java.lang.String city_name;

    private java.lang.String delete_flag;

    private int id;

    private java.lang.String state_name;

    public City() {
    }

    public City(
           int circle_code,
           java.lang.String city_name,
           java.lang.String delete_flag,
           int id,
           java.lang.String state_name) {
           this.circle_code = circle_code;
           this.city_name = city_name;
           this.delete_flag = delete_flag;
           this.id = id;
           this.state_name = state_name;
    }


    /**
     * Gets the circle_code value for this City.
     * 
     * @return circle_code
     */
    public int getCircle_code() {
        return circle_code;
    }


    /**
     * Sets the circle_code value for this City.
     * 
     * @param circle_code
     */
    public void setCircle_code(int circle_code) {
        this.circle_code = circle_code;
    }


    /**
     * Gets the city_name value for this City.
     * 
     * @return city_name
     */
    public java.lang.String getCity_name() {
        return city_name;
    }


    /**
     * Sets the city_name value for this City.
     * 
     * @param city_name
     */
    public void setCity_name(java.lang.String city_name) {
        this.city_name = city_name;
    }


    /**
     * Gets the delete_flag value for this City.
     * 
     * @return delete_flag
     */
    public java.lang.String getDelete_flag() {
        return delete_flag;
    }


    /**
     * Sets the delete_flag value for this City.
     * 
     * @param delete_flag
     */
    public void setDelete_flag(java.lang.String delete_flag) {
        this.delete_flag = delete_flag;
    }


    /**
     * Gets the id value for this City.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this City.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the state_name value for this City.
     * 
     * @return state_name
     */
    public java.lang.String getState_name() {
        return state_name;
    }


    /**
     * Sets the state_name value for this City.
     * 
     * @param state_name
     */
    public void setState_name(java.lang.String state_name) {
        this.state_name = state_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.circle_code == other.getCircle_code() &&
            ((this.city_name==null && other.getCity_name()==null) || 
             (this.city_name!=null &&
              this.city_name.equals(other.getCity_name()))) &&
            ((this.delete_flag==null && other.getDelete_flag()==null) || 
             (this.delete_flag!=null &&
              this.delete_flag.equals(other.getDelete_flag()))) &&
            this.id == other.getId() &&
            ((this.state_name==null && other.getState_name()==null) || 
             (this.state_name!=null &&
              this.state_name.equals(other.getState_name())));
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
        _hashCode += getCircle_code();
        if (getCity_name() != null) {
            _hashCode += getCity_name().hashCode();
        }
        if (getDelete_flag() != null) {
            _hashCode += getDelete_flag().hashCode();
        }
        _hashCode += getId();
        if (getState_name() != null) {
            _hashCode += getState_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(City.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://domain.tworks.com", "City"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circle_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.tworks.com", "circle_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.tworks.com", "city_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.tworks.com", "delete_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.tworks.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.tworks.com", "state_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
