package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sms_captcha_flow", schema = "shavedog", catalog = "")
public class SmsCaptchaFlowEntity implements Serializable {
    private long id;
    private String captcha;
    private Timestamp createAt;
    private String phone;
    private Timestamp updateAt;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "captcha")
    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
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
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        SmsCaptchaFlowEntity that = (SmsCaptchaFlowEntity) o;
        return id == that.id &&
                Objects.equals(captcha, that.captcha) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, captcha, createAt, phone, updateAt);
    }
}
