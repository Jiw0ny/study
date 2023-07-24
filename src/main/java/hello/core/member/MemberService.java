package hello.core.member;

import org.springframework.context.annotation.Configuration;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
