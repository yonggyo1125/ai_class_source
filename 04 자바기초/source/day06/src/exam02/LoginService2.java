package exam02;

public class LoginService2 {
    public void process(String userId, String userPw) {
        if (!userId.equals("user01")) {
            throw new UserId2Exception("아이디가 일치하지 않습니다.");
        }

        if (!userPw.equals("12345")) {
            throw new UserPw2Exception("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인 성공....");
    }
}
