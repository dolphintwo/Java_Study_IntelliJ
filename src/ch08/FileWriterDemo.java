package ch08;

import java.io.*;

public class FileWriterDemo {
	public static void main(String args[]){
        try{
            FileWriter a=new FileWriter("E:/ws/ecws/Java_Study/src/ch8/DemoFile2.txt");
            for(int i=32;i<126;i++){
                a.write(i);
            }
            a.close();
        }
        catch(IOException e){}
    }
}
