Step1:java -d bin src/module-info.java src/com/itranswarp/sample/*.java  //把目录中包含java的文件全部通过moduel-info.java依赖编译成class并存放bin文件中

Step2:jar --create --file hello.jar --main-class com.itranswarp.sample.Main -C bin .  //将bin文件中的内容打包成.jar文件

Step3:jmod create --class-path hello.jar hello.jmod  //将.jar 文件转换成.jmod文件

Step4:java --module-path hello.jar --module hello.world  //运行jar包
