package Collection.hospital;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Patient> hosp=new HashMap<>();
		int patientId=1;
		while(true)
		{
			System.out.println("Hospital Management System \n 1. Add Patient \n 2.View patient details \n 3. Search patient by ID \n 4. List All patients \n 5.Exit\n");
			System.out.println("Enter the option: ");
			int option=sc.nextInt();
			sc.nextLine();
			if(option==1)
			{
				System.out.println("Enter patient name: ");
				String patientName=sc.nextLine();
				System.out.println("Enetr age of the patient: ");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter patient gender(F/M): ");
				String gender=sc.next();
				sc.nextLine();
				System.out.println("Enter the diagnosis: ");
				String diagnosis=sc.nextLine();
				Patient p=new Patient(patientId,patientName,age,gender,diagnosis);
				hosp.put(patientId, p);
				patientId++;
				System.out.println("Patient Details Added Successfully");
			}
			else if(option==2)
			{
				System.out.println("Enter patient Id");
				int viewId=sc.nextInt();
				if (hosp.containsKey(viewId)) {
                   // Patient viewPatient = hosp.get(viewId);
                    System.out.println("Patient Details:");
                    System.out.println(hosp.get(viewId));
                } else {
                    System.out.println("Patient with ID " + viewId + " not found.");
                }
			}
			else if(option==3)
			{
				System.out.println("Enter patient Id");
				int searchId=sc.nextInt();
				if (hosp.containsKey(searchId)) {
                   // Patient viewPatient = hosp.get(viewId);
                    System.out.println("Patient Details:");
                    System.out.println(hosp.get(searchId));
                } else {
                    System.out.println("Patient with ID " + searchId + " not found.");
                }
			}
			else if(option==4)
			{
				System.out.println("All patient List");
				for(Patient pp:hosp.values())
				{
					System.out.println(pp.toString());
					System.out.println("-------------------------------------------------------------------");
				}
			}
			else if(option==5)
			{
				System.out.println("Exit");
				sc.close();
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid option. Please choose the correct option");
			}
		}

	}

}
