import java.util.Scanner;

public class Reader {
    public double readX(){
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x от -3 до 3");
        while(true){
            x = scanner.nextDouble();
            if(x >= -3 && x <= 3)
                break;
            else
                System.out.println("Некорректный x");
        }
        return x;
    }

    public double readY(){
        double y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите y от -3 до 5");
        while(true){
            y = scanner.nextDouble();
            if(y >= -3 && y <= 5)
                break;
            else
                System.out.println("Некорректный y");
        }
        return y;
    }

    public double readR(){
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите r от 1 до 3");
        while(true){
            r = scanner.nextDouble();
            if(r >= 1 && r <= 3)
                break;
            else
                System.out.println("Некорректный r");
        }
        return r;
    }
}
