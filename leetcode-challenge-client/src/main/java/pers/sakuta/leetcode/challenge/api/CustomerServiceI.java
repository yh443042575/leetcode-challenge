package pers.sakuta.leetcode.challenge.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import pers.sakuta.leetcode.challenge.dto.CustomerAddCmd;
import pers.sakuta.leetcode.challenge.dto.CustomerListByNameQry;
import pers.sakuta.leetcode.challenge.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
