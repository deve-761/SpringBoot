package com.sudha.tech;

public class Order {

	private Integer orderId;
	private String orderBy;
	private String orderStatus;
	private Double billamt;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getBillamt() {
		return billamt;
	}

	public void setBillamt(Double billamt) {
		this.billamt = billamt;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderBy=" + orderBy + ", orderStatus=" + orderStatus + ", billamt="
				+ billamt + "]";
	}

}
