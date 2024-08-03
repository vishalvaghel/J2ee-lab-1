import java.sql.*;
public class insert
{
    public static void main(String[] args)
    {
        connection conn;
        statement stmt;
        String url="jdbc:mysql://localhost:3306/employee";
        try
        {
            conn=Drivermanager.getconnection(url,'root','tnrao');
            stmt=conn.createstatement();
            String sql="insert into emp values(5,'lopa','sharma','clerk')";

            int val=stmt.executeUpdate(sql);

            System.out.println(val+"insert successfully");

            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            e,printstackTrace();
        }
    }
}