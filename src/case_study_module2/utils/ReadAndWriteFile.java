package case_study_module2.utils;

import case_study_module2.models.Booking;
import case_study_module2.models.Contract;
import case_study_module2.models.enums.*;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;

import java.io.*;
import java.util.*;

public class ReadAndWriteFile {

    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    final String CONTRACTS_FILE = "src\\case_study_module2\\data\\contracts.csv";
    final String VILLAS_FILE = "src\\case_study_module2\\data\\villas.csv";
    final String HOUSE_FILE = "src\\case_study_module2\\data\\houses.csv";
    final String ROOMS_FILE = "src\\case_study_module2\\data\\rooms.csv";



    public void writeFile(String pathFile, List<String> list) {
        File file = new File(pathFile);
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
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

    public void writeBookingFile(String pathFile, Set<String> list) {
        File file = new File(pathFile);
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
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

        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
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

    public LinkedList<Customer> readFileCustomer(String pathFile) {
        LinkedList<Customer> customerList = new LinkedList<>();

        File file = new File(pathFile);
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
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
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
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
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
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
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                rooms.add(new Room(strings[0],strings[1],Double.parseDouble(strings[2]),Double.parseDouble(strings[3]),Integer.parseInt(strings[4]),RentType.valueOf(strings[5]),strings[6]));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rooms;
    }

    public Set<Booking> readFileBooking(String pathFile) {
        Set<Booking> bookings = new TreeSet<>(new BookingComparator());

        File file = new File(pathFile);
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                bookings.add(new Booking(Integer.parseInt(strings[0]),strings[1],strings[2],this.convertCustomer(strings[3]), this.convertFacility(strings[4]),RentType.valueOf(strings[5])));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookings;
    }

    public Facility convertFacility(String str){
        List<Facility> facilityList = new ArrayList<>();
        facilityList.addAll(this.readFileVilla(VILLAS_FILE));
        facilityList.addAll(this.readFileHouse(HOUSE_FILE));
        facilityList.addAll(this.readFileRoom(ROOMS_FILE));
        Facility result = null;

        for (Facility facility:
             facilityList) {
            if(str.equals(facility.getServiceName())){
                result = facility;
            }
        }
        return  result;
    }

    public Customer convertCustomer(String id){
        List<Customer> customerList = this.readFileCustomer(CUSTOMERS_FILE);
        Customer customer = null;
        for(Customer customer1:customerList){
            if  (id.equals(customer1.getId())) {
                customer = customer1;
            }
        }
        return customer;
    }



    public List<Contract> readFileContract(String pathFile) {
        List<Contract> contracts = new ArrayList<>();

        File file = new File(pathFile);
        if(!file.exists()){
            try {
                throw new UserException("File not found");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(" ,");
                contracts.add(new Contract(strings[0],this.bookingConvert(strings[1]),Double.parseDouble(strings[2]),Double.parseDouble(strings[3]),this.convertCustomer(strings[4])));
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contracts;
    }

    public Booking bookingConvert(String str){
        Set<Booking> bookingSet = this.readFileBooking(BOOKINGS_FILE);
        Booking bookingResult = null;
        for (Booking booking:
             bookingSet) {
            if(Integer.parseInt(str) == (booking.getBookingId())){
                bookingResult = booking;
            }
        }
        return bookingResult;
    }

    public Customer customerConvert(String str){
        List<Customer> customerList = this.readFileCustomer(CUSTOMERS_FILE);
        Customer customerResult = null;
        for(Customer customer :customerList){
            if(str.equals(customer.getId())){
                customerResult = customer;
            }
        }
        return customerResult;
    }


}
