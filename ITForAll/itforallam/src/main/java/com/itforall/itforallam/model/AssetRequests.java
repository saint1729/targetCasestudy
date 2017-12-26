package com.itforall.itforallam.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class AssetRequests {

    @Id
    private Long requestId;
    private Long assetId;
    private Long employeeId;
    private Date requestDate;
    private Date fulfilmentDate;
    private Date expFulfilmentDate;
    private String requestStatus;

    /**
	 * @return the requestId
	 */
	public Long getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
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
	 * @return the employeeId
	 */
	public Long getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}
	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	/**
	 * @return the fulfilmentDate
	 */
	public Date getFulfilmentDate() {
		return fulfilmentDate;
	}
	/**
	 * @param fulfilmentDate the fulfilmentDate to set
	 */
	public void setFulfilmentDate(Date fulfilmentDate) {
		this.fulfilmentDate = fulfilmentDate;
	}
	/**
	 * @return the expFulfilmentDate
	 */
	public Date getExpFulfilmentDate() {
		return expFulfilmentDate;
	}
	/**
	 * @param expFulfilmentDate the expFulfilmentDate to set
	 */
	public void setExpFulfilmentDate(Date expFulfilmentDate) {
		this.expFulfilmentDate = expFulfilmentDate;
	}
	/**
	 * @return the requestStatus
	 */
	public String getRequestStatus() {
		return requestStatus;
	}
	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

}