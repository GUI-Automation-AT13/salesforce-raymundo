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
 * This class is for ShippingAddress entity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingAddress {
    public String city;
    public String country;
    public Object geocodeAccuracy;
    public Object latitude;
    public Object longitude;
    public String postalCode;
    public String state;
    public String street;

    /**
     * Gets city of ShippingAddress.
     *
     * @return city of ShippingAddress.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city of ShippingAddress.
     *
     * @param city of ShippingAddress.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets country of ShippingAddress.
     *
     * @return country of ShippingAddress.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country of ShippingAddress.
     *
     * @param country of ShippingAddress.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets geocodeAccuracy of ShippingAddress.
     *
     * @return geocodeAccuracy of ShippingAddress.
     */
    public Object getGeocodeAccuracy() {
        return geocodeAccuracy;
    }

    /**
     * Sets geocodeAccuracy of ShippingAddress.
     *
     * @param geocodeAccuracy of ShippingAddress.
     */
    public void setGeocodeAccuracy(Object geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }

    /**
     * Gets latitude of ShippingAddress.
     *
     * @return latitude of ShippingAddress.
     */
    public Object getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude of ShippingAddress.
     *
     * @param latitude of ShippingAddress.
     */
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets longitude of ShippingAddress.
     *
     * @return longitude of ShippingAddress.
     */
    public Object getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude of ShippingAddress.
     *
     * @param longitude of ShippingAddress.
     */
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets postalCode of ShippingAddress.
     *
     * @return postalCode of ShippingAddress.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets postalCode of ShippingAddress.
     *
     * @param postalCode of ShippingAddress.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets state of ShippingAddress.
     *
     * @return state of ShippingAddress.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state of ShippingAddress.
     *
     * @param state of ShippingAddress.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets street of ShippingAddress.
     *
     * @return street of ShippingAddress.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street of ShippingAddress.
     *
     * @param street of ShippingAddress.
     */
    public void setStreet(String street) {
        this.street = street;
    }
}
