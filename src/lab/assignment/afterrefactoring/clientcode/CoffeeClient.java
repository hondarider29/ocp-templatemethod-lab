package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.*;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();
        starbuzz.prepareCoffee();
    }

}
