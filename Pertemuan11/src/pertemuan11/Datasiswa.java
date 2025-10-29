/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "datasiswa")
@NamedQueries({
    @NamedQuery(name = "Datasiswa.findAll", query = "SELECT d FROM Datasiswa d"),
    @NamedQuery(name = "Datasiswa.findByNama", query = "SELECT d FROM Datasiswa d WHERE d.nama = :nama"),
    @NamedQuery(name = "Datasiswa.findByAbsen", query = "SELECT d FROM Datasiswa d WHERE d.absen = :absen"),
    @NamedQuery(name = "Datasiswa.findByWaliKelas", query = "SELECT d FROM Datasiswa d WHERE d.waliKelas = :waliKelas"),
    @NamedQuery(name = "Datasiswa.findByWaliMurid", query = "SELECT d FROM Datasiswa d WHERE d.waliMurid = :waliMurid")})
public class Datasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nama")
    private String nama;
    @Id
    @Basic(optional = false)
    @Column(name = "absen")
    private Integer absen;
    @Column(name = "wali_kelas")
    private String waliKelas;
    @Column(name = "wali_murid")
    private String waliMurid;

    public Datasiswa() {
    }

    public Datasiswa(Integer absen) {
        this.absen = absen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getAbsen() {
        return absen;
    }

    public void setAbsen(Integer absen) {
        this.absen = absen;
    }

    public String getWaliKelas() {
        return waliKelas;
    }

    public void setWaliKelas(String waliKelas) {
        this.waliKelas = waliKelas;
    }

    public String getWaliMurid() {
        return waliMurid;
    }

    public void setWaliMurid(String waliMurid) {
        this.waliMurid = waliMurid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (absen != null ? absen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datasiswa)) {
            return false;
        }
        Datasiswa other = (Datasiswa) object;
        if ((this.absen == null && other.absen != null) || (this.absen != null && !this.absen.equals(other.absen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pertemuan11.Datasiswa[ absen=" + absen + " ]";
    }
    
}
