打包Docker 命令  clean package docker:build docker:push
服务器中启动 docker run -d -p 80:8080 -m 8g --name xx xx   第一个xx是启动名称 第二个是打包出来的名称

swagger2 接口注册/访问  地址本地注册
http://shavedogadmin.com:8001/swagger-ui.html

/
    启动顺序Eureka→  Zuul网关 → dashboard 服务监控 → admin-Interface 后台接口 → admin-Web 后台控制  
/

shavedog-admin-interface    后台接口/数据层    熔断服务监控localhost:8001/actuator/hystrix.stream
shavedog-admin-web          后台控制层/WEB
shavedog-api                公共方法/类/定义
shavedog-dashboard          熔断监控           访问地址shavedog-dashboard.com:8762/hystrix        地址本地注册
shavedog-eureka             注册中心           访问地址eureka.com:8761      账号密码mingyuan   地址本地注册HOSTS
shavedog-font-interface     前台接口/数据层
shavedog-font-web           前台控制层/web
shavedog-listener           rabbitmq监听类。
shavedog-zool               网关