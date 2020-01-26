package Hotel_Example;

import java.util.Date;

/**
 *
 * @author George
 */
public class Period {

    public Date startDate; // Ξ”Ξ·Ξ»Ο�Ξ½ΞµΞΉ 2 ΞΌΞµΟ„Ξ±Ξ»Ξ²Ξ·Ο„Ξ­Ο‚
    private Date endDate;

    public Period(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }
    
  

    public Date getEndDate() {
        return endDate;
    }
    
    // *** Ξ�Ξ­ΞΈΞΏΞ΄ΞΏΟ‚ ΞµΞ»Ξ­Ξ³Ο‡ΞΏΟ…. Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³ΞΏΟ�ΞΌΞµ ΞΌΞΉΞ± ΞΌΞ­ΞΈΞΏΞ΄ΞΏ Ο�Ο€ΞΏΟ… Ξ΄Ξ―Ξ½ΞΏΟ… ΞΌΞµ Ο„Ξ·Ξ½ ΞΌΞµΟ„Ξ±Ξ²Ξ»Ξ·Ο„Ξ® p (Ο�Ο„Ξ±Ξ½ Ο„Ξ·Ξ½ ΞΏΟ�Ξ―Ξ¶ΞΏΟ…ΞΌΞµ)
    // Ο„ΞΉΞΌΞ­Ο‚ ΟƒΟ„Ξ± StartDate ΞΊΞ±ΞΉ EndDate Ξ­Ο„ΟƒΞΉ Ο�ΟƒΟ„Ξµ Ξ½Ξ± Ο„Ξ± ΟƒΟ…Ξ³ΞΊΟ�Ξ―Ξ½ΞΏΟ…ΞΌΞµ.

    public boolean overlaps(Period p) { // *** Ξ¤ΞΏ ΞΊΞ¬Ξ½ΞΏΟ…ΞΌΞµ Ξ±Ο…Ο„Ο� Ξ³ΞΉΞ± Ξ½Ξ± Ο€Ξ¬Ο�ΞµΞΉ Ξ­Ξ½Ξ±Ο‚ Ξ¬Ξ»Ξ»ΞΏΟ‚ ΞΊΞ±Ο„Ξ±ΟƒΞΊΞµΟ…Ξ±ΟƒΟ„Ξ®Ο‚ Ξ® ΞΌΞ­ΞΈΞΏΞ΄ΞΏΟ‚ Ο„ΞΉΟ‚ Ο„ΞΉΞΌΞ­Ο‚ Ο„Ο‰Ξ½ ΞΌΞµΟ„Ξ±Ξ²Ξ»Ξ·Ο„Ο�Ξ½ Ο€ΞΏΟ… Ξ²Ο�Ξ―ΟƒΞΊΞΏΞ½Ο„Ξ±ΞΉ ΟƒΟ„ΞΏΞ½ ΞΊΞ±Ο„Ξ±ΟƒΞΊΞµΟ…Ξ±ΟƒΟ„Ξ® Ξ±Ο…Ο„Ξ®Ο‚ Ο„Ξ·Ο‚ ΞΊΞ»Ξ¬ΟƒΞ·Ο‚.
        Date pStartD = p.getStartDate(); // ***Ξ�Ο‡ΞΏΟ…ΞΌΞµ get ΞµΟ€ΞµΞΉΞ΄Ξ® ΟƒΟ„ΞΏ Ο�Ο�ΞΉΟƒΞΌΞ± Ο„Ξ·Ο‚ ΞΌΞµΞΈΟ�Ξ΄ΞΏΟ… Ξ΄Ξ―Ξ½ΞΏΟ…ΞΌΞµ Ο„ΞΉΞΌΞ­Ο‚ ΟƒΟ„ΞΉΟ‚ ΞΌΞµΟ„Ξ±Ξ»Ξ²Ξ·Ο„Ξ­Ο‚.
        Date pEndD = p.getEndDate();
        /**
         * Ξ�β€�Ξ�οΏ½Ξ�Ξ� Ξ�β‚¬Ξ�ΒµΞ�οΏ½Ξ�β€•Ξ�Ξ�Ξ�Ξ„Ξ�Ξ�Ξ�Ξ‰ Ξ�β€� Ξ�Ξ�Ξ�Β±Ξ�Ξ‰ Ξ�β€™ Ξ�ΒµΞ�β‚¬Ξ�Ξ‰Ξ�Ξ�Ξ�Β±Ξ�Β»Ξ�οΏ½Ξ�β‚¬Ξ�β€�Ξ�Ξ�Ξ�Β½Ξ�β€�Ξ�Β±Ξ�Ξ‰ Ξ�β€΅Ξ�οΏ½Ξ�Ξ�Ξ�Β½Ξ�Ξ‰Ξ�Ξ�Ξ�Β¬ Ξ�Β±Ξ�Β½ 
         * startA<=endB AND endA>=startB
         */
        if (startDate.compareTo(pEndD)<=0 && endDate.compareTo(pStartD)>=0) {
            return true;
        }
        return false;
    }

}

