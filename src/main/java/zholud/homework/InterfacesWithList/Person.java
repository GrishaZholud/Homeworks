package zholud.homework.InterfacesWithList;

public class Person implements Worker {
    private String name;
    private int age;
    private int salary;
    private String companyName;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //region getter/setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //endregion

    @Override
    public boolean checkSalaryGreaterAge() {
        return salary >= age;
    }

    @Override
    public boolean existSalary() {
       return salary > 0;
    }
}
