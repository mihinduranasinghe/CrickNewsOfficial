/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricknewsofficial_V2.Repository;

import static cricknewsofficial_V2.Cricknews.matchdetails.txtMatchid;
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
public class SqlMatchDetailRepository implements Repository{
    
    @Override
    public MatchDetail get(){
        
    PreparedStatement pst,pst2,pst3,pst4 = null;
    ResultSet rs,rs2,rs3,rs4=null;
        
        
        try{
           // Class.forName("com.mysql.jdbc.Driver");
             String matchid;
             matchid=txtMatchid.getText();
             //matchid=request.getParameter("txtMatchid");\
           
        DbConnection db=new DbConnection();
        Connection cn=db.createScreen();
        
           
            
             String sql2="select * from match_schedule where match_id='"+matchid+"'";
             String sql="select won_the_toss_by,won_the_toss_and_elected_to_,first_batted_coutry,inning01_score_and_wickets,inning01_overs,inning01_extras from match_summery where match_id='"+matchid+"'";
             String sql3="select chasing_country,inning02_score_and_wickets,inning02_overs,inning02_extras from match_summery where match_id='"+matchid+"'";
             String sql4="select match_won_by from match_summery where match_id='"+matchid+"'";
             
            
             
            pst=cn.prepareStatement(sql);
            pst2=cn.prepareStatement(sql2);
            pst3=cn.prepareStatement(sql3);
            pst4=cn.prepareStatement(sql4);
            
            rs=pst.executeQuery();
            rs2=pst2.executeQuery();
            rs3=pst3.executeQuery();
            rs4=pst4.executeQuery();
            
            MatchDetails matchdetail = new MatchDetails();
            
            matchdetail.rs = rs();
            
            
            return matchdetail;
            
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs2));
//            jTable3.setModel(DbUtils.resultSetToTableModel(rs3));
//            jTable4.setModel(DbUtils.resultSetToTableModel(rs4));
            
            
        }
    catch(SQLException e1){
           JOptionPane.showConfirmDialog(null, e1);
        }
    
    }        
    
}
