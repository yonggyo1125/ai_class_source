package exam05;

public class JoinService {

    private static JoinService instance;

    private JoinService() {}

    // 회원 가입 처리 기능
    public void process() {
        System.out.println("회원 가입 처리 했음!");
    }

    public static JoinService getInstance() {
        if (instance == null) {
            instance = new JoinService();
        }

        return instance;
    }
}
