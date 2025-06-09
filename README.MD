## 环境配置 Environment configuration

- 在 [Android Studio 官网](https://developer.android.com/studio) 下载安装 Android Studio
- 将本项目源码下载下来, 可以使用 git clone, 也可以在 release 中下载
- 使用 Android Studio 打开本项目, _更改 JDK 设置_ (本项目中很多部分并不兼容高版本的 JDK),
  请使用 Java11 及以下版本, 如有提示升级 Gradle, 请不要理会 (除非你把本项目中所有不兼容的地方改了),
  这将导致 Build 的时候抛出各种各样奇奇怪怪的 Exception)
  > settings -> Build, Execution, Deployment -> Build Tools -> Gradle -> Gradle JDK
- 等待漫长的 Download, 结束后点击上方的小三角 (Build), 没有红色惊叹号报错便代表环境配置完成

## 导出 APK 文件

- 左上角 Main Menu -> Build -> Generate APK ... -> Generate APKs
- 生成 apk 文件后, 你便可以安装在手机上 or 模拟器上体验你的改动了

## 测试

- 不断生成 apk 测试太麻烦? 欢迎使用 Studio 自带的测试功能, 点击上方三角后, 点击右方 Running Devices,
  便可在 Studio 中快乐的测试

## 项目结构 (Project Structure)

- app: 主应用程序代码
  - manifest: AndroidManifest.xml 文件, 定义了应用程序的基本信息和组件
    - AndroidManifest.xml: 应用程序的清单文件, 定义了应用程序的基本信息和组件
  - kotlin+java/com.scatl.uestcbbs: 应用程序的 Kotlin/Java 源代码
    - annotations: 包含了应用程序的注解类
    - api: 包含了应用程序的 API 接口类
    - base: 包含了应用程序的基础类
    - callbacks: 包含了应用程序的回调接口
    - entity: 包含了应用程序的数据实体类
    - helper: 包含了应用程序的辅助类
    - manager: 包含了应用程序的管理类
    - module: 包含了应用程序的模块类
    - receiver: 包含了应用程序的广播接收器类
    - services: 包含了应用程序的服务类
    - util: 包含了应用程序的工具类
    - widget: 包含了应用程序的自定义控件类
  - aidl: 包含了应用程序的资源文件, 如布局文件、图片等 (Android Interface Definition Language)
  - assets: 包含了应用程序的静态资源文件, 如字体、音频等
  - res: 包含了应用程序的资源文件, 如布局文件、图片等
    - anim: 包含了应用程序的动画资源文件
    - color: 包含了应用程序的颜色资源文件
    - drawable: 包含了应用程序的图片资源文件
    - layout: 包含了应用程序的布局资源文件
    - menu: 包含了应用程序的菜单资源文件
    - mipmap: 包含了应用程序的图标资源文件
    - values: 包含了应用程序的字符串、样式等资源文件
    - xml: 包含了应用程序的 XML 资源文件, 如配置文件等
