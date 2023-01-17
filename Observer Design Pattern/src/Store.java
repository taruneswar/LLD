import Observable.*;
import Observer.*;
public class Store {
    public static void main(String[] args) {
        StocksObservable iphonestocks = new IphoneObservableImpl();
        NtificationAlertObserver ob1 = new EmailAlerObserverImpl("tarun@gmail.com",iphonestocks);
        NtificationAlertObserver ob2 = new EmailAlerObserverImpl("reddy@gmail.com",iphonestocks);
        NtificationAlertObserver ob3 = new MobileAlertObserverImpl("eswar@gmail.com",iphonestocks);
        iphonestocks.add(ob1);
        iphonestocks.add(ob2);
        iphonestocks.add(ob3);
        iphonestocks.setStockCount(10);


    }
}