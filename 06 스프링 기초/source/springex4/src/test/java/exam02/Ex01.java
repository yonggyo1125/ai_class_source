package exam02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.MvcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringJUnitWebConfig(MvcConfig.class)
public class Ex01 {
    @Autowired
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

    @BeforeEach
    void init() {
        // 모든 컨트롤러를 빈으로 생성
        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    void test1() throws Exception {
        mockMvc.perform(get("/member/test5")
                        //.header("test6", "value6") // 요청 헤더
                        .header("test7", "value7")
                )
                .andDo(print());
    }

    @Test
    void test2() throws Exception {

        mockMvc.perform(post("/member/test6")
                        // 요청 헤더 Content-Type: application/x-www-form-urlencoded
                        //.contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        // 요청 헤더 Content-Type: application/json
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print());
    }
}
