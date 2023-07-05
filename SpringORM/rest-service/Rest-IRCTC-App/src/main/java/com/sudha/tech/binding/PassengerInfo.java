package com.sudha.tech.binding;

public class PassengerInfo {

	private String name;
	private Long phno;
	private String jdate;
	private String from;
	private String to;
	private Integer trainNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getJdate() {
		return jdate;
	}

	public void setJdate(String jdate) {
		this.jdate = jdate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}

	@Override
	public String toString() {
		return "PassengerInfo [name=" + name + ", phno=" + phno + ", jdate=" + jdate + ", from=" + from + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}

}
