package com.dongda.entity;

import java.util.Date;

public class Tag extends TagKey {
    private Date createtime;

    private Integer watchnum;

    private Integer likenum;

    private String tagBg;

    private String tagTitle;

    private String tagImage;

    private Integer anno;

    private String tagContent;

    public Tag(Integer msbdId, String userId, Date createtime, Integer watchnum, Integer likenum, String tagBg, String tagTitle, String tagImage, Integer anno, String tagContent) {
        super(msbdId, userId);
        this.createtime = createtime;
        this.watchnum = watchnum;
        this.likenum = likenum;
        this.tagBg = tagBg;
        this.tagTitle = tagTitle;
        this.tagImage = tagImage;
        this.anno = anno;
        this.tagContent = tagContent;
    }

    public Tag() {
        super();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getWatchnum() {
        return watchnum;
    }

    public void setWatchnum(Integer watchnum) {
        this.watchnum = watchnum;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public String getTagBg() {
        return tagBg;
    }

    public void setTagBg(String tagBg) {
        this.tagBg = tagBg == null ? null : tagBg.trim();
    }

    public String getTagTitle() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle == null ? null : tagTitle.trim();
    }

    public String getTagImage() {
        return tagImage;
    }

    public void setTagImage(String tagImage) {
        this.tagImage = tagImage == null ? null : tagImage.trim();
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent == null ? null : tagContent.trim();
    }
}