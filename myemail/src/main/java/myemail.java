import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class myemail {
    public static void main(String[] args) {
        SimpleEmail email = new SimpleEmail();
        //qq：qq邮件服务器的端口号
        email.setSslSmtpPort("465");
        //
        email.setHostName("smtp.qq.com");
        //email.setAuthentication("你的qq号@qq.com", "pykkmyniimpdhfid");
        email.setAuthentication("2064555556@qq.com", "acrmvlunivapbeba");
        email.setCharset("UTF-8");
        //1、从文件把所有的qq邮箱读取出来
        //2、存储到一个数据结构当中
        //3、String email = 数据结构当中取一个
            try {
                //email.addTo("给谁发@qq.com");
                email.addTo("1187541487@qq.com");
                email.setFrom("2064555556@qq.com");
                email.setSubject("你作业做完了吗？？？？？？？？？？？？？？？？？？？？？？？？？");
                email.setMsg("来自麟弟弟的问候");
                email.send();
            } catch (EmailException e) {
                e.printStackTrace();
            }
    }
}
