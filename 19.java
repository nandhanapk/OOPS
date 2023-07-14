package pkg;
import java.util.*;
public class authentication {


	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String username="Nandhana";
		String password="password";
		System.out.println("Enter the username:");
		String u=sc.next();
		System.out.println("Enter the password");
		String p=sc.next();
		try
		{
			if(((u.equals(username))&&(p.equals(password))))
					{
				System.out.println("Access Granted");
				
					}
			else
			{
				throw new credexception("Invalid Credentials");
			}
		}
		catch(credexception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}
	


