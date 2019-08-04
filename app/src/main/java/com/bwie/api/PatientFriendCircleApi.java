package com.bwie.api;

/**
 * 病友圈相关接口
 */
public class PatientFriendCircleApi {

    //病友圈列表展示
    public static final String CUSTOMER_PATIENT_LIST_URL = "health/user/sickCircle/v1/findSickCircleList";
    //查询病友圈详情
    public static final String CUSTOMER_PATIENT_SEARCH_DETAIL_URL = "health/user/sickCircle/v1/findSickCircleInfo";
    //根据关键词查询病友圈
    public static final String CUSTOMER_PATIENT_SEARCH_SICK_CIRCLE_URL = "health/user/sickCircle/v1/searchSickCircle";
    //病友圈发表评论
    public static final String CUSTOMER_PATIENT_CIRCLE_COMMENTS_URL = "health/user/sickCircle/verify/v1/publishComment";
    //查询病友圈评论列表
    public static final String CUSTOMER_PATIENT_CIRCLE_COMMENTS_LIST_URL = "health/user/sickCircle/v1/findSickCircleCommentList";
    //采纳病友圈优秀的评论
    public static final String CUSTOMER_PATIENT_CIRCLE_ADOPTION__URL = "health/user/sickCircle/verify/v1/adoptionProposal";
    //发表观点
    public static final String CUSTOMER_PATIENT_PUBLISH_OPINION_URL = "health/user/sickCircle/verify/v1/expressOpinion";
    //查看病友的病友圈发帖列表
    public static final String CUSTOMER_PATIENT_CIRCLE_QUERY_SICK_LIST_URL = "health/user/sickCircle/v1/findPatientSickCircleList";
    //查看我的病友圈发帖列表
    public static final String CUSTOMER_PATIENT_CIRCLE_QUERY_MY_SICK_LIST_URL = "health/user/sickCircle/verify/v1/findMySickCircleList";
    // 查询我的病友圈帖子的评论列表
    public static final String CUSTOMER_PATIENT_CIRCLE_QUERY_MY_SICK_COMMENT_LIST_URL = "health/user/sickCircle/verify/v1/findMySickCircleCommentList";
    //发布病友圈
    public static final String CUSTOMER_PATIENT_CIRCLE_PUBLISH_URL = "http://172.17.8.100/health/user/sickCircle/verify/v1/publishSickCircle";
    //上传用户病友圈相关图片
    public static final String CUSTOMER_PATIENT_CIRCLE_USER_BE_RELATED_PICTURE_URL = "health/user/sickCircle/verify/v1/uploadSickCirclePicture";

}
