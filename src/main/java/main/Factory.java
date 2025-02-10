package main;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines;

    public Factory(String name){
        this.name = name;
        this.machines = new ArrayList<Machine>();
    }

    public void addMachine(Machine machine){
        this.machines.add(machine);
    }

    public ArrayList<Machine> getMachines(){
        return this.machines;
    }
    
    public String getName(){
        return this.name;
    }
}
