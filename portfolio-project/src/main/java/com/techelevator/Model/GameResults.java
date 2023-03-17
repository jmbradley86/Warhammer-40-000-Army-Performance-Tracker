package com.techelevator.Model;

public class GameResults {

    private String armyPlayed;
    private String opponentArmy;
    private Integer primaryObjective;
    private Integer purgeTheEnemy = null;
    private Integer noMercyNoRespite = null;
    private Integer battlefieldSupremacy = null;
    private Integer shadowOperations = null;
    private Integer warpcraft = null;
    private Boolean winOrLose;

    public String getArmyPlayed() {
        return armyPlayed;
    }

    public void setArmyPlayed(String armyPlayed) {
        this.armyPlayed = armyPlayed;
    }

    public String getOpponentArmy() {
        return opponentArmy;
    }

    public void setOpponentArmy(String opponentArmy) {
        this.opponentArmy = opponentArmy;
    }

    public Integer getPrimaryObjective() {
        return primaryObjective;
    }

    public void setPrimaryObjective(Integer primaryObjective) {
        this.primaryObjective = primaryObjective;
    }

    public Integer getPurgeTheEnemy() {
        return purgeTheEnemy;
    }

    public void setPurgeTheEnemy(Integer purgeTheEnemy) {
        this.purgeTheEnemy = purgeTheEnemy;
    }

    public Integer getNoMercyNoRespite() {
        return noMercyNoRespite;
    }

    public void setNoMercyNoRespite(Integer noMercyNoRespite) {
        this.noMercyNoRespite = noMercyNoRespite;
    }

    public Integer getBattlefieldSupremacy() {
        return battlefieldSupremacy;
    }

    public void setBattlefieldSupremacy(Integer battlefieldSupremacy) {
        this.battlefieldSupremacy = battlefieldSupremacy;
    }

    public Integer getShadowOperations() {
        return shadowOperations;
    }

    public void setShadowOperations(Integer shadowOperations) {
        this.shadowOperations = shadowOperations;
    }

    public Integer getWarpcraft() {
        return warpcraft;
    }

    public void setWarpcraft(Integer warpcraft) {
        this.warpcraft = warpcraft;
    }

    public Boolean getWinOrLose() {
        return winOrLose;
    }

    public void setWinOrLose(Boolean winOrLose) {
        this.winOrLose = winOrLose;
    }

    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Battle Report Details" +
                "\n--------------------------------------------" +
                "\n You Commanded: " + armyPlayed +
                "\n You Fought: " + opponentArmy +
                "\n Were you Victorious: " + winOrLose +
                "\n You Scored the Following on Primary: " + primaryObjective +
                //"\n Cover Image: " + coverImage;
    }
}
