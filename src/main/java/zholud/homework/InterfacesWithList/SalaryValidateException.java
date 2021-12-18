package zholud.homework.InterfacesWithList;

public class SalaryValidateException extends IllegalArgumentException{
    public SalaryValidateException() {
    }

    public SalaryValidateException(String message) {
        super(message);
    }
}
