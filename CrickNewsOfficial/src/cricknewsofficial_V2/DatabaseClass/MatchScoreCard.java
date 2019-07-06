
package cricknewsofficial_V2.DatabaseClass;

import java.sql.*;
public class MatchScoreCard {

    public void setMatchScoreCard(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private ResultSet scorecard;
     private ResultSet scorecard2;

    public ResultSet getScorecard2() {
        return scorecard2;
    }

    public void setScorecard2(ResultSet scorecard2) {
        this.scorecard2 = scorecard2;
    }

    public ResultSet getScorecard() {
        return scorecard;
    }

    public void setScorecard(ResultSet scorecard) {
        this.scorecard = scorecard;
    }
    
    
}
