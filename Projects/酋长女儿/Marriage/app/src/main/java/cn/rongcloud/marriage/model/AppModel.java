package cn.rongcloud.marriage.model;

import cn.rongcloud.marriage.bean.repo.VersionCheckRepo;
import cn.rongcloud.marriage.common.NetStateLiveData;
import cn.rongcloud.marriage.net.client.RetrofitClient;
import cn.rongcloud.marriage.net.service.AppService;

/**
 * APP版本管理模块数据层(M层)
 */
public class AppModel {

    private AppService appService;

    public AppModel(RetrofitClient client) {
        appService = client.createService(AppService.class);
    }

    public NetStateLiveData<VersionCheckRepo> checkVersion(String platform, Long versionCode) {
        return appService.versionCheck(platform, versionCode);
    }
}
