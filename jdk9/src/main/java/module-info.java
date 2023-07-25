/**
 * @author qinxianzhong
 * @since 2023/7/21 15:58:54
 */
module jdk9 {
    //引入hutool工具包
    requires hutool.all;

    requires java.net.http;

    //导出当前文件包
    exports com.qin.model;
    exports com.qin.model.privateInterface;
}