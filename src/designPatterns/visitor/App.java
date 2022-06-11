package designPatterns.visitor;

public class App {
    public void foo()
    {
        Algorithm a = new Algorithm();
        a.someAction(new Visitor1());
        a.someAction(new Visitor2());
    }
}
