package com.vikram.JWT.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "asset")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAsset;
    String nameAsset;
    @ElementCollection(fetch = FetchType.LAZY)
    private List<Float> closePrices = new ArrayList<>();
    @ElementCollection(fetch = FetchType.LAZY)
    private List<Float> predictedClosePrices = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    Cluster cluster;
    Date date;

    @ManyToMany
    List<Strategy> strategies;
    @ManyToMany
    List<Portfolio> portfolios;

    public Long getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(Long idAsset) {
        this.idAsset = idAsset;
    }

    public String getNameAsset() {
        return nameAsset;
    }

    public void setNameAsset(String nameAsset) {
        this.nameAsset = nameAsset;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Strategy> getStrategies() {
        return strategies;
    }

    public void setStrategies(List<Strategy> strategies) {
        this.strategies = strategies;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public List<Float> getClosePrices() {
        return closePrices;
    }

    public void setClosePrices(List<Float> closePrices) {
        this.closePrices = closePrices;
    }

    public List<Float> getPredictedClosePrices() {
        return predictedClosePrices;
    }

    public void setPredictedClosePrices(List<Float> predictedClosePrices) {
        this.predictedClosePrices = predictedClosePrices;
    }
}
