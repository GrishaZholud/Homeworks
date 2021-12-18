package zholud.homework.Interfaces;


public class Application {
    public static void main(String[] args) {
        Person person = new Person("Edvin", 17,20);
        Worker worker = new Person("Donald", 25,2000);
        Company company = new Company("Apple");

        company.recruitWorker(person);
        company.recruitWorker(worker);
        company.printAllWorkers();
        company.dismissWorker(worker);
        company.printAllInformationAboutWorker(worker);
    }
}
