package Serializable;

import java.io.Serializable;

/**
 * class       :khDTO
 * Package      :Serializable
 *
 * @Description:
 * @author: SR45
 * @since: 2024-05-13 오후 4:23
 * 변경이력:
 * 이름     : 일자          : 근거자료   : 변경내용
 * ------------------------------------------------------
 * : 2024-05-13 :            : 신규 개발.
 */

public class khDTO implements Serializable {
    static final long serialVersionUID =1L;
    private String bloodTypess = "B";
    private String name;
    private int age;
    private String address;
    public khDTO(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "khDTO{" +
                "bloodTypess='" + bloodTypess + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
