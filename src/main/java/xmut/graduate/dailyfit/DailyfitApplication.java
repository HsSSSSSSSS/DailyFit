package xmut.graduate.dailyfit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@MapperScan("xmut.graduate.dailyfit.dao")
@EnableTransactionManagement
public class DailyfitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyfitApplication.class, args);
    }
}
