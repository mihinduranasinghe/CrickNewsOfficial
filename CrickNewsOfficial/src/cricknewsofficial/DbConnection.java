
package cricknewsofficial;

import java.sql.*;

class DbConnection {
    public Connection cn;
    public Connection createScreen (){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            String dbpath="jdbc:mysql://localhost:3308/cricknews";
            cn=DriverManager.getConnection(dbpath,"root","");
        }
        catch(ClassNotFoundException ex1){
            System.out.println(ex1.getMessage());
            
        }
        catch(SQLException ex2){
            System.out.println(ex2.getMessage());
        }
        return cn;
    }
    
}
