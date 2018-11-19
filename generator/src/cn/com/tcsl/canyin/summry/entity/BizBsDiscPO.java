package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizBsDiscPO {
    private Long id;

    private Long bsId;

    private Short discType;

    private BigDecimal discScale;

    private BigDecimal discMoney;

    private Long dpId;

    private Long authEmpId;

    private Date modifyTime;

    private Integer createShopId;

    private Short uploadFlg;

    private Short downloadFlg;

    private Short delflg;

    private Long foId;

    private String orderId;

    private Date createTime;

    private Long creatorId;

    private Long modifierId;

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

    public Short getDiscType() {
        return discType;
    }

    public void setDiscType(Short discType) {
        this.discType = discType;
    }

    public BigDecimal getDiscScale() {
        return discScale;
    }

    public void setDiscScale(BigDecimal discScale) {
        this.discScale = discScale;
    }

    public BigDecimal getDiscMoney() {
        return discMoney;
    }

    public void setDiscMoney(BigDecimal discMoney) {
        this.discMoney = discMoney;
    }

    public Long getDpId() {
        return dpId;
    }

    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }

    public Long getAuthEmpId() {
        return authEmpId;
    }

    public void setAuthEmpId(Long authEmpId) {
        this.authEmpId = authEmpId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
    }

    public Long getFoId() {
        return foId;
    }

    public void setFoId(Long foId) {
        this.foId = foId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }
}