public class Transport_taxi {
    public static void main(String[] args) {
        //번호가 다른 택시 2대 생성
        Taxi taxi4885 = new Taxi(4885);
        Taxi taxi2022 = new Taxi(2022);

        //4885 승객 2명 탑승
        taxi4885.take(2,"서울역",4);

        //주유량 80 감소
        taxi4885.decrease(80);

        //승객 요금 결제
        taxi4885.getOff();

        //4885 승객 명 탑승
        taxi4885.take(5,"",0);

        //4885 승객 3명 탑승
        taxi4885.take(3,"구로디지털단지역",12);

        //주유량 20 감소
        taxi4885.decrease(20);

        //승객 요금 결제
        taxi4885.getOff();

    }
}
