package idv.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootMybatisApplication. 2020/8/15 5:48 下午
 *
 * @author sero
 * @version 1.0.0
 **/
@MapperScan(value = "idv.module.dao.mapper")
@SpringBootApplication
public class SpringBootMyBatisApplication {

    void main() {
        SpringApplication.run(SpringBootMyBatisApplication.class);
    }

}
