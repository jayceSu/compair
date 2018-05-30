package com.adeng.compair.entity;

import java.util.Date;

/**
 * 路单站点时间
 * 
 * @author Administrator
 * 
 */
public class BookSheetTrip {
	private Integer id;
	private Integer bookSheetId;
	private String tripId;
	private Integer orderId;
	private Integer pickupLocationId;
	private Integer deliveryLocationId;
	private Date pickupArriveTime;
	private Date pickupLeaveTime;
	private Date deliveryArriveTime;
	private Date deliveryLeaveTime;
	private Integer routeId;
	private Date createDate;
	private Integer createUserId;
	private Date lastUpdateDate;
	private Integer lastUpdateUserId;
	private Integer seq;
	private Integer lcmLocId;
	private Date lcmArriveTime;
	private Date lcmLeaveTime;
	private Integer distance;

	public BookSheetTrip() {
		super();
	}

	public BookSheetTrip(Integer id, Integer bookSheetId, String tripId,
			Integer orderId, Integer pickupLocationId,
			Integer deliveryLocationId, Date pickupArriveTime,
			Date pickupLeaveTime, Date deliveryArriveTime,
			Date deliveryLeaveTime, Integer routeId, Date createDate,
			Integer createUserId, Date lastUpdateDate,
			Integer lastUpdateUserId, Integer seq, Integer lcmLocId,
			Date lcmArriveTime, Date lcmLeaveTime, Integer distance) {
		super();
		this.id = id;
		this.bookSheetId = bookSheetId;
		this.tripId = tripId;
		this.orderId = orderId;
		this.pickupLocationId = pickupLocationId;
		this.deliveryLocationId = deliveryLocationId;
		this.pickupArriveTime = pickupArriveTime;
		this.pickupLeaveTime = pickupLeaveTime;
		this.deliveryArriveTime = deliveryArriveTime;
		this.deliveryLeaveTime = deliveryLeaveTime;
		this.routeId = routeId;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.seq = seq;
		this.lcmLocId = lcmLocId;
		this.lcmArriveTime = lcmArriveTime;
		this.lcmLeaveTime = lcmLeaveTime;
		this.distance = distance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBookSheetId() {
		return bookSheetId;
	}

	public void setBookSheetId(Integer bookSheetId) {
		this.bookSheetId = bookSheetId;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getPickupLocationId() {
		return pickupLocationId;
	}

	public void setPickupLocationId(Integer pickupLocationId) {
		this.pickupLocationId = pickupLocationId;
	}

	public Integer getDeliveryLocationId() {
		return deliveryLocationId;
	}

	public void setDeliveryLocationId(Integer deliveryLocationId) {
		this.deliveryLocationId = deliveryLocationId;
	}

	public Date getPickupArriveTime() {
		return pickupArriveTime;
	}

	public void setPickupArriveTime(Date pickupArriveTime) {
		this.pickupArriveTime = pickupArriveTime;
	}

	public Date getPickupLeaveTime() {
		return pickupLeaveTime;
	}

	public void setPickupLeaveTime(Date pickupLeaveTime) {
		this.pickupLeaveTime = pickupLeaveTime;
	}

	public Date getDeliveryArriveTime() {
		return deliveryArriveTime;
	}

	public void setDeliveryArriveTime(Date deliveryArriveTime) {
		this.deliveryArriveTime = deliveryArriveTime;
	}

	public Date getDeliveryLeaveTime() {
		return deliveryLeaveTime;
	}

	public void setDeliveryLeaveTime(Date deliveryLeaveTime) {
		this.deliveryLeaveTime = deliveryLeaveTime;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Integer lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getLcmLocId() {
		return lcmLocId;
	}

	public void setLcmLocId(Integer lcmLocId) {
		this.lcmLocId = lcmLocId;
	}

	public Date getLcmArriveTime() {
		return lcmArriveTime;
	}

	public void setLcmArriveTime(Date lcmArriveTime) {
		this.lcmArriveTime = lcmArriveTime;
	}

	public Date getLcmLeaveTime() {
		return lcmLeaveTime;
	}

	public void setLcmLeaveTime(Date lcmLeaveTime) {
		this.lcmLeaveTime = lcmLeaveTime;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "BookSheetTrip [id=" + id + ", bookSheetId=" + bookSheetId
				+ ", tripId=" + tripId + ", orderId=" + orderId
				+ ", pickupLocationId=" + pickupLocationId
				+ ", deliveryLocationId=" + deliveryLocationId
				+ ", pickupArriveTime=" + pickupArriveTime
				+ ", pickupLeaveTime=" + pickupLeaveTime
				+ ", deliveryArriveTime=" + deliveryArriveTime
				+ ", deliveryLeaveTime=" + deliveryLeaveTime + ", routeId="
				+ routeId + ", createDate=" + createDate + ", createUserId="
				+ createUserId + ", lastUpdateDate=" + lastUpdateDate
				+ ", lastUpdateUserId=" + lastUpdateUserId + ", seq=" + seq
				+ ", lcmLocId=" + lcmLocId + ", lcmArriveTime=" + lcmArriveTime
				+ ", lcmLeaveTime=" + lcmLeaveTime + ", distance=" + distance
				+ "]";
	}

}
