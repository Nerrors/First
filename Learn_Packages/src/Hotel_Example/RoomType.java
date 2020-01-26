package Hotel_Example;


import java.util.Arrays;

/**
 *
 * @author George
 */
public enum RoomType {
    SINGLE,
    DOUBLE,
    DOUBLEDOUBLE,
    TWIN,
    INTERCONNECTING,
    CABANA,
    STUDIO;
    /* Ξ— ΞΌΞ­ΞΈΞΏΞ΄ΞΏΟ‚ Ξ±Ο…Ο„Ξ®Ξ½ Ο‡Ο�Ξ·ΟƒΞΉΞΌΞΏΟ€ΞΏΞΉΞµΞ―Ο„Ξ±ΞΉ Ξ³ΞΉΞ± Ξ½Ξ± ΞµΟ€ΞΉΟƒΟ„Ο�Ξ±Ο†ΞΏΟ�Ξ½ ΞΏΞΉ Ο„ΞΉΞΌΞ­Ο‚ Ο„Ξ·Ο‚ enum
       Ο‰Ο‚ Ο€Ξ―Ξ½Ξ±ΞΊΞ±Ο‚ Ξ±Ο€Ο� String Ξ³ΞΉΞ± ΞµΞΌΟ†Ξ¬Ξ½ΞΉΟƒΞ· ΟƒΞµ Ξ»Ξ―ΟƒΟ„ΞµΟ‚ ΞµΟ€ΞΉΞ»ΞΏΞ³Ξ®Ο‚ ΟƒΟ„ΞΏ User 
       Interface
    */
    public static String[] names() {
        String valuesStr = Arrays.toString(RoomType.values());
        return valuesStr.substring(1, valuesStr.length() - 1).replace(" ", "").split(",");
    }

}
