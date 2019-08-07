package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "coupon_flow", schema = "shavedog", catalog = "")
public class CouponFlowEntity implements Serializable {
    private long id;
    private Timestamp createAt;
    private Timestamp endTime;
    private int fulfill;
    private String introduce;
    private boolean isUsed;
    private String name;
    private Long orderId;
    private Integer orderType;
    private Timestamp startTime;
    private int type;
    private Timestamp updateAt;
    private long userId;
    private int value;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "fulfill")
    public int getFulfill() {
        return fulfill;
    }

    public void setFulfill(int fulfill) {
        this.fulfill = fulfill;
    }

    @Basic
    @Column(name = "introduce")
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Basic
    @Column(name = "is_used")
    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "order_id")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_type")
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
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

    @Basic
    @Column(name = "value")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponFlowEntity that = (CouponFlowEntity) o;
        return id == that.id &&
                fulfill == that.fulfill &&
                isUsed == that.isUsed &&
                type == that.type &&
                userId == that.userId &&
                value == that.value &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(introduce, that.introduce) &&
                Objects.equals(name, that.name) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createAt, endTime, fulfill, introduce, isUsed, name, orderId, orderType, startTime, type, updateAt, userId, value);
    }
}
