package com.wimoor.erp.finance.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.finance.pojo.entity.FinanceProject;
@Mapper
public interface FinanceProjectMapper extends BaseMapper<FinanceProject> {

	List<FinanceProject> findProject(@Param("shopid")String shopid);

	List<Map<String, Object>> findProList(@Param("shopid")String shopid,@Param("search")String search);
     
}