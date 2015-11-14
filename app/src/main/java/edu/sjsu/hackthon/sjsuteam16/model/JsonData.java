package edu.sjsu.hackthon.sjsuteam16.model;

/**
 * Created by yunlongxu on 11/13/15.
 */

import java.util.HashMap;
import java.util.Map;


public class JsonData {

    private String SOURCE;
    private Integer ID;
    private String EFFECTIVESTARTTS;
    private String EFFECTIVEENDTS;
    private Integer BENEFITTYPE;
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
    private String SMALLIMAGEURI;
    private String LARGEIMAGEURI;
    private String HEROIMAGEURI;
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
     * The EFFECTIVESTARTTS
     */
    public String getEFFECTIVESTARTTS() {
        return EFFECTIVESTARTTS;
    }

    /**
     *
     * @param EFFECTIVESTARTTS
     * The EFFECTIVE_START_TS
     */
    public void setEFFECTIVESTARTTS(String EFFECTIVESTARTTS) {
        this.EFFECTIVESTARTTS = EFFECTIVESTARTTS;
    }

    /**
     *
     * @return
     * The EFFECTIVEENDTS
     */
    public String getEFFECTIVEENDTS() {
        return EFFECTIVEENDTS;
    }

    /**
     *
     * @param EFFECTIVEENDTS
     * The EFFECTIVE_END_TS
     */
    public void setEFFECTIVEENDTS(String EFFECTIVEENDTS) {
        this.EFFECTIVEENDTS = EFFECTIVEENDTS;
    }

    /**
     *
     * @return
     * The BENEFITTYPE
     */
    public Integer getBENEFITTYPE() {
        return BENEFITTYPE;
    }

    /**
     *
     * @param BENEFITTYPE
     * The BENEFIT_TYPE
     */
    public void setBENEFITTYPE(Integer BENEFITTYPE) {
        this.BENEFITTYPE = BENEFITTYPE;
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
     * The SMALLIMAGEURI
     */
    public String getSMALLIMAGEURI() {
        return SMALLIMAGEURI;
    }

    /**
     *
     * @param SMALLIMAGEURI
     * The SMALL_IMAGE_URI
     */
    public void setSMALLIMAGEURI(String SMALLIMAGEURI) {
        this.SMALLIMAGEURI = SMALLIMAGEURI;
    }

    /**
     *
     * @return
     * The LARGEIMAGEURI
     */
    public String getLARGEIMAGEURI() {
        return LARGEIMAGEURI;
    }

    /**
     *
     * @param LARGEIMAGEURI
     * The LARGE_IMAGE_URI
     */
    public void setLARGEIMAGEURI(String LARGEIMAGEURI) {
        this.LARGEIMAGEURI = LARGEIMAGEURI;
    }

    /**
     *
     * @return
     * The HEROIMAGEURI
     */
    public String getHEROIMAGEURI() {
        return HEROIMAGEURI;
    }

    /**
     *
     * @param HEROIMAGEURI
     * The HERO_IMAGE_URI
     */
    public void setHEROIMAGEURI(String HEROIMAGEURI) {
        this.HEROIMAGEURI = HEROIMAGEURI;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
