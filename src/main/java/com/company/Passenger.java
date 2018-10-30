package com.company;

public class Passenger extends Person{

    Destination destination;
    Luggage luggage;
    Main.CarriageClass carriageClass;

    public Passenger() {
        super();
        destination= Destination.NONE;
        carriageClass= Main.CarriageClass.ECONOM;
    }

    public Passenger(Destination destination, Luggage luggage, Main.CarriageClass carriageClass) {
        super();
        this.destination = destination;
        this.luggage = luggage;
        this.carriageClass = carriageClass;
    }

    public Destination getDestination() {
        return destination;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public Main.CarriageClass getCarriageClass() {
        return carriageClass;
    }

}
