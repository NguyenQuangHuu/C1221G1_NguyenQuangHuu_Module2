package ss16_io_text.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class CopyFileDemo {

    private static final String file = "src\\ss16_io_text\\bai_tap\\copy_file_text\\file.txt";
    private static final String fileCopy = "src\\ss16_io_text\\bai_tap\\copy_file_text\\file_copy.txt";
    public static void main(String[] args) {

        List<String> list = null;
        try {
            list = readFile(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        copyFile(fileCopy,list);
    }

    private static void copyFile(String stringFile,List<String> fileCopy1){
        File file = new File(stringFile);

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(int i = 0; i< fileCopy1.size();i++){

                if(i== fileCopy1.size()-1){
                    bufferedWriter.write(fileCopy1.get(i));
                }else{
                    bufferedWriter.write(fileCopy1.get(i)+",");
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
           e.printStackTrace();
        }

    }


    private static List<String> readFile(String stringFile) throws FileNotFoundException {
        List<String> strings = new ArrayList<>();
        File file = new File(stringFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        if(!file.exists()){
            throw new FileNotFoundException();
        }

        try{
            String line = null;
            String[] arr = null;
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while((line=bufferedReader.readLine())!=null){
                arr = line.split(",");

            }
            for(int i = 0; i< Objects.requireNonNull(arr).length; i++){
                strings.add(arr[i]);
            }

            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return strings;
    }


}
