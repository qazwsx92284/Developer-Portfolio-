package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayListChallengeProject arrayListChallengeProject = new ArrayListChallengeProject();

    public static void main(String[] args) {
        printInstruction();

    }

    public static void printInstruction() {
        boolean flag = true;
        int instruction;
        while(flag) {
            System.out.println("------------------------------------------");
            System.out.println("For adding item, Press 1");
            System.out.println("For removing item, Press 2");
            System.out.println("For modifying list, Press 3");
            System.out.println("For viewing list, Press 4");
            System.out.println("For searching item, Press 5");
            System.out.println("For exiting the program, Press 6");

            System.out.println("Enter your choice");
            instruction = sc.nextInt();
            sc.nextLine();

            if(instruction == 1){
                addItem();
            }
            else if(instruction ==2) {
                removeItem();
            }
            else if(instruction ==3) {
                modifyList();
            }
            else if(instruction ==4) {
                viewList();
            }
            else if(instruction==5) {
                searchItem();
            }

            else if(instruction==6) {
                flag = false;
            }
        }
    }

    public static void addItem() {
        boolean flag = true;
        while(flag) {
            if(flag) {
                System.out.println("enter item");
                String item = sc.nextLine();
                arrayListChallengeProject.addItem(item);
                System.out.println(item + " was added");
                System.out.println("Do you want to add more? Press Y / N");
                String answer = sc.nextLine();
                if(answer.equalsIgnoreCase("Y")) {
                    flag = true;
                }
                else if(answer.equalsIgnoreCase("N")) {
                    flag = false;
                }
                else {
                    System.out.println("Wrong answer. Press Y/N");
                }
            }
            else {
                flag = false;
            }
        }

    }

    public static void removeItem() {
        System.out.println("Enter the index of item you want to remove");
        int position = sc.nextInt();
        sc.nextLine();
        arrayListChallengeProject.removeItem(position-1);

    }

    public static void modifyList() {
        System.out.println("Enter index of item want to modify");
        int position = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of new item");
        String newItem = sc.nextLine();
        arrayListChallengeProject.modifyItem(position, newItem);
    }

    public static void searchItem() {
        System.out.println("Enter the item name you are looking for");
        String searchItem = sc.nextLine();
        int index_s = arrayListChallengeProject.searchItem(searchItem);

        if(index_s>=0) {
            System.out.println(searchItem +" exists at the index of " +(index_s+1) );
        }
        else {
            System.out.println(searchItem + " does not exist");
        }
    }


    public static void viewList() {
        arrayListChallengeProject.getList();
        }

}
