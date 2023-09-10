package protokoll.eatscape.post.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import protokoll.eatscape.post.domain.Posts;

public interface PostRepository extends JpaRepository<Posts, Long> {
}
