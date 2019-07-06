
package cricknewsofficial_V2.Repository;

import cricknewsofficial_V2.DatabaseClass.CricketTeams;
import cricknewsofficial_V2.db_connectivity.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mihindu Ranasinghe
 */
public class SqlRepository {
         PreparedStatement pst = null;
         ResultSet rs=null;
         
     public CricketTeams get(){
         
         CricketTeams team=new CricketTeams();
        
        try{
            
            
           // Class.forName("com.mysql.jdbc.Driver");
             DbConnection db=new DbConnection();
             Connection cn=db.createScreen();
             String sql="select * from cricket_teams";
            pst=cn.prepareStatement(sql);
            rs=pst.executeQuery();
           
            team.setCriketteams(rs);
            
            
        }
    catch(SQLException e1){
           JOptionPane.showConfirmDialog(null, e1);
        }
        
    return team;
    }
   
    
}
