package com.adeng.compair.entity;


/**
 * 路单对应订单
 * 
 * @author Administrator
 * 
 */
public class BookingSheetOrder {
	private Integer id;// 主键ID(PK)
	private Integer bookingSheetId;// 调度单ID(FK)
	private Integer orderId;// 订单ID(FK)
	private Character isLate;// 是否迟到(0为准时、1为迟到)
	private Character orderType;// 订单状态(2已调度、3已发运、4已完成)
	private String orderSchedulingTime;// 订单调度时间
	private String orderShippingTime;// 订单发运时间
	private String orderCompleteTime;// 订单完成时间
	private String actualDeliveryTime;// 系统实际到货时间
	private Character isDamag;// 是否破损(0为否、1为是)
	private String actualPickupTime;// 系统实际提货时间

	public BookingSheetOrder() {
		super();
	}

	public BookingSheetOrder(Integer id, Integer bookingSheetId,
			Integer orderId, Character isLate, Character orderType,
			String orderSchedulingTime, String orderShippingTime,
			String orderCompleteTime, String actualDeliveryTime,
			Character isDamag, String actualPickupTime) {
		super();
		this.id = id;
		this.bookingSheetId = bookingSheetId;
		this.orderId = orderId;
		this.isLate = isLate;
		this.orderType = orderType;
		this.orderSchedulingTime = orderSchedulingTime;
		this.orderShippingTime = orderShippingTime;
		this.orderCompleteTime = orderCompleteTime;
		this.actualDeliveryTime = actualDeliveryTime;
		this.isDamag = isDamag;
		this.actualPickupTime = actualPickupTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBookingSheetId() {
		return bookingSheetId;
	}

	public void setBookingSheetId(Integer bookingSheetId) {
		this.bookingSheetId = bookingSheetId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Character getIsLate() {
		return isLate;
	}

	public void setIsLate(Character isLate) {
		this.isLate = isLate;
	}

	public Character getOrderType() {
		return orderType;
	}

	public void setOrderType(Character orderType) {
		this.orderType = orderType;
	}

	public String getOrderSchedulingTime() {
		return orderSchedulingTime;
	}

	public void setOrderSchedulingTime(String orderSchedulingTime) {
		this.orderSchedulingTime = orderSchedulingTime;
	}

	public String getOrderShippingTime() {
		return orderShippingTime;
	}

	public void setOrderShippingTime(String orderShippingTime) {
		this.orderShippingTime = orderShippingTime;
	}

	public String getOrderCompleteTime() {
		return orderCompleteTime;
	}

	public void setOrderCompleteTime(String orderCompleteTime) {
		this.orderCompleteTime = orderCompleteTime;
	}

	public String getActualDeliveryTime() {
		return actualDeliveryTime;
	}

	public void setActualDeliveryTime(String actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}

	public Character getIsDamag() {
		return isDamag;
	}

	public void setIsDamag(Character isDamag) {
		this.isDamag = isDamag;
	}

	public String getActualPickupTime() {
		return actualPickupTime;
	}

	public void setActualPickupTime(String actualPickupTime) {
		this.actualPickupTime = actualPickupTime;
	}

	@Override
	public String toString() {
		return "bookingSheetOrder [id=" + id + ", bookingSheetId="
				+ bookingSheetId + ", orderId=" + orderId + ", isLate="
				+ isLate + ", orderType=" + orderType
				+ ", orderSchedulingTime=" + orderSchedulingTime
				+ ", orderShippingTime=" + orderShippingTime
				+ ", orderCompleteTime=" + orderCompleteTime
				+ ", actualDeliveryTime=" + actualDeliveryTime + ", isDamag="
				+ isDamag + ", actualPickupTime=" + actualPickupTime + "]";
	}

}
