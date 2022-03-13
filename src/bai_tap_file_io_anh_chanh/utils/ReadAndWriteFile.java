package bai_tap_file_io_anh_chanh.utils;

import bai_tap_file_io_anh_chanh.models.Car;
import bai_tap_file_io_anh_chanh.models.Motorbike;
import bai_tap_file_io_anh_chanh.models.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public <T> void writeFile(String filePath, List<T> t,boolean append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter= null;
        try{
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T str:t
                 ) {
                bufferedWriter.write(str.toString());
                bufferedWriter.newLine();
            }
        }catch (Exception e){
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


    public List<Car> readFileCars(String filePath){
        List<Car> listCar = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine())!=null){
                strings=line.split(", ");
                Car car = new Car(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]),strings[5]);
                listCar.add(car);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listCar;
    }

    public List<Motorbike> readFileMotorbikes(String filePath){
        List<Motorbike> listMotor = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine())!=null){
                strings=line.split(", ");
                Motorbike motorbike = new Motorbike(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]));
                listMotor.add(motorbike);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listMotor;
    }

    public List<Truck> readFileTrucks(String filePath){
        List<Truck> listTruck = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine())!=null){
                strings=line.split(", ");
                Truck truck = new Truck(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]));
                listTruck.add(truck);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listTruck;
    }


}
