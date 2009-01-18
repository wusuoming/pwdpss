package com.elongway.pss.dto.custom;
/**
 * µç¼ÛDto
 * @author goodluck
 *
 */
public class SalePriceDto {
	private double farmPrice = 0D;
	private double producePrice = 0D;
	private double peoplePrice = 0D;
	private double industryPrice = 0D;
	private double notPeople = 0D;
	private double businessPrice  = 0D;
	public double getFarmPrice() {
		return farmPrice;
	}
	public void setFarmPrice(double farmPrice) {
		this.farmPrice = farmPrice;
	}
	public double getProducePrice() {
		return producePrice;
	}
	public void setProducePrice(double producePrice) {
		this.producePrice = producePrice;
	}
	public double getPeoplePrice() {
		return peoplePrice;
	}
	public void setPeoplePrice(double peoplePrice) {
		this.peoplePrice = peoplePrice;
	}
	public double getIndustryPrice() {
		return industryPrice;
	}
	public void setIndustryPrice(double industryPrice) {
		this.industryPrice = industryPrice;
	}
	public double getNotPeople() {
		return notPeople;
	}
	public void setNotPeople(double notPeople) {
		this.notPeople = notPeople;
	}
	public double getBusinessPrice() {
		return businessPrice;
	}
	public void setBusinessPrice(double businessPrice) {
		this.businessPrice = businessPrice;
	}
}
