package zholud.homework.Interfaces;

public class SalaryValidateException extends IllegalArgumentException {
    public SalaryValidateException() {
    }

    public SalaryValidateException(String message) {
        super(message);
    }
}
