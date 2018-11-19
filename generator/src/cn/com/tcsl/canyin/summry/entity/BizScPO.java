package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizScPO {
    private Long id;

    private Long bsId;

    private Long ssId;

    private Long tsId;

    private Long shiftId;

    private Date settleTime;

    private Boolean isSettled;

    private Date settleBizDate;

    private String settleBizMonth;

    private Integer sortOrder;

    private Long itemId;

    private String tempItemName;

    private Long unitId;

    private BigDecimal costPrice;

    private BigDecimal origPrice;

    private BigDecimal lastPrice;

    private Boolean isChangePrice;

    private BigDecimal makeFee;

    private BigDecimal origMakeFee;

    private BigDecimal lastMakeFee;

    private BigDecimal origQty;

    private BigDecimal lastQty;

    private BigDecimal origSubtotal;

    private Short discType;

    private Short discFlg;

    private BigDecimal discScale;

    private BigDecimal discMoney;

    private BigDecimal lastSubtotal;

    private BigDecimal presentMoney;

    private BigDecimal discFix;

    private BigDecimal wipeMoney;

    private BigDecimal discTotal;

    private BigDecimal lastTotal;

    private BigDecimal notIncomeMoney;

    private BigDecimal incomeMoney;

    private BigDecimal costTotal;

    private Short itemType;

    private Short pkgFlg;

    private Short pkgType;

    private Long pkgScId;

    private BigDecimal pkgRaisePrice;

    private Boolean pkgIsRaiseByQty;

    private Long rzFreeId;

    private Long serveWayId;

    private String methodText;

    private Date modifyTime;

    private Long modifierId;

    private Integer createShopId;

    private Date createTime;

    private Short uploadFlg;

    private Short downloadFlg;

    private Short delflg;

    private Boolean isTeamSc;

    private Long itemSizeId;

    private Long sourceScId;

    private Boolean isBuffet;

    private Long barcode;

    private Boolean isConfirmWeigh;

    private Boolean discountGiveItemFlg;

    private Short saleTypeId;

    private BigDecimal taxMoney;

    private BigDecimal salePrice;

    private BigDecimal memberPrice;

    private BigDecimal promotePrice;

    private Short priceType;

    private BigDecimal lastItemPrice;

    private BigDecimal memberMoney;

    private BigDecimal promoteMoney;

    private String code;

    private Long settleShiftId;

    private Long pointId;

    private Long createPosId;

    private Long waiterId;

    private Long creatorId;

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

    public Long getTsId() {
        return tsId;
    }

    public void setTsId(Long tsId) {
        this.tsId = tsId;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public Boolean getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(Boolean isSettled) {
        this.isSettled = isSettled;
    }

    public Date getSettleBizDate() {
        return settleBizDate;
    }

    public void setSettleBizDate(Date settleBizDate) {
        this.settleBizDate = settleBizDate;
    }

    public String getSettleBizMonth() {
        return settleBizMonth;
    }

    public void setSettleBizMonth(String settleBizMonth) {
        this.settleBizMonth = settleBizMonth == null ? null : settleBizMonth.trim();
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

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
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

    public Boolean getIsChangePrice() {
        return isChangePrice;
    }

    public void setIsChangePrice(Boolean isChangePrice) {
        this.isChangePrice = isChangePrice;
    }

    public BigDecimal getMakeFee() {
        return makeFee;
    }

    public void setMakeFee(BigDecimal makeFee) {
        this.makeFee = makeFee;
    }

    public BigDecimal getOrigMakeFee() {
        return origMakeFee;
    }

    public void setOrigMakeFee(BigDecimal origMakeFee) {
        this.origMakeFee = origMakeFee;
    }

    public BigDecimal getLastMakeFee() {
        return lastMakeFee;
    }

    public void setLastMakeFee(BigDecimal lastMakeFee) {
        this.lastMakeFee = lastMakeFee;
    }

    public BigDecimal getOrigQty() {
        return origQty;
    }

    public void setOrigQty(BigDecimal origQty) {
        this.origQty = origQty;
    }

    public BigDecimal getLastQty() {
        return lastQty;
    }

    public void setLastQty(BigDecimal lastQty) {
        this.lastQty = lastQty;
    }

    public BigDecimal getOrigSubtotal() {
        return origSubtotal;
    }

    public void setOrigSubtotal(BigDecimal origSubtotal) {
        this.origSubtotal = origSubtotal;
    }

    public Short getDiscType() {
        return discType;
    }

    public void setDiscType(Short discType) {
        this.discType = discType;
    }

    public Short getDiscFlg() {
        return discFlg;
    }

    public void setDiscFlg(Short discFlg) {
        this.discFlg = discFlg;
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

    public BigDecimal getLastSubtotal() {
        return lastSubtotal;
    }

    public void setLastSubtotal(BigDecimal lastSubtotal) {
        this.lastSubtotal = lastSubtotal;
    }

    public BigDecimal getPresentMoney() {
        return presentMoney;
    }

    public void setPresentMoney(BigDecimal presentMoney) {
        this.presentMoney = presentMoney;
    }

    public BigDecimal getDiscFix() {
        return discFix;
    }

    public void setDiscFix(BigDecimal discFix) {
        this.discFix = discFix;
    }

    public BigDecimal getWipeMoney() {
        return wipeMoney;
    }

    public void setWipeMoney(BigDecimal wipeMoney) {
        this.wipeMoney = wipeMoney;
    }

    public BigDecimal getDiscTotal() {
        return discTotal;
    }

    public void setDiscTotal(BigDecimal discTotal) {
        this.discTotal = discTotal;
    }

    public BigDecimal getLastTotal() {
        return lastTotal;
    }

    public void setLastTotal(BigDecimal lastTotal) {
        this.lastTotal = lastTotal;
    }

    public BigDecimal getNotIncomeMoney() {
        return notIncomeMoney;
    }

    public void setNotIncomeMoney(BigDecimal notIncomeMoney) {
        this.notIncomeMoney = notIncomeMoney;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public BigDecimal getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(BigDecimal costTotal) {
        this.costTotal = costTotal;
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

    public Long getRzFreeId() {
        return rzFreeId;
    }

    public void setRzFreeId(Long rzFreeId) {
        this.rzFreeId = rzFreeId;
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

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
    }

    public Boolean getIsTeamSc() {
        return isTeamSc;
    }

    public void setIsTeamSc(Boolean isTeamSc) {
        this.isTeamSc = isTeamSc;
    }

    public Long getItemSizeId() {
        return itemSizeId;
    }

    public void setItemSizeId(Long itemSizeId) {
        this.itemSizeId = itemSizeId;
    }

    public Long getSourceScId() {
        return sourceScId;
    }

    public void setSourceScId(Long sourceScId) {
        this.sourceScId = sourceScId;
    }

    public Boolean getIsBuffet() {
        return isBuffet;
    }

    public void setIsBuffet(Boolean isBuffet) {
        this.isBuffet = isBuffet;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public Boolean getIsConfirmWeigh() {
        return isConfirmWeigh;
    }

    public void setIsConfirmWeigh(Boolean isConfirmWeigh) {
        this.isConfirmWeigh = isConfirmWeigh;
    }

    public Boolean getDiscountGiveItemFlg() {
        return discountGiveItemFlg;
    }

    public void setDiscountGiveItemFlg(Boolean discountGiveItemFlg) {
        this.discountGiveItemFlg = discountGiveItemFlg;
    }

    public Short getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(Short saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public BigDecimal getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(BigDecimal taxMoney) {
        this.taxMoney = taxMoney;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Short getPriceType() {
        return priceType;
    }

    public void setPriceType(Short priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getLastItemPrice() {
        return lastItemPrice;
    }

    public void setLastItemPrice(BigDecimal lastItemPrice) {
        this.lastItemPrice = lastItemPrice;
    }

    public BigDecimal getMemberMoney() {
        return memberMoney;
    }

    public void setMemberMoney(BigDecimal memberMoney) {
        this.memberMoney = memberMoney;
    }

    public BigDecimal getPromoteMoney() {
        return promoteMoney;
    }

    public void setPromoteMoney(BigDecimal promoteMoney) {
        this.promoteMoney = promoteMoney;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getSettleShiftId() {
        return settleShiftId;
    }

    public void setSettleShiftId(Long settleShiftId) {
        this.settleShiftId = settleShiftId;
    }

    public Long getPointId() {
        return pointId;
    }

    public void setPointId(Long pointId) {
        this.pointId = pointId;
    }

    public Long getCreatePosId() {
        return createPosId;
    }

    public void setCreatePosId(Long createPosId) {
        this.createPosId = createPosId;
    }

    public Long getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(Long waiterId) {
        this.waiterId = waiterId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}