import java.util.Scanner;

public class SR3task5 {
    static boolean exit=false;

    static Double readNumber(Scanner sc,String name) {
        while(true) {
            System.out.print(name+" (0 - выход): ");
            if(!sc.hasNextLine()) {
                exit=true;
                return null;
            }
            String text=sc.nextLine().trim().replace(',','.');
            if(text.equals("0")||text.equalsIgnoreCase("exit")) {
                exit=true;
                return null;
            }
            try {
                return Double.parseDouble(text);
            } catch(NumberFormatException e) {
                System.out.println("Неверное число. Попробуйте ещё раз.");
            }
        }
    }

    static double[] input(Scanner sc) {
        double[] data=new double[2];
        while(true) {
            Double a=readNumber(sc,"Длина");
            if(a==null) return null;
            Double b=readNumber(sc,"Ширина");
            if(b==null) return null;
            data[0]=a;
            data[1]=b;
            if(check(data)) return data;
            System.out.println("Ошибка. Стороны должны быть больше 0. Повторите ввод.");
        }
    }

    static boolean check(double[] data) {
        return data[0]>0&&data[1]>0&&Double.isFinite(data[0])
                &&Double.isFinite(data[1])&&Double.isFinite(data[0]*data[1]);
    }

    static double[] calculate(double[] data) {
        double[] result=new double[1];
        result[0]=data[0]*data[1];
        return result;
    }

    static void output(double[] result) {
        System.out.println("Площадь прямоугольника = "+result[0]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(!exit) {
            System.out.println("\n1 - Выполнить расчёт");
            System.out.println("2 - Информация о программе");
            System.out.println("3 - Информация о разработчике");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            if(!sc.hasNextLine()) break;
            String choice=sc.nextLine().trim();
            if(choice.equals("1")) {
                double[] data=input(sc);
                if(data!=null) output(calculate(data));
            } else if(choice.equals("2")) {
                System.out.println("Программа считает площадь прямоугольника: S=a*b");
            } else if(choice.equals("3")) {
                System.out.println("Разработчик: студент, вариант 1");
            } else if(choice.equals("0")) {
                break;
            } else {
                System.out.println("Неверный выбор. Попробуйте ещё раз.");
            }
        }
        System.out.println("Программа завершена");
    }
}
