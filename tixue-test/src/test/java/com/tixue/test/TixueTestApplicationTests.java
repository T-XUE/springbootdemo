package com.tixue.test;

import com.tixue.assemble.SpringbootApplication;
import com.tixue.dal.dao.TxDddMapper;
import com.tixue.dal.model.TxDdd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: T-XUE
 * @Date: Created in 2018/4/26 0026
 * @Description:
 * @Version: 1.0
 * @Email: tx.info
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-04-26</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TixueTestApplicationTests {


    @Autowired
    private TxDddMapper txDddMapper;

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
     * 黑名单报警分页查询
     *
     * @throws Exception
     */
    @Test
    public void testBlacklistPages() throws Exception {
        TxDdd txDdd = txDddMapper.selectByPrimaryKey(1);
//        List<TxDdd> list = new ArrayList<>();
//        TxDdd add = new TxDdd();
//        add.setUserId(121L);
//        add.setRoleId(5);
//        add.setRowAddTime(new Date());
//        list.add(add);
////        TxDdd add1 = new TxDdd();
////        add1.setUserId(13L);
////        add1.setRoleId(2);
////        add1.setRowAddTime(new Date());
////        list.add(add1);
//        txDddMapper.insertList(list);
        List<TxDdd> re = txDddMapper.selectAll();
        int t = 1;
    }

}
