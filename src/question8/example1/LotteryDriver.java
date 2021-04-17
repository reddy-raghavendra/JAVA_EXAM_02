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
public class LotteryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LotteryPrime lotPrime = new LotteryPrime(102, 5000);
        LotteryGeneral lotGen = new LotteryGeneral(897, 600);
//Stored LotteryPrime reference in abstract class object Lottery        
        Lottery lot = new LotteryPrime(657, 10000);
        
        System.out.println("Answer for the question 8: Raghavendra Reddy");
        
        lotPrime.setLotteryTax(lotPrime.calculateLotteryTax());
        lotGen.setLotteryTax(lotGen.calculateLotteryTax());
        lot.setLotteryTax(lot.calculateLotteryTax());

        System.out.println(lotPrime);
        System.out.println(lotGen);
        System.out.println(lot);

    }

}
