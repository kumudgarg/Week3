package com.bridgelab.Oops.AddressBookManagement.model;

public class Addressbook 
{
	private String ad;
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String State;
	private long Zip;
	private long PhoneNumber ;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Long getZip() {
		return Zip;
	}
	public void setZip(long zip) {
		Zip = zip;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", Zip=" + Zip + ", PhoneNumber=" + PhoneNumber + "]";
	}
}


