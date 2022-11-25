public class Taxi {

    int taxi_num; //택시 번호
    int taxi_max_passenger = 4; //최대 승객수
    int passenger_count = 0; //현재 승객수
    int taxi_oiling_amount = 100; //주유량
    int taxi_speed = 0; //현재 속도
    String destination; //목적지
    int taxi_base_distance = 2; //기본 거리
    int taxi_Remaining_distance; //목적지까지 남은 거리
    int taxi_base_fee = 3000; //택시 기본 요금
    int taxi_distance_fee = 500; //거리당 요금
    int taxi_fee = 0; //지불할 요금
    int taxi_state = 1; //택시 상태 : 1. 일반 / 2. 운행중 / 3. 운행불가

    //매개변수 값이 택시 번호
    public Taxi(int taxi_num) {
        this.taxi_num = taxi_num;
        System.out.println("\n택시 " + taxi_num + "번");
        System.out.println("주유량 : " + taxi_oiling_amount);

        if (taxi_state == 1) {
            System.out.println("상태 : 일반");
        } else if (taxi_state == 2) {
            System.out.println("상태 : 운행중");
        } else {
            System.out.println("상태 : 운행불가");
        }
    }

    //택시에 승객 탑승
    public void take(int passenger_count, String destination, int taxi_Remaining_distance) {
        if (passenger_count > 4) {
            System.out.println("최대 승객 수 초과");

        } else {
            this.passenger_count += passenger_count;
            taxi_max_passenger -= passenger_count;
            this.destination = destination;
            this.taxi_Remaining_distance = taxi_Remaining_distance;
            taxi_state = 2;

            System.out.println("탑승 승객수 : " + this.passenger_count);
            System.out.println("잔여 승객수 : " + taxi_max_passenger);
            System.out.println("기본 요금 확인 : " + taxi_base_fee);
            System.out.println("목적지 : " + this.destination);
            System.out.println("목적지까지 거리 : " + this.taxi_Remaining_distance + "km");

            //기본거리보다 멀 경우
            if (taxi_base_distance < taxi_Remaining_distance) {
                taxi_fee = (taxi_Remaining_distance - taxi_base_distance) * taxi_distance_fee;
            }
            System.out.println("지불할 요금 : " + (taxi_base_fee + taxi_fee));
            System.out.println("상태 : 운행중");

        }
    }

    //택시 주유량 감소
    public void decrease(int taxi_oiling_amount) {
        this.taxi_oiling_amount -= taxi_oiling_amount;
        if (this.taxi_oiling_amount < 11) {
            taxi_state = 3;
        }
    }

    //하차 후 결제
    public void getOff() {
        taxi_max_passenger = 4;
        passenger_count = 0;

        System.out.println("주유량 : " + taxi_oiling_amount);
        if (taxi_oiling_amount < 11) {
            System.out.println("상태 : 운행불가");
            System.out.println("주유가 필요합니다");
            taxi_state = 3;
        }
        System.out.println("누적 요금 : " + (taxi_base_fee + taxi_fee));
    }
}
