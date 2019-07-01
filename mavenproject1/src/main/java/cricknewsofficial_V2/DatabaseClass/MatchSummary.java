/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricknewsofficial_V2.DatabaseClass;
    
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    
public class MatchSummary {
    HashMap<String,ResultSet> data = new HashMap<>();
    
    private ResultSet Innings1;
    private ResultSet Innings2;
    private ResultSet Winner;

    public ResultSet getInnings1() {
        return Innings1;
    }

    public void setInnings1(ResultSet Innings1) {
        this.Innings1 = Innings1;
        
    }

    public ResultSet getInnings2() {
        return Innings2;
    }

    public void setInnings2(ResultSet Innings2) {
        this.Innings2 = Innings2;
    }

    public ResultSet getWinner() {
        return Winner;
    }

    public void setWinner(ResultSet Winner) {
        this.Winner = Winner;
    }

    
    
    
    
}
