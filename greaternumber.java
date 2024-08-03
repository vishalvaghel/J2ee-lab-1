import java.sql.*;
 public class greaternumber
 { 
    public static void main(String[] args)
    {
     Connection conn = null; 
     Statement stmt = null; 
     String url="jdbc:mysql://localhost:3306/employee"; 
     try 
     {
         conn=DriverManager.getConnection(url, "root", "tnrao"); 
         System.out.println("Creating statement..."); 
         stmt=conn.createStatement(); 
         String=sql "select from emp where empno > 2"; 
         ResultSet rs=stmt.executeQuery(sql); 
         while (rs.next()) 
         { 
          String fnm=rs.getString (2);
          String Inm=rs.getString(3); 
          String des=rs.getString(4); 
          System.out.println(" Name:" fnm); 
          System.out.println(" LName:" lnm); 
          System.out.println(" Desig:" des);
           } 
           rs.close(); 
           stmt.close(); 
           conn.close(); 
           } 
           catch (Exception e) 
           {
             e.printStackTrace();
      }
   }
}