package com.techelevator.BattleDao;

import com.techelevator.Model.GameResults;

import java.util.List;

public interface BattleDao {

    String averageArmyWinrate(String playedArmy);
    String winratePerOpponent(String playedArmy, String opponentArmy);
    Integer getAvgPrimary(String playedArmy);
    Integer getAvgSecondary(String playedArmy, String objectiveType);
    List<GameResults> overallResults(String playedArmy);

}
