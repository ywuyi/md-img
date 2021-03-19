# GitHub 图床的正确用法

创建一个 GitHub 仓库作为图床仓库。

在要使用 GitHub 图床图片的软件中将链接换为 https://cdn.jsdelivr.net/gh/{user}/{repo}/图片路径

在PicGo设置自定义域名时填入https://cdn.jsdelivr.net/gh/{user}/{仓库名}/即可

举个 🌰：比如我的 github 仓库 md-img 里图片原始访问路径为 https://raw.githubusercontent.com/wuyiy/md-img/masterorb_result.png 访问起来贼慢

但是使用 jsDelivr 加速后的地址为：https://cdn.jsdelivr.net/gh/wuyiy/md-img/masterorb_result.png 访问速度飞起，享受 jsDelivr 提供的全球 CDN 加速

如果觉得动上传 GitHub 图床仓库太麻烦，这里还有一款开源神器PicGo可以推荐，超赞
https://github.com/Molunerfinn/PicGo

这个是软件运行起来的界面

![image-20210320002956398](https://cdn.jsdelivr.net/gh/ywuyi/md-img/md/img/image-20210320002956398.png)


安装完成之后，需要去 github 申请一个token => [GitHub PAT (Personal access tokens)](https://github.com/settings/tokens)

记得勾选下面这个选项即可，名称随便起

![image-20210320002931437](https://cdn.jsdelivr.net/gh/ywuyi/md-img/md/img/image-20210320002931437.png)

然后在软件里面将刚刚获得的 Token 和其他参数设置好就OK啦

![image-20210320001909245](https://cdn.jsdelivr.net/gh/ywuyi/md-img/md/img/image-20210320001909245.png)



