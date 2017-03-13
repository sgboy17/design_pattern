package observe.weather;

/**
 * Created by nghiapv on 04/03/2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
