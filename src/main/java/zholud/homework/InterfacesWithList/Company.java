package zholud.homework.InterfacesWithList;

import java.util.ArrayList;

public class Company implements IdealCompany {
    private String name;
    private ArrayList<Worker> workers = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    //region getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    //endregion


    @Override
    public void recruitWorker(Worker name) {
        for (Worker worker : workers) {
            if (worker.equals(name)) {
                System.out.println("Этот работник уже есть в компании");
                return;
            }
        }
        workers.add(name);
    }

    @Override
    public void dismissLastWorker() {
        if (workers.size() == 0) {
            return;
        }
        workers.remove(workers.size() - 1);
    }

    @Override
    public void dismissWorker(Worker person) {
        for (Worker worker : workers) {
            if (worker.equals(person)) {
                workers.remove(person);
                return;
            }
            System.out.println("Такого работника нет в компании");
        }
    }
}