import java.util.Scanner;

public class Task5 {
    static boolean exit=false;

    static Double readSide(Scanner sc,String name) {
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
                double x=Double.parseDouble(text);
                if(x>0&&Double.isFinite(x)) return x;
            } catch(NumberFormatException e) {
                // Неверный ввод
            }
            System.out.println("Ошибка. Введите положительное число или 0 для выхода.");
        }
    }

    static void calculate(Scanner sc) {
        while(true) {
            Double a=readSide(sc,"Длина");
            if(a==null) return;
            Double b=readSide(sc,"Ширина");
            if(b==null) return;
            double s=a*b;
            if(Double.isFinite(s)) {
                System.out.println("Площадь = "+s);
                return;
            }
            System.out.println("Числа слишком большие. Повторите ввод или введите 0.");
        }
    }

    static void about() {
        System.out.println("Программа считает площадь прямоугольника: S=a*b");
    }

    static void developer() {
        System.out.println("Разработчик: студент, вариант 1");
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
            if(choice.equals("1")) calculate(sc);
            else if(choice.equals("2")) about();
            else if(choice.equals("3")) developer();
            else if(choice.equals("0")) break;
            else System.out.println("Неверный выбор. Попробуйте ещё раз или введите 0.");
        }
        System.out.println("Программа завершена");
    }
}
