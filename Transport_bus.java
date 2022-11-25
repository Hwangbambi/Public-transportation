public class Transport_bus {
    public static void main(String[] args) {
        //번호가 다른 버스 2대 생성
        Bus bus80 = new Bus(80);
        Bus bus90 = new Bus(90);

        //승객 2명이 90번 버스 탑승
        bus90.take(2);

        //주유량 50 감소
        bus90.decrease(50);

        //90번 버스 차고지 행 (상태 변경)
        bus90.state(0);

        //주유량 10 증가 및 운행중으로 상태 변경
        bus90.increase(10);
        bus90.state(1);

        //승객 45명 90번 버스 탑승
        bus90.take(45);

        //승객 5명 90번 버스 탑승
        bus90.take(5);

        //주유량 55 감소
        bus90.decrease(55);

    }
}
