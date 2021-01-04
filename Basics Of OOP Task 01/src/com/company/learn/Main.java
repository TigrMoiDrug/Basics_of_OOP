package com.company.learn;

import java.util.Scanner;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class Main {

    public static void main(String[] args) {

        String text = "Николя Фламель родился в 1330 году в окрестностях Понтуаза в бедной семье.";
        Scanner sc = new Scanner(System.in);

        TextFile textFile = new TextFile(new Directory("D: Study/EPAM"), "Task 1", text);
        Operations workSpace = new Operations(textFile);

        System.out.println("Введите 1, чтобы вывести текст \n" +
                "2, чтобы переименовать файл \n" +
                "3, чтобы удалить файл \n" +
                "4, чтобы добавить текст :");

        int choice = sc.nextInt();

        if (choice == 1){
            workSpace.readTextFile();
        }

        else if (choice == 2){
            System.out.println("Введите новое имя файла: ");

            String newName = sc.next();
            workSpace.rename(newName);
        }

        else if (choice == 3){
            workSpace.delete();
            System.out.println("Файл удалён");
        }

        else if (choice == 4){
            System.out.println("Введите тект: ");

            String newText = sc.next();

            workSpace.addText(newText);

        }
        System.out.println(textFile.toString());
    }
}
