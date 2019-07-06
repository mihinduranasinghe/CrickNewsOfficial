
package cricknewsofficial_V2.Repository;

import cricknewsofficial_V2.CricknewsView.matchdetailsView;
import cricknewsofficial_V2.DatabaseClass.MatchSchedule;
import cricknewsofficial_V2.DatabaseClass.MatchScoreCard;
import cricknewsofficial_V2.DatabaseClass.MatchSummary;
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
public class SqlScoreCardRepository  {

    public SqlScoreCardRepository(String matchid) {
        this.matchid = matchid;
    }
    PreparedStatement pst,pst2= null;
    ResultSet rs,rs2=null;
    String matchid;
    
     public MatchScoreCard get(){
        
        this.matchid=matchid;
        
        MatchScoreCard sorecard=new MatchScoreCard();
        
        try{
           // Class.forName("com.mysql.jdbc.Driver");
          
           
        DbConnection db=new DbConnection();
        Connection cn=db.createScreen();
           
            
            
            
             String sql1="select team_name,player_id,runs,balls_faced,fours,sixes from match_score_card where match_id='"+matchid+"'";
             String sql2="select team_name,player_id,bowled_overs,runs_given,wickets_taken,catches from match_score_card where match_id='"+matchid+"'";
             
            
             
            pst=cn.prepareStatement(sql1);
            pst2=cn.prepareStatement(sql2);
            
            rs=pst.executeQuery();
            rs2=pst2.executeQuery();
            
           sorecard.setScorecard(rs);
           sorecard.setScorecard2(rs2);
                    
            
          
            
        }
    catch(SQLException e1){
           JOptionPane.showConfirmDialog(null, e1);
        }
        return sorecard;
 }

    
    

    
   
    
}
