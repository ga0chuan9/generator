package cn.com.tcsl.canyin.summry.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizTsPO {
    private Long id;

    private String code;

    private Long bsId;

    private Long shiftId;

    private Date settleTime;

    private Date settleBizDate;

    private String settleBizMonth;

    private BigDecimal lastTotal;

    private BigDecimal takeMoney;

    private BigDecimal giveChange;

    private Integer printCount;

    private Boolean isGiveInvoice;

    private BigDecimal invoiceMoney;

    private String settleInfo;

    private String remark;

    private Short saleTypeId;

    private Integer subSystemId;

    private Long createPosId;

    private Integer createShopId;

    private Long creatorId;

    private Date modifyTime;

    private Long modifierId;

    private Short uploadFlg;

    private Short downloadFlg;

    private Short settleState;

    private String orderCode;

    private Date createTime;

    private Short delflg;

    private Boolean paymentFlg;

    private BigDecimal tearingInvoiceMoney;

    private Short settleWayType;

    private Date invoiceTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getBsId() {
        return bsId;
    }

    public void setBsId(Long bsId) {
        this.bsId = bsId;
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

    public BigDecimal getLastTotal() {
        return lastTotal;
    }

    public void setLastTotal(BigDecimal lastTotal) {
        this.lastTotal = lastTotal;
    }

    public BigDecimal getTakeMoney() {
        return takeMoney;
    }

    public void setTakeMoney(BigDecimal takeMoney) {
        this.takeMoney = takeMoney;
    }

    public BigDecimal getGiveChange() {
        return giveChange;
    }

    public void setGiveChange(BigDecimal giveChange) {
        this.giveChange = giveChange;
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public Boolean getIsGiveInvoice() {
        return isGiveInvoice;
    }

    public void setIsGiveInvoice(Boolean isGiveInvoice) {
        this.isGiveInvoice = isGiveInvoice;
    }

    public BigDecimal getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(BigDecimal invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    public String getSettleInfo() {
        return settleInfo;
    }

    public void setSettleInfo(String settleInfo) {
        this.settleInfo = settleInfo == null ? null : settleInfo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(Short saleTypeId) {
        this.saleTypeId = saleTypeId;
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

    public Short getSettleState() {
        return settleState;
    }

    public void setSettleState(Short settleState) {
        this.settleState = settleState;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getDelflg() {
        return delflg;
    }

    public void setDelflg(Short delflg) {
        this.delflg = delflg;
    }

    public Boolean getPaymentFlg() {
        return paymentFlg;
    }

    public void setPaymentFlg(Boolean paymentFlg) {
        this.paymentFlg = paymentFlg;
    }

    public BigDecimal getTearingInvoiceMoney() {
        return tearingInvoiceMoney;
    }

    public void setTearingInvoiceMoney(BigDecimal tearingInvoiceMoney) {
        this.tearingInvoiceMoney = tearingInvoiceMoney;
    }

    public Short getSettleWayType() {
        return settleWayType;
    }

    public void setSettleWayType(Short settleWayType) {
        this.settleWayType = settleWayType;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }
}