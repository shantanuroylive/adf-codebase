package com.nttdata.model.vo;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Feb 07 02:34:11 PST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LocationsVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LocationId {
            public Object get(LocationsVORowImpl obj) {
                return obj.getLocationId();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setLocationId((Number)value);
            }
        }
        ,
        StreetAddress {
            public Object get(LocationsVORowImpl obj) {
                return obj.getStreetAddress();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setStreetAddress((String)value);
            }
        }
        ,
        PostalCode {
            public Object get(LocationsVORowImpl obj) {
                return obj.getPostalCode();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setPostalCode((String)value);
            }
        }
        ,
        City {
            public Object get(LocationsVORowImpl obj) {
                return obj.getCity();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setCity((String)value);
            }
        }
        ,
        StateProvince {
            public Object get(LocationsVORowImpl obj) {
                return obj.getStateProvince();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setStateProvince((String)value);
            }
        }
        ,
        CountryId {
            public Object get(LocationsVORowImpl obj) {
                return obj.getCountryId();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setCountryId((String)value);
            }
        }
        ,
        CountryName1 {
            public Object get(LocationsVORowImpl obj) {
                return obj.getCountryName1();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setCountryName1((String)value);
            }
        }
        ,
        CountryId1 {
            public Object get(LocationsVORowImpl obj) {
                return obj.getCountryId1();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setCountryId1((String)value);
            }
        }
        ,
        DepartmentsVO {
            public Object get(LocationsVORowImpl obj) {
                return obj.getDepartmentsVO();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CountriesVO {
            public Object get(LocationsVORowImpl obj) {
                return obj.getCountriesVO();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CountriesVO1 {
            public Object get(LocationsVORowImpl obj) {
                return obj.getCountriesVO1();
            }

            public void put(LocationsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(LocationsVORowImpl object);

        public abstract void put(LocationsVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int STREETADDRESS = AttributesEnum.StreetAddress.index();
    public static final int POSTALCODE = AttributesEnum.PostalCode.index();
    public static final int CITY = AttributesEnum.City.index();
    public static final int STATEPROVINCE = AttributesEnum.StateProvince.index();
    public static final int COUNTRYID = AttributesEnum.CountryId.index();
    public static final int COUNTRYNAME1 = AttributesEnum.CountryName1.index();
    public static final int COUNTRYID1 = AttributesEnum.CountryId1.index();
    public static final int DEPARTMENTSVO = AttributesEnum.DepartmentsVO.index();
    public static final int COUNTRIESVO = AttributesEnum.CountriesVO.index();
    public static final int COUNTRIESVO1 = AttributesEnum.CountriesVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LocationsVORowImpl() {
    }

    /**
     * Gets LocationsEO entity object.
     * @return the LocationsEO
     */
    public EntityImpl getLocationsEO() {
        return (EntityImpl)getEntity(0);
    }


    /**
     * Gets CountriesEO entity object.
     * @return the CountriesEO
     */
    public EntityImpl getCountriesEO() {
        return (EntityImpl)getEntity(1);
    }

    /**
     * Gets the attribute value for LOCATION_ID using the alias name LocationId.
     * @return the LOCATION_ID
     */
    public Number getLocationId() {
        return (Number) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION_ID using the alias name LocationId.
     * @param value value to set the LOCATION_ID
     */
    public void setLocationId(Number value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for STREET_ADDRESS using the alias name StreetAddress.
     * @return the STREET_ADDRESS
     */
    public String getStreetAddress() {
        return (String) getAttributeInternal(STREETADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for STREET_ADDRESS using the alias name StreetAddress.
     * @param value value to set the STREET_ADDRESS
     */
    public void setStreetAddress(String value) {
        setAttributeInternal(STREETADDRESS, value);
    }

    /**
     * Gets the attribute value for POSTAL_CODE using the alias name PostalCode.
     * @return the POSTAL_CODE
     */
    public String getPostalCode() {
        return (String) getAttributeInternal(POSTALCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTAL_CODE using the alias name PostalCode.
     * @param value value to set the POSTAL_CODE
     */
    public void setPostalCode(String value) {
        setAttributeInternal(POSTALCODE, value);
    }

    /**
     * Gets the attribute value for CITY using the alias name City.
     * @return the CITY
     */
    public String getCity() {
        return (String) getAttributeInternal(CITY);
    }

    /**
     * Sets <code>value</code> as attribute value for CITY using the alias name City.
     * @param value value to set the CITY
     */
    public void setCity(String value) {
        setAttributeInternal(CITY, value);
    }

    /**
     * Gets the attribute value for STATE_PROVINCE using the alias name StateProvince.
     * @return the STATE_PROVINCE
     */
    public String getStateProvince() {
        return (String) getAttributeInternal(STATEPROVINCE);
    }

    /**
     * Sets <code>value</code> as attribute value for STATE_PROVINCE using the alias name StateProvince.
     * @param value value to set the STATE_PROVINCE
     */
    public void setStateProvince(String value) {
        setAttributeInternal(STATEPROVINCE, value);
    }

    /**
     * Gets the attribute value for COUNTRY_ID using the alias name CountryId.
     * @return the COUNTRY_ID
     */
    public String getCountryId() {
        return (String) getAttributeInternal(COUNTRYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_ID using the alias name CountryId.
     * @param value value to set the COUNTRY_ID
     */
    public void setCountryId(String value) {
        setAttributeInternal(COUNTRYID, value);
    }


    /**
     * Gets the attribute value for COUNTRY_NAME using the alias name CountryName1.
     * @return the COUNTRY_NAME
     */
    public String getCountryName1() {
        return (String) getAttributeInternal(COUNTRYNAME1);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_NAME using the alias name CountryName1.
     * @param value value to set the COUNTRY_NAME
     */
    public void setCountryName1(String value) {
        setAttributeInternal(COUNTRYNAME1, value);
    }

    /**
     * Gets the attribute value for COUNTRY_ID using the alias name CountryId1.
     * @return the COUNTRY_ID
     */
    public String getCountryId1() {
        return (String) getAttributeInternal(COUNTRYID1);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_ID using the alias name CountryId1.
     * @param value value to set the COUNTRY_ID
     */
    public void setCountryId1(String value) {
        setAttributeInternal(COUNTRYID1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DepartmentsVO.
     */
    public RowIterator getDepartmentsVO() {
        return (RowIterator)getAttributeInternal(DEPARTMENTSVO);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CountriesVO.
     */
    public RowIterator getCountriesVO() {
        return (RowIterator)getAttributeInternal(COUNTRIESVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CountriesVO1.
     */
    public RowSet getCountriesVO1() {
        return (RowSet)getAttributeInternal(COUNTRIESVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
