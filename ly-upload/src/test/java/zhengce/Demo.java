package zhengce;

import com.leyou.LyUploadApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/31 16:29
 * @version:
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LyUploadApplication.class)
public class Demo {
    @Test
    public void demo(){
        String s = "api/upload/image";
        String s1 = "^/api/(.*)$";
        String result = s.replaceAll(s1,s);
        System.out.println(result);
    }
}
