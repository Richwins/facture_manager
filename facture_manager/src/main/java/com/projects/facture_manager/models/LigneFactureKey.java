package com.projects.facture_manager.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LigneFactureKey implements Serializable {

    @Column(name ="facture_id" )
    private Integer factureId;
    @Column(name = "produit_id")
    private Integer produitId;
}
