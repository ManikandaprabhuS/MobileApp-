package PackageMyApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author $Dark
 *
 */
public class MobileRechargeApp implements MyPay {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.print(
				"**********************************************************************************************\n\nWelcome to Online MObileRecharge  Application\n");
		Scanner sc = new Scanner(System.in);
		MobileRechargeApp app = new MobileRechargeApp();
		List<MyPlan> smartPlanList = new ArrayList<>();
		List<MyPlan> dataPlanList = new ArrayList<>();
		List<User> userList = new ArrayList<>();
		String option = "";
		while (!option.equals("Quit")) {
			option = app.showMenu(sc);
			switch (option) {
				case "1":
					app.addingPlanList(sc, smartPlanList, userList, dataPlanList);
					break;
				case "2":
					app.updatePlanList(smartPlanList, userList, dataPlanList, sc);
					break;
				case "3":
					app.calculateMobileRechargePlan(sc, smartPlanList, dataPlanList);
					break;
				case "4":					
					app.removePlanList(sc, smartPlanList, dataPlanList);
					break;
				case "Quit":

					break;
				default:
					System.out.println("Enter correct options");
					break;
			}
		}
		sc.close();
	}

	public void removePlanList(Scanner sc, List<MyPlan> smartPlanList, List<MyPlan> dataPlanList) {
		System.out.println("Choose the Plan to remove it");
		System.out.println("1).SmartPlanList");					
		System.out.println("1).DataPlanList");
		int planno=sc.nextInt();
		try {
		if(planno==1) {
			System.out.println("Enter The PlanType to remove");
			String planType = sc.next();
			int c = 0;
			Iterator<MyPlan> it = smartPlanList.iterator();
			while (it.hasNext()) {
				MyPlan my = it.next();
				if (my.getPackType().equals(planType)) {
					c = 1;
					it.remove();
				}
			} if(c==0) {
				throw new Exception("Sorry, It's Not in PlanList");
			}
			System.out.println(smartPlanList);
			System.out.println("Your PlanType is removed from the SmartPlanRecharge");
		} else {
			System.out.println("Enter The PlanType to remove");
			String planType = sc.next();
			int c = 0;
			Iterator<MyPlan> it = dataPlanList.iterator();
			while (it.hasNext()) {
				MyPlan my = it.next();
				if (my.getPackType().equals(planType)) {
					c = 1;
					it.remove();
				}
			}
			if (c == 0) {
				throw new Exception("Sorry, It's Not in PlanList");
			}
			System.out.println(dataPlanList);
			System.out.println("Your PlanType is removed from the DataRecharge");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void calculateMobileRechargePlan(Scanner sc, List<MyPlan> smartPlanList, List<MyPlan> dataPlanList) {
		System.out.println("Enter The PhoneNumber");
		String phoneNumber = sc.next();
		System.out.println("Enter The Name");
		String name = sc.next();
		System.out.println("Enter the Network Name");
		String networkName = sc.next();
		User user = new User(phoneNumber, name, networkName);
		System.out.println("choose plan to recharge");
		System.out.println("1).SmartRecharge");
		System.out.println("2).DataRecharge");
		int no = sc.nextInt();
		double tax = 6.6;
		double totalAmount = 0;
		int p = 1;
		try {
			if (no == 1) {
				for (int i = 0; i < smartPlanList.size(); i++) {
					System.out
							.println(p + ":" + smartPlanList.get(i).getPackType() + "and" + smartPlanList.get(i).getPlanPrice());
					p++;
				}
				int planno = sc.nextInt();
				System.out.println(
						user.getName() + "Recharge is successfull for PackType : " + smartPlanList.get(planno - 1).getPackType()
								+ " and Amount is --->" + smartPlanList.get(planno - 1).getPlanPrice() + "for your "
								+ user.getNetworkName() + " Number" + user.getPhoneNumber());
				totalAmount = smartPlanList.get(planno - 1).getPlanPrice() + tax;
				System.out.println("The Total Amount is " + totalAmount);
			}
			if (no == 2) {
				for (int i = 0; i < dataPlanList.size(); i++) {
					System.out.println(p + ":" + dataPlanList.get(i).getPackType() + "and" + dataPlanList.get(i).getPlanPrice());
					p++;
				}
				int planno = sc.nextInt();
				System.out.println(
						user.getName() + "Recharge is successfull for PackType : " + dataPlanList.get(planno - 1).getPackType()
								+ " and Amount is --->" + dataPlanList.get(planno - 1).getPlanPrice() + "for your "
								+ user.getNetworkName() + " Number" + user.getPhoneNumber());
				totalAmount = dataPlanList.get(planno - 1).getPlanPrice() + tax;
				System.out.println("The Total Amount is " + totalAmount);
			}

		} catch (Exception e) {
			System.out.println("Enter vaild Options");
		}
	}

	/**
	 * @param smartPlanList
	 * @param userList
	 * @param dataPlanList
	 * @param sc
	 */
	public void updatePlanList(List<MyPlan> smartPlanList, List<User> userList, List<MyPlan> dataPlanList, Scanner sc) {
		System.out.println("Choose Any one to Update Plans");
		System.out.println("1).SmartRecharge Plans");
		System.out.println("2).DataPack Plans");
		int planNumber = sc.nextInt();
		try {
			if (planNumber == 1) {
				System.out.println("Enter MobileRecharge  Plan Name:");
				String name = sc.next();
				System.out.println("Enter the Plan Price: ");
				int planPrice = sc.nextInt();
				int c = 0;
				Iterator<MyPlan> it = smartPlanList.iterator();
				while (it.hasNext()) {
					MyPlan my = it.next();
					if (my.getPackType().equals(name)) {
						c = 1;
						it.remove();
					}
				}
				if (c == 0) {
					throw new Exception("Sorry This is Not in the PlanList");
				}
				smartPlanList.add(new MyPlan(name, planPrice));
				System.out.println(smartPlanList);
				System.out.println("Your SmartRecharge Plan is Edited");
			} else if (planNumber == 2) {
				System.out.println("Enter MobileRecharge  Plan Name:");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the Plan Price: ");
				int planPrice = sc.nextInt();
				for (MyPlan myplan : dataPlanList) {
					if (myplan.getPackType().equals(name)) {
						dataPlanList.remove(myplan);
					}
				}
				System.out.println(dataPlanList);
				System.out.println("Your DataRecharge Plan is Edited");
			} else {
				System.out.println("Enter Vaild number To upadate");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @param sc
	 * @param smartPlanList
	 * @param userList
	 * @param dataPlanList
	 */
	public void addingPlanList(Scanner sc, List<MyPlan> smartPlanList, List<User> userList, List<MyPlan> dataPlanList) {
		System.out.println("Choose Any one to add Plans");
		System.out.println("1).SmartRecharge Plans");
		System.out.println("2).DataPack Plans");
		int planNumber = sc.nextInt();
		if (planNumber == 1) {
			System.out.println("How many Plans you Need to add");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter MobileRecharge  Plan Name:");
				String name = sc.next();
				System.out.println("Enter the Plan Price: ");
				int planPrice = sc.nextInt();
				smartPlanList.add(new MyPlan(name, planPrice));
			}
			System.out.println(smartPlanList);
			System.out.println("SmartRecharge is Added Succssfully");
		} else if (planNumber == 2) {
			System.out.println("How many Plans you Need to add");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter MobileRecharge  Plan Name:");
				String name = sc.next();
				System.out.println("Enter the Plan Price: ");
				int planPrice = sc.nextInt();
				dataPlanList.add(new MyPlan(name, planPrice));
			}
			System.out.println(dataPlanList);
			System.out.println("DataPlanRecharge is Added Succssfully");
		} else {
			System.out.println("Enter Correct Number");
		}
	}

	/**
	 * @param sc
	 * @return option
	 */
	public String showMenu(Scanner sc) {
		String option;
		System.out.println("Choose from below Menu Option");
		System.out.println(" \t\t______________________________________________________________________\r\n");
		System.out.println("\t\t1: Add New MobileRecharge Plan");
		System.out.println("\t\t2: Edit Existing MobileRecharge Plan");
		System.out.println("\t\t3: Calculate Your MobileRecharge Plan");
		System.out.println("\t\t4: Remove Your MobileRecharge Plan");
		System.out.println("\t\tQuit: Stop the program execution.\n");
		System.out.println(" \t\t______________________________________________________________________\r\n");
		System.out.println("Enter Your Option:");
		option = sc.next();
		return option;
	}
}