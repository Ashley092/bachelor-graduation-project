package lab.higgus.platform.gateway.adapter;

/**
 * 定义设备策略的接口类
 */
public interface TelemetryAdapter {

    // 设备型号
    String deviceModel();

    // 当前系统是否支持该设备
    boolean matches();


}
