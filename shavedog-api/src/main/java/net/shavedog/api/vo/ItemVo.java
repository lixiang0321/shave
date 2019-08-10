package net.shavedog.api.vo;

import java.io.Serializable;
import java.util.Date;

public class ItemVo implements Serializable {
    private Long id;
    private String bannerImagesJson;
    private long categoryId;
    private String coverImage;
    private Date createAt;
    private String introduce;
    private boolean isDelete;
    private boolean isVipPrice;
    private String name;
    private int price;
    private long propertyId;
    private String propertyValueIdsJson;
    private String status;
    private String subTitle;
    private Date updateAt;

    @Override
    public String toString() {
        return "ItemEntity{" +
                "id=" + id +
                ", bannerImagesJson='" + bannerImagesJson + '\'' +
                ", categoryId=" + categoryId +
                ", coverImage='" + coverImage + '\'' +
                ", createAt=" + createAt +
                ", introduce='" + introduce + '\'' +
                ", isDelete=" + isDelete +
                ", isVipPrice=" + isVipPrice +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", propertyId=" + propertyId +
                ", propertyValueIdsJson='" + propertyValueIdsJson + '\'' +
                ", status=" + status +
                ", subTitle='" + subTitle + '\'' +
                ", updateAt=" + updateAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBannerImagesJson() {
        return bannerImagesJson;
    }

    public void setBannerImagesJson(String bannerImagesJson) {
        this.bannerImagesJson = bannerImagesJson;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public boolean isVipPrice() {
        return isVipPrice;
    }

    public void setVipPrice(boolean vipPrice) {
        isVipPrice = vipPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyValueIdsJson() {
        return propertyValueIdsJson;
    }

    public void setPropertyValueIdsJson(String propertyValueIdsJson) {
        this.propertyValueIdsJson = propertyValueIdsJson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
