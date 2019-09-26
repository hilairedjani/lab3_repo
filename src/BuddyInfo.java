
public class BuddyInfo {
	
	// Instance variables
	private String name;
	private String address;
	private int phoneNumber;
	
	/**
	 * Default constructor
	 */
	public BuddyInfo() {
		this.name = "";
		this.address = "";
		this.phoneNumber = 999;
	}
	
	/**
	 * Overloaded Constructor
	 */
	public BuddyInfo(String name, String address, int phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @return the name of buddy
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set for the buddy
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Equals method
	 */
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(!(o instanceof BuddyInfo)) return false;
		BuddyInfo bi = (BuddyInfo)o;
		return (bi.name.equals(this.name) && bi.address.equals(this.address) && bi.phoneNumber == this.phoneNumber);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello world!");
		BuddyInfo myguy = new BuddyInfo();
		myguy.setName("Franck");
		
		System.out.println("Hello " + myguy.getName());
		
	}

}
