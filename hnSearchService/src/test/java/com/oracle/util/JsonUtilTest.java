package com.oracle.util;

import com.oracle.domain.Student;
import com.oracle.utils.JsonUtils;
import org.junit.Test;

/**
 * @author YangHaiBo
 * @create 2019-09-10 11:32
 */
public class JsonUtilTest {
    @Test
    public void demo01() {
        Student student = new Student();
        student.setId("65");
        student.setName("Jack Chen");
        String jsonText = JsonUtils.objectToJson(student);
        System.out.println(jsonText);
    }

    @Test
    public void demo02() {
        String jsonText = "{\"id\":\"32\",\"name\":\"yang\"}";
        Student student = JsonUtils.jsonToPojo(jsonText, Student.class);
        if (student!=null){
            System.out.println("id:" + student.getId() + "\tname:" + student.getName());
        }

    }
}
