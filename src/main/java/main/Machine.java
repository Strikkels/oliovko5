package main;

public class Machine {
    private String type;
    private String model;
    protected Worker operator;
    
    public Machine(String type, String model, Worker operator){
        this.type = type;
        this.model = model;
        this.operator = operator;
    }

    public String getMachineDetails(){
        String info = "Koneen tiedot: " + this.type + ", " + this.model;
        return info;
    }

}
