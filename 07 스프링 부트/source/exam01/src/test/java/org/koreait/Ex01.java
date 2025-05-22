package org.koreait;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@ActiveProfiles("default,test") // spring.profiles.active=default,test
public class Ex01 {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1() throws Exception {
        Connection con = dataSource.getConnection();
        System.out.println(con);
    }

    @Test
    void test2() {
        String sql = "SELECT COUNT(*) FROM MEMBER";
        long total = jdbcTemplate.queryForObject(sql, long.class);
        System.out.println(total);
    }
}
