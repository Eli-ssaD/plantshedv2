package com.plantshedv2.plantshedv2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface AccountRepo extends JpaRepository<Account, Integer> {
    static List<Account> findByUserId(String user) {
        // TODO Auto-generated method stub
        return null;
    }
}
