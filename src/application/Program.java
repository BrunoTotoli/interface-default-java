package application;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {

    public static void main(String[] args) {
        double amount = 200.0;
        int months = 3;

        InterestService interestService = new UsaInterestService(1.0);
        double payment = interestService.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
    }

}
