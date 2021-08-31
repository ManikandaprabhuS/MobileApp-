package PackageMyApplication;

import java.util.List;
import java.util.Scanner;

/**
 * Here we will declare the method what we used in Main method. Topic : core
 * java.
 * @author mani.
 */
public interface MyPay {
	/**
	 * @param sc
	 * @return option
	 */
	String showMenu(Scanner sc);

	/**
	 * @param sc
	 * @param smartPlanList
	 * @param userList
	 * @param dataPlanList
	 */
	void addingPlanList(Scanner sc, List<MyPlan> smartPlanList, List<User> userList, List<MyPlan> dataPlanList);

	/**
	 * @param smartPlanList
	 * @param userList
	 * @param dataPlanList
	 * @param sc
	 */
	void updatePlanList(List<MyPlan> smartPlanList, List<User> userList, List<MyPlan> dataPlanList, Scanner sc);

	public void removePlanList(Scanner sc, List<MyPlan> smartPlanList, List<MyPlan> dataPlanList);

	public void calculateMobileRechargePlan(Scanner sc, List<MyPlan> smartPlanList, List<MyPlan> dataPlanList);
}
