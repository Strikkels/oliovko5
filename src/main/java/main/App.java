package main;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        Factory factory = null;

        System.out.println( "Anna tehtaalle nimi: " );
        String name = sc.nextLine();
        factory = new Factory(name);

        boolean exit = false;
        while(!exit){
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()){
                int choise = sc.nextInt();
                sc.nextLine();

                switch(choise){
                    case 1:
                        System.out.println( "Anna koneen tyyppi: " );
                        String machineType = sc.nextLine();
                        System.out.println( "Anna koneen malli: " );
                        String machineModel = sc.nextLine();
                        System.out.println( "Anna työntekijän nimi: " );
                        String operatorName = sc.nextLine();
                        System.out.println( "Anna työntekijän ammattinimike: " );
                        String operatorJob = sc.nextLine();
                        Worker machineOperator = new Worker(operatorName, operatorJob);
                        Machine machine = new Machine(machineType, machineModel, machineOperator);
                        factory.addMachine(machine);
                        System.out.println("Kone lisätty!");
                        break;
                    case 2:
                        System.out.println("Tehtaassa " + factory.getName() + " löytyy seuraavat koneet:");
                        ArrayList<Machine> machines = factory.getMachines();
                        for(int i = 0; i < machines.size(); i++){
                            machines.get(i).getMachineDetails();
                            

                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Virheellinen valinta");
                        break;
                }
            }
        }
        sc.close();
    }
}
