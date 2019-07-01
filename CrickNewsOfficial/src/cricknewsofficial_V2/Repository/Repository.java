/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricknewsofficial_V2.Repository;

import cricknewsofficial_V2.DatabaseClass.MatchSchedule;
import cricknewsofficial_V2.DatabaseClass.MatchSummary;

/**
 *
 * @author Mihindu Ranasinghe
 */
public interface Repository {
    MatchSummary get();
    MatchSchedule get2();
}
