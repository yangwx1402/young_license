1.将mac.license文件放在部署服务器中任意位置都可以并记录存放路径
2.用解压软件打开isoftstone_license.jar找到license.properties配置文件
修改licensePath=E:\\mac.license(改为1中mac.license存放路径)   
expirePage=/license_expired.jsp(为license过期后redirect路径,可以放一个提示license过期的页面)
打开root-license.xml配置文件,<aop:pointcut id="licenseCheck" expression="execution(* org.bdp.modules.*.*.controller..*.*(..))"/>
修改需要验证license的controller
3.将修改后的isoftstone_license.jar打包放在WEB-INFO/lib下
4.将public.store文件放在项目的classes中
5.在spring-mvc配置文件中加入<import resource="root-license.xml"/>启动项目即可进行license的验证