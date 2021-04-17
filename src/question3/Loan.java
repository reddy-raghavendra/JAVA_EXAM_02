/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Raghavendra Reddy
 */
public class Loan {

    private double principleAmount;
    private int loanTenure;
    private double interestRate;

    public Loan(double principleAmount, int loanTenure, double interestRate) {
        this.principleAmount = principleAmount;
        this.loanTenure = loanTenure;
        this.interestRate = interestRate;
    }

    public double getPrincipleAmount() {
        return principleAmount;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "Loan:" + "\nPrincipleAmount: " + principleAmount
                + "\nLoanTenure: "
                + loanTenure + "\nInterestRate: " + interestRate;
    }

}
