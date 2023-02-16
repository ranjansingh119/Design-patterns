package org.example.code.designPatterns.Observer.ObserverInterface;

import org.example.code.designPatterns.Observer.ObservableInterface.AmazonObservableInterface;

public class WebsiteObserverServiceImpl implements DisplayObserverInterface{

    private AmazonObservableInterface observableInterface;
    private String emailId;

    public WebsiteObserverServiceImpl(AmazonObservableInterface observableInterface, String email) {
        this.observableInterface = observableInterface;
        this.emailId = email;
    }

    @Override
    public void update() {
        System.out.println(emailId + " user has been notified on Website");
    }
}
