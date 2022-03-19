package case_study_module2.utils;

import case_study_module2.models.Booking;
import case_study_module2.models.Contract;
import case_study_module2.models.enums.*;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    final String CONTRACTS_FILE = "src\\case_study_module2\\data\\contracts.csv";


    public void writeFile(String pathFile, List<String> list) {
        File file = new File(pathFile);

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str :
                    list) {

                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    public List<Employee> readFileEmployee(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[10];
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                employeeList.add(new Employee(strings[0], strings[1], strings[2], Gender.valueOf(strings[3]), strings[4], strings[5], strings[6], Levels.valueOf(strings[7]), Position.valueOf(strings[8]), Double.parseDouble(strings[9])));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public List<Customer> readFileCustomer(String pathFile) {
        List<Customer> customerList = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                customerList.add(new Customer(strings[0], strings[1], strings[2], Gender.valueOf(strings[3]), strings[4], strings[5], strings[6], Membership.valueOf(strings[7]),strings[8]));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    public List<Villa> readFileVilla(String pathFile) {
        List<Villa> villas = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                villas.add(new Villa(strings[0],strings[1],Double.parseDouble(strings[2]),Double.parseDouble(strings[3]),Integer.parseInt(strings[4]),RentType.valueOf(strings[5]),strings[6],Double.parseDouble(strings[7]),Integer.parseInt(strings[8])));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return villas;
    }

    public List<House> readFileHouse(String pathFile) {
        List<House> houses = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                houses.add(new House(strings[0],strings[1],Double.parseDouble(strings[2]),Double.parseDouble(strings[3]),Integer.parseInt(strings[4]),RentType.valueOf(strings[5]),strings[6],Integer.parseInt(strings[7])));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return houses;
    }

    public List<Room> readFileRoom(String pathFile) {
        List<Room> rooms = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                rooms.add(new Room(strings[0],strings[1],Double.parseDouble(strings[2]),Integer.parseInt(strings[3]),Integer.parseInt(strings[4]),RentType.valueOf(strings[5]),strings[6]));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rooms;
    }

    public List<Booking> readFileBooking(String pathFile) {
        List<Booking> bookings = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                bookings.add(new Booking(strings[0],strings[1],strings[2],strings[3],strings[4],RentType.valueOf(strings[5])));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookings;
    }



    public List<Contract> readFileContract(String pathFile) {
        List<Contract> contracts = new ArrayList<>();

        File file = new File(pathFile);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                contracts.add(new Contract(strings[0],strings[1],Double.parseDouble(strings[2]),Double.parseDouble(strings[3]),strings[4]));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contracts;
    }
}
