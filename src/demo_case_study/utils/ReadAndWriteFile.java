package demo_case_study.utils;



import demo_case_study.models.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void writeFile(String pathFile, List<String> stringList){
        File file = new File("src\\data\\bookings.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str:
                 stringList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public List<Booking> readFile(String pathFile){
        List<Booking> stringList = new ArrayList<>();

        File file = new File("src\\data\\bookings.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader =  new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[6];
            while ((line=bufferedReader.readLine())!=null){
                strings = line.split(",");
                stringList.add(new Booking(strings[0],strings[0],strings[0],strings[0],strings[0],strings[0]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }
}
