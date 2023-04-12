
import java.io.*;

public class LaunchBWFW {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJAVA");
        File file = new File(dir, "pwskill.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hey i am sayista yazdani");
        bw.newLine();
        bw.write(65);
        bw.newLine();

        char ch[] = { 'p', 'w', 's', 'j' };
        bw.write(ch);

        bw.flush();
        bw.close();
    }

}
