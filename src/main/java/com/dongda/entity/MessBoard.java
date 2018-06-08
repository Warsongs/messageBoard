package com.dongda.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MessBoard {
    private Integer msbdId;

    private String msbdName;

    private String msbdIntro;

    private Date createtime;

    private Integer msbdBgIndex;

    private String msbdBg;

    private Integer msbdType;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public MessBoard(Integer msbdId, String msbdName, String msbdIntro, Date createtime, Integer msbdBgIndex, String msbdBg, Integer msbdType, BigDecimal longitude, BigDecimal latitude) {
        this.msbdId = msbdId;
        this.msbdName = msbdName;
        this.msbdIntro = msbdIntro;
        this.createtime = createtime;
        this.msbdBgIndex = msbdBgIndex;
        this.msbdBg = msbdBg;
        this.msbdType = msbdType;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public MessBoard() {
        super();
    }

    public Integer getMsbdId() {
        return msbdId;
    }

    public void setMsbdId(Integer msbdId) {
        this.msbdId = msbdId;
    }

    public String getMsbdName() {
        return msbdName;
    }

    public void setMsbdName(String msbdName) {
        this.msbdName = msbdName == null ? null : msbdName.trim();
    }

    public String getMsbdIntro() {
        return msbdIntro;
    }

    public void setMsbdIntro(String msbdIntro) {
        this.msbdIntro = msbdIntro == null ? null : msbdIntro.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getMsbdBgIndex() {
        return msbdBgIndex;
    }

    public void setMsbdBgIndex(Integer msbdBgIndex) {
        this.msbdBgIndex = msbdBgIndex;
    }

    public String getMsbdBg() {
        return msbdBg;
    }

    public void setMsbdBg(String msbdBg) {
        this.msbdBg = msbdBg == null ? null : msbdBg.trim();
    }

    public Integer getMsbdType() {
        return msbdType;
    }

    public void setMsbdType(Integer msbdType) {
        this.msbdType = msbdType;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}