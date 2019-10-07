# Springboot 创建Web工程
Springboot 

***
1.创建Springboot Web工程   
**
2.开启右下角-Auto自动补充  
**
3.设置Idea->Setting->processing Enable  
**
4.设置阿里云仓库  
{% highlight html linenos %}
<repositories>  
    <repository>  
        <id>central</id>  
        <name>aliyun maven</name>  
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
        <layout>default</layout>  
        <!-- 是否开启发布版构件下载 -->  
        <releases>  
            <enabled>true</enabled>  
        </releases>  
        <!-- 是否开启快照版构件下载 -->  
        <snapshots>  
            <enabled>false</enabled>  
        </snapshots>  
    </repository>  
</repositories> 
**
{% endhighlight %}
