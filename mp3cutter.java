import java.io.*;
public class mp3cutter 
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("E:\\Marshmello & Anne-Marie - FRIENDS 320kbps(Onmirchi.in).mp3");
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream("E:\\q.mp3");
			FileOutputStream fos1 = new FileOutputStream("E:\\q1.mp3");
			FileOutputStream fos2 = new FileOutputStream("E:\\full.mp3");
			int k = (int) f.length();
			System.out.println(k);
			int i=0;
			while(i!=(8222439/2))
		    {
				fos.write(fis.read());
				i++;
		    }
			System.out.println("Done 1");
			while(i!=(8222439))
			{
				fos1.write(fis.read());
				i++;
			}
			System.out.println("Done 2");
			i=0;
			File f1=new File("E:\\q.mp3");
			FileInputStream fis1=new FileInputStream(f1);
			File f2=new File("E:\\q1.mp3");
			FileInputStream fis2=new FileInputStream(f2);
			while(i!=(8222439))
		    {
				if(i<(8222439/2))
				{
					fos2.write(fis2.read());
					i++;
				}
				else
				{
					fos2.write(fis1.read());
					i++;
				}
		    }
			System.out.println("Done 3");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
