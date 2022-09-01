# CalendarCryptoTool
日历密码加解密工具

某次CTF比赛遇到了日历密码的题目，因为比赛时没有找到类似工具，感觉人工解密还是需要一定时间的，赛后写了一个小工具，可以快速解密日历密码。

相关比赛详情请见：https://blog.csdn.net/sorryagain/article/details/126644620

### 日历密码

（1）数字`1-26`对应`a-z`共26个英文字母，因此日历密码只能加密英文字母，并且不区分大小写；

（2）`M、T1、W、T2、F、S1、S2` 分别代表周一到周日七天（英文首字母代替，首字母相同的星期使用1或2来区分）；

（3）密钥为某年某月，即该月的日历为密码表，某天对应的日期为明文。

### 开发环境

java version "1.8.0_111"

### 工具介绍

运行 CalendarCryptoTool.jar 文件，输入密文、密钥，点击解密即可。

明文：小写英文字母

密文：日历密码的密文格式，中间用空格分隔

密钥：某年某月，格式为`yyyyMM`

### 使用示例

密文：`S21 F2 S11 T13 F2 T23 W2 T21 S23 S24`

密钥：`200711`

![image-20220901143029848](https://raw.githubusercontent.com/2ha0yuk7on/CalendarCryptoTool/main/image-20220901143029848.png)

