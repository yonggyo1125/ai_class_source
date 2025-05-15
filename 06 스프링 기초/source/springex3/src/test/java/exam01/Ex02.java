package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppCtx.class)
public class Ex02 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1() {
        String sql = "INSERT INTO MEMBER (email, password, name, mobile) " +
                    "VALUES (?, ?, ?, ?)";
        int affectedRows = jdbcTemplate.update(sql, "user03@test.org", "1234", "사용자03", "01010001000");
        System.out.println(affectedRows);
    }
}
