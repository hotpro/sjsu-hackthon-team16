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
    private Integer BENEFITVALUE;
    private String BENEFITTEXT;
    private Integer ORIGINALPRICE;
    private Object COUPONCODE;
    private Object MINMEMBERSHIPLVL;
    private String INCLUDEDSTORES;
    private Integer SKU;
    private String TITLE;
    private String DISCLAIMERS;
    private String PUBLISHSTARTTS;
    private String PUBLISHENDTS;
    private String CATEGORIESTODISPLAY;
    private Integer APPLICABLEBEACONS;
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
     * The BENEFITVALUE
     */
    public Integer getBENEFITVALUE() {
        return BENEFITVALUE;
    }

    /**
     *
     * @param BENEFITVALUE
     * The BENEFIT_VALUE
     */
    public void setBENEFITVALUE(Integer BENEFITVALUE) {
        this.BENEFITVALUE = BENEFITVALUE;
    }

    /**
     *
     * @return
     * The BENEFITTEXT
     */
    public String getBENEFITTEXT() {
        return BENEFITTEXT;
    }

    /**
     *
     * @param BENEFITTEXT
     * The BENEFIT_TEXT
     */
    public void setBENEFITTEXT(String BENEFITTEXT) {
        this.BENEFITTEXT = BENEFITTEXT;
    }

    /**
     *
     * @return
     * The ORIGINALPRICE
     */
    public Integer getORIGINALPRICE() {
        return ORIGINALPRICE;
    }

    /**
     *
     * @param ORIGINALPRICE
     * The ORIGINAL_PRICE
     */
    public void setORIGINALPRICE(Integer ORIGINALPRICE) {
        this.ORIGINALPRICE = ORIGINALPRICE;
    }

    /**
     *
     * @return
     * The COUPONCODE
     */
    public Object getCOUPONCODE() {
        return COUPONCODE;
    }

    /**
     *
     * @param COUPONCODE
     * The COUPON_CODE
     */
    public void setCOUPONCODE(Object COUPONCODE) {
        this.COUPONCODE = COUPONCODE;
    }

    /**
     *
     * @return
     * The MINMEMBERSHIPLVL
     */
    public Object getMINMEMBERSHIPLVL() {
        return MINMEMBERSHIPLVL;
    }

    /**
     *
     * @param MINMEMBERSHIPLVL
     * The MIN_MEMBERSHIP_LVL
     */
    public void setMINMEMBERSHIPLVL(Object MINMEMBERSHIPLVL) {
        this.MINMEMBERSHIPLVL = MINMEMBERSHIPLVL;
    }

    /**
     *
     * @return
     * The INCLUDEDSTORES
     */
    public String getINCLUDEDSTORES() {
        return INCLUDEDSTORES;
    }

    /**
     *
     * @param INCLUDEDSTORES
     * The INCLUDED_STORES
     */
    public void setINCLUDEDSTORES(String INCLUDEDSTORES) {
        this.INCLUDEDSTORES = INCLUDEDSTORES;
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
     * The PUBLISHSTARTTS
     */
    public String getPUBLISHSTARTTS() {
        return PUBLISHSTARTTS;
    }

    /**
     *
     * @param PUBLISHSTARTTS
     * The PUBLISH_START_TS
     */
    public void setPUBLISHSTARTTS(String PUBLISHSTARTTS) {
        this.PUBLISHSTARTTS = PUBLISHSTARTTS;
    }

    /**
     *
     * @return
     * The PUBLISHENDTS
     */
    public String getPUBLISHENDTS() {
        return PUBLISHENDTS;
    }

    /**
     *
     * @param PUBLISHENDTS
     * The PUBLISH_END_TS
     */
    public void setPUBLISHENDTS(String PUBLISHENDTS) {
        this.PUBLISHENDTS = PUBLISHENDTS;
    }

    /**
     *
     * @return
     * The CATEGORIESTODISPLAY
     */
    public String getCATEGORIESTODISPLAY() {
        return CATEGORIESTODISPLAY;
    }

    /**
     *
     * @param CATEGORIESTODISPLAY
     * The CATEGORIES_TO_DISPLAY
     */
    public void setCATEGORIESTODISPLAY(String CATEGORIESTODISPLAY) {
        this.CATEGORIESTODISPLAY = CATEGORIESTODISPLAY;
    }

    /**
     *
     * @return
     * The APPLICABLEBEACONS
     */
    public Integer getAPPLICABLEBEACONS() {
        return APPLICABLEBEACONS;
    }

    /**
     *
     * @param APPLICABLEBEACONS
     * The APPLICABLE_BEACONS
     */
    public void setAPPLICABLEBEACONS(Integer APPLICABLEBEACONS) {
        this.APPLICABLEBEACONS = APPLICABLEBEACONS;
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
