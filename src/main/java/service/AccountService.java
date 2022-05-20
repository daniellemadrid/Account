package service;

import org.springframework.stereotype.Service;
import model.Account;
import repository.AccountRepository;

@Service
public class AccountService {

    private final AccountRepository countRepository;

    public AccountService(AccountRepository countRepository) {
        this.countRepository = countRepository;
    }

   // @Transactional(rollbackFor = {RuntimeException.class})
    public Account createCount(Account account){
      return countRepository.save(account);
    }
}
