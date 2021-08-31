package PackageMyApplication;

/**
 * Topic : core java. Title: MobileRecharge Applications. User Details and Link
 * the plan class.
 * @author Mani
 */
public class User {
	private String phoneNumber;
	private String name;
	private String networkName;
	private MyPlan myplan; // linkage

	/**
	 * @param phoneNumber
	 * @param name
	 * @param netName
	 */
	public User(String phoneNumber, String name, String netName) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.networkName = netName;
	}

	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return networkName
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * @param netName
	 */
	public void setNetworkName(String netName) {
		this.networkName = netName;
	}

	/**
	 */
	public User() {
		super();
	}

	/**
	 * @return myplan
	 */
	public MyPlan getMyplan() {
		return myplan;
	}

	/**
	 * @param myplan
	 */
	public void setMyplan(MyPlan myplan) {
		this.myplan = myplan;
	}

	@Override
	public String toString() {
		return "User [phoneNumber=" + phoneNumber + ", name=" + name + ", networkName=" + networkName + ", myplan="
				+ myplan + "]";
	}

	/**
	 * @param username
	 * @param networkName
	 * @param myplan
	 * @param phoneNumber
	 */
	public User(String username, String networkName, MyPlan myplan, String phoneNumber) {
		super();
		this.name = username;
		this.networkName = networkName;
		this.myplan = myplan;
		this.phoneNumber = phoneNumber;
	}

}
