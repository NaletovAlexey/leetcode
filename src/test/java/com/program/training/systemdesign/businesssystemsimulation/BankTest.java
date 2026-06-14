package com.program.training.systemdesign.businesssystemsimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q1. Simple Bank System
 *
 * @author naletov
 */
class BankTest
{
    @Test
    void testBank()
    {
        long[] balance = { 10, 100, 20, 50, 30 };
        Bank bank = new Bank(balance);
        assertTrue(bank.withdraw(3, 10),
                "return true, account 3 has a balance of $20, so it is valid to withdraw $10");
        // Account 3 has $20 - $10 = $10.
        assertTrue(bank.transfer(5, 1, 20),
                "return true, account 5 has a balance of $30, so it is valid to transfer $20.");
        // Account 5 has $30 - $20 = $10, and account 1 has $10 + $20 = $30.
        assertTrue(bank.deposit(5, 20),
                "return true, it is valid to deposit $20 to account 5");
        // Account 5 has $10 + $20 = $30.
        assertFalse(bank.transfer(3, 4, 15),
                "return false, the current balance of account 3 is $10");
        // so it is invalid to transfer $15 from it.
        assertFalse(bank.withdraw(10, 50),
                "return false, it is invalid because account 10 does not exist");
    }
}