public class Taxi {

    int taxi_num; //택시 번호
    int taxi_oiling_amount = 100; //주유량
    int taxi_speed = 0; //현재 속도
    String destination; //목적지
    int taxi_base_distance = 1; //기본 거리
    int taxi_Remaining_distance; //목적지까지 남은 거리
    int taxi_base_fee = 3000; //택시 기본 요금
    int taxi_distance_fee = 1000; //거리당 요금
    int taxi_state = 1; //택시 상태 : 1. 일반 / 2. 운행중 / 3. 운행불가

    public int getTaxi_num() {
        return taxi_num;
    }

    public void setTaxi_num(int taxi_num) {
        this.taxi_num = taxi_num;
    }

    public int getTaxi_oiling_amount() {
        return taxi_oiling_amount;
    }

    public void setTaxi_oiling_amount(int taxi_oiling_amount) {
        this.taxi_oiling_amount = taxi_oiling_amount;
    }

    public int getTaxi_speed() {
        return taxi_speed;
    }

    public void setTaxi_speed(int taxi_speed) {
        this.taxi_speed = taxi_speed;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTaxi_base_distance() {
        return taxi_base_distance;
    }

    public void setTaxi_base_distance(int taxi_base_distance) {
        this.taxi_base_distance = taxi_base_distance;
    }

    public int getTaxi_Remaining_distance() {
        return taxi_Remaining_distance;
    }

    public void setTaxi_Remaining_distance(int taxi_Remaining_distance) {
        this.taxi_Remaining_distance = taxi_Remaining_distance;
    }

    public int getTaxi_base_fee() {
        return taxi_base_fee;
    }

    public void setTaxi_base_fee(int taxi_base_fee) {
        this.taxi_base_fee = taxi_base_fee;
    }

    public int getTaxi_distance_fee() {
        return taxi_distance_fee;
    }

    public void setTaxi_distance_fee(int taxi_distance_fee) {
        this.taxi_distance_fee = taxi_distance_fee;
    }

    public int getTaxi_state() {
        return taxi_state;
    }

    public void setTaxi_state(int taxi_state) {
        this.taxi_state = taxi_state;
    }
}
