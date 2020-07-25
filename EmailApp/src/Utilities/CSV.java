package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //this method will read date and return as a list
    public static List<String[]> read(String file){
            List<String[]> data = new LinkedList<String[]>();
            String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
               while ((dataRow = br.readLine()) !=null){
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);}
            } catch (IOException e) {
                System.out.println("Can't read file");
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file");
            e.printStackTrace();
        }
        return data;
    }
}

