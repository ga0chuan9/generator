package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class bizTsPaywayPO {
    private Long id;

    private Long paywayId;

    private Long tsId;

    private Long bsId;

    private Integer sortOrder;

    private BigDecimal takeMoney;

    private BigDecimal payMoney;

    private BigDecimal giveChange;

    private Boolean isDeposit;

    private BigDecimal incomeMoney;

    private BigDecimal notIncomeMoney;

    private String remark;

    private Integer createShopId;

    private Date modifyTime;

    private Short uploadFlg;

    private Short downloadFlg;

    private Short settleState;

    private BigDecimal belongPaywayMoney;

    private Boolean isHidden;

    private Long belongPaywayId;

    private Short delflg;

    private Date createTime;

    private Long creatorId;

    private Long modifierId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaywayId() {
        return paywayId;
    }

    public void setPaywayId(Long paywayId) {
        this.paywayId = paywayId;
    }

    public Long getTsId() {
        return tsId;
    }

    public void setTsId(Long tsId) {
        this.tsId = tsId;
    }

    public Long getBsId() {
        return bsId;
    }

    public void setBsId(Long bsId) {
        this.bsId = bsId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public BigDecimal getTakeMoney() {
        return takeMoney;
    }

    public void setTakeMoney(BigDecimal takeMoney) {
        this.takeMoney = takeMoney;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getGiveChange() {
        return giveChange;
    }

    public void setGiveChange(BigDecimal giveChange) {
        this.giveChange = giveChange;
    }

    public Boolean getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Boolean isDeposit) {
        this.isDeposit = isDeposit;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public BigDecimal getNotIncomeMoney() {
        return notIncomeMoney;
    }

    public void setNotIncomeMoney(BigDecimal notIncomeMoney) {
        this.notIncomeMoney = notIncomeMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreateShopId() {
        return createShopId;
    }

    public void setCreateShopId(Integer createShopId) {
        this.createShopId = createShopId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

    public Short getSettleState() {
        return settleState;
    }

    public void setSettleState(Short settleState) {
        this.settleState = settleState;
    }

    public BigDecimal getBelongPaywayMoney() {
        return belongPaywayMoney;
    }

    public void setBelongPaywayMoney(BigDecimal belongPaywayMoney) {
        this.belongPaywayMoney = belongPaywayMoney;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Long getBelongPaywayId() {
        return belongPaywayId;
    }

    public void setBelongPaywayId(Long belongPaywayId) {
        this.belongPaywayId = belongPaywayId;
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

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }
}