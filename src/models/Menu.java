package models;

import lists.Lista;

import java.util.Scanner;

public class Menu {

    private Lista myList;

    public Menu(Lista myList) {
        this.myList = myList;
    }

    public Lista getMyList() {
        return myList;
    }

    public void runBasicList() {
        String i = "0";
        Scanner s = new Scanner(System.in);
        while (!i.equals("4")) {
            getMyList().viewList();
            System.out.println("Seleccione Opción: 1) Reproducir - 2) Borrar Canción - 3) Lista de Canciones - 4) Salir.");
            i = s.nextLine();
            switch (i) {
                case "1":
                    getMyList().play();
                    break;
                case "2":
                    getMyList().deleteSong();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Opción no Válida!");
                    break;
            }
        }
    }

    public void runPremiumList() {
        String i = "0";
        Scanner s = new Scanner(System.in);
        while (!i.equals("4")) {
            System.out.println("Seleccione Opción: 1) Reproducir - 2) Borrar Canción - 3) Lista de Canciones - 4) Salir.");
            i = s.nextLine();
            switch (i) {
                case "1":
                    getMyList().play();
                    break;
                case "2":
                    getMyList().deleteSong();
                    break;
                case "3":
                    getMyList().viewList();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Opción no Válida!");
                    break;
            }
        }
    }

}