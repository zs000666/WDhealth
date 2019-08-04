package com.bwie.api;

/**
 * 咨询相关接口
 */
public class ConsultancyRelatedApi {

    //查询问诊医生列表
    public static final String CUSTOMER_CONSULT_SEARCH_COUNSELLING_DOCTOR_LIST_URL = "health/user/inquiry/v1/findDoctorList";
    //查询医生明细信息
    public static final String CUSTOMER_CONSULT_SEARCH_DOCTOR_Detail_INFO_URL = "health/user/inquiry/v1/findDoctorInfo";
    //咨询医生
    public static final String CUSTOMER_CONSULT_CONSULT_DOCTOR_URL = "health/user/inquiry/verify/v1/consultDoctor";
    //关注医生
    public static final String CUSTOMER_CONSULT_FOLLOW_DOCTOR_URL = "health/user/inquiry/verify/v1/followDoctor";
    //取消关注医生
    public static final String CUSTOMER_CONSULT_CANCEL_FOLLOW_DOCTOR_URL = "health/user/inquiry/verify/v1/cancelFollow";
    //结束问诊
    public static final String CUSTOMER_CONSULT_END_COUNSELLING_URL = "health/user/inquiry/verify/v1/endInquiry";
    //用户评论问诊服务
    public static final String CUSTOMER_CONSULT_USER_COMMENT_COUNSELLING_URL = "health/user/inquiry/verify/v1/evaluationInquiry";
    //送礼物
    public static final String CUSTOMER_CONSULT_HAND_SELGIFT_URL = "health/user/inquiry/verify/v1/handselGift";
    //用户查看当前问诊
    public static final String CUSTOMER_CONSULT_USER_SEARCH_CURRENT_COUNSELLING_URL = "health/user/inquiry/verify/v1/findCurrentInquiryRecord";
    //查看历史问诊
    public static final String CUSTOMER_CONSULT_SEARCH_HISTORY_COUNSELLING_URL = "health/user/inquiry/verify/v1/findHistoryInquiryRecord";
    //问诊-发送消息
    public static final String CUSTOMER_CONSULT_COUNSELLING_SEND_MESSAGE_URL = "health/user/inquiry/verify/v1/pushMessage";
    //查询历史问诊聊天记录
    public static final String CUSTOMER_CONSULT_SEARCH_HISTORY_COUNSELLING_LIST_URL = "health/user/inquiry/verify/v1/findInquiryRecordList";
    //查询问诊评价详情
    public static final String CUSTOMER_CONSULT_SEARCH_COUNSELLING_COMMENT_DETAIL_URL = "health/user/inquiry/verify/v1/findDoctorEvaluate";
    //查询礼物列表
    public static final String CUSTOMER_CONSULT_SEARCH_GIFT_LIST_URL = "health/user/inquiry/v1/findGiftList";

}
