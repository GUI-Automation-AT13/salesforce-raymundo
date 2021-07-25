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
import salesforce.entities.support.MailingAddress;
import salesforce.entities.support.OtherAddress;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    public Object masterRecordId;
    @JsonProperty("AccountId")
    public String accountId;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("Salutation")
    public String salutation;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("OtherStreet")
    public String otherStreet;
    @JsonProperty("OtherCity")
    public String otherCity;
    @JsonProperty("OtherState")
    public String otherState;
    @JsonProperty("OtherPostalCode")
    public String otherPostalCode;
    @JsonProperty("OtherCountry")
    public String otherCountry;
    @JsonProperty("OtherLatitude")
    public Object otherLatitude;
    @JsonProperty("OtherLongitude")
    public Object otherLongitude;
    @JsonProperty("OtherGeocodeAccuracy")
    public Object otherGeocodeAccuracy;
    @JsonProperty("OtherAddress")
    public OtherAddress otherAddress;
    @JsonProperty("MailingStreet")
    public String mailingStreet;
    @JsonProperty("MailingCity")
    public String mailingCity;
    @JsonProperty("MailingState")
    public String mailingState;
    @JsonProperty("MailingPostalCode")
    public String mailingPostalCode;
    @JsonProperty("MailingCountry")
    public String mailingCountry;
    @JsonProperty("MailingLatitude")
    public Object mailingLatitude;
    @JsonProperty("MailingLongitude")
    public Object mailingLongitude;
    @JsonProperty("MailingGeocodeAccuracy")
    public Object mailingGeocodeAccuracy;
    @JsonProperty("MailingAddress")
    public MailingAddress mailingAddress;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("Fax")
    public String fax;
    @JsonProperty("MobilePhone")
    public String mobilePhone;
    @JsonProperty("HomePhone")
    public String homePhone;
    @JsonProperty("OtherPhone")
    public String otherPhone;
    @JsonProperty("AssistantPhone")
    public String assistantPhone;
    @JsonProperty("ReportsToId")
    public String reportsToId;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Department")
    public String department;
    @JsonProperty("AssistantName")
    public String assistantName;
    @JsonProperty("LeadSource")
    public String leadSource;
    @JsonProperty("Birthdate")
    public String birthdate;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("OwnerId")
    public String ownerId;
    @JsonProperty("CreatedDate")
    public Date createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("SystemModstamp")
    public Date systemModStamp;
    @JsonProperty("LastActivityDate")
    public Object lastActivityDate;
    @JsonProperty("LastCURequestDate")
    public Object lastCuRequestDate;
    @JsonProperty("LastCUUpdateDate")
    public Object lastCuUpdateDate;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;
    @JsonProperty("EmailBouncedReason")
    public Object emailBouncedReason;
    @JsonProperty("EmailBouncedDate")
    public Object emailBouncedDate;
    @JsonProperty("IsEmailBounced")
    public Boolean isEmailBounced;
    @JsonProperty("PhotoUrl")
    public String photoUrl;
    @JsonProperty("Jigsaw")
    public Object jigsaw;
    @JsonProperty("JigsawContactId")
    public Object jigsawContactId;
    @JsonProperty("CleanStatus")
    public String cleanStatus;
    @JsonProperty("IndividualId")
    public Object individualId;
    @JsonProperty("Level__c")
    public String levelC;
    @JsonProperty("Languages__c")
    public String languagesC;

    /**
     * Gets attributes of Contact.
     *
     * @return attributes of Contact.
     */
    public Attribute getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes of Contact.
     *
     * @param attributes of Contact.
     */
    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets id of Contact.
     *
     * @return id of Contact.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id of Contact.
     *
     * @param id of Contact.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets isDeleted of Contact.
     *
     * @return isDeleted of Contact.
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets isDeleted of Contact.
     *
     * @param isDeleted of Contact.
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Gets masterRecordId of Contact.
     *
     * @return masterRecordId of Contact.
     */
    public Object getMasterRecordId() {
        return masterRecordId;
    }

    /**
     * Sets masterRecordId of Contact.
     *
     * @param masterRecordId of Contact.
     */
    public void setMasterRecordId(Object masterRecordId) {
        this.masterRecordId = masterRecordId;
    }

    /**
     * Gets accountId of Contact.
     *
     * @return accountId of Contact.
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets accountId of Contact.
     *
     * @param accountId of Contact.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets lastName of Contact.
     *
     * @return lastName of Contact.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets lastName of Contact.
     *
     * @param lastName of Contact.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets firstName of Contact.
     *
     * @return firstName of Contact.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets firstName of Contact.
     *
     * @param firstName of Contact.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets salutation of Contact.
     *
     * @return salutation of Contact.
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets salutation of Contact.
     *
     * @param salutation of Contact.
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * Gets name of Contact.
     *
     * @return name of Contact.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of Contact.
     *
     * @param name of Contact.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets otherStreet of Contact.
     *
     * @return otherStreet of Contact.
     */
    public String getOtherStreet() {
        return otherStreet;
    }

    /**
     * Sets otherStreet of Contact.
     *
     * @param otherStreet of Contact.
     */
    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    /**
     * Gets otherCity of Contact.
     *
     * @return otherCity of Contact.
     */
    public String getOtherCity() {
        return otherCity;
    }

    /**
     * Sets otherCity of Contact.
     *
     * @param otherCity of Contact.
     */
    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    /**
     * Gets otherState of Contact.
     *
     * @return otherState of Contact.
     */
    public String getOtherState() {
        return otherState;
    }

    /**
     * Sets otherState of Contact.
     *
     * @param otherState of Contact.
     */
    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    /**
     * Gets otherPostalCode of Contact.
     *
     * @return otherPostalCode of Contact.
     */
    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    /**
     * Sets otherPostalCode of Contact.
     *
     * @param otherPostalCode of Contact.
     */
    public void setOtherPostalCode(String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }

    /**
     * Gets otherCountry of Contact.
     *
     * @return otherCountry of Contact.
     */
    public String getOtherCountry() {
        return otherCountry;
    }

    /**
     * Sets otherCountry of Contact.
     *
     * @param otherCountry of Contact.
     */
    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    /**
     * Gets otherLatitude of Contact.
     *
     * @return otherLatitude of Contact.
     */
    public Object getOtherLatitude() {
        return otherLatitude;
    }

    /**
     * Sets otherLatitude of Contact.
     *
     * @param otherLatitude of Contact.
     */
    public void setOtherLatitude(Object otherLatitude) {
        this.otherLatitude = otherLatitude;
    }

    /**
     * Gets otherLongitude of Contact.
     *
     * @return otherLongitude of Contact.
     */
    public Object getOtherLongitude() {
        return otherLongitude;
    }

    /**
     * Sets otherLongitude of Contact.
     *
     * @param otherLongitude of Contact.
     */
    public void setOtherLongitude(Object otherLongitude) {
        this.otherLongitude = otherLongitude;
    }

    /**
     * Gets otherGeocodeAccuracy of Contact.
     *
     * @return otherGeocodeAccuracy of Contact.
     */
    public Object getOtherGeocodeAccuracy() {
        return otherGeocodeAccuracy;
    }

    /**
     * Sets otherGeocodeAccuracy of Contact.
     *
     * @param otherGeocodeAccuracy of Contact.
     */
    public void setOtherGeocodeAccuracy(Object otherGeocodeAccuracy) {
        this.otherGeocodeAccuracy = otherGeocodeAccuracy;
    }

    /**
     * Gets otherAddress of Contact.
     *
     * @return otherAddress of Contact.
     */
    public OtherAddress getOtherAddress() {
        return otherAddress;
    }

    /**
     * Sets otherAddress of Contact.
     *
     * @param otherAddress of Contact.
     */
    public void setOtherAddress(OtherAddress otherAddress) {
        this.otherAddress = otherAddress;
    }

    /**
     * Gets mailingStreet of Contact.
     *
     * @return mailingStreet of Contact.
     */
    public String getMailingStreet() {
        return mailingStreet;
    }

    /**
     * Sets mailingStreet of Contact.
     *
     * @param mailingStreet of Contact.
     */
    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    /**
     * Gets mailingCity of Contact.
     *
     * @return mailingCity of Contact.
     */
    public String getMailingCity() {
        return mailingCity;
    }

    /**
     * Sets mailingCity of Contact.
     *
     * @param mailingCity of Contact.
     */
    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    /**
     * Gets mailingState of Contact.
     *
     * @return mailingState of Contact.
     */
    public String getMailingState() {
        return mailingState;
    }

    /**
     * Sets mailingState of Contact.
     *
     * @param mailingState of Contact.
     */
    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    /**
     * Gets mailingPostalCode of Contact.
     *
     * @return mailingPostalCode of Contact.
     */
    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    /**
     * Sets mailingPostalCode of Contact.
     *
     * @param mailingPostalCode of Contact.
     */
    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    /**
     * Gets mailingCountry of Contact.
     *
     * @return mailingCountry of Contact.
     */
    public String getMailingCountry() {
        return mailingCountry;
    }

    /**
     * Sets mailingCountry of Contact.
     *
     * @param mailingCountry of Contact.
     */
    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    /**
     * Gets mailingLatitude of Contact.
     *
     * @return mailingLatitude of Contact.
     */
    public Object getMailingLatitude() {
        return mailingLatitude;
    }

    /**
     * Sets mailingLatitude of Contact.
     *
     * @param mailingLatitude of Contact.
     */
    public void setMailingLatitude(Object mailingLatitude) {
        this.mailingLatitude = mailingLatitude;
    }

    /**
     * Gets mailingLongitude of Contact.
     *
     * @return mailingLongitude of Contact.
     */
    public Object getMailingLongitude() {
        return mailingLongitude;
    }

    /**
     * Sets mailingLongitude of Contact.
     *
     * @param mailingLongitude of Contact.
     */
    public void setMailingLongitude(Object mailingLongitude) {
        this.mailingLongitude = mailingLongitude;
    }

    /**
     * Gets mailingGeocodeAccuracy of Contact.
     *
     * @return mailingGeocodeAccuracy of Contact.
     */
    public Object getMailingGeocodeAccuracy() {
        return mailingGeocodeAccuracy;
    }

    /**
     * Sets mailingGeocodeAccuracy of Contact.
     *
     * @param mailingGeocodeAccuracy of Contact.
     */
    public void setMailingGeocodeAccuracy(Object mailingGeocodeAccuracy) {
        this.mailingGeocodeAccuracy = mailingGeocodeAccuracy;
    }

    /**
     * Gets mailingAddress of Contact.
     *
     * @return mailingAddress of Contact.
     */
    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets mailingAddress of Contact.
     *
     * @param mailingAddress of Contact.
     */
    public void setMailingAddress(MailingAddress mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    /**
     * Gets phone of Contact.
     *
     * @return phone of Contact.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone of Contact.
     *
     * @param phone of Contact.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets fax of Contact.
     *
     * @return fax of Contact.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets fax of Contact.
     *
     * @param fax of Contact.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets mobilePhone of Contact.
     *
     * @return mobilePhone of Contact.
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets mobilePhone of Contact.
     *
     * @param mobilePhone of Contact.
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * Gets homePhone of Contact.
     *
     * @return homePhone of Contact.
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets homePhone of Contact.
     *
     * @param homePhone of Contact.
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Gets otherPhone of Contact.
     *
     * @return otherPhone of Contact.
     */
    public String getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets otherPhone of Contact.
     *
     * @param otherPhone of Contact.
     */
    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    /**
     * Gets assistantPhone of Contact.
     *
     * @return assistantPhone of Contact.
     */
    public String getAssistantPhone() {
        return assistantPhone;
    }

    /**
     * Sets assistantPhone of Contact.
     *
     * @param assistantPhone of Contact.
     */
    public void setAssistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }

    /**
     * Gets reportsToId of Contact.
     *
     * @return reportsToId of Contact.
     */
    public String getReportsToId() {
        return reportsToId;
    }

    /**
     * Sets reportsToId of Contact.
     *
     * @param reportsToId of Contact.
     */
    public void setReportsToId(String reportsToId) {
        this.reportsToId = reportsToId;
    }

    /**
     * Gets email of Contact.
     *
     * @return email of Contact.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email of Contact.
     *
     * @param email of Contact.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets title of Contact.
     *
     * @return title of Contact.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of Contact.
     *
     * @param title of Contact.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets department of Contact.
     *
     * @return department of Contact.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets department of Contact.
     *
     * @param department of Contact.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets assistantName of Contact.
     *
     * @return assistantName of Contact.
     */
    public String getAssistantName() {
        return assistantName;
    }

    /**
     * Sets assistantName of Contact.
     *
     * @param assistantName of Contact.
     */
    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    /**
     * Gets leadSource of Contact.
     *
     * @return leadSource of Contact.
     */
    public String getLeadSource() {
        return leadSource;
    }

    /**
     * Sets leadSource of Contact.
     *
     * @param leadSource of Contact.
     */
    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    /**
     * Gets birthdate of Contact.
     *
     * @return birthdate of Contact.
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets birthdate of Contact.
     *
     * @param birthdate of Contact.
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets description of Contact.
     *
     * @return description of Contact.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of Contact.
     *
     * @param description of Contact.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets ownerId of Contact.
     *
     * @return ownerId of Contact.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets ownerId of Contact.
     *
     * @param ownerId of Contact.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets createdDate of Contact.
     *
     * @return createdDate of Contact.
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate of Contact.
     *
     * @param createdDate of Contact.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets createdById of Contact.
     *
     * @return createdById of Contact.
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets createdById of Contact.
     *
     * @param createdById of Contact.
     */
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    /**
     * Gets lastModifiedDate of Contact.
     *
     * @return lastModifiedDate of Contact.
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate of Contact.
     *
     * @param lastModifiedDate of Contact.
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets lastModifiedById of Contact.
     *
     * @return lastModifiedById of Contact.
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets lastModifiedById of Contact.
     *
     * @param lastModifiedById of Contact.
     */
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    /**
     * Gets systemModStamp of Contact.
     *
     * @return systemModStamp of Contact.
     */
    public Date getSystemModStamp() {
        return systemModStamp;
    }

    /**
     * Sets systemModStamp of Contact.
     *
     * @param systemModStamp of Contact.
     */
    public void setSystemModStamp(Date systemModStamp) {
        this.systemModStamp = systemModStamp;
    }

    /**
     * Gets lastActivityDate of Contact.
     *
     * @return lastActivityDate of Contact.
     */
    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets lastActivityDate of Contact.
     *
     * @param lastActivityDate of Contact.
     */
    public void setLastActivityDate(Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * Gets lastCuRequestDate of Contact.
     *
     * @return lastCuRequestDate of Contact.
     */
    public Object getLastCuRequestDate() {
        return lastCuRequestDate;
    }

    /**
     * Sets lastCuRequestDate of Contact.
     *
     * @param lastCuRequestDate of Contact.
     */
    public void setLastCuRequestDate(Object lastCuRequestDate) {
        this.lastCuRequestDate = lastCuRequestDate;
    }

    /**
     * Gets lastCuUpdateDate of Contact.
     *
     * @return lastCuUpdateDate of Contact.
     */
    public Object getLastCuUpdateDate() {
        return lastCuUpdateDate;
    }

    /**
     * Sets lastCuUpdateDate of Contact.
     *
     * @param lastCuUpdateDate of Contact.
     */
    public void setLastCuUpdateDate(Object lastCuUpdateDate) {
        this.lastCuUpdateDate = lastCuUpdateDate;
    }

    /**
     * Gets lastViewedDate of Contact.
     *
     * @return lastViewedDate of Contact.
     */
    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets lastViewedDate of Contact.
     *
     * @param lastViewedDate of Contact.
     */
    public void setLastViewedDate(Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets lastReferencedDate of Contact.
     *
     * @return lastReferencedDate of Contact.
     */
    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets lastReferencedDate of Contact.
     *
     * @param lastReferencedDate of Contact.
     */
    public void setLastReferencedDate(Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    /**
     * Gets emailBouncedReason of Contact.
     *
     * @return emailBouncedReason of Contact.
     */
    public Object getEmailBouncedReason() {
        return emailBouncedReason;
    }

    /**
     * Sets emailBouncedReason of Contact.
     *
     * @param emailBouncedReason of Contact.
     */
    public void setEmailBouncedReason(Object emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }

    /**
     * Gets emailBouncedDate of Contact.
     *
     * @return emailBouncedDate of Contact.
     */
    public Object getEmailBouncedDate() {
        return emailBouncedDate;
    }

    /**
     * Sets emailBouncedDate of Contact.
     *
     * @param emailBouncedDate of Contact.
     */
    public void setEmailBouncedDate(Object emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }

    /**
     * Gets isEmailBounced of Contact.
     *
     * @return isEmailBounced of Contact.
     */
    public Boolean getIsEmailBounced() {
        return isEmailBounced;
    }

    /**
     * Sets isEmailBounced of Contact.
     *
     * @param isEmailBounced of Contact.
     */
    public void setIsEmailBounced(Boolean isEmailBounced) {
        this.isEmailBounced = isEmailBounced;
    }

    /**
     * Gets photoUrl of Contact.
     *
     * @return photoUrl of Contact.
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets photoUrl of Contact.
     *
     * @param photoUrl of Contact.
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * Gets jigsaw of Contact.
     *
     * @return jigsaw of Contact.
     */
    public Object getJigsaw() {
        return jigsaw;
    }

    /**
     * Sets jigsaw of Contact.
     *
     * @param jigsaw of Contact.
     */
    public void setJigsaw(Object jigsaw) {
        this.jigsaw = jigsaw;
    }

    /**
     * Gets jigsawContactId of Contact.
     *
     * @return jigsawContactId of Contact.
     */
    public Object getJigsawContactId() {
        return jigsawContactId;
    }

    /**
     * Sets jigsawContactId of Contact.
     *
     * @param jigsawContactId of Contact.
     */
    public void setJigsawContactId(Object jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }

    /**
     * Gets cleanStatus of Contact.
     *
     * @return cleanStatus of Contact.
     */
    public String getCleanStatus() {
        return cleanStatus;
    }

    /**
     * Sets cleanStatus of Contact.
     *
     * @param cleanStatus of Contact.
     */
    public void setCleanStatus(String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    /**
     * Gets individualId of Contact.
     *
     * @return individualId of Contact.
     */
    public Object getIndividualId() {
        return individualId;
    }

    /**
     * Sets individualId of Contact.
     *
     * @param individualId of Contact.
     */
    public void setIndividualId(Object individualId) {
        this.individualId = individualId;
    }

    /**
     * Gets levelC of Contact.
     *
     * @return levelC of Contact.
     */
    public String getLevelC() {
        return levelC;
    }

    /**
     * Sets levelC of Contact.
     *
     * @param levelC of Contact.
     */
    public void setLevelC(String levelC) {
        this.levelC = levelC;
    }

    /**
     * Gets languagesC of Contact.
     *
     * @return languagesC of Contact.
     */
    public String getLanguagesC() {
        return languagesC;
    }

    /**
     * Sets languagesC of Contact.
     *
     * @param languagesC of Contact.
     */
    public void setLanguagesC(String languagesC) {
        this.languagesC = languagesC;
    }
}
