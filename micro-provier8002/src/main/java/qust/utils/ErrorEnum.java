package qust.utils;

/**
 * Created by lowdad on 18-1-23. error枚举
 */
public enum ErrorEnum {

	SUCCESS(true, 0, "成功"),
	SUCCESS1(false, 1, "当前城市未开放业务"),

	USER_ERROR(true, 0, "该账号已被冻结，无法登录。\n" +
			"\n" +
			"若有疑问请联系客服。\n" +
			"\n" +
			"客户电话：400-000-0000\n"),
	USER_ALREADY_EXISTS(false, 2, "用户已存在"),
	USER_NOT_EXISTS(false, 5, "用户不存在"), 
	SMS_ERROR(false,3, "验证码错误"), 
	PASSWORD_NOT_EXISTS(false, 6, "未设置密码"), 
	NO_APPROVE(false, 12, "未认证"), 
	WRONG_IDCARD(false, 10, "身份证错误"), 
	MISMATCHING(false, 19, "身份信息有误"), 
	ERROR_PARAM(false, -5, "缺少参数"),
	USER_NOT_REGISTER(false, 100, "用户未注册"),
	BALANCE_NOT_ENOUGH(false,101,"用户账户余额不足")
	;
	private Boolean isSuccess;
	private Integer code;
	private String msg;

	ErrorEnum(Boolean isSuccess, Integer code, String msg) {
		this.isSuccess = isSuccess;
		this.code = code;
		this.msg = msg;

	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
