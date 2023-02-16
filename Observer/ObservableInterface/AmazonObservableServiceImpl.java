package org.example.code.designPatterns.Observer.ObservableInterface;


import org.example.code.designPatterns.Observer.ObserverInterface.DisplayObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class AmazonObservableServiceImpl implements AmazonObservableInterface{

    private List<DisplayObserverInterface> displayObservers;
    private int dataCount;

    public AmazonObservableServiceImpl() {
        this.displayObservers = new ArrayList<>();
        this.dataCount = 0;
    }


    @Override
    public void add(DisplayObserverInterface displayObserver) {
        displayObservers.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserverInterface displayObserver) {
        displayObservers.remove(displayObserver);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserverInterface observer : displayObservers) {
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        if(dataCount == 0) {
            notifyObservers();
        }
        dataCount += data;
    }

    @Override
    public int getData() {
        return dataCount;
    }
}
