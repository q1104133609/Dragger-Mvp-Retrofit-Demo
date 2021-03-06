package com.huangbo.baseprojecet.persenter;

import com.huangbo.baseprojecet.base.BasePersenter;
import com.huangbo.baseprojecet.bean.LocationBean;
import com.huangbo.baseprojecet.http.MineService;
import com.huangbo.baseprojecet.imple.MainModleImp;
import com.huangbo.baseprojecet.modle.MainModle;
import com.huangbo.baseprojecet.view.MainView;

import javax.inject.Inject;

/**
 * Created by huangb on 2017/5/11.
 */

public class MainPersenter extends BasePersenter<MainView<LocationBean>, MainModle> {

    @Inject
    public MainPersenter(MineService mService, MainView<LocationBean> mView, MainModle mModuleImpl) {
        super(mService, mView, mModuleImpl);
    }

    public void getData(){
        mMoudle.getData("116.228.89.150");
    }

}
