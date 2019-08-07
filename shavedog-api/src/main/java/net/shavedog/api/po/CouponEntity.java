package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "coupon", schema = "shavedog", catalog = "")
public class CouponEntity implements Serializable {
    private long id;
    private Timestamp createAt;
    private Timestamp endTime;
    private int fulfill;
    private String introduce;
    private boolean isDelete;
    private String name;
    private Timestamp startTime;
    private int type;
    private Timestamp updateAt;
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
    @Column(name = "is_delete")
    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
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
        CouponEntity that = (CouponEntity) o;
        return id == that.id &&
                fulfill == that.fulfill &&
                isDelete == that.isDelete &&
                type == that.type &&
                value == that.value &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(introduce, that.introduce) &&
                Objects.equals(name, that.name) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createAt, endTime, fulfill, introduce, isDelete, name, startTime, type, updateAt, value);
    }
}
