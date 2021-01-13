/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Jonathan Roddy
 */
@Entity
@Table(name = "cars")
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c"),
    @NamedQuery(name = "Cars.findByListingNumber", query = "SELECT c FROM Cars c WHERE c.listingNumber = :listingNumber"),
    @NamedQuery(name = "Cars.findByYear", query = "SELECT c FROM Cars c WHERE c.year = :year"),
    @NamedQuery(name = "Cars.findByReg", query = "SELECT c FROM Cars c WHERE c.reg = :reg"),
    @NamedQuery(name = "Cars.findByMake", query = "SELECT c FROM Cars c WHERE c.make = :make"),
    @NamedQuery(name = "Cars.findByModel", query = "SELECT c FROM Cars c WHERE c.model = :model"),
    @NamedQuery(name = "Cars.findByColour", query = "SELECT c FROM Cars c WHERE c.colour = :colour"),
    @NamedQuery(name = "Cars.findByDescription", query = "SELECT c FROM Cars c WHERE c.description = :description"),
    @NamedQuery(name = "Cars.findByBuyPrice", query = "SELECT c FROM Cars c WHERE c.buyPrice = :buyPrice"),
    @NamedQuery(name = "Cars.findByListPrice", query = "SELECT c FROM Cars c WHERE c.listPrice = :listPrice"),
    @NamedQuery(name = "Cars.findByOdometer", query = "SELECT c FROM Cars c WHERE c.odometer = :odometer"),
    @NamedQuery(name = "Cars.findByKph", query = "SELECT c FROM Cars c WHERE c.kph = :kph"),
    @NamedQuery(name = "Cars.findByEngine", query = "SELECT c FROM Cars c WHERE c.engine = :engine"),
    @NamedQuery(name = "Cars.findByFuel", query = "SELECT c FROM Cars c WHERE c.fuel = :fuel"),
    @NamedQuery(name = "Cars.findByTransmission", query = "SELECT c FROM Cars c WHERE c.transmission = :transmission"),
    @NamedQuery(name = "Cars.findByBody", query = "SELECT c FROM Cars c WHERE c.body = :body"),
    @NamedQuery(name = "Cars.findByIsofix", query = "SELECT c FROM Cars c WHERE c.isofix = :isofix"),
    @NamedQuery(name = "Cars.findByMotorTax", query = "SELECT c FROM Cars c WHERE c.motorTax = :motorTax"),
    @NamedQuery(name = "Cars.findByPreOwnerNumber", query = "SELECT c FROM Cars c WHERE c.preOwnerNumber = :preOwnerNumber"),
    @NamedQuery(name = "Cars.findByFullServiceHistory", query = "SELECT c FROM Cars c WHERE c.fullServiceHistory = :fullServiceHistory"),
    @NamedQuery(name = "Cars.findByNote", query = "SELECT c FROM Cars c WHERE c.note = :note")})
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListingNumber")
    private Integer listingNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Year")
    private int year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reg")
    private int reg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Make")
    private String make;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Colour")
    private String colour;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BuyPrice")
    private int buyPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListPrice")
    private int listPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Odometer")
    private int odometer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "060kph")
    private String kph;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Engine")
    private double engine;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Fuel")
    private String fuel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "Transmission")
    private String transmission;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Body")
    private String body;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "Isofix")
    private String isofix;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MotorTax")
    private String motorTax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PreOwnerNumber")
    private int preOwnerNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FullServiceHistory")
    private Character fullServiceHistory;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Note")
    private String note;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cars")
    private CarArchive carArchive;
    @JoinColumn(name = "SalesPersonID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Vendor salesPersonID;
    @JoinColumn(name = "PreOwnerID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PreOwner preOwnerID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carID")
    private Collection<Favourites> favouritesCollection;

    public Cars() {
    }

    public Cars(Integer listingNumber) {
        this.listingNumber = listingNumber;
    }

    public Cars(Integer listingNumber, int year, int reg, String make, String model, String colour, String description, int buyPrice, int listPrice, int odometer, String kph, double engine, String fuel, String transmission, String body, String isofix, String motorTax, int preOwnerNumber, Character fullServiceHistory, String note) {
        this.listingNumber = listingNumber;
        this.year = year;
        this.reg = reg;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.description = description;
        this.buyPrice = buyPrice;
        this.listPrice = listPrice;
        this.odometer = odometer;
        this.kph = kph;
        this.engine = engine;
        this.fuel = fuel;
        this.transmission = transmission;
        this.body = body;
        this.isofix = isofix;
        this.motorTax = motorTax;
        this.preOwnerNumber = preOwnerNumber;
        this.fullServiceHistory = fullServiceHistory;
        this.note = note;
    }

    public Integer getListingNumber() {
        return listingNumber;
    }

    public void setListingNumber(Integer listingNumber) {
        this.listingNumber = listingNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getKph() {
        return kph;
    }

    public void setKph(String kph) {
        this.kph = kph;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getIsofix() {
        return isofix;
    }

    public void setIsofix(String isofix) {
        this.isofix = isofix;
    }

    public String getMotorTax() {
        return motorTax;
    }

    public void setMotorTax(String motorTax) {
        this.motorTax = motorTax;
    }

    public int getPreOwnerNumber() {
        return preOwnerNumber;
    }

    public void setPreOwnerNumber(int preOwnerNumber) {
        this.preOwnerNumber = preOwnerNumber;
    }

    public Character getFullServiceHistory() {
        return fullServiceHistory;
    }

    public void setFullServiceHistory(Character fullServiceHistory) {
        this.fullServiceHistory = fullServiceHistory;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CarArchive getCarArchive() {
        return carArchive;
    }

    public void setCarArchive(CarArchive carArchive) {
        this.carArchive = carArchive;
    }

    public Vendor getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(Vendor salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public PreOwner getPreOwnerID() {
        return preOwnerID;
    }

    public void setPreOwnerID(PreOwner preOwnerID) {
        this.preOwnerID = preOwnerID;
    }

    
    public Collection<Favourites> getFavouritesCollection() {
        return favouritesCollection;
    }

    public void setFavouritesCollection(Collection<Favourites> favouritesCollection) {
        this.favouritesCollection = favouritesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listingNumber != null ? listingNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.listingNumber == null && other.listingNumber != null) || (this.listingNumber != null && !this.listingNumber.equals(other.listingNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cars[ listingNumber=" + listingNumber + " ]";
    }

    public void setBuyPrice(double buyPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setListPrice(double listPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
