package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.alpha.model.Asset;


public interface AssetRepository extends JpaRepository<Asset, String> {
//	@Query(value="select * from Asset",nativeQuery = true)
//	List<Asset> getAsset();
}
