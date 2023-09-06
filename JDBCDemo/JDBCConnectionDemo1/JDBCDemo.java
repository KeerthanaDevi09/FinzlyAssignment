package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Keerthi@123");
		 Statement statement = con.createStatement();
	    Scanner scanner = new Scanner(System.in);
	        while (true) {
	            
	            
	            System.out.println("CRUD Operations using statement:");
	            System.out.println("1. Create (Insert) ");
	            System.out.println("2. Read (Select)");
	            System.out.println("3. Update");
	            System.out.println("4. Delete");
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

	                    String query =   "INSERT INTO login (s_id, s_username, s_password) VALUES (" + id+",'"+username+"',"+password+")";
	                    statement.executeUpdate(query);
	                    System.out.println("Record inserted successfully using Statement.");
	                    break;
	                case 2:

	                    ResultSet resultSet = statement.executeQuery("SELECT * FROM login");

	                    while(resultSet.next()){

	                        System.out.println("ID: "+resultSet.getInt(1)+", Name: "+resultSet.getString(2)+", Password: "+resultSet.getInt(3));
	                    }
	                    break;

	                case 3:

	                    System.out.print("Enter student ID to update: ");
	                    int updateId = scanner.nextInt();
	                    
	                    scanner.nextLine(); // Consume newline
	                    
	                    System.out.print("Enter new student password: ");
	                    String newStudentPassword = scanner.nextLine();

	                    String query1 = "UPDATE login SET s_password=" + newStudentPassword +" WHERE s_id= "+updateId;
	                    statement.executeUpdate(query1);
	                    System.out.println("Record updated successfully using Statement.");
	                    break;
	                case 4:
	                    System.out.print("Enter student ID to delete: ");
	                    int deleteId = scanner.nextInt();
	                    
	                    String query2 = "DELETE FROM login WHERE s_id = " + deleteId;
	                    statement.executeUpdate(query2);
	                    System.out.println("Record deleted successfully using Statement.");
	                     break;
	                
	                 case 5:

	                    scanner.close();
	                    statement.close();
	                    con.close();
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                    break;
	            
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	        
	    }

}
