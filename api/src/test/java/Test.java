import cn.crap.utils.MD5;
import cn.crap.utils.Tools;

/**
 * @author Ehsan
 * @date 2018/5/27 17:11
 */
public class Test {
    public static void main(String args[]) {
//        String error = " insert into log      ( id,                       createTime,                       sequence,                       modelClass,                       modelName,                       type,                       updateBy,                       remark,                       identy,                       content )       values ( ?,                       ?,                       ?,                       ?,                       ?,                       ?,                       ?,                       ?,                       ?,                       ? )";
//        int index = error.indexOf("insert into") + 11;
//        System.out.println(error.substring(index, error.length()).split(" ")[1].trim());
        String aaa = Tools.getChar(20);
        System.out.println(aaa);
        System.out.println(MD5.encrytMD5("", aaa));

    }
}
