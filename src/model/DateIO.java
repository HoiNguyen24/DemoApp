package src.model;
import java.sql.Date;

public class DateIO {
    Date date;
    private long quantity;

    public DateIO(Date date, long quantity) {
        this.date = date;
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
