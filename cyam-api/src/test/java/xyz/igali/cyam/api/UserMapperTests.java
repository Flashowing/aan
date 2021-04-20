package xyz.igali.cyam.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.igali.cyam.api.entity.CyamUser;
import xyz.igali.cyam.api.mapper.CyamUserMapper;

import javax.sql.DataSource;

@SpringBootTest
class UserMapperTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    CyamUserMapper mapper;

    @Test
    void contextLoads() {
    }

    @Test
    void getConnection() throws Exception {
        System.out.println(dataSource.getConnection());
    }

    @Test
    void insertData(){
        CyamUser user = new CyamUser();
        user.setUsername("admin");
        user.setUserPhone("65305300");
        int row = mapper.insert(user);
        System.out.println(row);


    }
}
