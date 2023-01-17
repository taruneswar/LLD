package Observable;

import Observer.NtificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public List<NtificationAlertObserver> observerlist = new ArrayList<>();
    public int stockCount=0;
    public void add(NtificationAlertObserver observer){
        observerlist.add(observer);
    }
    public void remove(NtificationAlertObserver observer){
        observerlist.remove(observer);
    }
    public void notifySubscribers(){
        for(NtificationAlertObserver observer:observerlist){
            observer.update();
        }
    }
    public void setStockCount(int newStockAdded){
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStockAdded;

    }
    public int getStockCount(){
        return stockCount;
    }
}
