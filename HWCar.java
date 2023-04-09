import java.util.ArrayList;
import java.util.Scanner;

class Car{
    int speed;
    String name;

    Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    void printInfo() {
        System.out.println("스피드는"+speed+"이고, 이름은 "+name+"입니다.");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("자동차의 갯수를 입력하세요.");
        n = scanner.nextInt();

        ArrayList<Car> cars = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println(i+1+"번 째 자동차의 스피드를 입력하세요.");
            int speed = scanner.nextInt();
            System.out.println(i+1+"번 째 자동차의 이름을 입력하세요.");
            String name = scanner.next();

            Car car = new Car(speed, name);
            cars.add(i, car);
        }

        System.out.println("\n-----경기 참가자 소개-----");
        for(Car participant : cars) {
            participant.printInfo();
        }
    }
}