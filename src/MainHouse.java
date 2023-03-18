import java.util.ArrayList;
import java.util.List;

public class MainHouse {
  //    === TASK_1 ===
//  Создайте абстрактный класс "Дом".
//  В качестве аргумента конструктора принимайте адрес.
//  Напишите для адреса сеттер и геттер.

//  Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".

//  При создании многоквартирного дома дополнительно
//  принимайте в конструкторе целое число - количество подъездов.

//  В методе toString() выводите в удобном виде всю известную информацию о доме.

//  В основном файле программы создайте список домов,
//  в который поместите два частных дома и один многоквартирный.
//
//  Выведите информацию о домах в списке с использованием цикла for-each.

//    ===== TASK_2 ====
//  Добавьте классу "Дом" виртуальный метод "снести".

//  Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":

//  для частного дома выводите на экран: "Вы снесли частный дом";
//  для многоквартирного дома выведите на экран: "Вы снесли многоквартирный дом.
//  %d подъездов!" Вместо %d должно быть число подъездов.
  public static void main(String[] args) {
    List<House> houses = new ArrayList<>();
    House house1 = new PrivateHouse("Berlin", "Bismarckstrasse", 10);
    House house2 = new PrivateHouse("Frankfurt", "Gottestrasse", 32);
    House apart = new ApartmentsHouse("Karlsruhe", "Sophienstrasse", 5, 3);
    houses.add(house1);
    houses.add(house2);
    houses.add(apart);

    for(House house : houses){
       System.out.println(house);
    }

    System.out.println();   // отладочный вывод
    for(House house : houses){
      System.out.println(house.destroyHouse());
    }


  }
}