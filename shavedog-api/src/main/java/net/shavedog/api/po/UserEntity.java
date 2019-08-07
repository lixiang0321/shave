package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "shavedog", catalog = "")
public class UserEntity implements Serializable {
    private long id;
    private String avatar;
    private int balance;
    private Timestamp createAt;
    private int gender;
    private Timestamp lastLoginAt;
    private Timestamp lastReadMessageAt;
    private String nickname;
    private String password;
    private String phone;
    private int status;
    private Timestamp updateAt;
    private String username;
    private boolean vip;
    private Timestamp vipExpire;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "balance")
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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
    @Column(name = "gender")
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "last_login_at")
    public Timestamp getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(Timestamp lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    @Basic
    @Column(name = "last_read_message_at")
    public Timestamp getLastReadMessageAt() {
        return lastReadMessageAt;
    }

    public void setLastReadMessageAt(Timestamp lastReadMessageAt) {
        this.lastReadMessageAt = lastReadMessageAt;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "vip")
    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Basic
    @Column(name = "vip_expire")
    public Timestamp getVipExpire() {
        return vipExpire;
    }

    public void setVipExpire(Timestamp vipExpire) {
        this.vipExpire = vipExpire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                balance == that.balance &&
                gender == that.gender &&
                status == that.status &&
                vip == that.vip &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(lastLoginAt, that.lastLoginAt) &&
                Objects.equals(lastReadMessageAt, that.lastReadMessageAt) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(password, that.password) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(updateAt, that.updateAt) &&
                Objects.equals(username, that.username) &&
                Objects.equals(vipExpire, that.vipExpire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avatar, balance, createAt, gender, lastLoginAt, lastReadMessageAt, nickname, password, phone, status, updateAt, username, vip, vipExpire);
    }
}
