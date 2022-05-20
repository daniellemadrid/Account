package ControllerTest;


import com.google.gson.Gson;
import model.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.AccountService;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



public class AccountControllerTest {

    @Autowired
    AccountService countService;

    @Test
     public void deveriaRetornarSucessoNaCriacaoDeConta() {
         Account account = new Account(100, true);

         String paraJson = new Gson().toJson(account);

        when(countService.createCount(account)).thenReturn(account);
        Account currentCount = countService.createCount(account);

        assertEquals(account, currentCount);
        verify(countService).createCount(account);

    }
}