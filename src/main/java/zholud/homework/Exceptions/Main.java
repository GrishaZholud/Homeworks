package zholud.homework.Exceptions;

public class Main {
    public static void main(String[] args) {
        authentication("login", "password", "password");
    }


    public static boolean authentication(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[a-zA-Z]+\\.?")) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            }
            if (login.length() >= 20) {
                throw new WrongLoginException("Логин превышает допустимую длину");
            }
            if (!password.matches("[a-zA-Z]+\\.?")) {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            }
            if (password.length() >= 20) {
                throw new WrongPasswordException("Пароль превышает допустимую длину");
            }
            if (password != confirmPassword) {
                throw new WrongPasswordException("Введён неправильный пароль");
            }
        }catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
            return false;
        }
        System.out.println("Вы авторизировались");
        return true;
    }
}




