package dataAccess;

import entities.categorys.Category;
import entities.courses.Course;
import entities.persons.Person;

import java.util.List;

public interface IDBService {
    void addCourse(Course course);
    void addCategory(Category category);
    void addPerson(Person person);
    List<Course> getAllCourses();
    List<Category> getAllCategory();



}
