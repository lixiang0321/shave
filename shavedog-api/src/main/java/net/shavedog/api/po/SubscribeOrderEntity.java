package net.shavedog.api.po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "subscribe_order", schema = "shavedog", catalog = "")
public class SubscribeOrderEntity implements Serializable {
    private long id;
    private String addressSnapshotJson;
    private Timestamp createAt;
    private String displayId;
    private int expressCompanyId;
    private boolean isShip;
    private int period;
    private Timestamp shipAt;
    private Timestamp startAt;
    private long subscribeId;
    private Timestamp updateAt;
    private String waybill;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address_snapshot_json")
    public String getAddressSnapshotJson() {
        return addressSnapshotJson;
    }

    public void setAddressSnapshotJson(String addressSnapshotJson) {
        this.addressSnapshotJson = addressSnapshotJson;
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
    @Column(name = "display_id")
    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    @Basic
    @Column(name = "express_company_id")
    public int getExpressCompanyId() {
        return expressCompanyId;
    }

    public void setExpressCompanyId(int expressCompanyId) {
        this.expressCompanyId = expressCompanyId;
    }

    @Basic
    @Column(name = "is_ship")
    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    @Basic
    @Column(name = "period")
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Basic
    @Column(name = "ship_at")
    public Timestamp getShipAt() {
        return shipAt;
    }

    public void setShipAt(Timestamp shipAt) {
        this.shipAt = shipAt;
    }

    @Basic
    @Column(name = "start_at")
    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    @Basic
    @Column(name = "subscribe_id")
    public long getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(long subscribeId) {
        this.subscribeId = subscribeId;
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
    @Column(name = "waybill")
    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscribeOrderEntity that = (SubscribeOrderEntity) o;
        return id == that.id &&
                expressCompanyId == that.expressCompanyId &&
                isShip == that.isShip &&
                period == that.period &&
                subscribeId == that.subscribeId &&
                Objects.equals(addressSnapshotJson, that.addressSnapshotJson) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(displayId, that.displayId) &&
                Objects.equals(shipAt, that.shipAt) &&
                Objects.equals(startAt, that.startAt) &&
                Objects.equals(updateAt, that.updateAt) &&
                Objects.equals(waybill, that.waybill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressSnapshotJson, createAt, displayId, expressCompanyId, isShip, period, shipAt, startAt, subscribeId, updateAt, waybill);
    }
}
