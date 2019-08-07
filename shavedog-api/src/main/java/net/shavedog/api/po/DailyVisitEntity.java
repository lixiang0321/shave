package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "daily_visit", schema = "shavedog", catalog = "")
public class DailyVisitEntity implements Serializable {
    private String id;
    private String userIdSetJson;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id_set_json")
    public String getUserIdSetJson() {
        return userIdSetJson;
    }

    public void setUserIdSetJson(String userIdSetJson) {
        this.userIdSetJson = userIdSetJson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyVisitEntity that = (DailyVisitEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userIdSetJson, that.userIdSetJson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userIdSetJson);
    }
}
