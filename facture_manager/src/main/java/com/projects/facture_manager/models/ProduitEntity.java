package com.projects.facture_manager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitEntity implements Serializable {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String labelle;

    @Column(nullable = false)
    private String ref;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private double quantity_stock;

    @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<LigneFactureEntity> factureEntities;
}
