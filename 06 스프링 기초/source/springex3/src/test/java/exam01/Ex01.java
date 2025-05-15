package exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.Connection;
import java.sql.SQLException;

@SpringJUnitConfig(AppCtx.class)
public class Ex01 {

    @Autowired
    private DataSource ds;

    @Test
    void test1() throws SQLException {
        Connection con = ds.getConnection();
        System.out.println(con);
    }
}
