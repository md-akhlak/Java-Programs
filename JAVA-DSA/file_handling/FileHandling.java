package file_handling;

import java.io.*;
public class FileHandling {
    public static void main(String[] args) {

        File myFile = new File("file.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("File created successfully"+ myFile.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("ERROR" + e.getCause());
        }
        
    }
}
