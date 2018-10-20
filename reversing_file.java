import java.util.*;
import java.io.*;
import java.net.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.Scanner;
public class reversing_file {
    public static void main(String args[])
{
    try{
    File f=new File("C:\\Users\\dhair\\Desktop\\Yaari.mp3");
    File f1=new File("C:\\Users\\dhair\\Desktop\\3.mp3");
    FileInputStream fis=new FileInputStream(f);
    FileOutputStream fos=new FileOutputStream(f1);
    
    int length=(int)f.length();
    System.out.println(length);
    int k,count=0;
    while((k=fis.read())!=-1)
    {
        if(count>=length/2)
        {
            fos.write(k);
        }
        count++;
       
    }
    while((k=fis.read())!=-1)
    {
        if(count==length/2)
        {
            k=-1;
            break;
        }
        else
        {
            fos.write(k);
        }
        count++;
    }
       System.out.print("file created");
     }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}

