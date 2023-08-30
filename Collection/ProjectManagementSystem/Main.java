package Collection.project;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Project> pro=new HashMap<>();
		int id=1;
		while(true)
		{
			System.out.println("Project Management System \n Add Project \n 2. Assign team members to project \n 3. view project details \n 4. List all projects \n 5. Exit");
			System.out.println("Enter the option: ");
			int option=sc.nextInt();
			sc.nextLine();
			if(option==1)
			{
				System.out.println("Enter the project name: ");
				String name=sc.nextLine();
				System.out.println("Enter project describtion: ");
				String describe=sc.nextLine();
				Project p=new Project(id,name,describe);
				pro.put(id, p);
				id++;
				System.out.println("Project added successfully");
			}
			else if(option==2)
			{
				 System.out.print("Enter Project ID: ");
                 int projectId = sc.nextInt();
                 sc.nextLine();
                 if (pro.containsKey(projectId)) {
                     Project assignProject = pro.get(projectId);
                     System.out.print("Enter Team Member Name to Assign: ");
                     String teamMemberName = sc.nextLine();
                     assignProject.addTeamMember(teamMemberName);
                     System.out.println("Team member assigned successfully.");
                 } else {
                     System.out.println("Project with ID " + projectId + " not found.");
                 }
			}
			else if(option==3)
			{
				System.out.print("Enter Project ID to view details: ");
                int viewProjectId = sc.nextInt();
                if (pro.containsKey(viewProjectId)) {
                    Project viewProject = pro.get(viewProjectId);
                    System.out.println("Project Details:");
                    System.out.println(viewProject.toString());
                } else {
                    System.out.println("Project with ID " + viewProjectId + " not found.");
                }
			}
			else if(option==4)
			{
				System.out.println("All Projects:");
                for (Project p : pro.values()) {
                    System.out.println(p);
                    System.out.println("------------------------------------------------------------");
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
