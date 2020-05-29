package com.learning.jwtauthentication.repository;

import com.learning.jwtauthentication.dao.BankAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by subhashchandra on 9/5/20.
 */
public interface BankRepository extends JpaRepository<BankAccountDao,Integer> {
}
