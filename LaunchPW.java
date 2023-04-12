import java.io.*;
public class LaunchPW {
    public static void main(String[] args) throws Exception {
        File dir = new File("PWJAVA");

        File file = new File(dir, "pwskill.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(97);
        pw.write("\n");

        pw.println("java");
        pw.println(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();
    }
    
}
