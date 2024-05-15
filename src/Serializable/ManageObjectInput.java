package Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * class       :ManageObjectInput
 * Package      :Serializable
 *
 * @Description:
 * @author: SR45
 * @since: 2024-05-13 오후 4:32
 * 변경이력:
 * 이름     : 일자          : 근거자료   : 변경내용
 * ------------------------------------------------------
 * : 2024-05-13 :            : 신규 개발.
 */
public class ManageObjectInput {
    public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream((fullPath));
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            khDTO dto = (khDTO)obj;
            System.out.println(dto);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
