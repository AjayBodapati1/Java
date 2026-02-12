import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int l,w;
//        double area;
//        System.out.print("Enter length of rectangle:");
//        l = sc.nextInt();
//        System.out.print("Enter width of rectangle:");
//        w = sc.nextInt();
//        area = l*w;
//        System.out.println("Area of rectangle: "+area);

//        Random random = new Random();
//        int min, max;
//        System.out.print("Enter start number for range:");
//        min = sc.nextInt();
//        System.out.print("Enter end number for range:");
//        max = sc.nextInt();
//        int randomNumber = random.nextInt(min, max+1);
//        System.out.println("Your random number: " + randomNumber);

//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        double circumference = 2 * Math.PI * radius;
//        double area = Math.PI * Math.pow(radius, 2);
//        double volume = (4/3.0) * Math.PI * Math.pow(radius, 3);
//        System.out.println("Circumference: " + Math.round(circumference)+"cm");
//        System.out.println("Area: " + Math.round(area)+"cm^2");
//        System.out.println("Volume: " + Math.round(volume)+"cm^3");

//        String name = "Ajay";
//        double cgpa = 9.34;
//        System.out.printf("Hello! %s\n", name);
//        System.out.printf("You have CGPA of %.1f\n", cgpa);

//        double a = 22567.987;
//        double b = -22567.987;
//        int c = 22;
//        System.out.printf("%f\n", a);
//        System.out.printf("%+f\n", a);
//        System.out.printf("%+f\n", b);
//        System.out.printf("%f\n", b);
//        System.out.printf("%.2f\n", a);
//        System.out.printf("%,.2f\n", a);
//        System.out.printf("% .2f\n", a);
//        System.out.printf("%(.2f\n", b);
//        System.out.printf("% .2f\n", a);
//        System.out.printf("% .2f\n", b);
//        System.out.printf("%04d\n", c);
//        System.out.printf("%4d\n", c);
//        System.out.printf("%-4d\n", c);

//        System.out.print("Enter the principal amount: ");
//        double principal = sc.nextDouble();
//        System.out.print("Enter the # times compounded: ");
//        int times = sc.nextInt();
//        System.out.print("Enter the time period (years): ");
//        int years = sc.nextInt();
//        System.out.print("Enter the interest rate (in %): ");
//        double rate = sc.nextDouble() / 100;
//        double total = principal * Math.pow(1 + rate / times, times * years);
//        System.out.printf("Balance after %d years: %.2f", years, total);

//        Random random = new Random();
//        int num = random.nextInt(1,11);
//        int guess;
//        int count = 0;
//        System.out.println("Welcome to number guessing game");
//        do{
//            System.out.print("Enter a number between 1 to 10: ");
//            guess = sc.nextInt();
//            count++;
//            if(guess < num){
//                System.out.println("Too low. Try again!");
//            }else if (guess > num){
//                System.out.println("Too high. Try again!");
//            }
//        }while (num != guess);
//        System.out.println("You guessed the number in "+count+" attempts");

//        int n = 5;
//        for(int i =0; i<5; i++){
//            System.out.print(i + " ");
//        }

//        int n = 9;
//        int m = 3;
//        for (int j=0; j<m; j++){
//            for(int i=1; i<=n; i++){
//                System.out.print(i);
//            }
//            System.out.print("\n");
//        }

//        int a = 3;
//        int b = 4;
//        System.out.println(sum(a,b));

//        add(1,2,3);   ->varargs

//        String[] fruits = {"apple", "banana"};
//        String[] vegetables = {"carrot", "beetroot"};
//        String[][] groceries= {fruits, vegetables};
//        for(String[] foods:groceries){
//            for(String food:foods){
//                System.out.print(food+" ");
//            }
//            System.out.print(";\n");
//        }

        // Objects
//        Person person = new Person();
//        System.out.println(person.isEmployed);
//        person.printDetails();

        // Constructors
//        Person person1 = new Person("Ajay", 22, true);
//        Person person2 = new Person("Senior", 22, true);
//        person1.printDetails();
//        person2.printDetails();

        // Constructors overloading
//        Person person1 = new Person("Ajay", 22, false);
//        Person person2 = new Person("Senior", 22);
//        person1.printEmployement();
//        person2.printEmployement();

        sc.close();
        }

//    static int sum(int x,int y){
//        return x+y;
//    }

//    static void add(int... number){
//        int total = 0;
//        for(int i=0; i<number.length; i++){
//            total += number[i];
//        }
//        for(int ele : number){
//            total += ele;
//        }
//        System.out.println(total);
//    }

}