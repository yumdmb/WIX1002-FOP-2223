package lab8.tutorial;

public class Connection { //Class connection	

	private static int cnt = 0;   //Static instance variable


public Connection() {
	cnt++;}

public void disconnect() {
	cnt--; }


public void display() 
{
	System.out.println("The number of connection is:" + cnt);
}
}			//Connection obj = new Connection() 
			//the obj of theclass is created in ester program
