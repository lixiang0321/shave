package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wechat_user", schema = "shavedog", catalog = "")
public class WechatUserEntity implements Serializable {
    private long id;
    private String city;
    private String country;
    private Timestamp createAt;
    private String headImgUrl;
    private String language;
    private String maOpenId;
    private String mpOpenId;
    private String nickname;
    private String province;
    private int sex;
    private String unionId;
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
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    @Column(name = "head_img_url")
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "ma_open_id")
    public String getMaOpenId() {
        return maOpenId;
    }

    public void setMaOpenId(String maOpenId) {
        this.maOpenId = maOpenId;
    }

    @Basic
    @Column(name = "mp_open_id")
    public String getMpOpenId() {
        return mpOpenId;
    }

    public void setMpOpenId(String mpOpenId) {
        this.mpOpenId = mpOpenId;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "sex")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "union_id")
    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
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
        WechatUserEntity that = (WechatUserEntity) o;
        return id == that.id &&
                sex == that.sex &&
                userId == that.userId &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(headImgUrl, that.headImgUrl) &&
                Objects.equals(language, that.language) &&
                Objects.equals(maOpenId, that.maOpenId) &&
                Objects.equals(mpOpenId, that.mpOpenId) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(province, that.province) &&
                Objects.equals(unionId, that.unionId) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, country, createAt, headImgUrl, language, maOpenId, mpOpenId, nickname, province, sex, unionId, updateAt, userId);
    }
}
