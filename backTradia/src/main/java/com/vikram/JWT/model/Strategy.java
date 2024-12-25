package com.vikram.JWT.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "strategy")
public class Strategy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idS;
    @Enumerated(EnumType.STRING)
    typeStrategy typeS;
    @ManyToMany
    List<Asset> assets;

    public Long getIdS() {
        return idS;
    }

    public void setIdS(Long idS) {
        this.idS = idS;
    }

    public typeStrategy getTypeS() {
        return typeS;
    }

    public void setTypeS(typeStrategy typeS) {
        this.typeS = typeS;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
