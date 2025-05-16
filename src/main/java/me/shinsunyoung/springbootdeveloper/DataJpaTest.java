package me.shinsunyoung.springbootdeveloper;

import java.util.List;

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
        assetThat(members.size()).isEqualTo(3);
    }
}
