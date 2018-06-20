package com.tixue.util.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: T-XUE
 * @Date: Created in 2018/6/20 0020 16:30
 * @Description:
 * @Version: 1.0
 * @Email: tx.info
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-06-20</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface TxMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
