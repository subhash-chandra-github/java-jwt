package com.learning.jwtauthentication.Controller;

import com.learning.jwtauthentication.dao.BankAccountDao;
import com.learning.jwtauthentication.dao.CurrentAccountDao;
import com.learning.jwtauthentication.dao.SavingAccountDao;
import com.learning.jwtauthentication.dto.BankAccount;
import com.learning.jwtauthentication.model.UserDto;
import com.learning.jwtauthentication.repository.BankRepository;
import com.learning.jwtauthentication.service.JwtUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by subhashchandra on 3/5/20.
 */
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private JwtUserDetailService userService;

    @Autowired
    private BankRepository bankRepository;

    @PostMapping("/login")
    String login(@RequestParam String name, @RequestParam String password)
    {
        return "Succesfull";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    ResponseEntity<String> SignUp(@RequestBody UserDto user)
    {
        String message = userService.signUp(user);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    @GetMapping("/account")
    String createAccount()
    {
        CurrentAccountDao bankAccountDao = new CurrentAccountDao();
        bankAccountDao.setCustomerName("Subhash");
        bankAccountDao.setAccountNumber(506);
        bankAccountDao.setReward("JEETO");
        bankAccountDao.setEarning(5000);

        SavingAccountDao savingAccountDao = new SavingAccountDao();
        savingAccountDao.setBonus(1000);
        savingAccountDao.setOffers("MAUKA");
        savingAccountDao.setAccountNumber(304);
        savingAccountDao.setCustomerName("Shivam");

        bankRepository.save(bankAccountDao);
        bankRepository.save(savingAccountDao);

        return "success";
    }

    @GetMapping("/getaccountbyId/{id}")
    BankAccountDao getBankAccountById(@PathVariable(name = "id") int id)
    {

        Optional<BankAccountDao> bankAccountDao = bankRepository.findById(id);
        return  bankAccountDao.get();
    }
}
