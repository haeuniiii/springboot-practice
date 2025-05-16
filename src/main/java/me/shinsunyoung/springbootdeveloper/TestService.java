package me.shinsunyoung.springbootdeveloper;

import org.hibernate.service.spi.InjectService;

import java.util.List;

public class TestService {
    @Service
    public class TestService {

        @Autowired
        MemberRepository memberRepository;

        public List<Member> getAllMembers() {
            return memberRepository.findAll();
        }
    }
}
