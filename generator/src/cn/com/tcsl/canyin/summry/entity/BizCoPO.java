package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizCoPO {
    private Long id;

    private Long bsId;

    private Long ssId;

    private Integer sortOrder;

    private Long itemId;

    private String tempItemName;

    private Long unitId;

    private BigDecimal origPrice;

    private BigDecimal lastPrice;

    private BigDecimal makeFee;

    private BigDecimal qty;

    private BigDecimal subtotal;

    private Boolean isChangePrice;

    private Short discFlg;

    private Short itemType;

    private Short pkgFlg;

    private Short pkgType;

    private Long pkgScId;

    private BigDecimal pkgRaisePrice;

    private Boolean pkgIsRaiseByQty;

    private Long rzCancelId;

    private Long serveWayId;

    private String methodText;

    private Integer createShopId;

    private Date createTime;

    private Short uploadFlg;

    private Short downloadFlg;

    private Long creatorId;

    private Long itemSizeId;

    private Short delflg;

    private Short cancelType;

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

    public Long getSsId() {
        return ssId;
    }

    public void setSsId(Long ssId) {
        this.ssId = ssId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getTempItemName() {
        return tempItemName;
    }

    public void setTempItemName(String tempItemName) {
        this.tempItemName = tempItemName == null ? null : tempItemName.trim();
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public BigDecimal getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(BigDecimal origPrice) {
        this.origPrice = origPrice;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getMakeFee() {
        return makeFee;
    }

    public void setMakeFee(BigDecimal makeFee) {
        this.makeFee = makeFee;
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

    public Boolean getIsChangePrice() {
        return isChangePrice;
    }

    public void setIsChangePrice(Boolean isChangePrice) {
        this.isChangePrice = isChangePrice;
    }

    public Short getDiscFlg() {
        return discFlg;
    }

    public void setDiscFlg(Short discFlg) {
        this.discFlg = discFlg;
    }

    public Short getItemType() {
        return itemType;
    }

    public void setItemType(Short itemType) {
        this.itemType = itemType;
    }

    public Short getPkgFlg() {
        return pkgFlg;
    }

    public void setPkgFlg(Short pkgFlg) {
        this.pkgFlg = pkgFlg;
    }

    public Short getPkgType() {
        return pkgType;
    }

    public void setPkgType(Short pkgType) {
        this.pkgType = pkgType;
    }

    public Long getPkgScId() {
        return pkgScId;
    }

    public void setPkgScId(Long pkgScId) {
        this.pkgScId = pkgScId;
    }

    public BigDecimal getPkgRaisePrice() {
        return pkgRaisePrice;
    }

    public void setPkgRaisePrice(BigDecimal pkgRaisePrice) {
        this.pkgRaisePrice = pkgRaisePrice;
    }

    public Boolean getPkgIsRaiseByQty() {
        return pkgIsRaiseByQty;
    }

    public void setPkgIsRaiseByQty(Boolean pkgIsRaiseByQty) {
        this.pkgIsRaiseByQty = pkgIsRaiseByQty;
    }

    public Long getRzCancelId() {
        return rzCancelId;
    }

    public void setRzCancelId(Long rzCancelId) {
        this.rzCancelId = rzCancelId;
    }

    public Long getServeWayId() {
        return serveWayId;
    }

    public void setServeWayId(Long serveWayId) {
        this.serveWayId = serveWayId;
    }

    public String getMethodText() {
        return methodText;
    }

    public void setMethodText(String methodText) {
        this.methodText = methodText == null ? null : methodText.trim();
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

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
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

    public Short getCancelType() {
        return cancelType;
    }

    public void setCancelType(Short cancelType) {
        this.cancelType = cancelType;
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