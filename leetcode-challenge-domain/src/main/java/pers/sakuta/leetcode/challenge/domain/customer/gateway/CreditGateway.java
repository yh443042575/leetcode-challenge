package pers.sakuta.leetcode.challenge.domain.customer.gateway;

import pers.sakuta.leetcode.challenge.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
