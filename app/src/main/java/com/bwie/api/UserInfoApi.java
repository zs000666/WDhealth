package com.bwie.api;

/**
 * 用户相关接口
 */
public class UserInfoApi {

    //测试环境&正式环境
    public static boolean isRelease = false;

    //测试版url
    public static final String TEST_URL = "http://172.17.8.100/";
    //正式版url
    public static final String OFFICIAL_URL = "http://mobile.bwstudent.com/";
    //当前url
    public static final String BASE_URL = isRelease ? TEST_URL : OFFICIAL_URL;

    //发送邮箱验证码
    public static final String CUSTOMER_USER_SEND_EMAIL_CODE_URL = "health/user/v1/sendOutEmailCode";
    //注册
    public static final String CUSTOMER_USER_USER_REGISTER_URL = "health/user/v1/register";
    //登录
    public static final String CUSTOMER_USER_USER_LOGIN_URL = "health/user/v1/login";
    //根据用户ID查询用户信息
    public static final String CUSTOMER_USER_FIND_ID_USER_INFO_URL = "health/user/verify/v1/getUserInfoById";
    //完善用户信息
    public static final String CUSTOMER_USER_PERFECT_USER_INFO_URL = "health/user/verify/v1/perfectUserInfo";
    //上传头像
    public static final String CUSTOMER_USER_UPLOAD_PICTRUE_URL = "health/user/verify/v1/modifyHeadPic";
    //添加用户档案
    public static final String CUSTOMER_USER_ADD_USER_INFO_URL = "health/user/verify/v1/addUserArchives";
    //上传用户档案相关图片
    public static final String CUSTOMER_USER_UPLOAD_USER_INFO_PICTRUE_URL = "health/user/verify/v1/uploadArchivesPicture";
    //用户查看自己的档案
    public static final String CUSTOMER_USER_FIND_MY_ARCHIVES_URL = "health/user/verify/v1/findUserArchives";
    //用户签到
    public static final String CUSTOMER_USER_USER_SIGN_URL = "health/user/verify/v1/addSign";
    //查询用户当天是否签到
    public static final String CUSTOMER_USER_USER_SIGN_TODAY_URL = "health/user/verify/v1/whetherSignToday";
    //查询用户连续签到天数
    public static final String CUSTOMER_USER_QUERY_USER_SIGN_URL = "health/user/verify/v1/findUserSign";
    //修改用户性别
    public static final String CUSTOMER_USER_UPDATE_USER_SEX_URL = "health/user/verify/v1/updateUserSex";
    //修改用户昵称
    public static final String CUSTOMER_USER_UPDATE_USER_NAME_URL = "health/user/verify/v1/modifyNickName";
    //生成邀请码
    public static final String CUSTOMER_USER_MAKE_INVITE_URL = "health/user/verify/v1/makeInvitationCode";
    //查询用户邀请码
    public static final String CUSTOMER_USER_QUERY_USER_INVITE_URL = "health/user/verify/v1/findUserInvitationCode";
    //修改密码
    public static final String CUSTOMER_USER_UPDATE_USER_PWD_URL = "health/user/verify/v1/updateUserPwd";
    //添加用户极光推送信息Token
    public static final String CUSTOMER_USER_ADD_USER_JPUSH_TOKEN_URL = "health/user/verify/v1/addUserPushToken";
    //做任务
    public static final String CUSTOMER_USER_DO_TASK_URL = "health/user/verify/v1/doTask";
    //查询用户任务列表
    public static final String CUSTOMER_USER_QUERY_USER_TASK_LIST_URL = "health/user/verify/v1/findUserTaskList";
    //领取任务奖励
    public static final String CUSTOMER_USER_RECEIVE_TASK_REWARD_URL = "health/user/verify/v1/receiveReward";
    //修改用户档案
    public static final String CUSTOMER_USER_UPDATE_USER_ARCHIVES_URL = "health/user/verify/v1/updateUserArchives";
    //删除用户档案
    public static final String CUSTOMER_USER_DELETE_USER_ARCHIVES_URL = "health/user/verify/v1/deleteUserArchives";
    //收藏资讯
    public static final String CUSTOMER_USER_ADD_INFORMATION_URL = "health/user/verify/v1/addInfoCollection";
    //查询用户资讯收藏列表
    public static final String CUSTOMER_USER_QUERY_USER_INFORMATION_LIST_URL = "health/user/verify/v1/findUserInfoCollectionList";
    //取消资讯收藏
    public static final String CUSTOMER_USER_CANCEL_INFORMATION_URL = "health/user/verify/v1/cancelInfoCollection";
    //收藏病友圈
    public static final String CUSTOMER_USER_ADD_PATIENT_CIRCLE_URL = "health/user/verify/v1/addUserSickCollection";
    //用户收藏病友圈列表
    public static final String CUSTOMER_USER_USER_ADD_PATIENT_CIRCLE_LIST_URL = "health/user/verify/v1/findUserSickCollectionList";
    //取消病友圈收藏
    public static final String CUSTOMER_USER_CANCEL_PATIENT_CIRCLE_URL = "health/user/verify/v1/cancelSickCollection";
    //用户收藏健康课堂视频列表
    public static final String CUSTOMER_USER_USER_COLLECT_VIDEO_LIST_URL = "health/user/verify/v1/findVideoCollectionList";
    //用户取消视频收藏
    public static final String CUSTOMER_USER_USER_CANCEL_VIDEO_COLLECT_URL = "health/user/verify/v1/cancelVideoCollection";
    //查询用户关注医生列表
    public static final String CUSTOMER_USER_QUERY_USER_FOCUS_DOCTOR_LIST_URL = "health/user/verify/v1/findUserDoctorFollowList";
    //查询用户购买视频列表
    public static final String CUSTOMER_USER_QUERY_USER_BUY_VIDEO_LIST_URL = "health/user/verify/v1/findUserVideoBuyList";
    //删除购买健康课堂视频
    public static final String CUSTOMER_USER_DELETE_USER_BUY_VIDEO_LIST_URL = "health/user/verify/v1/deleteVideoBuy";
    //查询用户消费记录
    public static final String CUSTOMER_USER_QUERY_USER_CONSUMPTION_LIST_URL = "health/user/verify/v1/findUserConsumptionRecordList";
    //我的钱包
    public static final String CUSTOMER_USER_MY_WALLET_URL = "health/user/verify/v1/findUserWallet";
    //检验验证码
    public static final String CUSTOMER_USER_CHECK_CODE_URL = "health/user/v1/checkCode";
    //重置用户密码（忘记密码用）
    public static final String CUSTOMER_USER_RESET_USER_PWD_URL = "health/user/v1/resetUserPwd";
    //查询用户系统通知列表
    public static final String CUSTOMER_USER_QUERY_USER_NOTICE_SYSTEM_LIST_URL = "health/user/verify/v1/findSystemNoticeList";
    //查询用户问诊通知列表
    public static final String CUSTOMER_USER_QUERY_USER_COUNSELLING_LIST_URL = "health/user/verify/v1/findInquiryNoticeList";
    //查询用户H币通知列表
    public static final String CUSTOMER_USER_QUERY_USER_H_CURRENCY_LIST_URL = "health/user/verify/v1/findHealthyCurrencyNoticeList";
    //绑定（换绑）银行卡信息
    public static final String CUSTOMER_USER_BIND_USERBANK_CARD_URL = "health/user/verify/v1/bindUserBankCard";
    //查询绑定银行卡信息
    public static final String CUSTOMER_USER_QUERY_BIND_USERBANK_CARD_INFO_URL = "health/user/verify/v1/findUserBankCardByUserId";
    //绑定身份证
    public static final String CUSTOMER_USER_BIND_USERID_CARD_URL = "health/user/verify/v1/bindUserIdCard";
    //查询用户身份证信息
    public static final String CUSTOMER_USER_QUERY_USERID_CARD_INFO_URL = "health/user/verify/v1/findUserIdCard";
    //查询用户提现记录
    public static final String CUSTOMER_USER_QUERY_USER_DRAW_CASH_LIST_URL = "health/user/verify/v1/findUserDrawRecordList";
    //提现
    public static final String CUSTOMER_USER_DRAW_CASH_URL = "health/user/verify/v1/drawCash";
    //观看资讯奖励
    public static final String CUSTOMER_USER_WATCH_INFO_REWARDS_URL = "health/user/verify/v1/watchInfoRewards";
    //查询用户未读消息数
    public static final String CUSTOMER_USER_QUERY_USER_NOT_READ_NUM_URL = "health/user/verify/v1/findUserNoticeReadNum";
    //修改消息状态为全部已读
    public static final String CUSTOMER_USER_UPDATE_NEWS_STATUS_IS_READ_URL = "health/user/verify/v1/modifyAllStatus";
    //查询我的被采纳的建议
    public static final String CUSTOMER_USER_QUERY_MY_ADOPTED_SUGGESTION_URL = "health/user/verify/v1/findMyAdoptedCommentList";
    //查询健康检测跳转URL
    public static final String CUSTOMER_USER_QUERY_HEALTH_TEST_URL = "health/user/verify/v1/userHealthTest";
    //充值
    public static final String CUSTOMER_USER_RECHARGE_URL = "health/user/verify/v1/recharge";
}
