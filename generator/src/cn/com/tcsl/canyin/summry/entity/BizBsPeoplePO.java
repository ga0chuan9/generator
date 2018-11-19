package cn.com.tcsl.canyin.summry.entity;

import java.util.Date;

public class BizBsPeoplePO {
    private Long id;

    private Long bsId;

    private Long eaterTypeId;

    private Integer eaterQty;

    private Short delflg;

    private Integer createShopId;

    private Date createTime;

    private Date modifyTime;

    private Long creatorId;

    private Short uploadFlg;

    private Short downloadFlg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBsId() {
        return bsId;
    }

    public void setBsId(Long bsId) {
        this.bsId = bsId;
    }

    public Long getEaterTypeId() {
        return eaterTypeId;
    }

    public void setEaterTypeId(Long eaterTypeId) {
        this.eaterTypeId = eaterTypeId;
    }

    public Integer getEaterQty() {
        return eaterQty;
    }

    public void setEaterQty(Integer eaterQty) {
        this.eaterQty = eaterQty;
    }

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
    }

    public Integer getCreateShopId() {
        return createShopId;
    }

    public void setCreateShopId(Integer createShopId) {
        this.createShopId = createShopId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Short getUploadFlg() {
        return uploadFlg;
    }

    public void setUploadFlg(Short uploadFlg) {
        this.uploadFlg = uploadFlg;
    }

    public Short getDownloadFlg() {
        return downloadFlg;
    }

    public void setDownloadFlg(Short downloadFlg) {
        this.downloadFlg = downloadFlg;
    }
}