package p.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    /*
    运行前检查：
    1.运行前先进行Maven---->clean
    2.运行前先停止当前Java程序
    3.目录结构【Application】要在【control包】的顶部
    错误原因：
    1.如果localhost提示【Whitelabel Error Page-type=Not Found, status=404】
    （1）是因为网址跟RequestMapping不同
    （2）是因为路径错误，【Application】没有在【control包】的顶部
    （3）没有进行clean，没有关闭当前运行的jar，没有删除当前target
     */
    @RequestMapping("testpage")//加不加斜线都可以
    public String hello() {
        return "2019年10月7日11:57:18";
    }
}
