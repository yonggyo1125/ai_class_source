package exam01;

public class LoginService {
    public void process(String userId, String userPw) throws UserIdException, UserPwException {
        /**
         * userId - user01
         * userPw - 12345
         *
         */

            if (!userId.equals("user01")) {
                throw new UserIdException("아이디가 일치하지 않습니다.");
            }

            if (!userPw.equals("12345")) {
                throw new UserPwException("비밀번호가 일치하지 않습니다.");
            }

            // 아이디와 비번이 일치 하므로 로그인 처리
            System.out.println("로그인 처리 완료...");


    }
}
