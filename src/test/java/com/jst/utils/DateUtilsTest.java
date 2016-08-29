package com.jst.utils;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;

/**
 * Created by Arnaud Flaesch on 21/04/2016.
 */

public class DateUtilsTest {

    @Test
    public final void should_format_date() {
        assertEquals(new SimpleDateFormat("yyyy-MM-dd").format(new Date(2016,04,15)), DateUtils.format(new Date(2016,04,15)));
    }

}
