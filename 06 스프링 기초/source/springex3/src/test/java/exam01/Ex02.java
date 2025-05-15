package exam01;

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
    void test1() {
        String sql = "INSERT INTO MEMBER (email, password, name, mobile) " +
                    "VALUES (?, ?, ?, ?)";
        int affectedRows = jdbcTemplate.update(sql, "user04@test.org", "1234", "사용자04", "01010001000");
        System.out.println(affectedRows);
    }

    @Test
    void test2() {
        String sql = "SELECT * FROM MEMBER";
        List<Member> items = jdbcTemplate.query(sql, (rs, i) -> {
                Member member = new Member();
                member.setSeq(rs.getLong("seq"));
                member.setEmail(rs.getString("email"));
                member.setPassword(rs.getString("password"));
                member.setName(rs.getString("name"));
                member.setMobile(rs.getString("mobile"));
                member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());

                return member;
        });

        items.forEach(System.out::println);
    }
}
