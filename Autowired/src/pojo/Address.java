package pojo;

public class Address {
private String house_no;
public String getHouse_no() {
	return house_no;
}
public void setHouse_no(String house_no) {
	this.house_no = house_no;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
private String city;
private int pincode;

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+house_no +" "+city+" " +pincode;
	}
}
