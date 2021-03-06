package com.xwx.springcloud.core.service.imp;

import com.xwx.springcloud.core.dao.StudentEntityMapper;
import com.xwx.springcloud.core.model.StudentEntity;
import com.xwx.springcloud.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author winsonxiao
 * @ClassName StudentServiceImpl
 * @date 2021/9/29γ3:05 δΈε
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentEntityMapper studentEntityMapper;
    @Override
    public StudentEntity selectAll(Long id) {

        return studentEntityMapper.selectByPrimaryKey(id);
    }
}
