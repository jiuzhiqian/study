package xin.jiuzhiqian.study.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : feng
 */
public class StreamTest {
    public static void main(String[] args) {
        StreamTest st = new StreamTest();
        List<Student> stuList = st.getList();
        Map<Integer, List<Student>> stuMap = new HashMap<>();
        // traditional
        for (Student stu : stuList) {
            if (stu.getHeight() > 500) {
                if (stuMap.get(stu.getSex()) == null) {
                    List<Student> list = new ArrayList<>();
                    list.add(stu);
                    stuMap.put(stu.getSex(), list);
                } else {
                    stuMap.get(stu.getSex()).add(stu);
                }
            }
        }
        // Serial Stream
        Map<Integer, List<Student>> stu2Map = stuList.stream()
                .filter((Student s) -> s.getHeight() > 500)
                .collect(Collectors.groupingBy(Student::getSex));
        // parallel Stream
        Map<Integer, List<Student>> stu3Map = stuList.parallelStream()
                .filter((Student s) -> s.getHeight() > 500)
                .collect(Collectors.groupingBy(Student::getSex));
    }


    public List<Student> getList() {
        List<Student> result = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            Student stu = new Student();
            stu.setAge(i);
            stu.setHeight(i);
            stu.setName("hello " + i);
            stu.setSex(i % 2);
            System.out.println(stu.toString());
        }
        return result;
    }
}