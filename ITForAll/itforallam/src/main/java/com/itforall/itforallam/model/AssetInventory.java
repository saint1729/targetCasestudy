package com.itforall.itforallam.model;

import org.springframework.data.annotation.Id;

public class AssetInventory {


    @Id
    private Long assetInventoryId;
    private Long assetId;
    private Long totalAssetCount;

	/**
	 * @return the assetInventoryId
	 */
	public Long getAssetInventoryId() {
		return assetInventoryId;
	}
	/**
	 * @param assetInventoryId the assetInventoryId to set
	 */
	public void setAssetInventoryId(Long assetInventoryId) {
		this.assetInventoryId = assetInventoryId;
	}
	/**
	 * @return the assetId
	 */
	public Long getAssetId() {
		return assetId;
	}
	/**
	 * @param assetId the assetId to set
	 */
	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}
	/**
	 * @return the totalAssetCount
	 */
	public Long getTotalAssetCount() {
		return totalAssetCount;
	}
	/**
	 * @param totalAssetCount the totalAssetCount to set
	 */
	public void setTotalAssetCount(Long totalAssetCount) {
		this.totalAssetCount = totalAssetCount;
	}

    
    
}
