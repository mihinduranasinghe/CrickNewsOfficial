/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricknewsofficial_V2.Repository;

import static cricknewsofficial_V2.Cricknews.matchdetailsView.txtMatchid;
import cricknewsofficial_V2.DatabaseClass.MatchSchedule;
import cricknewsofficial_V2.DatabaseClass.MatchSummary;
import cricknewsofficial_V2.db_connectivity.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mihindu Ranasinghe
 */
public class SqlMatchDetailRepository implements Repository{
    PreparedStatement pst,pst2,pst3,pst4 = null;
    ResultSet rs,rs2,rs3,rs4=null;
    String matchid;

    public SqlMatchDetailRepository(String matchid) {
        this.matchid = matchid;
    }
    
    

    //public MatchDetails get(){
    public MatchSummary get(){
        
    
    MatchSummary matchsummary = new MatchSummary();
        
        try{
          
           
        DbConnection db=new DbConnection();
        Connection cn=db.createScreen();
        
           
            
            
             String sql="select won_the_toss_by,won_the_toss_and_elected_to_,first_batted_coutry,inning01_score_and_wickets,inning01_overs,inning01_extras from match_summery where match_id='"+matchid+"'";
             String sql3="select chasing_country,inning02_score_and_wickets,inning02_overs,inning02_extras from match_summery where match_id='"+matchid+"'";
             String sql4="select match_won_by from match_summery where match_id='"+matchid+"'";
             
            
             
            pst=cn.prepareStatement(sql);
            
            pst3=cn.prepareStatement(sql3);
            pst4=cn.prepareStatement(sql4);
            
            rs=pst.executeQuery();
            
            rs3=pst3.executeQuery();
            rs4=pst4.executeQuery();
            
           
            
            
            
           
            matchsummary.setInnings1(rs);
            matchsummary.setInnings2(rs3);
            matchsummary.setWinner(rs4);
            
            
           
            
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs2));
//            jTable3.setModel(DbUtils.resultSetToTableModel(rs3));
//            jTable4.setModel(DbUtils.resultSetToTableModel(rs4));
            
            
        }
    catch(SQLException e1){
           JOptionPane.showConfirmDialog(null, e1);
        }
     return matchsummary;
    }   

    @Override
    public MatchSchedule get2() {
                    MatchSchedule matchSchedule = new MatchSchedule();
        try {

            
            DbConnection db=new DbConnection();
            Connection cn=db.createScreen();
            
             
            
            String sql2="select * from match_schedule where match_id='"+matchid+"'";
            
            pst2=cn.prepareStatement(sql2);
            
            rs2=pst2.executeQuery();
            matchSchedule.setMatchSchedule(rs2);
        } catch (SQLException ex) {
            Logger.getLogger(SqlMatchDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return matchSchedule;
         
    }
    
    
    
}
