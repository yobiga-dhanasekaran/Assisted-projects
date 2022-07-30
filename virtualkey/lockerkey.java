package virtualkey;
import java.util.Scanner;
import java.io.IOException;
public class lockerkey {
	public static void main(String[] args) throws IOException {
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("\t VIRTUAL KEY");
		
		
		while(true)
		{
			System.out.println("Please choose one of the following options :");
			System.out.println("1. List Current Files");
			System.out.println("2. Business Operations");
			System.out.println("3. Close Application");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			case 1: //List function feature to list all files in ascending order.
				businessoperation.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose one of the following options :");
					System.out.println("1. To Add a File");
					System.out.println("2. To Delete a File");
					System.out.println("3. To Search for a File");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("exception occured");  
	                  }          
					switch(choice)
					{
					case 1:
						//Creation of a file takes place
						System.out.println("Enter the Name of a file to be Created: ");
						String fileCreate = sc.next();
						
						// Calling the function to create the file
						businessoperation.createFile(fileCreate);
						break;
						
					case 2:
						//deletion of a file takes place
						System.out.print("Enter the Name of a File to be Deleted: ");
						String fileDelete = sc.next();
						
						// Calling the function to delete the file
						businessoperation.deleteFile(fileDelete);
						break;
					case 3:
						//Search for a file takes place
						System.out.println("Enter the Name of a File to be Searched: ");
						String fileSearch = sc.next();
						
						// Calling the function to search the file
						businessoperation.searchFile(fileSearch);
						break;
						
				default:
						//In the case of unprecedented input execute this
						System.out.println("Invalid process!!");
						break;
				}
			
					break;
			case 3:
				
				//Voluntarily exiting the application
				sc.close();
				System.out.println("\n It was nice having you here!!");
				System.exit(1);
				break;
			
			default:
				//In the case of unprecedented input execute this
				System.out.println(" !!Invalid Input!!");
				break;
			
			}
		}
		
	}

}
