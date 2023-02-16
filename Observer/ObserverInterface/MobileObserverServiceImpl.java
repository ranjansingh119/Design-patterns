package org.example.code.designPatterns.Observer.ObserverInterface;

import org.example.code.designPatterns.Observer.ObservableInterface.AmazonObservableInterface;

public class MobileObserverServiceImpl implements DisplayObserverInterface{

    private AmazonObservableInterface amazonObservable;
    private String emailId;

    public MobileObserverServiceImpl(AmazonObservableInterface observable, String email) {
        amazonObservable = observable;
        emailId = email;
    }

    @Override
    public void update() {
        System.out.println(emailId + " user has been notified on Mobile");
    }
}
