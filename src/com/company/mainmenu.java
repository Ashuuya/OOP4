package com.company;

import java.util.Scanner;

public class mainmenu {
    private static final Info dialog;
    private static final Scanner scanner = new Scanner(System.in);


    static{
        dialog = new Info();
        dialog.add(new JustNote("Вова", "Привет!"));
        dialog.add(new AddressNote( "Лиза", "Новый год", "На съёмной квартире"));
    }

    public static void menu(){
        int choice = -1;
        do{
            System.out.println("1) Вывести все заметки");
            System.out.println("2) Написать заметку");
            System.out.println("3) Написать заметку с выделенным адресом");
            System.out.println("4) Сохранить заметку в закладки");
            System.out.println("5) Повысить важность");
            System.out.println("6) Пометить заметку как выполненную");
            System.out.println("7) Вывести закладки");
            System.out.println("0) Выход");

            String author;
            String content;
            String address;
            int id;
            Note srcPost;


            choice = readInt();
            switch (choice){
                case 1:
                    System.out.println("_________________________________________________________");
                    dialog.print();
                    System.out.println("_________________________________________________________");
                    break;
                case 2:
                    System.out.print("Автор: ");
                    author = scanner.nextLine();
                    System.out.print("Текст: ");
                    content = scanner.nextLine();
                    dialog.add(new JustNote( author, content));
                    break;
                case 3:
                    System.out.print("Автор: ");
                    author = scanner.nextLine();
                    System.out.print("Текст: ");
                    content = scanner.nextLine();
                    System.out.print("Адрес: ");
                    address = scanner.nextLine();
                    dialog.add(new AddressNote( author, content, address));
                    break;
                case 4:
                    System.out.print("Автор: ");
                    author = scanner.nextLine();
                    System.out.print("Текст: ");
                    content = scanner.nextLine();
                    System.out.print("ID заметки: ");
                    id = readInt();

                    srcPost = dialog.getPost(id);
                    if (srcPost != null) {
                        if(!(srcPost instanceof FavorNote)){
                            srcPost.share();
                            srcPost.like();
                            dialog.add(new FavorNote(author, content, srcPost));
                        }else{
                            System.out.println("Вы чего? Нельзя выбирать уже помеченное!");
                        }
                    }
                    else
                        System.out.println("Нет такой заметки!");
                    break;
                case 5:

                    System.out.print("ID заметки: ");
                    id = readInt();
                    srcPost = dialog.getPost(id);
                    if (srcPost != null) {
                        srcPost.like();
                    }
                    else
                        System.out.println("Нет такой заметки");
                    break;
                case 6:
                    System.out.print("ID заметки: ");
                    id = readInt();
                    dialog.Remove(id);
                    break;
                case 7:
                    System.out.print("Чьи закладки вы хотите просмотреть? Введите имя: ");
                    author = scanner.nextLine();
                    dialog.print(author);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Выберите пункт из меню.");
            }
        }while (choice != 0);
    }

    private static int readInt() {
        int readed = -1;
        try{
            readed = Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException ex)
        {
            System.out.println("Вводите только цифры");
            readed = readInt();
        }
        return readed;
    }

    }

