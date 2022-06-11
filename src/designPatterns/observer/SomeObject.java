package designPatterns.observer;

import java.util.List;

public class SomeObject{
    List<Subscriber> subscribers;
    public void addSubscriber(Subscriber subscriber)
    {
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber)
    {
        subscribers.remove(subscriber);
    }
    private void onUpdate()
    {
        for (Subscriber subscriber: subscribers) {
            subscriber.notifySubscriber();
        }
    }
}
