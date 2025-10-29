package pers.sakuta.leetcode.challenge.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import pers.sakuta.leetcode.challenge.api.CustomerServiceI;
import pers.sakuta.leetcode.challenge.dto.CustomerAddCmd;
import pers.sakuta.leetcode.challenge.dto.CustomerListByNameQry;
import pers.sakuta.leetcode.challenge.dto.data.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.sakuta.leetcode.challenge.customer.executor.CustomerAddCmdExe;
import pers.sakuta.leetcode.challenge.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}