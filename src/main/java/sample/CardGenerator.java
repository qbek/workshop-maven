package sample;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CardGenerator {

    private Faker generator = Faker.instance(Locale.GERMANY);

    public Card newValidCard(String bin) {
        String holder = generator.name().fullName();
        String pan = generator.numerify(StringUtils.rightPad(bin, 16, "#"));
        String expDate = generateValidExpDate();
        String cvv = generator.numerify("###");
        return new Card(pan, holder, expDate, cvv);
    }

    private String generateValidExpDate() {
        Calendar from = GregorianCalendar.getInstance();
        from.set(2019, 1, 1);

        Calendar to = GregorianCalendar.getInstance();
        to.set(2021, 12, 1);

        Date exp = generator.date().between(from.getTime(), to.getTime());
        return new SimpleDateFormat("MM/yy").format(exp);
    }
}
