package jnshu.tiles.service;

import jnshu.tiles.entity.Student;
import jnshu.tiles.entity.StudentExample;

import java.util.List;

public interface StudnetService {

    public int deleteByPrimaryKey(Long id);

    public int insert(Student record);

    public Student selectByPrimaryKey(Long id);

    public List<Student> selectAll(StudentExample studentExample);

    public int updateByPrimaryKey(Student record);
}
