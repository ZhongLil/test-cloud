package com.lwu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwu.entity.Countries;
import com.lwu.service.CountriesService;
import com.lwu.mapper.CountriesMapper;
import org.springframework.stereotype.Service;

/**
* @author liz
* @description 针对表【countries】的数据库操作Service实现
* @createDate 2024-03-08 16:55:22
*/
@Service
public class CountriesServiceImpl extends ServiceImpl<CountriesMapper, Countries>
    implements CountriesService{

}




