

package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JAMIEXXX3
 */
public class DBConnection {
    
    private static Connection Myconnection;
    
    public static void init() {
    try{ 
        
        Class.forName("com.mysql.jdbc.Driver");
        Myconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root", "root");
    }
   
    catch(Exception e){}
    }
    
    public static Connection getConnection(){
        return Myconnection; }
    
    public static void close(ResultSet rs){
    
         if(rs!=null){
         try{
             rs.close();
        }
         catch(Exception e){System.out.println(e);}
         
         }
    }
    
    public void Destroy(){
    if(Myconnection!=null){
     
        try{
        Myconnection.close();
        }
        catch(Exception e){}
    
    }
  
}

    
    }
    
    