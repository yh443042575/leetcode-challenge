package pers.sakuta.leetcode.challenge.domain.customer.gateway;

import pers.sakuta.leetcode.challenge.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
