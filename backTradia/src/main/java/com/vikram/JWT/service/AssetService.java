package com.vikram.JWT.service;

import com.vikram.JWT.model.Asset;

import java.util.List;

public interface AssetService {
    List<String> getCluster(String clusterName);
    Asset assignClustertoAsset(Asset a);
    Asset assignPredictedClosingPrice(Asset a);


}
