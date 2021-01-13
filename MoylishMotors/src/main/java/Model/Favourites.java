/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;

/**
 *
 * @author Jonathan Roddy
 */
@Entity
@Table(name = "favourites")
@NamedQueries({
    @NamedQuery(name = "Favourites.findAll", query = "SELECT f FROM Favourites f"),
    @NamedQuery(name = "Favourites.findByUserID", query = "SELECT f FROM Favourites f WHERE f.userID = :userID")})
public class Favourites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "User_ID")
    private Integer userID;
    @JoinColumn(name = "car_ID", referencedColumnName = "ListingNumber")
    @ManyToOne(optional = false)
    private Cars carID;
    @JoinColumn(name = "User_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users;

    public Favourites() {
    }

    public Favourites(Integer userID) {
        this.userID = userID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Cars getCarID() {
        return carID;
    }

    public void setCarID(Cars carID) {
        this.carID = carID;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Favourites)) {
            return false;
        }
        Favourites other = (Favourites) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Favourites[ userID=" + userID + " ]";
    }
    
}
