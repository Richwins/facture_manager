package com.projects.facture_manager.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ligne_facture")
@Data
@ToString
public class LigneFactureEntity implements Serializable {

    @EmbeddedId
    private LigneFactureKey id;

    @ManyToOne()
    @MapsId("produitId")
    @JoinColumn(name = "produit_id")
    private ProduitEntity produit;

    @ManyToOne()
    @MapsId("factureId")
    @JoinColumn(name = "facture_id")
    private FactureEntity facture;

    private double quantite;
}
