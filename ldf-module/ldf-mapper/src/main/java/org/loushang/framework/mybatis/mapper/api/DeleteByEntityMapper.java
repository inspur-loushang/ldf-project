package org.loushang.framework.mybatis.mapper.api;

import org.apache.ibatis.annotations.DeleteProvider;
import org.loushang.framework.mybatis.mapper.provider.EntityDeleteProvider;

/**
 * 通用Mapper接口,删除
 *
 * @param <T>
 *            不能为空
 * @author 框架产品组
 */
public interface DeleteByEntityMapper<T> {

	/**
	 * 根据实体属性作为条件进行删除，查询条件使用等号
	 *
	 * @param record
	 * @return
	 */
	@DeleteProvider(type = EntityDeleteProvider.class, method = "dynamicSQL")
	int deleteByEntity(T record);

}