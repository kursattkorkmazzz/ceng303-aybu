

import operations.Operation1;
import operations.Operation2;
import operations.Operation3;

public class AssignmentApp {
    public static void main(String[] args) {
        String pathFor1M;
        String pathFor50M;
        try{
             pathFor1M = args[0];
             pathFor50M = args[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lütfen gereken tüm dosyaların yolunu parametre olarak veriniz.(1Mint.txt, 50Mint.txt)");
            return;
        }


        // Operation 1 for 1Mint.txt
        System.out.println("\n==================== OUTPUT for Operation1 with 1Mint.txt ====================\n");
        Operation1 operation1_1 = new Operation1(pathFor1M,1_000_000);
        operation1_1.printStatus(900_000,9);

        // Operation 1 for 50Mint.txt
        System.out.println("\n==================== OUTPUT for Operation1 with 50Mint.txt ====================\n");
        Operation1 operation1_2 = new Operation1(pathFor50M,50_000_000);
        operation1_2.printStatus(45_000_000,9);

        // Operation 2 for 1Mint.txt
        System.out.println("\n==================== OUTPUT for Operation2 with 1Mint.txt ====================\n");
        Operation2 operation2_1 = new Operation2(pathFor1M);
        try{
            operation2_1.printStatus();
        }catch (Exception e){
            System.out.println(e);
            return;
        }

        // Operation 2 for 50Mint.txt
        System.out.println("\n==================== OUTPUT for Operation2 with 50Mint.txt ====================\n");
        Operation2 operation2_2 = new Operation2(pathFor50M);
        try{
            operation2_2.printStatus();
        }catch (Exception e){
            return;
        }


        // Operation 3 for 1Mint.txt
        System.out.println("\n==================== OUTPUT for Operation3 with 1Mint.txt ====================\n");
        Operation3 op3_1 = new Operation3(pathFor1M, 900000,9);
        op3_1.printStatus();

        // Operation 3 for 50Mint.txt
        System.out.println("\n==================== OUTPUT for Operation3 with 50Mint.txt ====================\n");
        Operation3 op3_2 = new Operation3(pathFor50M, 45000000);
        op3_2.printStatus();



    }
}