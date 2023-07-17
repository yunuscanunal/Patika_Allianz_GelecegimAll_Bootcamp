package service;

import model.Branch;

import java.util.ArrayList;
import java.util.List;

public class InitialDataService {

    public static List<Branch> loadInitialDataForBranch() {

        BranchService branchService = new BranchService();

        List<Branch> branchList = new ArrayList<>();

        Branch branch1 = branchService.createBranch("Bachata");
        branchList.add(branch1);

        Branch branch2 = branchService.createBranch("Salsa");
        branchList.add(branch2);

        Branch branch3 = branchService.createBranch("Halay");
        branchList.add(branch3);

        return branchList;

    }


}
