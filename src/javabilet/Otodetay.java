/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabilet;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author kadirbusra
 */
@Entity
@Table(name = "otodetay", catalog = "sql11229067", schema = "")
@NamedQueries({
    @NamedQuery(name = "Otodetay.findAll", query = "SELECT o FROM Otodetay o")
    , @NamedQuery(name = "Otodetay.findById", query = "SELECT o FROM Otodetay o WHERE o.id = :id")
    , @NamedQuery(name = "Otodetay.findByOtono", query = "SELECT o FROM Otodetay o WHERE o.otono = :otono")
    , @NamedQuery(name = "Otodetay.findByOtoguzergah", query = "SELECT o FROM Otodetay o WHERE o.otoguzergah = :otoguzergah")
    , @NamedQuery(name = "Otodetay.findByOtohedef", query = "SELECT o FROM Otodetay o WHERE o.otohedef = :otohedef")
    , @NamedQuery(name = "Otodetay.findByHareket", query = "SELECT o FROM Otodetay o WHERE o.hareket = :hareket")
    , @NamedQuery(name = "Otodetay.findByTarihi", query = "SELECT o FROM Otodetay o WHERE o.tarihi = :tarihi")
    , @NamedQuery(name = "Otodetay.findByZamani", query = "SELECT o FROM Otodetay o WHERE o.zamani = :zamani")
    , @NamedQuery(name = "Otodetay.findByFiyat", query = "SELECT o FROM Otodetay o WHERE o.fiyat = :fiyat")
    , @NamedQuery(name = "Otodetay.findByKoltuk", query = "SELECT o FROM Otodetay o WHERE o.koltuk = :koltuk")})
public class Otodetay implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "otono")
    private String otono;
    @Basic(optional = false)
    @Column(name = "otoguzergah")
    private String otoguzergah;
    @Basic(optional = false)
    @Column(name = "otohedef")
    private String otohedef;
    @Basic(optional = false)
    @Column(name = "hareket")
    private String hareket;
    @Basic(optional = false)
    @Column(name = "tarihi")
    private String tarihi;
    @Column(name = "zamani")
    private String zamani;
    @Column(name = "fiyat")
    private String fiyat;
    @Column(name = "koltuk")
    private String koltuk;

    public Otodetay() {
    }

    public Otodetay(Integer id) {
        this.id = id;
    }

    public Otodetay(Integer id, String otono, String otoguzergah, String otohedef, String hareket, String tarihi) {
        this.id = id;
        this.otono = otono;
        this.otoguzergah = otoguzergah;
        this.otohedef = otohedef;
        this.hareket = hareket;
        this.tarihi = tarihi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getOtono() {
        return otono;
    }

    public void setOtono(String otono) {
        String oldOtono = this.otono;
        this.otono = otono;
        changeSupport.firePropertyChange("otono", oldOtono, otono);
    }

    public String getOtoguzergah() {
        return otoguzergah;
    }

    public void setOtoguzergah(String otoguzergah) {
        String oldOtoguzergah = this.otoguzergah;
        this.otoguzergah = otoguzergah;
        changeSupport.firePropertyChange("otoguzergah", oldOtoguzergah, otoguzergah);
    }

    public String getOtohedef() {
        return otohedef;
    }

    public void setOtohedef(String otohedef) {
        String oldOtohedef = this.otohedef;
        this.otohedef = otohedef;
        changeSupport.firePropertyChange("otohedef", oldOtohedef, otohedef);
    }

    public String getHareket() {
        return hareket;
    }

    public void setHareket(String hareket) {
        String oldHareket = this.hareket;
        this.hareket = hareket;
        changeSupport.firePropertyChange("hareket", oldHareket, hareket);
    }

    public String getTarihi() {
        return tarihi;
    }

    public void setTarihi(String tarihi) {
        String oldTarihi = this.tarihi;
        this.tarihi = tarihi;
        changeSupport.firePropertyChange("tarihi", oldTarihi, tarihi);
    }

    public String getZamani() {
        return zamani;
    }

    public void setZamani(String zamani) {
        String oldZamani = this.zamani;
        this.zamani = zamani;
        changeSupport.firePropertyChange("zamani", oldZamani, zamani);
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        String oldFiyat = this.fiyat;
        this.fiyat = fiyat;
        changeSupport.firePropertyChange("fiyat", oldFiyat, fiyat);
    }

    public String getKoltuk() {
        return koltuk;
    }

    public void setKoltuk(String koltuk) {
        String oldKoltuk = this.koltuk;
        this.koltuk = koltuk;
        changeSupport.firePropertyChange("koltuk", oldKoltuk, koltuk);
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
        if (!(object instanceof Otodetay)) {
            return false;
        }
        Otodetay other = (Otodetay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javabilet.Otodetay[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
