package designPatterns.visitor;

public class Algorithm
{
    public void someAction(Visitor visitor)
    {
        //some actions
        visitor.action(this);
        //other actions
    }
}
