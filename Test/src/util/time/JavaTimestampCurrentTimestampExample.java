package util.time;
import java.sql.*;
import java.util.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
 * Prepare Database 
create database date_time_tests;
create table datetests (
		  date1 date,
		  timestamp1 timestamp,
		  timestamp2 timestamp
		);
*/
public class JavaTimestampCurrentTimestampExample
{
	static Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");

	public static Connection getConnection() throws ClassNotFoundException {
	    String myDriver = "com.mysql.jdbc.Driver";
	    String myUrl = "jdbc:mysql://localhost/date_time_tests";
	    Class.forName(myDriver);
	    Connection connection = null;
		try {
			connection = DriverManager.getConnection(myUrl, "root", "apmsetup");
			logger.info("connection {}", connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error Occur!");
			System.out.print(e.getMessage());
	
		}
		    
		return connection;
		  
	}
  
	public static java.sql.Timestamp getTimeStmap() {
	  
	  Calendar calendar = Calendar.getInstance();
	  java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());
	  return ourJavaTimestampObject;
	  
	}
  
	  public static void insertTime(Connection connection, java.sql.Timestamp ourJavaTimestampObject) throws SQLException {
	    String sqlTimestampInsertStatement = "INSERT INTO datetests (timestamp2) VALUES (?)";
	    PreparedStatement preparedStatement = connection.prepareStatement(sqlTimestampInsertStatement);
	    preparedStatement.setTimestamp(1, ourJavaTimestampObject);
	 
	    // (4) execute the sql timestamp insert statement, then shut everything down
	    preparedStatement.executeUpdate();
	    preparedStatement.close();
	    System.exit(0);
	  }
  
	  public static void main(String[] args) throws Exception
	  {
	    // (1) connect to the database (mysql)
		Connection connection = getConnection();
		if (connection == null) {
			throw new Exception();
		} else {
			System.out.println("Database Connection Success!");
		    }
		 
		    // (2) create a java timestamp object that represents the current time (i.e., a "current timestamp")
		java.sql.Timestamp ourJavaTimestampObject = getTimeStmap();
		 
		// (3) create our java timestamp insert statement
		insertTime(connection, ourJavaTimestampObject);
		
		System.out.println("This Programe is End!");
	  }
}
