package com.vikram.JWT.service;

import com.vikram.JWT.model.Asset;
import com.vikram.JWT.model.Cluster;
import com.vikram.JWT.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class AssetServiceImp implements AssetService {
    @Autowired
    AssetRepository assetRepository;
    private final RestTemplate restTemplate = new RestTemplate();
    private final String flaskEndpoint = "http://localhost:5000/get_clusters";
    @Override
    public List<String> getCluster(String clusterName) {
        Map<String, List<String>> allClusters = restTemplate.getForObject(flaskEndpoint, Map.class);

        return allClusters.get(clusterName);
    }

    @Override
    public Asset assignClustertoAsset(Asset asset) {
        List<String> clusterA = getCluster("compartiment_A");
        List<String> clusterB = getCluster("compartiment_B");

        if (clusterA != null && clusterA.contains(asset.getNameAsset())) {
            asset.setCluster(Cluster.A);
        } else if (clusterB != null && clusterB.contains(asset.getNameAsset())) {
            asset.setCluster(Cluster.B);
        } else {
            asset.setCluster(Cluster.S); // Default cluster
        }

        return asset;
    }

    @Override
    public Asset assignPredictedClosingPrice(Asset a) {
        return null;
    }
}

