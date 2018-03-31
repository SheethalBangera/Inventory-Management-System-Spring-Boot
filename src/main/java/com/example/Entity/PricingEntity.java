package com.example.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "pricing", schema = "ipaytest2")
public class PricingEntity {
    private Integer pricingId;
    private String pricingName;
    private Integer pricingDiscountPrecentage;
    private Date pricingEffectiveDate;
    private Date pricingExpireDate;
    private String createdUser;
    private Timestamp createdDateTime;
    private String lastModifiedUser;
    private Timestamp lastModifiedDateTime;
    private Integer version;
    private Collection<ProductPricingEntity> productPricingsByPricingId;

    public PricingEntity(Integer pricingId, String pricingName, Integer pricingDiscountPrecentage, Date pricingEffectiveDate, Date pricingExpireDate, String createdUser, Timestamp createdDateTime, String lastModifiedUser, Timestamp lastModifiedDateTime,
                         Integer version, Collection<ProductPricingEntity> productPricingsByPricingId) {
        this.pricingId = pricingId;
        this.pricingName = pricingName;
        this.pricingDiscountPrecentage = pricingDiscountPrecentage;
        this.pricingEffectiveDate = pricingEffectiveDate;
        this.pricingExpireDate = pricingExpireDate;
        this.createdUser = createdUser;
        this.createdDateTime = createdDateTime;
        this.lastModifiedUser = lastModifiedUser;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.version = version;
        this.productPricingsByPricingId = productPricingsByPricingId;
    }

    public PricingEntity() {
    }

    @Id
    @Column(name = "pricingId")
    public Integer getPricingId() {
        return pricingId;
    }

    public void setPricingId(Integer pricingId) {
        this.pricingId = pricingId;
    }

    @Basic
    @Column(name = "pricingName")
    public String getPricingName() {
        return pricingName;
    }

    public void setPricingName(String pricingName) {
        this.pricingName = pricingName;
    }

    @Basic
    @Column(name = "pricingDiscountPrecentage")
    public Integer getPricingDiscountPrecentage() {
        return pricingDiscountPrecentage;
    }

    public void setPricingDiscountPrecentage(Integer pricingDiscountPrecentage) {
        this.pricingDiscountPrecentage = pricingDiscountPrecentage;
    }

    @Basic
    @Column(name = "pricingEffectiveDate")
    public Date getPricingEffectiveDate() {
        return pricingEffectiveDate;
    }

    public void setPricingEffectiveDate(Date pricingEffectiveDate) {
        this.pricingEffectiveDate = pricingEffectiveDate;
    }

    @Basic
    @Column(name = "pricingExpireDate")
    public Date getPricingExpireDate() {
        return pricingExpireDate;
    }

    public void setPricingExpireDate(Date pricingExpireDate) {
        this.pricingExpireDate = pricingExpireDate;
    }

    @Basic
    @Column(name = "CreatedUser")
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Basic
    @Column(name = "CreatedDateTime")
    public Timestamp getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Timestamp createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    @Basic
    @Column(name = "LastModifiedUser")
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    @Basic
    @Column(name = "LastModifiedDateTime")
    public Timestamp getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(Timestamp lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Basic
    @Column(name = "VERSION")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricingEntity that = (PricingEntity) o;
        return pricingId == that.pricingId &&
                Objects.equals(pricingName, that.pricingName) &&
                Objects.equals(pricingDiscountPrecentage, that.pricingDiscountPrecentage) &&
                Objects.equals(pricingEffectiveDate, that.pricingEffectiveDate) &&
                Objects.equals(pricingExpireDate, that.pricingExpireDate) &&
                Objects.equals(createdUser, that.createdUser) &&
                Objects.equals(createdDateTime, that.createdDateTime) &&
                Objects.equals(lastModifiedUser, that.lastModifiedUser) &&
                Objects.equals(lastModifiedDateTime, that.lastModifiedDateTime) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pricingId, pricingName, pricingDiscountPrecentage, pricingEffectiveDate, pricingExpireDate, createdUser, createdDateTime, lastModifiedUser, lastModifiedDateTime, version);
    }

    @OneToMany(mappedBy = "pricingByPricingPricingId")
    public Collection<ProductPricingEntity> getProductPricingsByPricingId() {
        return productPricingsByPricingId;
    }

    public void setProductPricingsByPricingId(Collection<ProductPricingEntity> productPricingsByPricingId) {
        this.productPricingsByPricingId = productPricingsByPricingId;
    }
}
