package jnshu.tiles.service.impl;

import jnshu.tiles.dao.StudentMapper;
import jnshu.tiles.entity.Student;
import jnshu.tiles.entity.StudentExample;
import jnshu.tiles.service.StudnetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudnetService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Student record) {
        return 0;
    }

    @Override
    public Student selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
   /* @Cacheable(value = "aboutStudent")*/
    public List<Student> selectAll(StudentExample studentExample) {
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return 0;
    }
}
