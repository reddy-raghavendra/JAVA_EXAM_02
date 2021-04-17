/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class LotteryPrime extends Lottery {

    public LotteryPrime(int lotteryNumber, double lotteryAmount) {
        super(lotteryNumber, lotteryAmount, 35);
    }

    @Override
    public double calculateLotteryTax() {
        return Math.round(super.getLotteryAmount() * super.getLotteryTax())
                / 100.0;
    }

}
