package idv.module.dao.mapper;

import idv.module.po.Product;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 18 22:23:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 18 22:23:17 CST 2023
     */
    int insert(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 18 22:23:17 CST 2023
     */
    int insertSelective(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 18 22:23:17 CST 2023
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 18 22:23:17 CST 2023
     */
    int updateByPrimaryKeySelective(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 18 22:23:17 CST 2023
     */
    int updateByPrimaryKey(Product row);
}