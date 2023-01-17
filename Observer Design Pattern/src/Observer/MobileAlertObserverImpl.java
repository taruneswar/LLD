package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NtificationAlertObserver{
    String username;
    StocksObservable observable;
    public MobileAlertObserverImpl(String emailId,StocksObservable observable){
        this.observable=observable;
        this.username=emailId;
    }

    public void update(){
        sendMail(username,"Prodcut is in stock hurry up!");
    }
    private void sendMail(String emailid,String msg){
        System.out.println("Mail Sent to :"+username);
    }

}
