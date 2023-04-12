import java.io.*;
public class LaunchFW
{
	public static void main(String args[]) throws IOException
	{
			File dir = new File("Avneet_kaur");
			//dir.mkdir();
			File file = new File(dir,"pw.txt");
			//file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write("pw");
			fw.write("\n");
			fw.write(65);
			fw.write("\n");
			fw.write(97);
			fw.write("\n");
			char ch[] = {'j','a','v','a'};
			fw.write(ch);

			fw.close();
			System.out.println("I want to marry with sayista yazdani");
					
	}
}