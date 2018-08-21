
package cn.yilucaifu.utils;

import org.apache.log4j.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author Administrator
 */
public class ConfigUtil {
    private static Logger logger = Logger.getLogger(ConfigUtil.class);

    private final static ConfigUtil INSTANCE = new ConfigUtil();

    // private static final String YLSERVERPROPERTIESFILE =
    // "YLserver.properties";

    public static ConfigUtil getInstance() {
        return INSTANCE;
    }

    public static final String IMAGESERVER_URL = "imageserver.url";
    public static final String SERVER_NAME_URL = "forezp.name.url";
    public static final String SERVER_NAME_URL_HTTPS = "forezp.name.url.https";
    public static final String FTPSERVER_URL = "ftp.forezp";

    //银行卡号密匙
    public static final String BANK_KEY = "1DF6BF44DACD4216B0B5A168";
    public static final String BANK_VAL = "1DF6BF16";

    private static final String IMAGESERVER_URL_MIN = "imageserver.url.min";

    //企业材料审核邮箱模版
    private static final String EMAIL_OPEN_ACCOUNT_FTL = "email/openAccount.ftl";
    //余额购买完产品通知模版
    public static final String BALANCE_BUY_FTL = "balanceBuyMsg.ftl";
    //企业材料审核人
    public static final String EMAIL_OPEN_ACCOUNT_MAN = "email.openAccountMan";
    //信息收集查看人邮箱
    public static final String EMAIL_GATHER_INFO = "email.gatherinfo";
    //信息收集查看人手机号
    public static final String PHONE_GATHER_INFO = "phone.gatherinfo";
    //余额购买完产品后通知人邮箱
    private static final String EMAIL_BALANCE_BUY_MAN = "email.balaceBuy";
    //余额购买完产品后通知人手机号
    private static final String PHONE_BALANCE_BUY_MAN = "phone.balaceBuy";
    //等待开户页
    private static final String OPEN_ACCOUNT_PAGE = "/passport/userInfoSuccess.html";
    //平台交易密码
    private static final String SET_TRANSPASSWD_PAGE = "/user/setTradePwd.html";
    //风险测评
    private static final String FUND_RISK_PAGE = "/fundRisk/content.html";
    //注册流程
    private static final String REGISTER_PAGE = "/passport/reg.html";
    //徽商设置交易密码
    private static final String HS_PASSWD_SETURL = "/user/passwdSetUrl.html?userId=";
    //上传合格投资者证明
    private static final String UPLOAD_USER_QFII = "/passport/toUpQfiiPage.html";




    public static Properties props = null;

    public static Properties getProperties() {

        if (props == null) {
            props = new Properties();
            InputStream fileStream = null;
            Context env = null;
            String path = null;

            try {
                // Get a handle to the JNDI environment naming context
                env = (Context) new InitialContext().lookup("java:comp/env");
                path = (String) env.lookup("YLCFConfigs");

                File file = new File(path);
                file = file.getAbsoluteFile();
                fileStream = new FileInputStream(file);

                if (logger.isDebugEnabled()) {
                    logger.debug("Opened config file <" + path
                            + "> successfully.");
                }
            } catch (FileNotFoundException e1) {
                logger.error(path
                        + " is not found in local environment.  Trying the classpath....");
                // do nothing yet
            } catch (NamingException e) {
                logger.error(path + " pathname is erroneous.  ", e);
            }

            try {

                if (fileStream == null) {
                    props.load(ConfigUtil.class.getClassLoader()
                            .getResourceAsStream(path));

                } else {
                    // HOSTSFILE was found
                    props.load(fileStream);
                }
            } catch (IOException e) {
                logger.fatal("Cannot find and load " + path
                        + "!! Make sure it is available!", e);
            }
        }
        return props;
    }




    /**
     * FTP地址
     *
     * @return
     */
    public String getFtp_server_url() {
        return getProperties().getProperty(FTPSERVER_URL);
    }

    /**
     * @return the imageserver_url
     */
    public String getImageserver_url() {
        return getProperties().getProperty(IMAGESERVER_URL);
    }

    public static String getEmailBalanceBuyMan() {
        return getProperties().getProperty(EMAIL_BALANCE_BUY_MAN);
    }
    public static String getPhoneBalanceBuyMan() {
        return getProperties().getProperty(PHONE_BALANCE_BUY_MAN);
    }

    public static String getEmailOpenAccountFTL() {
        return EMAIL_OPEN_ACCOUNT_FTL;
    }

    public static String getEmailOpenAccountMAN() {
        return getProperties().getProperty(EMAIL_OPEN_ACCOUNT_MAN);
    }

    public static String getOpenAccountPage() {
        return OPEN_ACCOUNT_PAGE;
    }

    public static  String getUploadByUserQfii(){
        return UPLOAD_USER_QFII;
    }

    public static String getSetTranspasswdPage() {
        return SET_TRANSPASSWD_PAGE;
    }

    public static String getFundRiskPage() {
        return FUND_RISK_PAGE;
    }

    public static String getRegisterPage() {
        return REGISTER_PAGE;
    }

    public static String getHsPasswdSeturl() {
        return HS_PASSWD_SETURL;
    }

    public static String getEmailGatherInfo() {
        return getProperties().getProperty(EMAIL_GATHER_INFO);
    }

    public static String getPhoneGatherInfo() { return getProperties().getProperty(PHONE_GATHER_INFO); }

}
