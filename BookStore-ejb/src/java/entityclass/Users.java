/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityclass;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nobita
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUId", query = "SELECT u FROM Users u WHERE u.uId = :uId")
    , @NamedQuery(name = "Users.findByUAccount", query = "SELECT u FROM Users u WHERE u.uAccount = :uAccount")
    , @NamedQuery(name = "Users.findByUPassword", query = "SELECT u FROM Users u WHERE u.uPassword = :uPassword")
    , @NamedQuery(name = "Users.findByUName", query = "SELECT u FROM Users u WHERE u.uName = :uName")
    , @NamedQuery(name = "Users.findByUAddress", query = "SELECT u FROM Users u WHERE u.uAddress = :uAddress")
    , @NamedQuery(name = "Users.findByUPermiss", query = "SELECT u FROM Users u WHERE u.uPermiss = :uPermiss")
    , @NamedQuery(name = "Users.findByUStatus", query = "SELECT u FROM Users u WHERE u.uStatus = :uStatus")
    , @NamedQuery(name = "Users.findByUAdddate", query = "SELECT u FROM Users u WHERE u.uAdddate = :uAdddate")
    , @NamedQuery(name = "Users.findByUEmail", query = "SELECT u FROM Users u WHERE u.uEmail = :uEmail")
    , @NamedQuery(name = "Users.findByUPhone", query = "SELECT u FROM Users u WHERE u.uPhone = :uPhone")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "u_id")
    private Integer uId;
    @Size(max = 255)
    @Column(name = "u_account")
    private String uAccount;
    @Size(max = 255)
    @Column(name = "u_password")
    private String uPassword;
    @Size(max = 255)
    @Column(name = "u_name")
    private String uName;
    @Size(max = 255)
    @Column(name = "u_address")
    private String uAddress;
    @Column(name = "u_permiss")
    private Integer uPermiss;
    @Column(name = "u_status")
    private Integer uStatus;
    @Column(name = "u_adddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uAdddate;
    @Size(max = 255)
    @Column(name = "u_email")
    private String uEmail;
    @Size(max = 255)
    @Column(name = "u_phone")
    private String uPhone;

    public Users() {
    }

    public Users(Integer uId) {
        this.uId = uId;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public String getUAccount() {
        return uAccount;
    }

    public void setUAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getUPassword() {
        return uPassword;
    }

    public void setUPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUAddress() {
        return uAddress;
    }

    public void setUAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public Integer getUPermiss() {
        return uPermiss;
    }

    public void setUPermiss(Integer uPermiss) {
        this.uPermiss = uPermiss;
    }

    public Integer getUStatus() {
        return uStatus;
    }

    public void setUStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public Date getUAdddate() {
        return uAdddate;
    }

    public void setUAdddate(Date uAdddate) {
        this.uAdddate = uAdddate;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUPhone() {
        return uPhone;
    }

    public void setUPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uId != null ? uId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.uId == null && other.uId != null) || (this.uId != null && !this.uId.equals(other.uId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityclass.Users[ uId=" + uId + " ]";
    }
}
