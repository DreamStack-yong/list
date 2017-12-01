package javaweb;

import java.util.Date;

public class Syste {

}
class user{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	private String tel;
}
class order{
	private String orderId;
	private Date orderDate;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
class ticket{
	private String tiketNum;
	private Date ticketDte;
	public String getTiketNum() {
		return tiketNum;
	}
	public void setTiketNum(String tiketNum) {
		this.tiketNum = tiketNum;
	}
	public Date getTicketDte() {
		return ticketDte;
	}
	public void setTicketDte(Date ticketDte) {
		this.ticketDte = ticketDte;
	}
}
class maker{
	private String makLocation;
	public String getMakLocation() {
		return makLocation;
	}
	public void setMakLocation(String makLocation) {
		this.makLocation = makLocation;
	}
	public String getMakTel() {
		return makTel;
	}
	public void setMakTel(String makTel) {
		this.makTel = makTel;
	}
	private String makTel;
}
class info{
	private String infoContent;
	public String getInfoContent() {
		return infoContent;
	}
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}
	public Integer getInfoLevel() {
		return infoLevel;
	}
	public void setInfoLevel(Integer infoLevel) {
		this.infoLevel = infoLevel;
	}
	private Integer infoLevel;
}