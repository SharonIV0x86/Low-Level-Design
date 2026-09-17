interface RiderInterface {
    void bookRide();

    void rateDriver();
}

interface DriverInterface {
    void acceptRide();

    void trackEarnings();

    void ratePassenger();
}

class Rider implements RiderInterface {
    public void bookRide() {
        /* yes */ }

    public void rateDriver() {
        /* yes */ }
}

class Driver implements DriverInterface {
    public void acceptRide() {
        /* yes */ }

    public void trackEarnings() {
        /* yes */ }

    public void ratePassenger() {
        /* yes */ }
}
