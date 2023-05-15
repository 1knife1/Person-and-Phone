package org.knife;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Телефон ======================");
        Phone phone1 = new Phone("4321", "Samsung A777", 432);
        Phone phone2 = new Phone("456", "Nokia 3310X");
        Phone phone3 = new Phone();

        System.out.println("[PHONE 1] Номер: " + phone1.getNumber() + ", модель: " + phone1.getModel() + ", вес: " + phone1.getWeight());
        System.out.println("[PHONE 2] Номер: " + phone2.getNumber() + ", модель: " + phone2.getModel() + ", вес: " + phone2.getWeight());
        System.out.println("[PHONE 3] Номер: " + phone3.getNumber() + ", модель: " + phone3.getModel() + ", вес: " + phone3.getWeight());

        phone1.receiveCall("Никита");
        phone2.receiveCall("Шабан", "666");
        phone3.sendMessage("1232", "42134", "123");

        System.out.println("2. Личность ======================");
        Person person1 = new Person();
        Person person2 = new Person("Шабан Шабанов", 18);

        System.out.println("[PERSON 1] Полное имя: " + person1.getFullName() + ", возраст: " + person1.getAge());
        System.out.println("[PERSON 2] Полное имя: " + person2.getFullName() + ", возраст: " + person2.getAge());

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}