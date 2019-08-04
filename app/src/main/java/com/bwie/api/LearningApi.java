package com.bwie.api;


/**
 * 知识库相关接口
 */
public class LearningApi {

    //banner
    public static final String CUSTOMER_LEARN_BANNER_URL = "health/share/v1/bannersShow";
    //首页搜索
    public static final String CUSTOMER_LEARN_HOME_SEARCH_LIST_URL = "health/share/v1/homePageSearch";
    //查询科室列表
    public static final String CUSTOMER_LEARN_SEARCH_DEPARTMENT_URL = "health/share/knowledgeBase/v1/findDepartment";
    //根据科室查询对应病症
    public static final String CUSTOMER_LEARN_BASE_ON_DISEASE_CATEGORY_URL = "health/share/knowledgeBase/v1/findDiseaseCategory";
    //查询常见病症详情
    public static final String CUSTOMER_LEARN_SEARCH_DISEASE_DETAIL_URL = "health/share/knowledgeBase/v1/findDiseaseKnowledge";
    //药品科目分类列表查询
    public static final String CUSTOMER_LEARN_SEARCH_DRUHHS_CATEGORY_LIST_URL = "health/share/knowledgeBase/v1/findDrugsCategoryList";
    //根据药品类目查询常见药品
    public static final String CUSTOMER_LEARN_SO_SEARCH_DRUG_URL = "health/share/knowledgeBase/v1/findDrugsKnowledgeList";
    //查询常见药品详情
    public static final String CUSTOMER_LEARN_SEARCH_DRUG_DETAIL_URL = "health/share/knowledgeBase/v1/findDrugsKnowledge";
    //查询健康资讯板块
    public static final String CUSTOMER_LEARN_SEARCH_HEALTH_INFO_URL = "health/share/information/v1/findInformationPlateList";
    //根据资讯板块查询资讯列表
    public static final String CUSTOMER_LEARN_SO_SEARCH_HEALTH_INFO_LIST_URL = "health/share/information/v1/findInformationList";
    //资讯详情
    public static final String CUSTOMER_LEARN_INFO_DETAIL_URL = "health/share/information/v1/findInformation";
    //热门搜索
    public static final String CUSTOMER_LEARN_POPULAR_SEARCH_URL = "health/share/v1/popularSearch";

}
