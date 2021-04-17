/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public enum Players {
    CRICKET(11), FOOTBALL(11), VOLLEYBALL(6), BASKETBALL(6), BASEBALL(9);

    private int noOfPlayers;

    private Players(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

}
