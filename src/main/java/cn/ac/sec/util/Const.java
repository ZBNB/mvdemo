package cn.ac.sec.util;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;

/**
 * 项目名称：
 * 
 * @author:
 * 
 */
public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String SESSION_menuList = "menuList"; // 当前菜单
	public static final String SESSION_allmenuList = "allmenuList"; // 全部菜单
	public static final String SESSION_QX = "QX";
	public static final String SESSION_userpds = "userpds";
	public static final String SESSION_USERROL = "USERROL"; // 用户对象
	public static final String SESSION_USERNAME = "USERNAME"; // 用户名

	public static final int LOGINVALIDIDY = 3; // Token有效期

	public static final String TRUE = "T";
	public static final String FALSE = "F";
	public static final String LOGIN = "/login_toLogin.do"; // 登录地址
	public static final String SYSNAME = "admin/config/SYSNAME.txt"; // 系统名称路径
	public static final String PAGE = "admin/config/PAGE.txt"; // 分页条数配置路径

	public static final String FILEPATHIMG = "uploadFiles/uploadImgs/"; // 图片上传路径
	public static final String FILEPATHFILE = "uploadFiles/file/"; // 文件上传路径
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(uploadFiles)|(static)).*"; // 不对匹配该值的访问路径拦截（正则）

	public static final String UPLOADIMGS = "/uploadFiles/uploadImgs/"; // 默认图片路径
	public static final String FILEIN = "/uploadFiles/FileIn/"; // 文件批量导入上传路径
	public static final String RESOURCESFILEPATH = "/uploadFiles/resources/"; // 资源上传路径
	
	//课时有效期
	static Calendar cal = Calendar.getInstance();
	public static final String bigmonth01 = String.valueOf(cal.get(Calendar.YEAR))+"-"+"08-01";//大月份
	public static final String bigmonth02 = String.valueOf(cal.get(Calendar.YEAR))+"-"+"08-02";//大月份
	public static final String smallmonth01 = String.valueOf(cal.get(Calendar.YEAR))+"-"+"02-01";//小月份
	public static final String smallmonth02 = String.valueOf(cal.get(Calendar.YEAR))+"-"+"02-02";//小月份
	public static final String nsmallmonth = String.valueOf(cal.get(Calendar.YEAR)+1)+"-"+"02-01";//下一年小月份
	public static final String obigmonth = String.valueOf(cal.get(Calendar.YEAR)-1)+"-"+"08-02";//前一年大月份

	/* 后台操作日志 */
	public static final String SESSION_USERID = "USER_ID"; // 用户ID
	public static final String SESSION_IP = "IP";
	public static final String USER_LOGIN = "登录";
	public static final String USER_LOGOUT = "登出";
	public static final String ACTION_EDIT = "修改";
	public static final String ACTION_ADD = "添加";
	public static final String ACTION_DELETE = "删除";
	public static final String ACTION_PASS = "通过";
	public static final String ONLINE = "上线";
	public static final String DOWNLINE = "下线";
	public static final String ABLE = "启用";
	public static final String UNABLE = "禁用";
	public static final String ACTION_BATCH_IMPORT = "批量导入";
	public static final String ACTION_BATCH_DELETE = "批量删除";
	public static final String FILEPARSE = "文件转换";
	public static final String VERSION_ADD = "版本发布";

	public static ApplicationContext WEB_APP_CONTEXT = null; // 该值会在web容器启动时由WebAppContextListener初始化

}
