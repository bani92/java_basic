package Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * class       :ManageObject
 * Package      :Serializable
 *
 * @Description:
 * @author: SR45
 * @since: 2024-05-13 오후 4:24
 * 변경이력:
 * 이름     : 일자          : 근거자료   : 변경내용
 * ------------------------------------------------------
 * : 2024-05-13 :            : 신규 개발.
 */
public class ManageObject {
    public static void main(String[] args) {
        ManageObject manage = new ManageObject();
        String fullPath = "KH" + "test" + "KH.obj";
        khDTO khDTO = new khDTO("JEONG", 20, "Incheon");
        manage.saveObject(fullPath, khDTO);
    }

    public void saveObject(String fullPath, khDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("@@@@@@@@@@@@@");
            System.out.println("Write Success");
            System.out.println("@@@@@@@@@@@@@");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
