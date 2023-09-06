package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCDemo1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Keerthi@123");
	    PreparedStatement preparedStatement =con.prepareStatement(  "INSERT INTO login (s_id, s_username, s_password) VALUES (?, ?, ?)");
	    Scanner scanner = new Scanner(System.in);

	    while (true) {
	            
	    		System.out.println("CRUD Operations uing Prepared statement:");
	            System.out.println("1. Create (Insert) ");
	            System.out.println("2. Read (Select)");
	            System.out.println("3. Update using PreparedStatement");
	            System.out.println("4. Delete using PreparedStatement");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	           
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {

	                case 1:

	                    System.out.print("Enter student ID: ");
	                    int id = scanner.nextInt();
	                        
	                    scanner.nextLine(); 

	                    System.out.print("Enter student username: ");
	                    String username = scanner.nextLine();
	                        
	                    System.out.print("Enter student password: ");
	                    String password = scanner.nextLine();

	                    preparedStatement = con.prepareStatement(  "INSERT INTO login (s_id, s_username, s_password) VALUES (?, ?, ?)");

	                    preparedStatement.setInt(1, id);
	                    preparedStatement.setString(2, username);
	                    preparedStatement.setString(3, password);
	                    preparedStatement.executeUpdate();

	                    System.out.println("Record inserted successfully");

	                    break;

	                case 2:

	                    ResultSet resultSet = preparedStatement.executeQuery("SELECT * FROM login");

	                    while(resultSet.next()){

	                        System.out.println("ID: "+resultSet.getInt(1)+", Name: "+resultSet.getString(2)+ ", Password: "+resultSet.getInt(3));
	                    }


	                    break;

	                case 3:

	                    System.out.print("Enter student ID to update: ");
	                    int updateId = scanner.nextInt();
	                    
	                    scanner.nextLine(); 
	                    
	                    System.out.print("Enter new student password: ");
	                    String newStudentPassword = scanner.nextLine();

	                    
	                    preparedStatement = con.prepareStatement("UPDATE login SET s_password = ? WHERE s_id = ?");

	                                       
	                    preparedStatement.setString(1,newStudentPassword );
	                    preparedStatement.setInt(2, updateId);

	                    preparedStatement.executeUpdate();

	                    System.out.println("Record updated successfully");
	                   break;
	                
	                case 4:

	                    System.out.print("Enter student ID to delete: ");
	                    int deleteId = scanner.nextInt();
	                    preparedStatement = con.prepareStatement( "DELETE FROM login WHERE s_id= ?");
	                    preparedStatement.setInt(1, deleteId);
	                    preparedStatement.executeUpdate();
	                    System.out.println("Record deleted successfully using preparedStatement.");
	                    break;
	                

	                case 5:

	                    scanner.close();
	                    preparedStatement.close();
	                    con.close();
	                    System.out.println("Exiting");
	                    System.exit(0);
	                    break;
	            
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	        
	    }
	}


