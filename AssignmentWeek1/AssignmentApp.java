import operations.Operation1;

public class AssignmentApp {
    public static void main(String[] args) {
        String pathFor1M = args[0];
        String pathFor50M = args[1];


        // Operation 1 for 1Mint.txt
        System.out.println("\nOUTPUT for Operation1 with 1Mint.txt ====================\n");
        Operation1 operation1_1 = new Operation1(pathFor1M,1_000_000);
        operation1_1.printStatus(900_000,9);
        System.out.println("\nOUTPUT for Operation1 with 50Mint.txt ====================\n");
        // Operation 1 for 50Mint.txt
        Operation1 operation1_2 = new Operation1(pathFor50M,50_000_000);
        operation1_2.printStatus(45_000_000,9);
    }
}