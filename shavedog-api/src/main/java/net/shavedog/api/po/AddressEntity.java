package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "shavedog", catalog = "")
public class AddressEntity implements Serializable {
    private long id;
    private String address;
    private int areaId;
    private int cityId;
    private Timestamp createAt;
    private boolean isDelete;
    private String phone;
    private int provinceId;
    private String recipient;
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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "area_id")
    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "city_id")
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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
    @Column(name = "is_delete")
    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "province_id")
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "recipient")
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
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
        AddressEntity that = (AddressEntity) o;
        return id == that.id &&
                areaId == that.areaId &&
                cityId == that.cityId &&
                isDelete == that.isDelete &&
                provinceId == that.provinceId &&
                userId == that.userId &&
                Objects.equals(address, that.address) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(recipient, that.recipient) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, areaId, cityId, createAt, isDelete, phone, provinceId, recipient, updateAt, userId);
    }
}
