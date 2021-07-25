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
 * This class is for MailingAddress entity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MailingAddress {
    public String city;
    public String country;
    public Object geocodeAccuracy;
    public Object latitude;
    public Object longitude;
    public String postalCode;
    public String state;
    public String street;

    /**
     * Gets city of MailingAddress.
     *
     * @return city of MailingAddress.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city of MailingAddress.
     *
     * @param city of MailingAddress.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets country of MailingAddress.
     *
     * @return country of MailingAddress.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country of MailingAddress.
     *
     * @param country of MailingAddress.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets geocodeAccuracy of MailingAddress.
     *
     * @return geocodeAccuracy of MailingAddress.
     */
    public Object getGeocodeAccuracy() {
        return geocodeAccuracy;
    }

    /**
     * Sets geocodeAccuracy of MailingAddress.
     *
     * @param geocodeAccuracy of MailingAddress.
     */
    public void setGeocodeAccuracy(Object geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }

    /**
     * Gets latitude of MailingAddress.
     *
     * @return latitude of MailingAddress.
     */
    public Object getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude of MailingAddress.
     *
     * @param latitude of MailingAddress.
     */
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets longitude of MailingAddress.
     *
     * @return longitude of MailingAddress.
     */
    public Object getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude of MailingAddress.
     *
     * @param longitude of MailingAddress.
     */
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets postalCode of MailingAddress.
     *
     * @return postalCode of MailingAddress.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets postalCode of MailingAddress.
     *
     * @param postalCode of MailingAddress.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets state of MailingAddress.
     *
     * @return state of MailingAddress.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state of MailingAddress.
     *
     * @param state of MailingAddress.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets street of MailingAddress.
     *
     * @return street of MailingAddress.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street of MailingAddress.
     *
     * @param street of MailingAddress.
     */
    public void setStreet(String street) {
        this.street = street;
    }
}
