package cn.com.tcsl.canyin.summry.entity;

import java.util.Date;

public class BizScHastenPO {
    private Long scId;

    private Long bsId;

    private Long itemId;

    private Long fromAddTime;

    private Integer times;

    private Date modifyTime;

    private Long modifierId;

    private Date createTime;

    private Integer createShopId;

    private Short uploadFlg;

    private Short downloadFlg;

    private Long itemSizeId;

    private Short delflg;

    private Long creatorId;

    public Long getScId() {
        return scId;
    }

    public void setScId(Long scId) {
        this.scId = scId;
    }

    public Long getBsId() {
        return bsId;
    }

    public void setBsId(Long bsId) {
        this.bsId = bsId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getFromAddTime() {
        return fromAddTime;
    }

    public void setFromAddTime(Long fromAddTime) {
        this.fromAddTime = fromAddTime;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateShopId() {
        return createShopId;
    }

    public void setCreateShopId(Integer createShopId) {
        this.createShopId = createShopId;
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

    public Long getItemSizeId() {
        return itemSizeId;
    }

    public void setItemSizeId(Long itemSizeId) {
        this.itemSizeId = itemSizeId;
    }

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}