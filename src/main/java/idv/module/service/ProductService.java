package idv.module.service;

import idv.module.dao.mapper.ProductMapper;
import idv.module.po.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * ProductService. 2020/8/17 下午 01:03
 *
 * @author sero
 * @version 1.0.0
 **/
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

    /**
     * 取得商品
     *
     * @param id 商品流水號
     * @return Product
     */
    public Product getProduct(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

}
