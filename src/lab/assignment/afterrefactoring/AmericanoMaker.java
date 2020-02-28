package lab.assignment.afterrefactoring;

public class AmericanoMaker extends CoffeeMaker {

    @Override
    protected void brew() {
        System.out.println("Brewing espresso");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}