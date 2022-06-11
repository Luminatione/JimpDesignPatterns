package designPatterns.chainOfResponsibility;

public class App
{
    Pipe pipes;
    public void configure()
    {

        pipes.addNext(new Pipe1()).addNext(new Pipe2());
    }
}
