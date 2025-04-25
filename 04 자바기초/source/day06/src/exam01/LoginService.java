package exam01;

public class LoginService {
    public void process(String userId, String userPw) {
        /**
         * userId - user01
         * userPw - 12345
         *
         */
        try {
            if (!userId.equals("user01")) {
                throw new UserIdException("아이디가 일치하지 않습니다.");
            }

            if (!userPw.equals("12345")) {
                throw new UserPwException("비밀번호가 일치하지 않습니다.");
            }
        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
        }
    }
}
