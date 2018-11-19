package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizCoScPO {
    private Long id;

    private Long bsId;

    private Long coId;

    private Long scId;

    private Integer createShopId;

    private Short delflg;

    private Date createTime;

    private Long creatorId;

    private Date modifyTime;

    private Long modifierId;

    private Short uploadFlg;

    private Short downloadFlg;

    private BigDecimal qty;

    private BigDecimal subtotal;

    private Date serveFinishTime;

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

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public Long getScId() {
        return scId;
    }

    public void setScId(Long scId) {
        this.scId = scId;
    }

    public Integer getCreateShopId() {
        return createShopId;
    }

    public void setCreateShopId(Integer createShopId) {
        this.createShopId = createShopId;
    }

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
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

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Date getServeFinishTime() {
        return serveFinishTime;
    }

    public void setServeFinishTime(Date serveFinishTime) {
        this.serveFinishTime = serveFinishTime;
    }
}