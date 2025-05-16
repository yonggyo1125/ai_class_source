package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.koreait.member.mappers.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(AppCtx.class)
public class Ex05 {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void test1() {
        List<Member> items = memberMapper.getList();
        items.forEach(System.out::println);
    }
}
