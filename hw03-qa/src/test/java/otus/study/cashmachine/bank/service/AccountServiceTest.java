package otus.study.cashmachine.bank.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import otus.study.cashmachine.bank.dao.AccountDao;
import otus.study.cashmachine.bank.data.Account;
import otus.study.cashmachine.bank.service.impl.AccountServiceImpl;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    AccountDao accountDao;

    @InjectMocks
    AccountServiceImpl accountServiceImpl;

    @Test
    void createAccountMock() {
// @TODO test account creation with mock and ArgumentMatcher
        Account expectedAccount = new Account(0, BigDecimal.TEN);
        when(accountDao.saveAccount(eq(expectedAccount))).thenReturn(new Account(1, BigDecimal.TEN));

        Account testAccunt = accountServiceImpl.createAccount(BigDecimal.TEN);
        assertEquals(expectedAccount.getAmount(), testAccunt.getAmount());

    }

    @Test
    void createAccountCaptor() {
//  @TODO test account creation with ArgumentCaptor
        Account expectedAccount = new Account(5, BigDecimal.TEN);
        ArgumentCaptor<Account> argumentCaptor = ArgumentCaptor.forClass(Account.class);
        when(accountDao.saveAccount(argumentCaptor.capture())).thenReturn(new Account(1, BigDecimal.TEN));

        accountServiceImpl.createAccount(BigDecimal.TEN);
        assertEquals(expectedAccount.getAmount(), argumentCaptor.getValue().getAmount());

    }

    @Test
    void addSum() {
    }

    @Test
    void getSum() {
    }

    @Test
    void getAccount() {
    }

    @Test
    void checkBalance() {
    }
}
