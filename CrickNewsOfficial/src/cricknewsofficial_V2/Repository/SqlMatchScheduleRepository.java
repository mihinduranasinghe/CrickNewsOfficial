/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricknewsofficial_V2.Repository;

import cricknewsofficial_V2.DatabaseClass.MatchSchedule;
import cricknewsofficial_V2.db_connectivity.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mihindu Ranasinghe
 */
public class SqlMatchScheduleRepository {
    
     PreparedStatement pst = null;
     ResultSet rs=null;
     public MatchSchedule get(){
        
        MatchSchedule matchschedule=new MatchSchedule();
        
        try{
           // Class.forName("com.mysql.jdbc.Driver");
        DbConnection db=new DbConnection();
        Connection cn=db.createScreen();
             String sql="select * from match_schedule";
            pst=cn.prepareStatement(sql);
            rs=pst.executeQuery();
            
           matchschedule.setMatchSchedule(rs);
            
            
        }
    catch(SQLException e1){
           JOptionPane.showConfirmDialog(null, e1);
        }
    return matchschedule;
    }     
    
}
