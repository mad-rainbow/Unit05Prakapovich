package lt.lhu.unit05_02.bean;

public class Customer {

	private String id;
	private String surname;
	private String name;
	private String middleName;
	private String address;
	private String creditCard;
	private String accNumber;

	public Customer() {
		id = "000000000";
		surname = "John";
		name = "Doe";
		middleName = "N/A";
		address = "N/A";
		creditCard = "1234567890123456";
		accNumber = "AA001234567890123456";
	}

	public Customer(String[] ar) {
		id = ar[0];
		surname = ar[1];
		name = ar[2];
		middleName = ar[3];
		address = ar[4];
		creditCard = ar[5];
		accNumber = ar[6];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", middleName=" + middleName
				+ ", address=" + address + ", creditCard=" + creditCard + ", accNumber=" + accNumber + "]";
	}

}
