import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Hilaire Lewis
 *
 */
public class AddressBook {
	
	private List <BuddyInfo> buddyInfos;

	/**
	 * 
	 */
	public AddressBook() {
		buddyInfos = new ArrayList<BuddyInfo>();
	}
	
	/**
	 * This method adds a new buddy to the buddy info array
	 */
	public void addBuddy(BuddyInfo buddy) {
		buddyInfos.add(buddy);
	}
	
	/**
	 * This method removes a new buddy to the buddy info array
	 */
	public BuddyInfo removeBuddy(int index) {
		if(index >= 0 && index < this.buddyInfos.size()) {
			return this.buddyInfos.remove(index);
		}
		return null;
	}
	
	/**
	 * This method returns all addresses in the address book
	 */
	public List<BuddyInfo> getBuddyInfos() {
		return this.buddyInfos;
	}
	
	/**
	 * Give the size of the address book
	 * @return An integer representing the number of elements in the address book
	 */
	public int size() {
		return this.buddyInfos.size();	
	}
	
	
	
	/**
	 * Main method for AddressBook class
	 */
	public static void main(String [] args) {
		System.out.println("Addess Book");
		
		BuddyInfo newBudy = new BuddyInfo("Test name", "Test address", 999);
		
		AddressBook addresses = new AddressBook();
		addresses.addBuddy(newBudy);
		addresses.removeBuddy(0);
	}

}
