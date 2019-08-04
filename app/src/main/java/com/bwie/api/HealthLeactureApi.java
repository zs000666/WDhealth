package com.bwie.api;

/**
 * 健康讲堂相关接口
 */
public class HealthLeactureApi {

    //查询健康讲堂类目
    public static final String CUSTOMER_LEACTURE_SEARCH_CATEGORY_LIST_URL = "health/user/video/v1/findVideoCategoryList";
    //根据视频类目查询视频列表
    public static final String CUSTOMER_LEACTURE_SEARCH_VIDEO_LIST_URL = "health/user/video/v1/findVideoVoList";
    //发表视频评论（弹幕）
    public static final String CUSTOMER_LEACTURE_ADD_VIDEO_COMMENT_URL = "health/user/video/verify/v1/addVideoComment";
    //健康课堂视频收藏
    public static final String CUSTOMER_LEACTURE_ADD_VIDEO_COMMENT_LIST = "health/user/video/verify/v1/addUserVideoCollection";
    //健康课堂视频购买
    public static final String CUSTOMER_LEACTURE_BUY_HEALTH_VIDEO_LIST = "health/user/video/verify/v1/videoBuy";
    //查询视频评论列表
    public static final String CUSTOMER_LEACTURE_SEARCH_VIDEO_COMMENT_LIST = "health/user/video/v1/findVideoCommentList";

}
