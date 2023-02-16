package org.example.code.designPatterns.Observer;


import org.example.code.designPatterns.Observer.ObservableInterface.AmazonObservableServiceImpl;
import org.example.code.designPatterns.Observer.ObserverInterface.MobileObserverServiceImpl;
import org.example.code.designPatterns.Observer.ObserverInterface.WebsiteObserverServiceImpl;

public class AmazonNotifyApplication {

    public static void main(String[] args) {
        AmazonObservableServiceImpl observable = new AmazonObservableServiceImpl();
        observable.add(new MobileObserverServiceImpl(observable, "ranjan@gmail.com"));
        observable.add(new WebsiteObserverServiceImpl(observable, "website@gmail.com"));
        observable.add(new MobileObserverServiceImpl(observable, "mobile@gmail.com"));

        observable.setData(20);
    }
}
