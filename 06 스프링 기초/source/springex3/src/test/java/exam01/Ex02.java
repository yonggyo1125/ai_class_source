package exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringJUnitConfig(AppCtx.class)
public class Ex02 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("회원정보 추가")
    void test1() {
        String sql = "INSERT INTO MEMBER (email, password, name, mobile) " +
                    "VALUES (?, ?, ?, ?)";
        int affectedRows = jdbcTemplate.update(sql, "user04@test.org", "1234", "사용자04", "01010001000");
        System.out.println(affectedRows);
    }

    @Test
    @DisplayName("회원 목록 조회")
    void test2() {
        String sql = "SELECT * FROM MEMBER WHERE email LIKE ?";
        List<Member> items = jdbcTemplate.query(sql, (rs, i) -> {
                Member member = new Member();
                member.setSeq(rs.getLong("seq"));
                member.setEmail(rs.getString("email"));
                member.setPassword(rs.getString("password"));
                member.setName(rs.getString("name"));
                member.setMobile(rs.getString("mobile"));
                member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());

                return member;
        }, "%user%");

        items.forEach(System.out::println);
    }

    @Test
    @DisplayName("회원 1명 조회")
    void test3() {
        String sql = "SELECT * FROM MEMBER WHERE email = ?";
        Member item = jdbcTemplate.queryForObject(sql, (rs, i) -> {
            Member member = new Member();
            member.setSeq(rs.getLong("seq"));
            member.setEmail(rs.getString("email"));
            member.setPassword(rs.getString("password"));
            member.setName(rs.getString("name"));
            member.setMobile(rs.getString("mobile"));
            member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());

            return member;
        }, "user01@test.org");
        System.out.println(item);
    }

    private Member mapper(ResultSet rs, int i) throws SQLException {
        Member member = new Member();
        member.setSeq(rs.getLong("seq"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("password"));
        member.setName(rs.getString("name"));
        member.setMobile(rs.getString("mobile"));
        member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());

        return member;
    }
}
