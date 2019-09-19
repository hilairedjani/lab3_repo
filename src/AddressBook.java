import java.util.HashMap;

/**
 * 
 */

/**
 * @author Hilaire Lewis
 *
 */
public class AddressBook {
	
	private HashMap <String, BuddyInfo> buddyInfos;

	/**
	 * 
	 */
	public AddressBook() {
		buddyInfos = new HashMap<>();
	}
	
	/**
	 * This method adds a new buddy to the buddy info array
	 */
	public void addBuddy(BuddyInfo buddy) {
		buddyInfos.put(buddy.getName(), buddy);
	}
	
	/**
	 * This method removes a new buddy to the buddy info array
	 */
	public void removeBuddy(BuddyInfo buddy) {
		buddyInfos.remove(buddy.getName(), buddy);
	}
	
	/**
	 * This method returns all addresses in the addressbook
	 */
	public HashMap<String, BuddyInfo> getBuddyInfos() {
		return this.buddyInfos;
	}
	
	/**
	 * Main method for AddressBook class
	 */
	public static void main(String [] args) {
		System.out.println("Addess Book");
		
		BuddyInfo newBudy = new BuddyInfo("Test name", "Test address", 999);
		
		AddressBook addresses = new AddressBook();
		addresses.addBuddy(newBudy);
		addresses.removeBuddy(newBudy);
	}

}
