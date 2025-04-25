package exam01;

public class Ex07 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        try {
            service.process("user02", "1234");
        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
        }
    }
}
