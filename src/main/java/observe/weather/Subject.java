package observe.weather;


/**
 * Created by nghiapv on 04/03/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
