package mgstation;
// Generated 1 mars 2017 15:29:17 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Prix generated by hbm2java
 */
@Entity
@Table(name="prix"
    ,schema="public"
)
public class Prix  implements java.io.Serializable {


     private int idprix;
     private Produit produit;
     private Double prix;
     private Date date;

    public Prix() {
    }

	
    public Prix(int idprix, Produit produit) {
        this.idprix = idprix;
        this.produit = produit;
    }
    public Prix(int idprix, Produit produit, Double prix, Date date) {
       this.idprix = idprix;
       this.produit = produit;
       this.prix = prix;
       this.date = date;
    }
   
     @Id 

    
    @Column(name="idprix", unique=true, nullable=false)
    public int getIdprix() {
        return this.idprix;
    }
    
    public void setIdprix(int idprix) {
        this.idprix = idprix;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idproduit", nullable=false)
    public Produit getProduit() {
        return this.produit;
    }
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    
    @Column(name="prix", precision=17, scale=17)
    public Double getPrix() {
        return this.prix;
    }
    
    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", length=13)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


