package cn.yilucaifu.utils;

import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateUtils {

    private static Logger logger = Logger
            .getLogger(DateUtils.class);


    // 获得本周一0点时间 本周开始时间
    public static Date getTimesWeekmorning() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }

    // 获得本周日24点时间  本周时间
    public static Date getTimesWeeknight() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTimesWeekmorning());
        cal.add(Calendar.DAY_OF_WEEK, 7);
        return cal.getTime();
    }

    /**
     * 获取指定日期几天前时间
     *
     * @param date
     * @param day
     * @return
     */
    public static Date getBeforeDay(Date date, int day) {
        if (date == null) {
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -day);
        date = calendar.getTime();
        return date;
    }

    /**
     * 获取指定日期几天后时间
     *
     * @param date
     * @param day
     * @return
     */
    public static Date getAfterDay(Date date, int day) {
        if (date == null) {
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        date = calendar.getTime();
        return date;
    }


    /**
     * 获取指定日期几年后时间
     *
     * @param date
     * @param years
     * @return
     */
    public static Date getAfterDateByYears(Date date, int years) {
        if (date == null) {
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, years);
        date = calendar.getTime();
        return date;
    }


    /**
     * 获得几分钟前时间
     *
     * @param minute
     * @return
     */
    public static Date getBeforeMinute(int minute) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -minute);
        date = calendar.getTime();
        return date;
    }

    /**
     * 获得几分钟后时间
     *
     * @param minute
     * @return
     */
    public static Date getAfterMinute(int minute) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, +minute);
        date = calendar.getTime();
        return date;
    }

    /**
     * 获得几天前时间
     *
     * @param day
     * @return
     */
    public static String getBeforeDayStr(int day) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -day);
        date = calendar.getTime();
        return StringUtil.formatDate(date);
    }


    /**
     * 获取几年前时间
     *
     * @param year
     * @return
     */
    public static String getBeforeDayStrByYear(int year) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -year);
        date = calendar.getTime();
        return StringUtil.formatDate(date);
    }


    /**
     * 获取几天前的时间
     *
     * @param day
     * @return
     */
    public static String getBeforeDayStrShort(int day) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -day);
        date = calendar.getTime();
        return StringUtil.formatDateShort(date);
    }

    /**
     * 获取几天前的时间（指定时间类型）
     *
     * @param timeStr
     * @param sdf
     * @param day
     * @return
     */
    public static String getBeforeDayStrShort(String timeStr, String sdf,
                                              int day) {
        SimpleDateFormat format = new SimpleDateFormat(sdf);
        try {
            Date date = format.parse(timeStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, -day);
            date = calendar.getTime();
            return new SimpleDateFormat(sdf).format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 相差天数
     *
     * @param timeStr
     * @param sdf
     * @return
     */
    public static int daysBetween(String timeStr, String sdf) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        Date date2 = null;
        ;
        try {
            date1 = format.parse(timeStr);
            date2 = format.parse(sdf);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        long time1 = cal.getTimeInMillis();
        cal.setTime(date2);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }


    /**
     * 获取几天后的时间（指定时间类型）
     *
     * @param timeStr
     * @param sdf
     * @param day
     * @return
     */
    public static String getAfterDayStrShort(String timeStr, String sdf, int day) {
        SimpleDateFormat format = new SimpleDateFormat(sdf);
        try {
            Date date = format.parse(timeStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, day);
            date = calendar.getTime();
            return new SimpleDateFormat(sdf).format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获得几分钟前时间
     *
     * @param minute
     * @return
     */
    public static String getBeforeMinuteStr(int minute) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -minute);
        date = calendar.getTime();
        return StringUtil.formatDate(date);
    }

    /**
     * 获得几秒前时间
     *
     * @param second
     * @return
     */
    public static String getBeforeSecondStr(int second) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, -second);
        date = calendar.getTime();
        return StringUtil.formatDate(date);
    }


    /**
     * @param sdf 日期
     * @return 是工作日返回true，非工作日返回false
     * @throws ParseException
     * @title 判断是否为工作日
     * @detail 工作日计算: 1、正常工作日，并且为非假期 2、周末被调整成工作日
     * @author str
     */
    public static boolean isWeekday(String str, String sdf)
            throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(sdf);
        Date date = format.parse(str);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return (calendar.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SATURDAY && calendar
                .get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SUNDAY);
    }


    /**
     * 判断在某时间段
     *
     * @param now
     * @param strDateBegin
     * @param strDateEnd
     * @return
     */
    public static boolean isBetweenDateScope(Date now, String strDateBegin, String strDateEnd) {
        Long time = now.getTime();

        Calendar calendar = Calendar.getInstance();
        // 处理开始时间
        String[] startTime = strDateBegin.split(":");
        calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(startTime[0]));
        calendar.set(Calendar.MINUTE, Integer.valueOf(startTime[1]));
        calendar.set(Calendar.SECOND, Integer.valueOf(startTime[2]));
        calendar.set(Calendar.MILLISECOND, 0);
        long startTimeL = calendar.getTimeInMillis();
        // 处理结束时间
        String[] endTime = strDateEnd.split(":");
        calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(endTime[0]));
        calendar.set(Calendar.MINUTE, Integer.valueOf(endTime[1]));
        calendar.set(Calendar.SECOND, Integer.valueOf(endTime[2]));
        calendar.set(Calendar.MILLISECOND, 0);
        long endTimeL = calendar.getTimeInMillis();
        return time >= startTimeL && time <= endTimeL;
    }


    /**
     * 判断是否为周末
     *
     * @param str
     * @param weekday
     * @return
     * @throws ParseException
     */
    public static boolean isWeekday(String str, int weekday)
            throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(str);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return calendar.get(GregorianCalendar.DAY_OF_WEEK) == weekday;
    }

    /**
     * 判读一个指定日期大于另一个指定日期指定天数
     *
     * @param date1 最近时间
     * @param date2 最远时间
     * @param day   差几天
     * @return
     * @throws ParseException
     */
    public static boolean isDaysBefore(String date1, String date2, int day)
            throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);
        return diffTime(d1, d2) > (day * 12 * 3600 * 1000);
    }

    //指定两个日期相差指定天数
    public static boolean isDaysIn(String date1, String date2, int day)
            throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);
        return diffTime(d1, d2) == (day * 24 * 3600 * 1000);
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String getNowDate() {
        String temp_str = "";
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        temp_str = sdf.format(dt);
        return temp_str;
    }

    /**
     * 获取当前日期
     *
     * @return
     */
    public static String getNowDay() {
        String temp_str = "";
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        temp_str = sdf.format(dt);
        return temp_str;
    }


    /**
     * 获取当前月份
     *
     * @return
     */
    public static String getNowMonth() {
        String temp_str = "";
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        temp_str = sdf.format(dt);
        return temp_str;
    }

    /**
     * 获取月份
     *
     * @return
     */
    public static String getMonth(String dateStr) {
        String temp_str = "";
        Date dt = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (!StringUtil.isEmpty(dateStr)) {
            try {
                dt = format.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        format = new SimpleDateFormat("yyyy-MM");
        temp_str = format.format(dt);
        return temp_str;
    }


    /**
     * 获得时间差
     *
     * @param d1
     * @param d2
     * @return
     */
    public static int diffDate(Date d1, Date d2) {
        if (null == d1 || null == d2) {
            return -1;
        }
        return (int) ((d1.getTime() - d2.getTime()) / 86400000);
    }

    /**
     * 获得时间差
     *
     * @param d1
     * @param d2
     * @return
     */
    public static String diffmin(Date d1, Date d2) {
        if (null == d1 || null == d2) {
            return "";
        }
        String day = "" + (int) ((d1.getTime() - d2.getTime()) / 86400000);

        int left1 = (int) ((d1.getTime() - d2.getTime()) % 86400000);

        String hour = "" + (int) (left1 / 3600000);

        int left2 = (int) (left1 % 3600000);

        String min = "" + (int) (left2 / 60000);

        return day + "天" + hour + "小时" + min + "分钟";
    }

    public static long diffTime(Date d1, Date d2) {
        if (null == d1 || null == d2) {
            return -1;
        }
        return d1.getTime() - d2.getTime();
    }

    /**
     * 获取本月的第一天
     *
     * @return
     */
    public static Date getMonthFirstDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 得到本月的最后一天
     *
     * @return
     */
    public static Date getMonthLastDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 得到指定月的最后一天
     *
     * @return
     */
    public static String getMonthLastDay(String date) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        calendar.setTime(df.parse(date));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return df.format(calendar.getTime());
    }

    //指定日期是星期几
    public static String getWeekendDay(String day) throws ParseException {
        String weekendDay = "";
        if (isWeekday(day, GregorianCalendar.MONDAY)) {
            weekendDay = "星期一";
        } else if (isWeekday(day, GregorianCalendar.TUESDAY)) {
            weekendDay = "星期二";
        } else if (isWeekday(day, GregorianCalendar.WEDNESDAY)) {
            weekendDay = "星期三";
        } else if (isWeekday(day, GregorianCalendar.THURSDAY)) {
            weekendDay = "星期四";
        } else if (isWeekday(day, GregorianCalendar.FRIDAY)) {
            weekendDay = "星期五";
        } else if (isWeekday(day, GregorianCalendar.SATURDAY)) {
            weekendDay = "星期六";
        } else {
            weekendDay = "星期日";
        }
        return weekendDay;
    }


    /**
     * 获取当前时间的calender
     *
     * @return
     */
    public static Calendar getCurrCalender() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal;
    }

    /**
     * 格式化日期
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String formartDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 格式化表单传来的日期数据
     *
     * @param dateStr
     * @param patternFrom
     * @param patternTo
     * @return
     * @throws ParseException
     */
    public static String formartDateStr(String dateStr, String patternFrom, String patternTo) throws ParseException {
        if (StringUtil.isEmpty(dateStr) || StringUtil.isEmpty(patternFrom) || StringUtil.isEmpty(patternTo)) {
            return null;
        }
        SimpleDateFormat fmt1 = new SimpleDateFormat(patternFrom);
        SimpleDateFormat fmt2 = new SimpleDateFormat(patternTo);
        return fmt2.format(fmt1.parse(dateStr));
    }

    //两个日期相差多少天
    public static String dateDiff(String startTime, String endTime,
                                  String format) {
        // 按照传入的格式生成一个simpledateformate对象
        SimpleDateFormat sd = new SimpleDateFormat(format);
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数long diff;try {
        // 获得两个时间的毫秒时间差异
        long diff = 0;
        long day = 0;
        long hour = 0;
        try {
            diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
            day = diff / nd;// 计算差多少天
            hour = diff % nd / nh;// 计算差多少小时
            // long min = diff % nd % nh / nm;// 计算差多少分钟
            // long sec = diff % nd % nh % nm / ns;// 计算差多少秒//输出结果

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return day + "天" + hour + "小时";
    }

    /**
     * 获取当前calender的前一个年、月、日时间字符串
     *
     * @param cal
     * @param field
     * @param pattern
     * @return
     */
    public static String getOneStepAgo(Calendar cal, int field, String pattern) {
        getOneStepAgo(cal, field);
        return new SimpleDateFormat(pattern).format(cal.getTime());
    }

    /**
     * 获取上一周的今天是几号
     *
     * @throws ParseException
     */
    public static String getDay(String nowDay) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(nowDay);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.setTime(date);
        int day = 8;
        if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.MONDAY) {
            day = 1;
        } else if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.TUESDAY) {
            day = 2;
        } else if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.WEDNESDAY) {
            day = 3;
        } else if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.THURSDAY) {
            day = 4;
        } else if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.FRIDAY) {
            day = 5;
        } else if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SATURDAY) {
            day = 6;
        } else if (gcalendar.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SUNDAY) {
            day = 7;
        }
        calendar.add(Calendar.DAY_OF_MONTH, -day);
        date = calendar.getTime();
        return format.format(date);
    }

    /**
     * 获取当前calender的前一个年、月、日时间
     *
     * @param cal
     * @param field
     * @return
     */
    public static Date getOneStepAgo(Calendar cal, int field) {
        cal.add(field, -1);
        return cal.getTime();
    }

    /**
     * 获取上个月的月份
     */
    public static String getLastDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -1);
        date = cal.getTime();
        return sdf.format(date);
    }

    /**
     * 获取上个月的最后一天
     */
    public static String getLastMonthLastDay() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /**
     * 获取上个月的第一天
     */
    public static String getLastMonthFirstDay() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /**
     * 获取指定月的下个月第一天
     */
    public static String getNextMonthFirstDay(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(date));
        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month + 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date nextMonth = calendar.getTime();
        return sdf.format(nextMonth);
    }

    public static String getAfterDayMonthString(int day) {
        Date date = getAfterDay(null, day);
        SimpleDateFormat format = new SimpleDateFormat("MM月dd日");
        return format.format(date);
    }

    public static String getAfterDayMonthFormatString(int day) {
        Date date = getAfterDay(null, day);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");
        return format.format(date);
    }

    /**
     * @param dateStr
     * @return
     * @Description:将日期字符串转换为Date
     */
    public static Date dateStrToDate(String dateStr, String patterns) {
        SimpleDateFormat sdf = new SimpleDateFormat(patterns);
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }


}
