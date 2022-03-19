package case_study_module2.services.impl;

import case_study_module2.controllers.ContractController;
import case_study_module2.models.Contract;
import case_study_module2.services.IContractService;
import case_study_module2.utils.ReadAndWriteFile;

import java.util.List;
import java.util.Scanner;

public class ContractServiceImpl implements IContractService {
    Scanner sc = new Scanner(System.in);
    final String CONTRACTS_FILE = "src\\case_study_module2\\data\\contracts.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Contract> contractList = readAndWriteFile.readFileContract(CONTRACTS_FILE);

    ContractController contractController = new ContractController();
    @Override
    public void add() {
        contractList.add(contractController.inputContract());
        readAndWriteFile.writeFile(CONTRACTS_FILE,contractController.writeContractToCSV(contractList));
    }

    @Override
    public void show() {
        contractController.displayContract(contractList);
    }

    @Override
    public void update() {
        System.out.println("Contract list :");
        contractList.forEach(System.out::println);
        System.out.print("Enter contract id to edit:");
        String contractId = sc.nextLine();
        boolean exist = false;
        while (!exist){
            while ("".equals(contractId)){
                System.out.println("Wrong input! Please re-type");
                contractId = sc.nextLine();
            }
            for (Contract contract:
                 contractList) {
                if(contractId.equals(contract.getContractId())){
                    exist = true;
                    contractController.editContract(contract);
                }
            }
            if(!exist){
                System.out.print("No exist! Please Re-type: ");
                contractId = sc.nextLine();
            }
        }

    }
}
