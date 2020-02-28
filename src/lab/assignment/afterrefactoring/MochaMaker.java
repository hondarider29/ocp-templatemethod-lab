package lab.assignment.afterrefactoring;

public class MochaMaker extends CoffeeMaker{

    @Override
    protected void brew() {
        System.out.println("Brewing espresso");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Adding sugar");
    }
}