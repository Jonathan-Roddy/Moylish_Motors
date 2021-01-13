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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Jonathan Roddy
 */
@Entity
@Table(name = "pre_owner")
@NamedQueries({
    @NamedQuery(name = "PreOwner.findAll", query = "SELECT p FROM PreOwner p"),
    @NamedQuery(name = "PreOwner.findById", query = "SELECT p FROM PreOwner p WHERE p.id = :id"),
    @NamedQuery(name = "PreOwner.findByFullName", query = "SELECT p FROM PreOwner p WHERE p.fullName = :fullName"),
    @NamedQuery(name = "PreOwner.findByFullAddress", query = "SELECT p FROM PreOwner p WHERE p.fullAddress = :fullAddress"),
    @NamedQuery(name = "PreOwner.findByPhoneNumber", query = "SELECT p FROM PreOwner p WHERE p.phoneNumber = :phoneNumber")})
public class PreOwner implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preOwnerID")
    private Collection<Cars> carsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FullName")
    private String fullName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FullAddress")
    private String fullAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PhoneNumber")
    private String phoneNumber;

    public PreOwner() {
    }

    public PreOwner(Integer id) {
        this.id = id;
    }

    public PreOwner(Integer id, String fullName, String fullAddress, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.fullAddress = fullAddress;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreOwner)) {
            return false;
        }
        PreOwner other = (PreOwner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.PreOwner[ id=" + id + " ]";
    }

    
    public Collection<Cars> getCarsCollection() {
        return carsCollection;
    }

    public void setCarsCollection(Collection<Cars> carsCollection) {
        this.carsCollection = carsCollection;
    }
    
}
