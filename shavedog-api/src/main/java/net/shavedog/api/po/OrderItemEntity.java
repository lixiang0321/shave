package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_item", schema = "shavedog", catalog = "")
public class OrderItemEntity implements Serializable {
    private long id;
    private int count;
    private Timestamp createAt;
    private long itemId;
    private String itemSnapshotJson;
    private long orderId;
    private long propertyValueId;
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
    @Column(name = "count")
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
    @Column(name = "item_id")
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_snapshot_json")
    public String getItemSnapshotJson() {
        return itemSnapshotJson;
    }

    public void setItemSnapshotJson(String itemSnapshotJson) {
        this.itemSnapshotJson = itemSnapshotJson;
    }

    @Basic
    @Column(name = "order_id")
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "property_value_id")
    public long getPropertyValueId() {
        return propertyValueId;
    }

    public void setPropertyValueId(long propertyValueId) {
        this.propertyValueId = propertyValueId;
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
        OrderItemEntity that = (OrderItemEntity) o;
        return id == that.id &&
                count == that.count &&
                itemId == that.itemId &&
                orderId == that.orderId &&
                propertyValueId == that.propertyValueId &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(itemSnapshotJson, that.itemSnapshotJson) &&
                Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count, createAt, itemId, itemSnapshotJson, orderId, propertyValueId, updateAt);
    }
}
