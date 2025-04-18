package com.enigma.oop_fundamental;

public class Car {
    /*
    key -> adalah keyword untuk menunjuk kepada property dalam class tersebut
    super -> adalah keyword untuk menunjuk ke property/method class parent
     */

    /*
    Acces modifier
    -> mekanisme atau syntax untuk mengatur tingkat aksesbilitas dari field atau method.
    1. public -> dapat diakses dari manapun
    2. default -> hanya dapat diakses dari package yang sama
    3. protected -> hanya dapat diakses didalam package yang sama dan dari sub classnya
    4. private -> hanya dapat diakses di kelas yang sama
     */
    //property
    String model;
    String name;
    String color;

    //constructor
    /*
    Constructor adalah sebuah method yang dijalankan saat pertama kali membuat object.
    Constructor memiliki nama yang sama dengan class.
     */
    public Car(String name) {
        this.name = name;
    }
    //constructor/method overloading, karena membuat method dengan nama yang sama, akan tetapi memiliki parameter yang berbeda
    public Car(String model, String name, String color) {
        this.model = model;
        this.name = name;
        this.color = color;
    }

    //method didalam class
    public void startEngine() {
        System.out.println(this.name+" engine start...");
    }
}
