public class Bus {

    int bus_max_passenger = 30; //최대 승객수
    int passenger_count = 0; //현재 승객수
    int bus_fee = 1000; //버스 요금
    int bus_num; //버스번호
    int bus_oiling_amount = 100; //주유량
    int bus_speed = 0; //현재 속도
    int bus_state = 1; //버스 상태 : 1 운행/ 0 차고지행

    //매개변수 값이 버스 번호
    public Bus(int bus_num) {
        this.bus_num = bus_num;
        System.out.println("버스 " + bus_num + "번");
    }

    //탑승한 승객만큼 현재 승객수 증가 및 최대 승객수 감소
    public void take(int passenger_count) {
        if (passenger_count > bus_max_passenger) {
            System.out.println("최대 승객 수 초과");
            
        } else {
            this.passenger_count += passenger_count;
            bus_max_passenger -= passenger_count;
            System.out.println("탑승 승객 수 : " + passenger_count);
            System.out.println("잔여 승객 수 : " + bus_max_passenger);
            System.out.println("요금 확인 : " + bus_fee * passenger_count);
        }
    }

    //매개변수 값 만큼 주유량 감소
    public void decrease(int bus_oiling_amount) {
        this.bus_oiling_amount -= bus_oiling_amount;
        System.out.println("주유량 : " + this.bus_oiling_amount);
        if (this.bus_oiling_amount < 11) {
            System.out.println("주유가 필요합니다");
        }
    }

    //매개변수 값이 1이면 운행중, 0이면 차고지행
    public void state(int bus_state) {
        passenger_count = 0;
        bus_max_passenger = 30;

        if (bus_state == 1) {
            this.bus_state = 1;
            System.out.println("버스 " + "운행중");
        } else {
            this.bus_state = 0;
            System.out.println("버스 " + "차고지행");
        }
    }

    //매개변수 값 만큼 주유량 증가
    public void increase(int bus_oiling_amount) {
        this.bus_oiling_amount += bus_oiling_amount;
        System.out.println("주유량 : " + this.bus_oiling_amount);
    }

}
