/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import salesforce.entities.support.Attribute;
import salesforce.entities.support.BillingAddress;
import salesforce.entities.support.ShippingAddress;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {
    private Attribute attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    private Object masterRecordId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("ParentId")
    private Object parentId;
    @JsonProperty("BillingStreet")
    private String billingStreet;
    @JsonProperty("BillingCity")
    private String billingCity;
    @JsonProperty("BillingState")
    private String billingState;
    @JsonProperty("BillingPostalCode")
    private String billingPostalCode;
    @JsonProperty("BillingCountry")
    private String billingCountry;
    @JsonProperty("BillingLatitude")
    private Object billingLatitude;
    @JsonProperty("BillingLongitude")
    private Object billingLongitude;
    @JsonProperty("BillingGeocodeAccuracy")
    private Object billingGeocodeAccuracy;
    @JsonProperty("BillingAddress")
    private BillingAddress billingAddress;
    @JsonProperty("ShippingStreet")
    private String shippingStreet;
    @JsonProperty("ShippingCity")
    private String shippingCity;
    @JsonProperty("ShippingState")
    private String shippingState;
    @JsonProperty("ShippingPostalCode")
    private String shippingPostalCode;
    @JsonProperty("ShippingCountry")
    private String shippingCountry;
    @JsonProperty("ShippingLatitude")
    private Object shippingLatitude;
    @JsonProperty("ShippingLongitude")
    private Object shippingLongitude;
    @JsonProperty("ShippingGeocodeAccuracy")
    private Object shippingGeocodeAccuracy;
    @JsonProperty("ShippingAddress")
    private ShippingAddress shippingAddress;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Fax")
    private String fax;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("Website")
    private String website;
    @JsonProperty("PhotoUrl")
    private String photoUrl;
    @JsonProperty("Sic")
    private String sic;
    @JsonProperty("Industry")
    private String industry;
    @JsonProperty("AnnualRevenue")
    private Double annualRevenue;
    @JsonProperty("NumberOfEmployees")
    private Integer numberOfEmployees;
    @JsonProperty("Ownership")
    private String ownership;
    @JsonProperty("TickerSymbol")
    private String tickerSymbol;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Rating")
    private String rating;
    @JsonProperty("Site")
    private String site;
    @JsonProperty("OwnerId")
    private String ownerId;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("CreatedById")
    private String createdById;
    @JsonProperty("LastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("LastModifiedById")
    private String lastModifiedById;
    @JsonProperty("SystemModstamp")
    private String systemModStamp;
    @JsonProperty("LastActivityDate")
    private Object lastActivityDate;
    @JsonProperty("LastViewedDate")
    private String lastViewedDate;
    @JsonProperty("LastReferencedDate")
    private String lastReferencedDate;
    @JsonProperty("Jigsaw")
    private Object jigsaw;
    @JsonProperty("JigsawCompanyId")
    private Object jigsawCompanyId;
    @JsonProperty("CleanStatus")
    private String cleanStatus;
    @JsonProperty("AccountSource")
    private Object accountSource;
    @JsonProperty("DunsNumber")
    private Object dunsNumber;
    @JsonProperty("Tradestyle")
    private Object tradeStyle;
    @JsonProperty("NaicsCode")
    private Object naiCsCode;
    @JsonProperty("NaicsDesc")
    private Object naiCsDesc;
    @JsonProperty("YearStarted")
    private Object yearStarted;
    @JsonProperty("SicDesc")
    private Object sicDesc;
    @JsonProperty("DandbCompanyId")
    private Object danDbCompanyId;
    @JsonProperty("OperatingHoursId")
    private Object operatingHoursId;
    @JsonProperty("CustomerPriority__c")
    private String customerPriorityC;
    @JsonProperty("SLA__c")
    private String slaC;
    @JsonProperty("Active__c")
    private String activeC;
    @JsonProperty("NumberofLocations__c")
    private Double numberOfLocationsC;
    @JsonProperty("UpsellOpportunity__c")
    private String upsellOpportunityC;
    @JsonProperty("SLASerialNumber__c")
    private String slaSerialNumberC;
    @JsonProperty("SLAExpirationDate__c")
    private String slaExpirationDateC;

    /**
     * Gets attributes of Account.
     *
     * @return attributes of Account.
     */
    public Attribute getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes of Account.
     *
     * @param attributes of Account.
     */
    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets id of Account.
     *
     * @return id of Account.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id of Account.
     *
     * @param id of Account.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets isDeleted of Account.
     *
     * @return isDeleted of Account.
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets deleted of Account.
     *
     * @param deleted of Account.
     */
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * Gets masterRecordId of Account.
     *
     * @return masterRecordId of Account.
     */
    public Object getMasterRecordId() {
        return masterRecordId;
    }

    /**
     * Sets masterRecordId of Account.
     *
     * @param masterRecordId of Account.
     */
    public void setMasterRecordId(Object masterRecordId) {
        this.masterRecordId = masterRecordId;
    }

    /**
     * Gets name of Account.
     *
     * @return name of Account.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of Account.
     *
     * @param name of Account.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets type of Account.
     *
     * @return type of Account.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type of Account.
     *
     * @param type of Account.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets parentId of Account.
     *
     * @return parentId of Account.
     */
    public Object getParentId() {
        return parentId;
    }

    /**
     * Sets parentId of Account.
     *
     * @param parentId of Account.
     */
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets billingStreet of Account.
     *
     * @return billingStreet of Account.
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * Sets billingStreet of Account.
     *
     * @param billingStreet of Account.
     */
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    /**
     * Gets billingCity of Account.
     *
     * @return billingCity of Account.
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets billingCity of Account.
     *
     * @param billingCity of Account.
     */
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Gets billingState of Account.
     *
     * @return billingState of Account.
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * Sets billingState of Account.
     *
     * @param billingState of Account.
     */
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * Gets billingPostalCode of Account.
     *
     * @return billingPostalCode of Account.
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets billingPostalCode of Account.
     *
     * @param billingPostalCode of Account.
     */
    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    /**
     * Gets billingCountry of Account.
     *
     * @return billingCountry of Account.
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets billingCountry of Account.
     *
     * @param billingCountry of Account.
     */
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Gets billingLatitude of Account.
     *
     * @return billingLatitude of Account.
     */
    public Object getBillingLatitude() {
        return billingLatitude;
    }

    /**
     * Sets billingLatitude of Account.
     *
     * @param billingLatitude of Account.
     */
    public void setBillingLatitude(Object billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    /**
     * Gets billingLongitude of Account.
     *
     * @return billingLongitude of Account.
     */
    public Object getBillingLongitude() {
        return billingLongitude;
    }

    /**
     * Sets billingLongitude of Account.
     *
     * @param billingLongitude of Account.
     */
    public void setBillingLongitude(Object billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    /**
     * Gets billingGeocodeAccuracy of Account.
     *
     * @return billingGeocodeAccuracy of Account.
     */
    public Object getBillingGeocodeAccuracy() {
        return billingGeocodeAccuracy;
    }

    /**
     * Sets billingGeocodeAccuracy of Account.
     *
     * @param billingGeocodeAccuracy of Account.
     */
    public void setBillingGeocodeAccuracy(Object billingGeocodeAccuracy) {
        this.billingGeocodeAccuracy = billingGeocodeAccuracy;
    }

    /**
     * Gets billingAddress of Account.
     *
     * @return billingAddress of Account.
     */
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets billingAddress of Account.
     *
     * @param billingAddress of Account.
     */
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Gets shippingStreet of Account.
     *
     * @return shippingStreet of Account.
     */
    public String getShippingStreet() {
        return shippingStreet;
    }

    /**
     * Sets shippingStreet of Account.
     *
     * @param shippingStreet of Account.
     */
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    /**
     * Gets shippingCity of Account.
     *
     * @return shippingCity of Account.
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets shippingCity of Account.
     *
     * @param shippingCity of Account.
     */
    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    /**
     * Gets shippingState of Account.
     *
     * @return shippingState of Account.
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets shippingState of Account.
     *
     * @param shippingState of Account.
     */
    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    /**
     * Gets shippingPostalCode of Account.
     *
     * @return shippingPostalCode of Account.
     */
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    /**
     * Sets shippingPostalCode of Account.
     *
     * @param shippingPostalCode of Account.
     */
    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    /**
     * Gets shippingCountry of Account.
     *
     * @return shippingCountry of Account.
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets shippingCountry of Account.
     *
     * @param shippingCountry of Account.
     */
    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    /**
     * Gets shippingLatitude of Account.
     *
     * @return shippingLatitude of Account.
     */
    public Object getShippingLatitude() {
        return shippingLatitude;
    }

    /**
     * Sets shippingLatitude of Account.
     *
     * @param shippingLatitude of Account.
     */
    public void setShippingLatitude(Object shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    /**
     * Gets shippingLongitude of Account.
     *
     * @return shippingLongitude of Account.
     */
    public Object getShippingLongitude() {
        return shippingLongitude;
    }

    /**
     * Sets shippingLongitude of Account.
     *
     * @param shippingLongitude of Account.
     */
    public void setShippingLongitude(Object shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    /**
     * Gets shippingGeocodeAccuracy of Account.
     *
     * @return shippingGeocodeAccuracy of Account.
     */
    public Object getShippingGeocodeAccuracy() {
        return shippingGeocodeAccuracy;
    }

    /**
     * Sets shippingGeocodeAccuracy of Account.
     *
     * @param shippingGeocodeAccuracy of Account.
     */
    public void setShippingGeocodeAccuracy(Object shippingGeocodeAccuracy) {
        this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
    }

    /**
     * Gets shippingAddress of Account.
     *
     * @return shippingAddress of Account.
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets shippingAddress of Account.
     *
     * @param shippingAddress of Account.
     */
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Gets phone of Account.
     *
     * @return phone of Account.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone of Account.
     *
     * @param phone of Account.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets fax of Account.
     *
     * @return fax of Account.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets fax of Account.
     *
     * @param fax of Account.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets accountNumber of Account.
     *
     * @return accountNumber of Account.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets accountNumber of Account.
     *
     * @param accountNumber of Account.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets website of Account.
     *
     * @return website of Account.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets website of Account.
     *
     * @param website of Account.
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Gets photoUrl of Account.
     *
     * @return photoUrl of Account.
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets photoUrl of Account.
     *
     * @param photoUrl of Account.
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * Gets sic of Account.
     *
     * @return sic of Account.
     */
    public String getSic() {
        return sic;
    }

    /**
     * Sets sic of Account.
     *
     * @param sic of Account.
     */
    public void setSic(String sic) {
        this.sic = sic;
    }

    /**
     * Gets industry of Account.
     *
     * @return industry of Account.
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets industry of Account.
     *
     * @param industry of Account.
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * Gets annualRevenue of Account.
     *
     * @return annualRevenue of Account.
     */
    public Double getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets annualRevenue of Account.
     *
     * @param annualRevenue of Account.
     */
    public void setAnnualRevenue(Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    /**
     * Gets numberOfEmployees of Account.
     *
     * @return numberOfEmployees of Account.
     */
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets numberOfEmployees of Account.
     *
     * @param numberOfEmployees of Account.
     */
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    /**
     * Gets ownership of Account.
     *
     * @return ownership of Account.
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets ownership of Account.
     *
     * @param ownership of Account.
     */
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    /**
     * Gets tickerSymbol of Account.
     *
     * @return tickerSymbol of Account.
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Sets tickerSymbol of Account.
     *
     * @param tickerSymbol of Account.
     */
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    /**
     * Gets description of Account.
     *
     * @return description of Account.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of Account.
     *
     * @param description of Account.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets rating of Account.
     *
     * @return rating of Account.
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets rating of Account.
     *
     * @param rating of Account.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Gets site of Account.
     *
     * @return site of Account.
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets site of Account.
     *
     * @param site of Account.
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * Gets ownerId of Account.
     *
     * @return ownerId of Account.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets ownerId of Account.
     *
     * @param ownerId of Account.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets createdDate of Account.
     *
     * @return createdDate of Account.
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate of Account.
     *
     * @param createdDate of Account.
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets createdById of Account.
     *
     * @return createdById of Account.
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets createdById of Account.
     *
     * @param createdById of Account.
     */
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    /**
     * Gets lastModifiedDate of Account.
     *
     * @return lastModifiedDate of Account.
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate of Account.
     *
     * @param lastModifiedDate of Account.
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets lastModifiedById of Account.
     *
     * @return lastModifiedById of Account.
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets lastModifiedById of Account.
     *
     * @param lastModifiedById of Account.
     */
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    /**
     * Gets systemModStamp of Account.
     *
     * @return systemModStamp of Account.
     */
    public String getSystemModStamp() {
        return systemModStamp;
    }

    /**
     * Sets systemModStamp of Account.
     *
     * @param systemModStamp of Account.
     */
    public void setSystemModStamp(String systemModStamp) {
        this.systemModStamp = systemModStamp;
    }

    /**
     * Gets lastActivityDate of Account.
     *
     * @return lastActivityDate of Account.
     */
    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets lastActivityDate of Account.
     *
     * @param lastActivityDate of Account.
     */
    public void setLastActivityDate(Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * Gets lastViewedDate of Account.
     *
     * @return lastViewedDate of Account.
     */
    public String getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets lastViewedDate of Account.
     *
     * @param lastViewedDate of Account.
     */
    public void setLastViewedDate(String lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets lastReferencedDate of Account.
     *
     * @return lastReferencedDate of Account.
     */
    public String getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets lastReferencedDate of Account.
     *
     * @param lastReferencedDate of Account.
     */
    public void setLastReferencedDate(String lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    /**
     * Gets jigsaw of Account.
     *
     * @return jigsaw of Account.
     */
    public Object getJigsaw() {
        return jigsaw;
    }

    /**
     * Sets jigsaw of Account.
     *
     * @param jigsaw of Account.
     */
    public void setJigsaw(Object jigsaw) {
        this.jigsaw = jigsaw;
    }

    /**
     * Gets jigsawCompanyId of Account.
     *
     * @return jigsawCompanyId of Account.
     */
    public Object getJigsawCompanyId() {
        return jigsawCompanyId;
    }

    /**
     * Sets jigsawCompanyId of Account.
     *
     * @param jigsawCompanyId of Account.
     */
    public void setJigsawCompanyId(Object jigsawCompanyId) {
        this.jigsawCompanyId = jigsawCompanyId;
    }

    /**
     * Gets cleanStatus of Account.
     *
     * @return cleanStatus of Account.
     */
    public String getCleanStatus() {
        return cleanStatus;
    }

    /**
     * Sets cleanStatus of Account.
     *
     * @param cleanStatus of Account.
     */
    public void setCleanStatus(String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    /**
     * Gets accountSource of Account.
     *
     * @return accountSource of Account.
     */
    public Object getAccountSource() {
        return accountSource;
    }

    /**
     * Sets accountSource of Account.
     *
     * @param accountSource of Account.
     */
    public void setAccountSource(Object accountSource) {
        this.accountSource = accountSource;
    }

    /**
     * Gets dunsNumber of Account.
     *
     * @return dunsNumber of Account.
     */
    public Object getDunsNumber() {
        return dunsNumber;
    }

    /**
     * Sets dunsNumber of Account.
     *
     * @param dunsNumber of Account.
     */
    public void setDunsNumber(Object dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    /**
     * Gets tradeStyle of Account.
     *
     * @return tradeStyle of Account.
     */
    public Object getTradeStyle() {
        return tradeStyle;
    }

    /**
     * Sets tradeStyle of Account.
     *
     * @param tradeStyle of Account.
     */
    public void setTradeStyle(Object tradeStyle) {
        this.tradeStyle = tradeStyle;
    }

    /**
     * Gets naiCsCode of Account.
     *
     * @return naiCsCode of Account.
     */
    public Object getNaiCsCode() {
        return naiCsCode;
    }

    /**
     * Sets naiCsCode of Account.
     *
     * @param naiCsCode of Account.
     */
    public void setNaiCsCode(Object naiCsCode) {
        this.naiCsCode = naiCsCode;
    }

    /**
     * Gets naiCsDesc of Account.
     *
     * @return naiCsDesc of Account.
     */
    public Object getNaiCsDesc() {
        return naiCsDesc;
    }

    /**
     * Sets naiCsDesc of Account.
     *
     * @param naiCsDesc of Account.
     */
    public void setNaiCsDesc(Object naiCsDesc) {
        this.naiCsDesc = naiCsDesc;
    }

    /**
     * Gets yearStarted of Account.
     *
     * @return yearStarted of Account.
     */
    public Object getYearStarted() {
        return yearStarted;
    }

    /**
     * Sets yearStarted of Account.
     *
     * @param yearStarted of Account.
     */
    public void setYearStarted(Object yearStarted) {
        this.yearStarted = yearStarted;
    }

    /**
     * Gets sicDesc of Account.
     *
     * @return sicDesc of Account.
     */
    public Object getSicDesc() {
        return sicDesc;
    }

    /**
     * Sets sicDesc of Account.
     *
     * @param sicDesc of Account.
     */
    public void setSicDesc(Object sicDesc) {
        this.sicDesc = sicDesc;
    }

    /**
     * Gets danDbCompanyId of Account.
     *
     * @return danDbCompanyId of Account.
     */
    public Object getDanDbCompanyId() {
        return danDbCompanyId;
    }

    /**
     * Sets danDbCompanyId of Account.
     *
     * @param danDbCompanyId of Account.
     */
    public void setDanDbCompanyId(Object danDbCompanyId) {
        this.danDbCompanyId = danDbCompanyId;
    }

    /**
     * Gets operatingHoursId of Account.
     *
     * @return operatingHoursId of Account.
     */
    public Object getOperatingHoursId() {
        return operatingHoursId;
    }

    /**
     * Sets operatingHoursId of Account.
     *
     * @param operatingHoursId of Account.
     */
    public void setOperatingHoursId(Object operatingHoursId) {
        this.operatingHoursId = operatingHoursId;
    }

    /**
     * Gets customerPriorityC of Account.
     *
     * @return customerPriorityC of Account.
     */
    public String getCustomerPriorityC() {
        return customerPriorityC;
    }

    /**
     * Sets customerPriorityC of Account.
     *
     * @param customerPriorityC of Account.
     */
    public void setCustomerPriorityC(String customerPriorityC) {
        this.customerPriorityC = customerPriorityC;
    }

    /**
     * Gets slaC of Account.
     *
     * @return slaC of Account.
     */
    public String getSlaC() {
        return slaC;
    }

    /**
     * Sets slaC of Account.
     *
     * @param slaC of Account.
     */
    public void setSlaC(String slaC) {
        this.slaC = slaC;
    }

    /**
     * Gets activeC of Account.
     *
     * @return activeC of Account.
     */
    public String getActiveC() {
        return activeC;
    }

    /**
     * Sets activeC of Account.
     *
     * @param activeC of Account.
     */
    public void setActiveC(String activeC) {
        this.activeC = activeC;
    }

    /**
     * Gets numberOfLocationsC of Account.
     *
     * @return numberOfLocationsC of Account.
     */
    public Double getNumberOfLocationsC() {
        return numberOfLocationsC;
    }

    /**
     * Sets numberOfLocationsC of Account.
     *
     * @param numberOfLocationsC of Account.
     */
    public void setNumberOfLocationsC(Double numberOfLocationsC) {
        this.numberOfLocationsC = numberOfLocationsC;
    }

    /**
     * Gets upsellOpportunityC of Account.
     *
     * @return upsellOpportunityC of Account.
     */
    public String getUpsellOpportunity__c() {
        return upsellOpportunityC;
    }

    /**
     * Sets upsellOpportunityC of Account.
     *
     * @param upsellOpportunityC of Account.
     */
    public void setUpsellOpportunityC(String upsellOpportunityC) {
        this.upsellOpportunityC = upsellOpportunityC;
    }

    /**
     * Gets slaSerialNumberC of Account.
     *
     * @return slaSerialNumberC of Account.
     */
    public String getSlaSerialNumberC() {
        return slaSerialNumberC;
    }

    /**
     * Sets slaSerialNumberC of Account.
     *
     * @param slaSerialNumberC of Account.
     */
    public void setSlaSerialNumberC(String slaSerialNumberC) {
        this.slaSerialNumberC = slaSerialNumberC;
    }

    /**
     * Gets slaExpirationDateC of Account.
     *
     * @return slaExpirationDateC of Account.
     */
    public String getSlaExpirationDateC() {
        return slaExpirationDateC;
    }

    /**
     * Sets slaExpirationDateC of Account.
     *
     * @param slaExpirationDateC of Account.
     */
    public void setSlaExpirationDateC(String slaExpirationDateC) {
        this.slaExpirationDateC = slaExpirationDateC;
    }
}
