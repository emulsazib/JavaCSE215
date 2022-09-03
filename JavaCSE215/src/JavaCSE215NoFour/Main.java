package JavaCSE215NoFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        File file=new File("student.txt");
        try{
            FileReader fileReader=new FileReader(file);
            if(file.exists()){
                System.out.println("File Found");
            }else {
                throw new FileNotFoundException("File Not Found");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
