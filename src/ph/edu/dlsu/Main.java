package ph.edu.dlsu;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String p = getInput("Input a boolean value for X [true/false]: ");
        String q = getInput("Input a boolean value for Y [true/false]: ");

        if (p.equals("0"))
            p = "false";

        if (q.equals("1"))
            q = "true";

        if (p.equals("1"))
            p = "true";

        if (q.equals("0"))
            q = "false";

        boolean X = Boolean.parseBoolean(p);
        boolean Y = Boolean.parseBoolean(q);

            System.out.println("LOGIC CALCULATOR MENU:");
            System.out.println("[1] AND");
            System.out.println("[2] OR");
            System.out.println("[3] XOR");
            System.out.println("[4] NAND");
            System.out.println("[5] NOR");
            System.out.println("[6] XNOR");
            System.out.println("[7] IMPLICATION");
            System.out.println("[8] QUIT PROGRAM");

            String strOption = getInput("Your choice here [1/2/3/4/5/6/7/8]: ");

            int intOption = Integer.parseInt(strOption);

        switch(intOption){
            case 1:
                andTable(X, Y);
                break;
            case 2:
                orTable(X, Y);
                break;
            case 3:
                xorTable(X, Y);
                break;
            case 4:
                nandTable(X, Y);
                break;
            case 5:
                norTable(X, Y);
                break;
            case 6:
                xnorTable(X, Y);
                break;
            case 7:
                impliTable(X, Y);
                break;
            case 8:
                System.out.println("Program Terminated.");
                break;
            default:
                System.out.println("Input cannot be recognized.");
                break;

        }
    }

    private static void impliTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("       IMPLICATION TRUTH TABLE        ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X    Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y+ "\t|\t" +(!y || y)+ "\t|");
        if((x == true && y == false) || (x == true && y == true) || (x == false && y == false)) {
            System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" + !(y && !x) + "\t|");
            System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" + !(x && !y) + "\t|");
        }
        else if((x == false && y == true) || (x == true && y == true) || (x == false && y == false)) {
            System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" + (!y && x) + "\t|");
            System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" + (!x && y) + "\t|");
        }
        System.out.println("|\t" +x+ "\t|\t" +x+ "\t|\t" +(!x || x)+ "\t|");
    }

    private static void xnorTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("             XNOR TRUTH TABLE           ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X    Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y+ "\t|\t" +!(y ^ y)+ "\t|");
        System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" +!(y ^ x)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x ^ y)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +x+ "\t|\t" +!(x ^ x)+ "\t|");
    }

    private static void norTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("             NOR TRUTH TABLE           ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X    Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y+ "\t|\t" +!(y || y)+ "\t|");
        System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" +!(y || x)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x || y)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +x+ "\t|\t" +!(x || x)+ "\t|");
    }

    private static void nandTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("           NAND TRUTH TABLE           ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X    Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y+ "\t|\t" +!(y && y)+ "\t|");
        System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" +!(y && x)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x && y)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +x+ "\t|\t" +!(x && x)+ "\t|");
    }

    private static void xorTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("             XOR TRUTH TABLE           ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X ^^ Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y+ "\t|\t" +(y ^ y)+ "\t|");
        System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" +(y ^ x)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x ^ y)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +x+ "\t|\t" +(x ^ x)+ "\t|");
    }

    private static void orTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("             OR TRUTH TABLE           ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X || Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y + "\t|\t" +(y || y)+ "\t|");
        System.out.println("|\t" +y+ "\t|\t" +x + "\t|\t" +(y || x)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +y + "\t|\t" +(x || y)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +x + "\t|\t" +(x || x)+ "\t|");
    }

    private static void andTable(boolean x, boolean y) {
        System.out.println("");
        System.out.println("======================================");
        System.out.println("            AND TRUTH TABLE           ");
        System.out.println("======================================");
        System.out.println("|     X     |    Y      |   X && Y  |");
        System.out.println("--------------------------------------");
        System.out.println("|\t" +y+ "\t|\t" +y+ "\t|\t" +(y && y)+ "\t|");
        System.out.println("|\t" +y+ "\t|\t" +x+ "\t|\t" +(y && x)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x && y)+ "\t|");
        System.out.println("|\t" +x+ "\t|\t" +x+ "\t|\t" +(x && x)+ "\t|");
    }

    private static String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

}
