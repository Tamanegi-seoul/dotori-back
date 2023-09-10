package protokoll.eatscape.account.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import protokoll.eatscape.account.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findAccountByEmail(String email);

}
