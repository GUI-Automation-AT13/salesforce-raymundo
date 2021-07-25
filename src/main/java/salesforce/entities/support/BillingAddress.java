/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities.support;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class creates a BillingAddress object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingAddress {
    public String city;
    public String country;
    public Object geocodeAccuracy;
    public Object latitude;
    public Object longitude;
    public String postalCode;
    public String state;
    public String street;

    /**
     * Gets the city.
     *
     * @return a String with the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city a String with the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the country.
     *
     * @return a String with the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     *
     * @param country a String with the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the geocode accuracy.
     *
     * @return a String with the geocode accuracy
     */
    public Object getGeocodeAccuracy() {
        return geocodeAccuracy;
    }

    /**
     * Sets the geocode accuracy.
     *
     * @param geocodeAccuracy a String with the geocode accuracy to set
     */
    public void setGeocodeAccuracy(Object geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }

    /**
     * Gets the latitude.
     *
     * @return a String with the latitude
     */
    public Object getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude.
     *
     * @param latitude a String with the latitude to set
     */
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets the longitude.
     *
     * @return a String with the longitude
     */
    public Object getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude.
     *
     * @param longitude a String with the longitude to set
     */
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets the postal code.
     *
     * @return a String with the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     *
     * @param postalCode a String with the postal code to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the street.
     *
     * @return a String with the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state a String with the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the street.
     *
     * @return a String with the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street.
     *
     * @param street a String with the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }
}
