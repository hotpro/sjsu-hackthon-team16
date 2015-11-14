package edu.sjsu.hackthon.sjsuteam16.model;

/**
 * Created by yunlongxu on 11/13/15.
 */

import java.util.HashMap;
import java.util.Map;


public class Promotion {

    private String SOURCE;
    private Integer ID;
    private String EFFECTIVE_START_TS;
    private String EFFECTIVE_END_TS;
    private Integer BENEFIT_TYPE;
    private Integer BENEFIT_VALUE;
    private String BENEFIT_TEXT;
    private Integer ORIGINAL_PRICE;
    private Object COUPON_CODE;
    private Object MIN_MEMBERSHIP_LVL;
    private String INCLUDED_STORES;
    private Integer SKU;
    private String TITLE;
    private String DISCLAIMERS;
    private String PUBLISH_START_TS;
    private String PUBLISH_END_TS;
    private String CATEGORIES_TO_DISPLAY;
    private Integer APPLICABLE_BEACONS;
    private String CAPTION;
    private String DESCRIPTION;
    private String SMALL_IMAGE_URI;
    private String LARGE_IMAGE_URI;
    private String HERO_IMAGE_URI;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The SOURCE
     */
    public String getSOURCE() {
        return SOURCE;
    }

    /**
     *
     * @param SOURCE
     * The SOURCE
     */
    public void setSOURCE(String SOURCE) {
        this.SOURCE = SOURCE;
    }

    /**
     *
     * @return
     * The ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     *
     * @param ID
     * The ID
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     * The EFFECTIVE_START_TS
     */
    public String getEFFECTIVE_START_TS() {
        return EFFECTIVE_START_TS;
    }

    /**
     *
     * @param EFFECTIVE_START_TS
     * The EFFECTIVE_START_TS
     */
    public void setEFFECTIVE_START_TS(String EFFECTIVE_START_TS) {
        this.EFFECTIVE_START_TS = EFFECTIVE_START_TS;
    }

    /**
     *
     * @return
     * The EFFECTIVE_END_TS
     */
    public String getEFFECTIVE_END_TS() {
        return EFFECTIVE_END_TS;
    }

    /**
     *
     * @param EFFECTIVE_END_TS
     * The EFFECTIVE_END_TS
     */
    public void setEFFECTIVE_END_TS(String EFFECTIVE_END_TS) {
        this.EFFECTIVE_END_TS = EFFECTIVE_END_TS;
    }

    /**
     *
     * @return
     * The BENEFIT_TYPE
     */
    public Integer getBENEFIT_TYPE() {
        return BENEFIT_TYPE;
    }

    /**
     *
     * @param BENEFIT_TYPE
     * The BENEFIT_TYPE
     */
    public void setBENEFIT_TYPE(Integer BENEFIT_TYPE) {
        this.BENEFIT_TYPE = BENEFIT_TYPE;
    }

    /**
     *
     * @return
     * The BENEFIT_VALUE
     */
    public Integer getBENEFIT_VALUE() {
        return BENEFIT_VALUE;
    }

    /**
     *
     * @param BENEFIT_VALUE
     * The BENEFIT_VALUE
     */
    public void setBENEFIT_VALUE(Integer BENEFIT_VALUE) {
        this.BENEFIT_VALUE = BENEFIT_VALUE;
    }

    /**
     *
     * @return
     * The BENEFIT_TEXT
     */
    public String getBENEFIT_TEXT() {
        return BENEFIT_TEXT;
    }

    /**
     *
     * @param BENEFIT_TEXT
     * The BENEFIT_TEXT
     */
    public void setBENEFIT_TEXT(String BENEFIT_TEXT) {
        this.BENEFIT_TEXT = BENEFIT_TEXT;
    }

    /**
     *
     * @return
     * The ORIGINAL_PRICE
     */
    public Integer getORIGINAL_PRICE() {
        return ORIGINAL_PRICE;
    }

    /**
     *
     * @param ORIGINAL_PRICE
     * The ORIGINAL_PRICE
     */
    public void setORIGINAL_PRICE(Integer ORIGINAL_PRICE) {
        this.ORIGINAL_PRICE = ORIGINAL_PRICE;
    }

    /**
     *
     * @return
     * The COUPON_CODE
     */
    public Object getCOUPON_CODE() {
        return COUPON_CODE;
    }

    /**
     *
     * @param COUPON_CODE
     * The COUPON_CODE
     */
    public void setCOUPON_CODE(Object COUPON_CODE) {
        this.COUPON_CODE = COUPON_CODE;
    }

    /**
     *
     * @return
     * The MIN_MEMBERSHIP_LVL
     */
    public Object getMIN_MEMBERSHIP_LVL() {
        return MIN_MEMBERSHIP_LVL;
    }

    /**
     *
     * @param MIN_MEMBERSHIP_LVL
     * The MIN_MEMBERSHIP_LVL
     */
    public void setMIN_MEMBERSHIP_LVL(Object MIN_MEMBERSHIP_LVL) {
        this.MIN_MEMBERSHIP_LVL = MIN_MEMBERSHIP_LVL;
    }

