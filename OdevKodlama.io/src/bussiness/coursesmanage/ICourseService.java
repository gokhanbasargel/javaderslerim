package bussiness.coursesmanage;

import entities.courses.Course;

public interface ICourseService {

    void add(Course course);

    void delete(Course course);
    void read(Course course);

}
