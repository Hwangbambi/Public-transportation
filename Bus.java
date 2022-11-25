public class Bus {

    int bus_max_passenger = 30; //최대 승객수
    int passenger_count = 0; //현재 승객수
    int bus_fee = 1000; //버스 요금
    int bus_num; //버스번호
    int bus_oiling_amount = 100; //주유량
    int bus_speed = 0; //현재 속도
    int bus_state = 1; //버스 상태 : 1 운행/ 0 차고지행

    public int getBus_max_passenger() {
        return bus_max_passenger;
    }

    public void setBus_max_passenger(int bus_max_passenger) {
        this.bus_max_passenger = bus_max_passenger;
    }

    public int getPassenger_count() {
        return passenger_count;
    }

    public void setPassenger_count(int passenger_count) {
        this.passenger_count = passenger_count;
    }

    public int getBus_fee() {
        return bus_fee;
    }

    public void setBus_fee(int bus_fee) {
        this.bus_fee = bus_fee;
    }

    public int getBus_num() {
        return bus_num;
    }

    public void setBus_num(int bus_num) {
        this.bus_num = bus_num;
    }

    public int getBus_oiling_amount() {
        return bus_oiling_amount;
    }

    public void setBus_oiling_amount(int bus_oiling_amount) {
        this.bus_oiling_amount = bus_oiling_amount;
    }

    public int getBus_speed() {
        return bus_speed;
    }

    public void setBus_speed(int bus_speed) {
        this.bus_speed = bus_speed;
    }

    public int getBus_state() {
        return bus_state;
    }

    public void setBus_state(int bus_state) {
        this.bus_state = bus_state;
    }
}
