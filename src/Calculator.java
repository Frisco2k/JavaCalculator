import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.sql.SQLOutput;


public class Calculator {

    public static void createHistory(){
        try{
            File history = new File("History.txt");
            if(history.createNewFile()){
                System.out.println("File created :  " + history.getName());
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToHistory(double result) {
        try {
            FileWriter writer = new FileWriter("History.txt", true);
            String answer = result + "";
            writer.write(answer);
            writer.close();
            System.out.println("Result written to history file successfully");
        }catch (IOException e){
            System.out.println("Error has occurred during writing... ");
            e.printStackTrace();
        }
    }

    public static double addition(double a, double b){
        double result = a + b;
        writeToHistory(result);
        return result;
    }

    public static double subtraction(double a, double b){
        double result = a - b;
        writeToHistory(result);
        return result;
    }

    public static double division(double a, double b){
        if(b == 0){
            System.out.println("error, division by 0 not allowed");
            return -1;
        }

        double result = a / b;
        writeToHistory(result);
        return result;
    }

    public static double multiplication(double a, double b){
        double result = a * b;
        writeToHistory(result);
        return result;
    }

    public static double remainder(double a, double b){
        double result = a % b;
        writeToHistory(result);
        return result;
    }

    public static void refreshHistory(){
        File delete = new File("History.txt");
        if(delete.delete()){
            System.out.println("History file deleted");
        }

        createHistory();
    }

}
