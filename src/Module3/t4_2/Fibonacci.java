package Module3.t4_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.FileReader;
public class Fibonacci {
    public static void main(String[] args) {
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;
        BigInteger num3;



        try (Writer writer = new FileWriter("file.csv");
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             BufferedReader bufferedReader = new BufferedReader(new FileReader("file.csv"))) {
            bufferedWriter.write("Fibonacci;");
            bufferedWriter.newLine();
            bufferedWriter.write(num1+";");
            bufferedWriter.newLine();
            bufferedWriter.write(num2+";");

            for (int i = 0;i<98;i++) {
                bufferedWriter.newLine();
                num3 = num1.add(num2);

                bufferedWriter.write(num3+";");
                num1 = num2;
                num2 = num3;
            }
            bufferedWriter.flush();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

