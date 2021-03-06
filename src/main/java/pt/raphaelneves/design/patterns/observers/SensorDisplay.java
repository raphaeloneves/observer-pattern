package pt.raphaelneves.design.patterns.observers;

import pt.raphaelneves.design.patterns.interfaces.IDisplay;
import pt.raphaelneves.design.patterns.subjects.IObservable;
import pt.raphaelneves.design.patterns.subjects.WeatherStation;

public class SensorDisplay implements IObserver, IDisplay {

    private final IObservable observable;

    public SensorDisplay(final IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void display() {
        System.out.println("Receiving message on sensors!");
        System.out.println(String.format("The temperature has been changed to %s", ((WeatherStation) observable).getState()));
        System.out.println("--");
    }

    @Override
    public void update() {
        display();
    }
}
