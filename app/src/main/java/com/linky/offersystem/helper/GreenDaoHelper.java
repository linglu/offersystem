package com.linky.offersystem.helper;

import android.content.Context;

import com.linky.offersystem.bean.OfferItemBean;
import com.linky.offersystem.dao.DaoMaster;
import com.linky.offersystem.dao.OfferItemBeanDao;
import com.linky.offersystem.support.utils.FileUtils;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Linky on 16-11-28.
 */
public class GreenDaoHelper {

    private static final String DB_NAME = "offer.db";

    private DaoMaster mDaoMaster;
    private Context mContext;

    @Inject
    public GreenDaoHelper(Context context) {
        mContext = context;
        // 创建消息数据库
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
        mDaoMaster = new DaoMaster(helper.getWritableDatabase());
    }

    public void initDbFromAsset() throws IOException {
        OfferItemBeanDao itemBeanDao = mDaoMaster.newSession().getOfferItemBeanDao();
        if (itemBeanDao.count() > 0) {
            return;
        }

        List<String> datas = FileUtils.readEachLine(mContext.getResources().getAssets().open("dhl"));
        for (String data : datas) {
            String[] items = data.split("\t");

            // 0.5	美国 97	12.25	0
            OfferItemBean itemBean = new OfferItemBean();
            itemBean.channel = "dhl";
            itemBean.weight = items[0];
            itemBean.country = items[1];
            itemBean.price = Double.parseDouble(items[2]);
            itemBean.fuelRate = Double.parseDouble(items[3]);
            itemBean.subCharge = Double.parseDouble(items[4]);
            itemBeanDao.insert(itemBean);
        }
    }
}
