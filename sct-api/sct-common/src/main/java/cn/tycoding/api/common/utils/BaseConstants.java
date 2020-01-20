package cn.tycoding.api.common.utils;

/**
 * 全局常量
 * Created by shuzheng on 2017/2/18.
 */
public class BaseConstants {

    public static final int SUCCESS = 1;//成功

    public static final int FAIL= 0;//失败

    public static final int ZERO= 0;//长度0
    public static final int TWO= 2;//长度2
    public static final int ONE = 1;//长度1
    public static final int THREE = 3;//长度1
    public static final int FOUR = 4;//长度1
    public static final int TWO_THOUSAND = 2000;//长度2000
    public static final int HUNDRED = 100;
    public static final int THOUSAND = 1000;
    public static final int WAREHOUSE_USER_ID = 3;//售后总仓管理员 用户id

    public static final int WD= 2;//未读    // 物料
    public static final int YD = 1;//已读   //整机

    public static final short isDel= 1;//删除         是SAP同步过来的数据
    public static final short notDel= 0;//未删除     不是SAP同步过来的数据
    public static final short DIGITAL_99 = 99;
    public static final short notDisplay= 1;//         是否显示巡检项目 0是 1否',
    public static final short isDisplay= 0;//    是否显示巡检项目 0是 1否',


    public static final String OA_FLASE = "false";
    public static final boolean TRUE = true;
    public static final boolean FALSE = false;

    //数据字典
    public static final int COST_TYPE= 1;//物料 造价类型 数据字典类型
    /**
     * 12小时对应的ms
     */
    public static final Long TWELVE_HOUR = 43200000L;
    /**
     * 一天的毫秒数
     */
    public static final Long ONE_DAY_MS = 86400000L;
    /**
     * 纳秒倍数
     */
    public static final Long MULTIPLE = 1000000L;
}
