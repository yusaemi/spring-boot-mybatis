# Spting Boot 搭配 MyBatis

## 準備作業
此範本需要`MySQL`資料庫及`JDK21`環境  
支援`lombok plugin`

#### Create Table(default schema: master)
可選擇以下兩種方式，擇一使用。
1. 使用`docker-compose.yml`建立簡易環境。
2. 安裝`MySQL`資料庫，並使用`product_schema.sql`建立Table

## 啟動方式
基本執行指令:
- `mvn spring-boot:run`

後面可帶參數決定不同環境變數執行，例如
- `mvn spring-boot:run -Ptest`

會根據`pom.xml`的`<profiles>`內容引入相對應變數

## 測試案例
預設情形之下，在網址打上
><http://localhost:8080/product/1>

即可看到結果

## 創建Table的Entity
在`generatorConfig.xml`內部添加table設定，添加的方式在`generatorConfig.xml`內的註解有說明。  
執行maven generator: 
- `mvn mybatis-generator:generate`

加上-e可查看generator過程:
- `mvn mybatis-generator:generate -e`

執行後根據`generator.properties`配置的參數產生至對應的位置。