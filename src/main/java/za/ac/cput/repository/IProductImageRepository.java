package za.ac.cput.repository;

import za.ac.cput.domain.ProductImage;
import java.util.List;

public interface IProductImageRepository extends IRepository<ProductImage, String>{
    List<ProductImage> getAll();
}
