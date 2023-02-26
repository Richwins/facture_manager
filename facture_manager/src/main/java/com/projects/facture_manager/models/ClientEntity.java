package com.projects.facture_manager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity implements Serializable {

    @Id()
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    private String first_name;

    @Column(name = "client_telephone")
    private String telephone;

    @OneToMany
    private List<FactureEntity> factureEntities;
}
