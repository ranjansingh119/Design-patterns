package org.example.code.designPatterns.Observer.ObservableInterface;

import org.example.code.designPatterns.Observer.ObserverInterface.DisplayObserverInterface;


public interface AmazonObservableInterface {

    // add subscriber
    public void add(DisplayObserverInterface displayObserver);

    // remove subscriber
    public void remove(DisplayObserverInterface displayObserver);

    //notify subscriber
    public void notifyObservers();

    public void setData(int data);

    public int getData();

}
