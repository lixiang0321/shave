package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "subscribe", schema = "shavedog", catalog = "")
public class SubscribeEntity implements Serializable {
    private long id;
    private String addressSnapshotJson;
    private int couponAmount;
    private Timestamp createAt;
    private String displayId;
    private Timestamp endAt;
    private boolean isPaid;
    private Timestamp payAt;
    private int price;
    private Timestamp startAt;
    private int type;
    private Timestamp updateAt;
    private long userId;

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
    @Column(name = "end_at")
    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    @Basic
    @Column(name = "is_paid")
    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
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
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "start_at")
    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscribeEntity that = (SubscribeEntity) o;
        return id == that.id &&
                couponAmount == that.couponAmount &&
                isPaid == that.isPaid &&
                price == that.price &&
                type == that.type &&
                userId == that.userId &&
                Objects.equals(addressSnapshotJson, that.addressSnapshotJson) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(displayId, that.displayId) &&
                Objects.equals(endAt, that.endAt) &&
                Objects.equals(payAt, that.payAt) &&
                Objects.equals(startAt, that.startAt) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressSnapshotJson, couponAmount, createAt, displayId, endAt, isPaid, payAt, price, startAt, type, updateAt, userId);
    }
}
