package me.shinsunyoung.springbootdeveloper;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class MemberRepositoryTest extends TestCase {
    @DataJpaTest
    class MemberRepositoryTest {
            @Autowired
            MemberRepository memberRepository;

            @Sql("/insert-members.sql")
            @Test
            void getAllMembers() {
                //when
                List<Member> members = memberRepository.findAll();

                //then
                assertThat(members.size()).isEqualTo(3);
            }
    }

}