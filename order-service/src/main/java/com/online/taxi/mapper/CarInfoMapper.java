package com.online.taxi.mapper;

import com.online.taxi.entity.CarInfo;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 * @date 2018/8/25
 */
@Service
public interface CarInfoMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_car_info
     *判断插入
     * @mbggenerated
     */
    int insertSelective(CarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_car_info
     *
     * @mbggenerated
     */
    CarInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_car_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_car_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CarInfo record);
}