    /**
     *
     * @return
     * The INCLUDED_STORES
     */
    public String getINCLUDED_STORES() {
        return INCLUDED_STORES;
    }

    /**
     *
     * @param INCLUDED_STORES
     * The INCLUDED_STORES
     */
    public void setINCLUDED_STORES(String INCLUDED_STORES) {
        this.INCLUDED_STORES = INCLUDED_STORES;
    }

    /**
     *
     * @return
     * The SKU
     */
    public Integer getSKU() {
        return SKU;
    }

    /**
     *
     * @param SKU
     * The SKU
     */
    public void setSKU(Integer SKU) {
        this.SKU = SKU;
    }

    /**
     *
     * @return
     * The TITLE
     */
    public String getTITLE() {
        return TITLE;
    }

    /**
     *
     * @param TITLE
     * The TITLE
     */
    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    /**
     *
     * @return
     * The DISCLAIMERS
     */
    public String getDISCLAIMERS() {
        return DISCLAIMERS;
    }

    /**
     *
     * @param DISCLAIMERS
     * The DISCLAIMERS
     */
    public void setDISCLAIMERS(String DISCLAIMERS) {
        this.DISCLAIMERS = DISCLAIMERS;
    }

    /**
     *
     * @return
     * The PUBLISH_START_TS
     */
    public String getPUBLISH_START_TS() {
        return PUBLISH_START_TS;
    }

    /**
     *
     * @param PUBLISH_START_TS
     * The PUBLISH_START_TS
     */
    public void setPUBLISH_START_TS(String PUBLISH_START_TS) {
        this.PUBLISH_START_TS = PUBLISH_START_TS;
    }

    /**
     *
     * @return
     * The PUBLISH_END_TS
     */
    public String getPUBLISH_END_TS() {
        return PUBLISH_END_TS;
    }

    /**
     *
     * @param PUBLISH_END_TS
     * The PUBLISH_END_TS
     */
    public void setPUBLISH_END_TS(String PUBLISH_END_TS) {
        this.PUBLISH_END_TS = PUBLISH_END_TS;
    }

    /**
     *
     * @return
     * The CATEGORIES_TO_DISPLAY
     */
    public String getCATEGORIES_TO_DISPLAY() {
        return CATEGORIES_TO_DISPLAY;
    }

    /**
     *
     * @param CATEGORIES_TO_DISPLAY
     * The CATEGORIES_TO_DISPLAY
     */
    public void setCATEGORIES_TO_DISPLAY(String CATEGORIES_TO_DISPLAY) {
        this.CATEGORIES_TO_DISPLAY = CATEGORIES_TO_DISPLAY;
    }

    /**
     *
     * @return
     * The APPLICABLE_BEACONS
     */
    public Integer getAPPLICABLE_BEACONS() {
        return APPLICABLE_BEACONS;
    }

    /**
     *
     * @param APPLICABLE_BEACONS
     * The APPLICABLE_BEACONS
     */
    public void setAPPLICABLE_BEACONS(Integer APPLICABLE_BEACONS) {
        this.APPLICABLE_BEACONS = APPLICABLE_BEACONS;
    }

    /**
     *
     * @return
     * The CAPTION
     */
    public String getCAPTION() {
        return CAPTION;
    }

    /**
     *
     * @param CAPTION
     * The CAPTION
     */
    public void setCAPTION(String CAPTION) {
        this.CAPTION = CAPTION;
    }

    /**
     *
     * @return
     * The DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     *
     * @param DESCRIPTION
     * The DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     *
     * @return
     * The SMALL_IMAGE_URI
     */
    public String getSMALL_IMAGE_URI() {
        return SMALL_IMAGE_URI;
    }

    /**
     *
     * @param SMALL_IMAGE_URI
     * The SMALL_IMAGE_URI
     */
    public void setSMALL_IMAGE_URI(String SMALL_IMAGE_URI) {
        this.SMALL_IMAGE_URI = SMALL_IMAGE_URI;
    }

    /**
     *
     * @return
     * The LARGE_IMAGE_URI
     */
    public String getLARGE_IMAGE_URI() {
        return LARGE_IMAGE_URI;
    }

    /**
     *
     * @param LARGE_IMAGE_URI
     * The LARGE_IMAGE_URI
     */
    public void setLARGE_IMAGE_URI(String LARGE_IMAGE_URI) {
        this.LARGE_IMAGE_URI = LARGE_IMAGE_URI;
    }

    /**
     *
     * @return
     * The HERO_IMAGE_URI
     */
    public String getHERO_IMAGE_URI() {
        return HERO_IMAGE_URI;
    }

    /**
     *
     * @param HERO_IMAGE_URI
     * The HERO_IMAGE_URI
     */
    public void setHERO_IMAGE_URI(String HERO_IMAGE_URI) {
        this.HERO_IMAGE_URI = HERO_IMAGE_URI;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
