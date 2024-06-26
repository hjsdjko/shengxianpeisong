package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.OrdersEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.OrdersVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.OrdersView;


/**
 * 订单
 *
 * @author 
 * @email 
 * @date
 */
public interface OrdersService extends IService<OrdersEntity> {

    PageUtils queryPage(Map<String, Object> params);
    PageUtils queryPage1(Map<String, Object> params);

   	List<OrdersVO> selectListVO(Wrapper<OrdersEntity> wrapper);
   	
   	OrdersVO selectVO(@Param("ew") Wrapper<OrdersEntity> wrapper);
   	
   	List<OrdersView> selectListView(Wrapper<OrdersEntity> wrapper);
   	
   	OrdersView selectView(@Param("ew") Wrapper<OrdersEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<OrdersEntity> wrapper);


	/**
	 * 查询字典表的分组统计总条数
	 * @return
	 */
	List<Map<String, Object>> graph();
   	
}

