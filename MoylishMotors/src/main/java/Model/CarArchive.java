/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Jonathan Roddy
 */
@Entity
@Table(name = "car_archive")
@NamedQueries({
    @NamedQuery(name = "CarArchive.findAll", query = "SELECT c FROM CarArchive c"),
    @NamedQuery(name = "CarArchive.findByCarID", query = "SELECT c FROM CarArchive c WHERE c.carID = :carID"),
    @NamedQuery(name = "CarArchive.findBySellPrice", query = "SELECT c FROM CarArchive c WHERE c.sellPrice = :sellPrice"),
    @NamedQuery(name = "CarArchive.findByWarranty", query = "SELECT c FROM CarArchive c WHERE c.warranty = :warranty"),
    @NamedQuery(name = "CarArchive.findByDateSold", query = "SELECT c FROM CarArchive c WHERE c.dateSold = :dateSold")})
public class CarArchive implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "car_ID")
    private Integer carID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sell_price")
    private int sellPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "Warranty")
    private String warranty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateSold")
    @Temporal(TemporalType.DATE)
    private Date dateSold;
    @JoinColumn(name = "car_ID", referencedColumnName = "ListingNumber", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Cars cars;
    @JoinColumn(name = "vendor_Id", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Vendor vendorId;
    @JoinColumn(name = "Customer_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users customerID;

    public CarArchive() {
    }

    public CarArchive(Integer carID) {
        this.carID = carID;
    }

    public CarArchive(Integer carID, int sellPrice, String warranty, Date dateSold) {
        this.carID = carID;
        this.sellPrice = sellPrice;
        this.warranty = warranty;
        this.dateSold = dateSold;
    }

    public Integer getCarID() {
        return carID;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public Date getDateSold() {
        return dateSold;
    }

    public void setDateSold(Date dateSold) {
        this.dateSold = dateSold;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public void setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
    }

    public Users getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Users customerID) {
        this.customerID = customerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carID != null ? carID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarArchive)) {
            return false;
        }
        CarArchive other = (CarArchive) object;
        if ((this.carID == null && other.carID != null) || (this.carID != null && !this.carID.equals(other.carID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.CarArchive[ carID=" + carID + " ]";
    }
    
}
