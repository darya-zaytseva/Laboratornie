import java.util.Scanner;
class Person
{
    String familiya;
    String name;
    String otchestvo;
    String adres;
    String telephon;
    String karta;

    public Person(String familiya, String name, String otchestvo, String adres, String telephon, String karta)
    {
        this.familiya = familiya;
        this.name = name;
        this.otchestvo = otchestvo;
        this.adres = adres;
        this.telephon = telephon;
        this.karta = karta;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Person[] persons = new Person[5];
        persons[0] = new Person("Фролов", "Кирилл", "Владимирович", "Гагарина, 14", "88005553535", "12345");
        persons[1] = new Person("Маркова", "Кира", "Романовна", "Кулакова, 88", "87776664422", "67890");
        persons[2] = new Person("Рынденкова", "Даниил", "Петрович", "Победа, 9", "89379310018", "04321");
        persons[3] = new Person("Зайцев", "Кирилл", "Максимович", "Шаманова, 53", "28354429885", "98765");
        persons[4] = new Person("Чепыжова", "Лариса", "Константиновна", "Попова, 77", "52428139096", "12345");
        String number = "12345";
        Karta(persons, number);
    }
    public static void Karta(Person[] persons, String number)
    {
        int per = 0;
        System.out.println("Пользователи с такими же номерами карт: \n");
        for (Person person : persons)
        {
            if (person.karta.equals(number))
            {
                System.out.println(person.familiya + " " + person.name + " " + person.otchestvo);
                per++;
            }
        }
        if (per == 0)
        {
            System.out.println("Совпадений нет.");
        }
    }
}
