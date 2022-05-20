package controller;

import model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import service.AccountService;

@RequestMapping("/count")
public class AccountController {

    private final AccountService countService;
    public AccountController(AccountService countService) {
        this.countService = countService;
    }

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public Account createCount (@RequestBody Account account){
        return countService.createCount(account);
    }
}
