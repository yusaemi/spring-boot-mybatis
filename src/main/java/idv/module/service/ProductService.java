package idv.module.service;

import idv.module.dao.mapper.ProductMapper;
import idv.module.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService. 2020/8/17 下午 01:03
 *
 * @author sero
 * @version 1.0.0
 **/
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 取得商品
     *
     * @param id
     * @return
     */
    public Product getProduct(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

}
