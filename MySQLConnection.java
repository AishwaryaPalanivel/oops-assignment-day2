package week3.day2.ass1;

public abstract class MySQLConnection implements DataBaseConnection{

	public void connect() {
		
		System.out.println("Connect");
	}

	
	
	public abstract void executeQuery();
	{

}
}