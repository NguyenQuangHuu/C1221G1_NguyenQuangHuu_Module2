package ss16_io_text.bai_tap.read_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVDemo {
    private static final String file = "D:\\Codegym\\C1221G1-NguyenQuangHuu\\module_2\\src\\ss16_io_text\\bai_tap\\read_csv\\country.csv";
    public static void main(String[] args){
        try{
            List<Country> countries = readCSVFile(file);
            countries.forEach(country -> System.out.println(country.getInformation()));

        }catch (IOException e){
            System.out.println("Lỗi nhập xuất");
        }
    }

    private static List<Country> readCSVFile(String filePath) throws IOException {
        List<Country> countries = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            String line = "";
            String[] arr = null;
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                countries.add(new Country(Integer.parseInt(arr[0]),arr[1],arr[2]));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bufferedReader.close();
            fileReader.close();
        }
        return countries;
    }
}
