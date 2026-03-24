package com.fengxiansheng;

import com.fengxiansheng.Entity.User;
import com.fengxiansheng.Mapper.UserMapper;
import com.fengxiansheng.Service.UserService;
import com.fengxiansheng.Util.RedisUtil;
import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
    extends TestCase
{
    @Autowired
    private UserMapper userMapper;
    @Resource
    private UserService userService;
    @Resource
    private RedisUtil redisUtil;
    @org.junit.jupiter.api.Test
    void  contextLoads(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList =userMapper.selectList(null);
        Assert.assertTrue("",5==userList.size());
        userList.forEach(System.out::println );

    }
    @Test
    void contextService(){
        List<User> userList = userService.list();
        userList.forEach(System.out::println );
    }
    @Test
    void contextRedis(){
        List<User> userList = userService.list();
        redisUtil.set("userList",userList);
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }

    /**
     * @return the suite of tests being tested
     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }

    /**
     * Rigourous Test :-)
     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}
