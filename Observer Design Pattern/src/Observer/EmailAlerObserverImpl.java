package Observer;
import Observable.StocksObservable;
public class EmailAlerObserverImpl implements NtificationAlertObserver{
    String Emailid;
    StocksObservable observable;
    public EmailAlerObserverImpl(String emailId,StocksObservable observable){
        this.observable=observable;
        this.Emailid=emailId;
    }

    public void update(){
        sendMail(Emailid,"Prodcut is in stock hurry up!");
    }
    private void sendMail(String emailid,String msg){
        System.out.println("Mail Sent to :"+Emailid);
    }

}
