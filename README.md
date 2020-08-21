# Spting Boot 搭配 MyBatis

## 準備作業
此範本需要先行安裝`MySql`資料庫及`JDK11`環境  
支援`lombok plugin`

#### Create Table(default schema: master)

使用`product_schema.sql`建立Table

## 啟動方式
基本執行指令:
- `mvn spring-boot:run`

後面可帶參數決定不同環境變數執行，例如
- `mvn spring-boot:run -Ptest`

會根據`pom.xml`的`<profiles>`內容引入相對應變數

## 測試案例
預設情形之下，在網址打上
><http://localhost:8080/1/getProduct>

即可看到結果

## 創建Table的Entity
在`generatorConfig.xml`內部添加table設定，添加的方式在`generatorConfig.xml`內的註解有說明。  
執行maven generator: 
- `mvn mybatis-generator:generate`

加上-e可查看generator過程:
- `mvn mybatis-generator:generate -e`

執行後根據`generator.properties`配置的參數產生至對應的位置。