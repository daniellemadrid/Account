package service;

import Enums.AccountEnum;
import dto.AccountDto;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

   // private final AccountRepository countRepository;

   // public AccountService(AccountRepository countRepository) {
      //  this.countRepository = countRepository;
  /// }

   // public Account createCount(Account account){
   //   return countRepository.save(account);
   // }



    model.Account account = null;

    public void createAccount(AccountDto accountDto){
        if(account != null){
            account = new model.Account(accountDto.getAvailableLimit(), accountDto.isActiveCard());
        } else {
            AccountEnum validation = AccountEnum.ACCOUNTALREADY_INITIALIZED;
        }
    }

    public void validatingTheCardLimit(AccountDto accountDto){
        if(account.getAvailableLimit() > accountDto.getAvailableLimit()){
            AccountEnum validationLimit = AccountEnum.ACCOUNTALREADY_INITIALIZED;
        } else {
            account = new model.Account(accountDto.getAvailableLimit(), accountDto.isActiveCard());
        }
    }
}
