package com.zeng.service.impl;

import com.zeng.entity.Blog;
import com.zeng.mapper.BlogMapper;
import com.zeng.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zeng
 * @since 2022-03-04
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
