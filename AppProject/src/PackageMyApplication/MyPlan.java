package PackageMyApplication;

/**
 * Topic : core java. Title: MobileRecharge Applications. Myplan class contain
 * the types of plan type, price and totalprice.
 * @author Mani.
 */
public class MyPlan {
	private String packType;
	private int planPrice;
	private int noOfRecharge;
	private double totalPrice;

	/**
	 * @return packType
	 */
	public String getPackType() {
		return packType;
	}

	/**
	 * @param packTypes
	 */
	public void setPackType(String packTypes) {
		this.packType = packTypes;
	}

	/**
	 * @return planPrice
	 */
	public int getPlanPrice() {
		return planPrice;
	}

	/**
	 * @param planPrices
	 */
	public void setPlanPrice(int planPrices) {
		this.planPrice = planPrices;
	}

	/**
	 * @return noOfRecharge
	 */
	public int getNoOfRecharge() {
		return noOfRecharge;
	}

	/**
	 * @param noOfRecharges
	 */
	public void setNoOfRecharge(int noOfRecharges) {
		this.noOfRecharge = noOfRecharges;
	}

	/**
	 * @return totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalpriceParam
	 */
	public void setTotalPrice(double totalpriceParam) {
		this.totalPrice = totalpriceParam;
	}

	/**
	 * @param packTypes
	 * @param planPrices
	 * @param totalPrices
	 * @param noOfRecharges
	 */
	public MyPlan(String packTypes, int planPrices, double totalPrices, int noOfRecharges) {
		super();
		this.packType = packTypes;
		this.planPrice = planPrices;
		this.noOfRecharge = noOfRecharges;
		this.totalPrice = totalPrices;
	}

	/**
	 * @param packTypes
	 * @param planPrices
	 */
	public MyPlan(String packTypes, int planPrices) {
		super();
		this.packType = packTypes;
		this.planPrice = planPrices;
	}

	/**
	 */
	public MyPlan() {
		super();
	}

	@Override
	public String toString() {
		return "MyPlan [packType=" + packType + ", planPrice=" + planPrice + "]";
	}

}
