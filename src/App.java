import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader fileBuffer = new BufferedReader(fileInput);
        fileBuffer.mark(200);
        
        Scanner sc = new Scanner(fileBuffer);
        
        
        fileBuffer.reset();
        FileWriter output = new FileWriter("output.txt");
        BufferedWriter bufferOutput = new BufferedWriter(output);
        
        sc.useDelimiter(",");
        
        while (sc.hasNext()) {
            String file = sc.next();
            bufferOutput.write(file);
            bufferOutput.newLine();
        }
        
        bufferOutput.flush();
        
        fileInput.close();
        fileBuffer.close();
        sc.close();
        output.close();
        bufferOutput.close();

    }
}
