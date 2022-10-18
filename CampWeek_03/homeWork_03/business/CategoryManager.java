package business;

import java.util.ArrayList;
import java.util.List;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<String> category1 = new ArrayList<>();

    public CategoryManager(CategoryDao catagoryDao, Logger[] loggers) {
        this.categoryDao = catagoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (category1.size() == 0) {
            category1.add(category.getName());
            categoryDao.add(category);
            for (Logger logger : loggers) {
                logger.log(category.getName());
            }

        } else {
            for (String categoryName : category1) {
                if (categoryName.equals(category.getName())) {
                    throw new Exception("Aynı kategori mevcut");
                } else {
                    category1.add(category.getName());
                    categoryDao.add(category);
                    for (Logger logger : loggers) {
                        logger.log(category.getName());
                    }
                }
            }

        }
    }

}