import java.io.*;
public class LaunchFile2
{
	public static void main(String args[]) throws IOException
	{
			
			//File dir = new File("PWJAVA");
			//System.out.println(dir.exists());//false
			
			//dir.mkdir();
			//System.out.println("dir is refering to directory PWJAVA : " +dir.isDirectory());//true

			//File file = new File(dir,"pwskill.txt");
			//file.createNewFile();
			//System.out.println(" file is refering to pwskill.txt  : " +file.exists());

			int count = 0;
			String s = "IO";
			File f = new File(s);
			String str[]=f.list();
			for(String name : str)
			{
				count++;
				System.out.println(name);
			}
			System.out.println("Number of file is :" + count);			
	}
}