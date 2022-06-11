package designPatterns.state;

public class StateManager
{
    State state;
    public void someAction()
    {
        state.method1();
        state.method2();
    }
    public void setState(State state)
    {
        this.state = state;
    }
}
