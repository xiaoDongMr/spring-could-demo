package cn.yilucaifu.utils;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	private static Random randGen = null;
	private static char[] numbersAndLetters = null;

	private StringUtil() {

	}

	/**
	 * 判断是否为空
	 * 
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(String arg) {
		return (arg == null)
				|| (arg.trim().equals("") || arg.trim().equals("null") || arg
						.trim().equals("NULL"));
	}

	/**
	 * 判断是否为空，为空时返回true
	 * 
	 * @param arg
	 * @return
	 */
	public static boolean isNotEmpty(String arg) {
		return !isEmpty(arg);
	}

	/**
	 * 以字符串形式返回，null返回空串
	 * 
	 * @param o
	 * @return
	 */
	public static String getStringValue(Object o) {
		if (o == null)
			return "";
		return String.valueOf(o);
	}


	/**
	 * 数字长度不够右对齐左补0
	 * 
	 * @param num
	 * @param length
	 * @return
	 */
	public static String fillNumWithLeft(String num, int length) {
		StringBuffer sb = new StringBuffer();
		if (!isEmpty(num)) {
			int i = getStrLength(num);
			if (i > length) {
				sb.append(limitString(num, length));
				// sb.append(num.substring(0, length));
			} else {
				for (; i < length; i++) {
					sb.append("0");
				}
				sb.append(num);
			}

		} else {
			for (int i = 0; i < length; i++) {
				sb.append("0");
			}

		}
		return sb.toString();
	}


	//截取字符串指定长度
	public static String limitString(String str, int subLength) {
		try {
			if (str == null) {
				return "";
			} else {
				int tempSubLength = subLength;//
				String subStr = str.substring(0,
						str.length() < subLength ? str.length() : subLength);
				int subByetsLength = subStr.getBytes("GBK").length;// 截取子串的字节长度
				// 说明截取的字符串中包含有汉字
				while (subByetsLength > tempSubLength) {
					int subLengthTemp = --subLength;
					subStr = str.substring(0,
							(subLengthTemp > str.length() ? str.length()
									: subLengthTemp));
					subByetsLength = subStr.getBytes("GBK").length;
				}
				return subStr;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 获得字符串长度,中文两个长度
	 *
	 * @param str
	 * @return
	 */
	public static int getStrLength(String str) {
		if (!isEmpty(str)) {
			try {
				return str.getBytes("GBK").length;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return 0;
			}
		}
		return 0;
	}

	/**
	 * 是否包含空字符串
	 * 
	 * @param arg
	 * @return
	 */
	public static boolean hasNullStr(String arg) {
		return arg == null || arg.trim().equals("")
				|| arg.trim().equalsIgnoreCase("null");
	}

	/**
	 * 去空格
	 * 
	 * @param resource
	 * @return
	 */
	public static String removeSpace(String resource) {
		return resource.replace(" ", "");
	}


	/**
	 * 
	 * @param date
	 *            时间
	 * @param format
	 *            格式
	 * @return
	 */
	public static String formatDate(Date date, String format) {
		return (new SimpleDateFormat(format)).format(date);
	}

	public static String formatDate(Date date) {
		return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date);
	}

	public static String formatDateShort(Date date) {
		return (new SimpleDateFormat("yyyy-MM-dd")).format(date);
	}

	public static String formatDateByShort(Date date) {
		return (new SimpleDateFormat("yyyyMMdd")).format(date);
	}

	/**
	 * 返回当前日期 yyyyMMdd
	 * 
	 * @return
	 */
	public static String getDate() {
		return (new SimpleDateFormat("yyyyMMdd")).format(new Date());
	}

	/**
	 * 返回当前时间HHmmss
	 * 
	 * @return
	 */
	public static String getTime() {
		return (new SimpleDateFormat("HHmmss")).format(new Date());
	}

	/**
	 * 返回当前时间yyyyMMddHHmmss
	 * 
	 * @return
	 */
	public static String getDateTime() {
		return (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());
	}

	/**
	 * 获得默认的时间字符串
	 * 
	 * @return
	 */
	public static String findDefaultDateStr() {
		return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
	}

	/**
	 * 根据时间模板返回字符串
	 * 
	 * @param fmt
	 * @return
	 */
	public static String findDateStr(String fmt) {
		return (new SimpleDateFormat(fmt)).format(new Date());
	}


	/**
	 * 验证邮箱是否正确
	 * @param searchPhrase
	 * @return
	 */
	public static boolean isEmail(final String searchPhrase) {
		if (!isEmpty(searchPhrase)) {
			final String check = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
			final Pattern regex = Pattern.compile(check);
			final Matcher matcher = regex.matcher(searchPhrase);
			return matcher.matches();
		}
		return false;
	}

	/**
	 * 验证手机号是否正确
	 * @param mobiles
	 * @return
	 */
	public static boolean isMobileNO(String mobiles) {
		if (!isEmpty(mobiles)) {
			Pattern p = Pattern
					.compile("^((13[0-9])|(17[0-9])|(15[^4,\\D])|(18[0-9])|(14[0-9]))\\d{8}$");
			Matcher m = p.matcher(mobiles);
			return m.matches();
		}
		return false;
	}

	/**
	 * 计算字符串长度，拼接报文头,不足前补0
	 * 
	 * @param content
	 * @param lenght
	 * @return
	 */
	public static String computeLengthMergerStr(String content, int lenght) {
		return StringUtil.fillNumWithLeft(content+ "", lenght);
	}

	/**
	 * 根据字节长度截取字符串
	 * 
	 * @param str
	 * @param begin
	 * @param count
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String subBytes(String str, int begin, int count)
			throws UnsupportedEncodingException {
		byte[] src = str.getBytes("GBK");
		byte[] bs = new byte[count];
		for (int i = begin; i < begin + count; i++) {
			bs[i - begin] = src[i];
		}
		String s = new String(bs, "GBK");
		return trim(s);
	}

	public static String trim(String arg) {
		if (!StringUtil.isEmpty(arg)) {
			return arg.trim();
		} else {
			return "";
		}
	}


	//判断是否为整正数
	public static boolean isInteger(String arg) {
		return (!isEmpty(arg)) && arg.matches("-?[0-9]*"); // 正负数
	}
	//判断是否为整负数
	public static boolean isPositiveInteger(String arg) {
		return (!isEmpty(arg)) && arg.matches("[0-9]*"); // 正负数
	}

	/**
	 * 判断是否为金额，最多两位小数，且不能为负
	 * 
	 * @param money
	 * @return
	 */
	public static boolean isMoney(String money) {
		if (!isEmpty(money)) {
			Pattern p = Pattern.compile("^[0-9]+(\\.[0-9]{1,2})?$");
			Matcher m = p.matcher(money);
			return m.matches();
		}
		return false;
	}

	/**
	 * 判断两位小数金额
	 * 
	 * @param money
	 * @return
	 */
	public static boolean isMoney(double money) {
		Pattern p = Pattern.compile("^[0-9]+(\\.[0-9]{1,2})?$");
		Matcher m = p.matcher("" + money);
		return m.matches();
	}

	/**
	 * 判断两位小数金额
	 * 
	 * @param money
	 * @return
	 */
	public static boolean isFloatMoney(float money) {
		Pattern p = Pattern.compile("^[0-9]+(\\.[0-9]{1,2})?$");
		Matcher m = p.matcher("" + money);
		return m.matches();
	}

	/**
	 * 判断是否为数字
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		if (!isEmpty(str)) {
			return str
					.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
		}
		return false;
	}

	/**
	 * 判断是否是邮政编码
	 * 
	 * @param postcode
	 * @return
	 */
	public static boolean isPostcode(String postcode) {
		if (isEmpty(postcode))
			return false;
		return postcode.matches("^[0-9]{6}$");
	}


	/**
	 * 字符串转时间
	 * 
	 * @param dateStr
	 * @param formatStr
	 * @return
	 */
	public static Date stringToDate(String dateStr, String formatStr) {
		DateFormat sdf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}


}
