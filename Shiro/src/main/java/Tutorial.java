import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/4/17:37
 **/

public class Tutorial {
    private static final transient Logger log = LoggerFactory.getLogger(Tutorial.class);

    public static void main(String[] args) {
        log.info("xihuashiroApplication");

        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager instance = factory.getInstance();
        SecurityUtils.setSecurityManager(instance);

        //获取当前正在执行操作的用户
        Subject subject = SecurityUtils.getSubject();

        Session session = subject.getSession();

        session.setAttribute("someKey","aValue");

        if (!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");

            //添加记住我功能
            token.setRememberMe(true);


            //登录
            subject.login(token);


        }

        //查看登陆用户的身份
        log.info("User["+subject.getPrincipal()+"]logged in successfully");

        //验证是否具有某个角色
        if( subject.hasRole("schwartz")){
            log.info("May the Schwartz be whit you!");
        }else {
            log.info("hello,mere mortal.");
        }

        //是否有某个权限
        if (subject.isPermitted("lightsaber:weild")){
            log.info("You may use a lightaber ring. Use it wisely");
        }else{
            log.info("Sorry,lightsaber rings are for schwartz masters only.");
        }

        //退出
        subject.logout();



        System.exit(0);
    }
}
