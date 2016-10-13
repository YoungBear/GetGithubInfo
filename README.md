##题目

Github 用户搜索

Github 提供了获取用户数据的RESTful API：

查询用户：https://api.github.com/search/users?q=test

查询用户的Repos：https://api.github.com/users/test/repos

请编写一个Android App，在输入查询关键字后，能够实时显示出结果列表，列表每一项对应用户的信息，包括：用户名，用户头像，用户的编程语言偏好（可以从用户Repos中获取到）。如遇鉴权问题等请查阅GitHub文档解决。

要求：

1. 功能完整正确；
2. 代码尽量整洁，不包含无用代码；
3. 程序架构清晰；
4. 不要求界面美观（不看脸）
5. 请将apk和源文件发至xxx@xxx.com，或告知GitHub地址。

##说明

每个请求最多可以访问1000条数据，默认情况下每页显示30条数据。

用户可以输入一个参数，表示每页的数据量，不输入则显示30条数据。(该程序当前版本只获取第一页的数据)

另外，同一个ip访问github api会有次数限制。

获取用户感兴趣的语言，是通过访问其所有repo，查找language字段，选择出现次数最多的作为感兴趣语言。

##更新信息

2.0版本更新日志：

1. 在访问字段中增加client_id和client_secret字段，使得访问限制有60/h增加到5000/h。
2. 优化ListView，使用Glide来加载图片，修复了头像和语言的错位的bug。