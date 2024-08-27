package za.ac.cput.service.interfaces;

import za.ac.cput.domain.Category;
import za.ac.cput.service.interfaces.IService;

import java.util.Set;

public interface ICategoryService extends IService<Category, Long> {
    Set<Category> getAll();
    Category findCategoryByName(String name);
}