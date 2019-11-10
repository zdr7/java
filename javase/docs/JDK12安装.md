# JDK12安装

1. 在官网下载所用JDK[下载地址](https://www.oracle.com/technetwork/java/javase/downloads/index.html)

2. 安装JDK后，发现新版JDK安装后没有JRE。在cmd命令窗口进入到JDK所安装的目录内。

3. 生成JRE运行以下命令： bin\jlink.exe --module-path jmods --add-modules java.desktop --output jre 

4. 配置环境变量：

   * 方法1：右键点击计算机–>属性–>高级系统设置–>高级–>环境变量
   * 方法2：win+ R –> 输入 sysdm.cpl 并回车 –> 高级 –> 环境变量

   1. 添加环境变量

      |  变量名   |                变量值                |
      | :-------: | :----------------------------------: |
      | JAVA_HOME |        C:\Apps\jdk\jdk-12.0.2        |
      |   Path    | %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin; |

      PS：JDK9版本开始  lib/dt.jar和其他各种内部JAR文件都存储在一个更有效的格式在实现特定的文件lib目录。所以不需要配置CLASSPASTH变量。 

5. 命令提示符输入“java -version”