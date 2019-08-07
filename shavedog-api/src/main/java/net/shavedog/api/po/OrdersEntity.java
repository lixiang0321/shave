package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "shavedog", catalog = "")
public class OrdersEntity implements Serializable {
    private long id;
    private String addressSnapshotJson;
    private int couponAmount;
    private Timestamp createAt;
    private String displayId;
    private int expressCompanyId;
    private int expressFee;
    private Timestamp finishAt;
    private int itemAmount;
    private Timestamp payAt;
    private String remark;
    private Timestamp shipAt;
    private int status;
    private Timestamp updateAt;
    private long userId;
    private String waybill;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address_snapshot_json")
    public String getAddressSnapshotJson() {
        return addressSnapshotJson;
    }

    public void setAddressSnapshotJson(String addressSnapshotJson) {
        this.addressSnapshotJson = addressSnapshotJson;
    }

    @Basic
    @Column(name = "coupon_amount")
    public int getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(int couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Basic
    @Column(name = "create_at")
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Basic
    @Column(name = "display_id")
    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    @Basic
    @Column(name = "express_company_id")
    public int getExpressCompanyId() {
        return expressCompanyId;
    }

    public void setExpressCompanyId(int expressCompanyId) {
        this.expressCompanyId = expressCompanyId;
    }

    @Basic
    @Column(name = "express_fee")
    public int getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(int expressFee) {
        this.expressFee = expressFee;
    }

    @Basic
    @Column(name = "finish_at")
    public Timestamp getFinishAt() {
        return finishAt;
    }

    public void setFinishAt(Timestamp finishAt) {
        this.finishAt = finishAt;
    }

    @Basic
    @Column(name = "item_amount")
    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    @Basic
    @Column(name = "pay_at")
    public Timestamp getPayAt() {
        return payAt;
    }

    public void setPayAt(Timestamp payAt) {
        this.payAt = payAt;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "ship_at")
    public Timestamp getShipAt() {
        return shipAt;
    }

    public void setShipAt(Timestamp shipAt) {
        this.shipAt = shipAt;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "update_at")
    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "waybill")
    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id &&
                couponAmount == that.couponAmount &&
                expressCompanyId == that.expressCompanyId &&
                expressFee == that.expressFee &&
                itemAmount == that.itemAmount &&
                status == that.status &&
                userId == that.userId &&
                Objects.equals(addressSnapshotJson, that.addressSnapshotJson) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(displayId, that.displayId) &&
                Objects.equals(finishAt, that.finishAt) &&
                Objects.equals(payAt, that.payAt) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(shipAt, that.shipAt) &&
                Objects.equals(updateAt, that.updateAt) &&
                Objects.equals(waybill, that.waybill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressSnapshotJson, couponAmount, createAt, displayId, expressCompanyId, expressFee, finishAt, itemAmount, payAt, remark, shipAt, status, updateAt, userId, waybill);
    }
}
