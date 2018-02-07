package com.ramchaudhary;

import java.util.ArrayList;

public class StateList {

    private ArrayList<String> stateList = new ArrayList<String>();

    public void addStateItem(String Item) {
        stateList.add(Item);
    }

    public void printStateList() {

        System.out.println("You have " + stateList.size() + "states in your list.");
        for(int i=0; i<stateList.size();i++){
            System.out.println(i+1 + ". " +stateList.get(i));
        }
    }

    public void modifyStateItem(int position, String newItem){
        stateList.set(position, newItem);
        System.out.println("State " + (position+1) + " has been modified.");
    }

    public String findItem(String searchItem){

        int position = stateList.indexOf(searchItem);
        if(position>=0){
            return stateList.get(position);
        }
        return null;
    }
}
