package com.company.learn;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/

public class Main {

    public static void main(String[] args) {

        Product iPhone8 = new Product("iPhone8", 900);
        Product honor = new Product("HONOR", 500);
        Product xiaomi = new Product("Xiaomi", 450);
        Product nokia = new Product("Nokia", 720);
        Product siemens = new Product("Siemens", 200);
        Product miBand = new Product("MiBand5", 100);
        Product iWatch = new Product("iWatch", 890);

        Payment.AmountOfProducts firstClient = new Payment.AmountOfProducts();

        firstClient.addProduct(nokia);
        firstClient.addProduct(siemens);
        firstClient.addProduct(honor);

        System.out.println("Корзина покупателя: ");
        for (int i = 0; i < firstClient.numberOfProducts(); i++){
            System.out.println(firstClient.getProducts().get(i));
        }

        System.out.println("Количество товаров в корзине " +firstClient.numberOfProducts());
        System.out.println("Общая стоимость товаров в корзине:  " +firstClient.totalPrice());

        System.out.println();

        firstClient.addProduct(iPhone8);         //  добавление в корзину
        firstClient.addProduct(xiaomi);
        firstClient.removeProduct(siemens);// удаление продукта


        System.out.println("Обновлённая орзина покупателя: ");
        for (int i = 0; i < firstClient.numberOfProducts(); i++){
            System.out.println(firstClient.getProducts().get(i));
        }

        System.out.println("Количество товаров в корзине " +firstClient.numberOfProducts());
        System.out.println("Общая стоимость товаров в корзине:  " +firstClient.totalPrice());
    }
}
