1、主程序@EnableFeignClients注解，则开启对@FeignClients的扫描。
2、利用ioc容器，根据feign规范，通过jdk的动态代理生成RequestTemplate对象，该对象封装了http请求信息。
3、然后通过，HttpClient或者OkHttp等去，再封装到LoadBalanceClient中，完成对服务的调用。
