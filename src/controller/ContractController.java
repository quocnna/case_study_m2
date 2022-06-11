package controller;

import model.Contract;
import service.ContractService;
import service.ContractServiceImpl;

import java.util.List;

public class ContractController {
    private ContractService contractService = new ContractServiceImpl();

    public void create(Contract contract) {
        contractService.create(contract);
    }

    public void update(Contract contract) {
        contractService.update(contract);
    }

    public List<Contract> findAll(){
        return contractService.findAll();
    }
}
