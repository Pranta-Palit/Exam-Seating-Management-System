package uapseatplanner;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Pranta
 */

class DatabaseConnect
{

        private String sql;
        private Connection connection;
        private Statement stmt;
        private ResultSet rs;


        public DatabaseConnect(String name,String user,String pass)
        {
			String username=user;
			String password=pass;
			String url="jdbc:odbc:"+name;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				this.connection=DriverManager.getConnection(url);
				System.out.print("Connected\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	  }

        private void setSqlString(String query)
        {
                sql = query;
        }

        public int updateDB(String query)
        {
                setSqlString(query);
                int result = 0;
                try
                {
                        stmt=this.connection.createStatement();
                        result=this.stmt.executeUpdate(sql);
                }
                catch (Exception e)
                {
                        result=-1;
                        System.out.println("In updateDB " + e.toString());
                }
                return result;
        }

        public ResultSet searchDB(String query)
        {

                setSqlString(query);
                try
                {
                        stmt=connection.createStatement();
                        rs=stmt.executeQuery(sql);
                }
                catch (Exception e)
                {

                        System.out.println("In searchDB " + e.toString());
                }
                return rs;
        }


        public void close()
        {
                try
                {
                        connection.close();
                        System.out.println("Disconnected");
                }
                catch(Exception e)
                {
                        System.out.println(e+"Error");
                }

        }

}

// till this line

class DatabaseTest
{
	DatabaseConnect dbc;


public	DatabaseTest()
	{
		try
		{
			dbc = new DatabaseConnect("Driver={Microsoft Access Driver (*.mdb)};DBQ=Processed.mdb;DriverID=22;READONLY=true","","");
			String username=new String();
                        String password=new String();
                        /************** How to select data ***************/
                        /*ResultSet rs=dbc.searchDB("select * from Data");
                        while(rs.next()){
                            username = rs.getString("Username");
                            password = rs.getString("Password");
                            System.out.println("Username: "+username);
                            System.out.println("Password: "+password);
                        }
                        rs.close();

                         */
                        /*************** How to retrieve password ********/
                        /*System.out.println("Please Enter your Username: ");
                        Scanner s=new Scanner(System.in);
                        username = s.nextLine();
                        ResultSet rs=dbc.searchDB("select Password from Data where Username='"+username+"'");
                        while(rs.next()){
                            password = rs.getString("Password");
                            System.out.println("Password: "+password);
                        }
                        rs.close();
                        */
                        /*************** Data insertion *************/
                        //Scanner s= new Scanner(System.in);
                        //System.out.println("Please Insert your ID: ");
                        //String id=s.nextLine();
                        //System.out.println("Please Insert your name: ");
                        //String name= s.nextLine();
                        //System.out.println("Please Insert your password");
                        //String pass= s.nextLine();
                        //dbc.updateDB("Insert into Data values('"+id+"','"+name+"','"+pass+"')");
                        //dbc.updateDB("update Data set Username='"+name+"',Password='"+pass+"' where ID='"+id+"'");
                        //int count=0;
                        //ResultSet rs=dbc.searchDB("select * from Data");
                        //while(rs.next()){
                        //    count++;
                        //}
                        //System.out.println("Number of student is = "+count);
                        //rs.close();
                        
                        /************* Update data ************/
                        /*
                        System.out.println("Please Insert your id: ");
                        Scanner s= new Scanner(System.in);
                        String id= s.nextLine();
                        System.out.println("Please Insert your password");
                        String pass= s.nextLine();
                        dbc.updateDB("update Data set Password='"+pass+"' where ID='"+id+"'");
                        dbc.updateDB("update Data set Password='"+pass+"' where ID='"+id+"'");
                        */
                        /*************** Delete from database **************/
                        /*
                        System.out.println("Please Insert your id: ");
                        Scanner s= new Scanner(System.in);
                        String id= s.nextLine();
                        dbc.updateDB("delete from Data where ID='"+id+"'");
                        dbc.updateDB("delete from Data where ID='"+id+"'");
                        */
                        
		}catch(Exception e)
		{
			System.out.println (e);
		}

	}
public class Processing {
    DatabaseTest a=new DatabaseTest();
}
