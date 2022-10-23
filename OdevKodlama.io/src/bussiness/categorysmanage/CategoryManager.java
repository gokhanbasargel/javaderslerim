package bussiness.categorysmanage;

import dataAccess.IDBService;
import entities.categorys.Category;
import entities.courses.Course;
import logger.ILoggerService;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements ICategoryService{
    IDBService idbService;
    public List<Category> getAll(){
        return idbService.getAllCategory();
    }

    public boolean checkIfCategoryNameExist(Course course) {

        for (Category _category: getAll()) {
            if (_category.getCategoryName().equalsIgnoreCase(_category.getCategoryName())) {
                System.out.println("Kategori ismi zaten var!!!!");
                return true;
            }


        }
        return false;
    }



    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }
}
