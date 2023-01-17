package Observable;
import Observer.NtificationAlertObserver;
public interface StocksObservable {
    public void add(NtificationAlertObserver observer);
    public void remove(NtificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int i);
}
