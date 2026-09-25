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
@Table(name = "bilet", catalog = "sql11229067", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bilet.findAll", query = "SELECT b FROM Bilet b")
    , @NamedQuery(name = "Bilet.findById", query = "SELECT b FROM Bilet b WHERE b.id = :id")
    , @NamedQuery(name = "Bilet.findByAd", query = "SELECT b FROM Bilet b WHERE b.ad = :ad")
    , @NamedQuery(name = "Bilet.findByYas", query = "SELECT b FROM Bilet b WHERE b.yas = :yas")
    , @NamedQuery(name = "Bilet.findByGuncelle", query = "SELECT b FROM Bilet b WHERE b.guncelle = :guncelle")
    , @NamedQuery(name = "Bilet.findByTelefon", query = "SELECT b FROM Bilet b WHERE b.telefon = :telefon")
    , @NamedQuery(name = "Bilet.findByTarihi", query = "SELECT b FROM Bilet b WHERE b.tarihi = :tarihi")
    , @NamedQuery(name = "Bilet.findByKoltuk", query = "SELECT b FROM Bilet b WHERE b.koltuk = :koltuk")
    , @NamedQuery(name = "Bilet.findByOtoguzergah", query = "SELECT b FROM Bilet b WHERE b.otoguzergah = :otoguzergah")
    , @NamedQuery(name = "Bilet.findByHedef", query = "SELECT b FROM Bilet b WHERE b.hedef = :hedef")
    , @NamedQuery(name = "Bilet.findByOtono", query = "SELECT b FROM Bilet b WHERE b.otono = :otono")
    , @NamedQuery(name = "Bilet.findByUcret", query = "SELECT b FROM Bilet b WHERE b.ucret = :ucret")
    , @NamedQuery(name = "Bilet.findByCinsiyet", query = "SELECT b FROM Bilet b WHERE b.cinsiyet = :cinsiyet")})
public class Bilet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ad")
    private String ad;
    @Basic(optional = false)
    @Column(name = "yas")
    private String yas;
    @Basic(optional = false)
    @Column(name = "guncelle")
    private String guncelle;
    @Basic(optional = false)
    @Column(name = "telefon")
    private String telefon;
    @Basic(optional = false)
    @Column(name = "tarihi")
    private String tarihi;
    @Basic(optional = false)
    @Column(name = "koltuk")
    private String koltuk;
    @Basic(optional = false)
    @Column(name = "otoguzergah")
    private String otoguzergah;
    @Basic(optional = false)
    @Column(name = "hedef")
    private String hedef;
    @Basic(optional = false)
    @Column(name = "otono")
    private String otono;
    @Basic(optional = false)
    @Column(name = "ucret")
    private String ucret;
    @Basic(optional = false)
    @Column(name = "cinsiyet")
    private String cinsiyet;

    public Bilet() {
    }

    public Bilet(Integer id) {
        this.id = id;
    }

    public Bilet(Integer id, String ad, String yas, String guncelle, String telefon, String tarihi, String koltuk, String otoguzergah, String hedef, String otono, String ucret, String cinsiyet) {
        this.id = id;
        this.ad = ad;
        this.yas = yas;
        this.guncelle = guncelle;
        this.telefon = telefon;
        this.tarihi = tarihi;
        this.koltuk = koltuk;
        this.otoguzergah = otoguzergah;
        this.hedef = hedef;
        this.otono = otono;
        this.ucret = ucret;
        this.cinsiyet = cinsiyet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        String oldAd = this.ad;
        this.ad = ad;
        changeSupport.firePropertyChange("ad", oldAd, ad);
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        String oldYas = this.yas;
        this.yas = yas;
        changeSupport.firePropertyChange("yas", oldYas, yas);
    }

    public String getGuncelle() {
        return guncelle;
    }

    public void setGuncelle(String guncelle) {
        String oldGuncelle = this.guncelle;
        this.guncelle = guncelle;
        changeSupport.firePropertyChange("guncelle", oldGuncelle, guncelle);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        String oldTelefon = this.telefon;
        this.telefon = telefon;
        changeSupport.firePropertyChange("telefon", oldTelefon, telefon);
    }

    public String getTarihi() {
        return tarihi;
    }

    public void setTarihi(String tarihi) {
        String oldTarihi = this.tarihi;
        this.tarihi = tarihi;
        changeSupport.firePropertyChange("tarihi", oldTarihi, tarihi);
    }

    public String getKoltuk() {
        return koltuk;
    }

    public void setKoltuk(String koltuk) {
        String oldKoltuk = this.koltuk;
        this.koltuk = koltuk;
        changeSupport.firePropertyChange("koltuk", oldKoltuk, koltuk);
    }

    public String getOtoguzergah() {
        return otoguzergah;
    }

    public void setOtoguzergah(String otoguzergah) {
        String oldOtoguzergah = this.otoguzergah;
        this.otoguzergah = otoguzergah;
        changeSupport.firePropertyChange("otoguzergah", oldOtoguzergah, otoguzergah);
    }

    public String getHedef() {
        return hedef;
    }

    public void setHedef(String hedef) {
        String oldHedef = this.hedef;
        this.hedef = hedef;
        changeSupport.firePropertyChange("hedef", oldHedef, hedef);
    }

    public String getOtono() {
        return otono;
    }

    public void setOtono(String otono) {
        String oldOtono = this.otono;
        this.otono = otono;
        changeSupport.firePropertyChange("otono", oldOtono, otono);
    }

    public String getUcret() {
        return ucret;
    }

    public void setUcret(String ucret) {
        String oldUcret = this.ucret;
        this.ucret = ucret;
        changeSupport.firePropertyChange("ucret", oldUcret, ucret);
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        String oldCinsiyet = this.cinsiyet;
        this.cinsiyet = cinsiyet;
        changeSupport.firePropertyChange("cinsiyet", oldCinsiyet, cinsiyet);
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
        if (!(object instanceof Bilet)) {
            return false;
        }
        Bilet other = (Bilet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javabilet.Bilet[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
