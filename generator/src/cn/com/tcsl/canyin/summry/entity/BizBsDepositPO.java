package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizBsDepositPO {
    private Long id;

    private Long bsId;

    private Short type;

    private Long paywayId;

    private BigDecimal deposit;

    private String remark;

    private Short origin;

    private Long relationId;

    private Integer subSystemId;

    private Long createPosId;

    private Integer createShopId;

    private Date createTime;

    private Long creatorId;

    private Short uploadFlg;

    private Short downloadFlg;

    private Short delflg;

    private Date modifyTime;

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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getPaywayId() {
        return paywayId;
    }

    public void setPaywayId(Long paywayId) {
        this.paywayId = paywayId;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getOrigin() {
        return origin;
    }

    public void setOrigin(Short origin) {
        this.origin = origin;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Integer getSubSystemId() {
        return subSystemId;
    }

    public void setSubSystemId(Integer subSystemId) {
        this.subSystemId = subSystemId;
    }

    public Long getCreatePosId() {
        return createPosId;
    }

    public void setCreatePosId(Long createPosId) {
        this.createPosId = createPosId;
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

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
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
}