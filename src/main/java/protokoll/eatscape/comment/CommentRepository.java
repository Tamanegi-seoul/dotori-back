package protokoll.eatscape.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import protokoll.eatscape.account.Account;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
