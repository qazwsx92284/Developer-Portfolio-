package com.company;

import java.util.ArrayList;

public class ArrayListChallengeProject {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String newItem) {

        groceryList.add(newItem);
    }

    public void removeItem(int position) {

        groceryList.remove(position);
    }

    public void modifyItem(int position, String newItem) {

        groceryList.set(position-1, newItem);
    }

    public int searchItem(String searchItem) {
        int index = groceryList.indexOf(searchItem);

        if(index>=0) {
            return index;
        } else{
            return -1;
        }
    }

    public int getSize() {
        int size = groceryList.size();
        return size;
    }

    public void getList() {
        for(int i =0; i<groceryList.size(); i++) {
            System.out.println((i+1)+ ". " + groceryList.get(i));
        }
    }


}
