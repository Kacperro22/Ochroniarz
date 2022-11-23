import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Stać! tu ochrona obiektu!");

        System.out.println("Podaj swoje imię");
        String name = skaner.nextLine();

        System.out.println("Podaj swoje nazwisko");
        String las_Name = skaner.nextLine();

        System.out.println("Podaj miasto zamieszaknia");
        String city = skaner.nextLine();

        System.out.println("Podaj swoje wiek");
        int age = skaner.nextInt();

        System.out.println("Czy jesteś w zwiazku? (true/false) ");
        boolean relationship = skaner.nextBoolean();
        String rel;
        if (relationship == true) {
            rel = "Tak";
        } else {
            rel = "Nie";
        }


        System.out.println("Witaj w klubie testera! \n" + name + " " + las_Name + "\n" + "Wiek: " + age + "\n"+
                 "Miasto: " +  city + " \n" + "Czy w związku: " + rel);

    }
}