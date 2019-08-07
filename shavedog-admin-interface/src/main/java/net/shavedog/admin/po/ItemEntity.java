package net.shavedog.admin.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "item", schema = "shavedog", catalog = "")
public class ItemEntity implements Serializable {
    private Long id;
    private String bannerImagesJson;
    private long categoryId;
    private String coverImage;
    private Timestamp createAt;
    private String introduce;
    private boolean isDelete;
    private boolean isVipPrice;
    private String name;
    private int price;
    private long propertyId;
    private String propertyValueIdsJson;
    private int status;
    private String subTitle;
    private Timestamp updateAt;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "banner_images_json")
    public String getBannerImagesJson() {
        return bannerImagesJson;
    }

    public void setBannerImagesJson(String bannerImagesJson) {
        this.bannerImagesJson = bannerImagesJson;
    }

    @Basic
    @Column(name = "category_id")
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "cover_image")
    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
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
    @Column(name = "is_vip_price")
    public boolean isVipPrice() {
        return isVipPrice;
    }

    public void setVipPrice(boolean vipPrice) {
        isVipPrice = vipPrice;
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
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "property_id")
    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    @Basic
    @Column(name = "property_value_ids_json")
    public String getPropertyValueIdsJson() {
        return propertyValueIdsJson;
    }

    public void setPropertyValueIdsJson(String propertyValueIdsJson) {
        this.propertyValueIdsJson = propertyValueIdsJson;
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
    @Column(name = "sub_title")
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Basic
    @Column(name = "update_at")
    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemEntity that = (ItemEntity) o;
        return id == that.id &&
                categoryId == that.categoryId &&
                isDelete == that.isDelete &&
                isVipPrice == that.isVipPrice &&
                price == that.price &&
                propertyId == that.propertyId &&
                status == that.status &&
                Objects.equals(bannerImagesJson, that.bannerImagesJson) &&
                Objects.equals(coverImage, that.coverImage) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(introduce, that.introduce) &&
                Objects.equals(name, that.name) &&
                Objects.equals(propertyValueIdsJson, that.propertyValueIdsJson) &&
                Objects.equals(subTitle, that.subTitle) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bannerImagesJson, categoryId, coverImage, createAt, introduce, isDelete, isVipPrice, name, price, propertyId, propertyValueIdsJson, status, subTitle, updateAt);
    }
}
