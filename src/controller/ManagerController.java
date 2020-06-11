package controller;
import view.*;
import model.*;
import model.entities.Worker;


public class ManagerController {

    protected model.ManagerModel model;


    public ManagerController() {
        this.model = new ManagerModel();
    }

    public String ChangeHourlySalary(int workerId, double newSalary) {
        return model.ChangeHourlySalary(workerId, newSalary);
    }

    public void addWorker(Worker w) {
        model.addWorker(w);
    }

    public String watchMonthlySalary(int workerId)
    {
        return model.watchMonthlySalary(workerId);
    }

    public boolean isExistsWorker(int workerId)
    {
        return model.isExistsWorker(workerId);
    }



}
