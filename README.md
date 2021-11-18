# JavaAlgorithmTest
Java Algorithm Test on Nowcoder

## Basic Code 01 基础语法

- Q1: 将一个小于2147483647的double类型变量转化为int类型
- Q2: 输入两个正整数a和b，输出这两个正整数的和，差，积，商，模（若a>b则输出a-b，a/b，a%b的值反之输出b-a，b/a，b%a的值，不考虑小数，请使用int类型）
- Q3: 定义一个int类型变量i,i为由浮点数变量d四舍五入后的整数类型，请将转换后的i进行输出
- Q4: 在不使用第三个变量的情况下交换两个int类型变量的值
- Q5: 计算商场折扣

      满100全额打9折；
      满500全额打8折；
      满2000全额打7折；
      满5000全额打6折；
      且商场有抹零活动，不足一元的部分不需要付款（类型强制转换）
      
- Q6: 体重指数 = 体重 (kg) / ( 身高 (m) × 身高 (m) )，小于18.5属于偏瘦，介于18.5和20.9之间（左闭右开）属于苗条，介于20.9和24.9之间（左闭右闭）属于适中，超过24.9属于偏胖。下面由你来编写一段逻辑，算出输入了身高和体重的用户的体重指数，并返回他们的身材状态。(体重指数请使用double类型)
- Q7: 现有如下成绩等级A,B,C,D。其中A代表优秀，B代表良好，C代表及格，D代表不及格。现在请你来为学生的成绩进行分级，如果用户输入错误则输出未知等级。
- Q8: 请根据给出的正则表达式来验证邮箱格式是否合法，如果用户输入的格式合法则输出「邮箱格式合法」，否则输出「邮箱格式不合法」。
- Q9: 有数列为：9，99，999，...，9999999999。要求使用程序计算此数列的和，并在控制台输出结果。（请尝试使用循环的方式生成这个数列并同时在循环中求和）
- Q10: 控制台输入整数，请设计一个死循环，当用户输入非正数时停止输入。请给出用户输入的正整数个数（默认输入个数不超过2147483647）
- Q11: 编写一个方法，该方法的返回值是两个不大于100的正整数的最小公倍数
- Q12: 一球从h米高度自由落下，每次落地后反弹回原高度的一半再落下，求它在第n次落地时共经过了多少米？第n次反弹多高？
- Q13: 键盘输入任意多个10000以内正整数（负数代表结束），求出它们的平均数
- Q14: 判断是否为质数/素数
- Q15: 输入一个整数，计算它的位数。如果输入的整数不大于0则输出这个数
- Q16: 将用户输入的六个数字填入数组并找出数组中最大值和最小值
- Q17: 输入6个整数，先将其输出然后再将数组倒转，再次输出数组
- Q18: 给定一个二维数组，请你编写一个求和函数，计算出这个数组元素的和


## Basic Code 02 面向对象_修饰符封装

- Q19: 现有一个Data类，内部定义了属性x和y，在main方法中实例化了Data类，并计算了data对象中x和y的和。但是，Data类的定义存在错误，请你将这些错误修正过来，使得main方法中的求和逻辑可以正常执行。
- Q20: 采用封装的思想，为Person类定义年龄属性，要求：
       修改年龄时判断其范围，若年龄小于0则按0输出，若年龄大于200则按200输出。
- Q21: 补全构造方法  - -  有父类Base，内部定义了x、y属性。有子类Sub，继承自父类Base。子类新增了一个z属性，并且定义了calculate方法，在此方法内计算了父类和子类中x、y、z属性三者的乘积。请补全子类构造方法的初始化逻辑，使得该计算逻辑能够正确执行。
- Q22: 在父类Base中定义了计算方法calculate()，该方法用于计算两个数的乘积（X*Y）。请在子类Sub中重写该方法，将计算逻辑由乘法改为除法（X/Y）。注意，当分母为0时输出“Error”。
- Q23: 已知有三个类：First、Second、Third。要求定义一个打印方法，支持传入任意引用类型的参数（包括上述三个类），并在方法内部打印出对象的字符串形式。
- Q24: 父类Base有两个子类：Sub1、Sub2，现有一个方法getClassName()，要求传入Base类型的实例，在方法内部判定其具体的类型，返回的是类型的简单名字（不含包名），请补全getClassName()方法的判断逻辑。obj.getClass().getSimpleName()
- Q25: 已知抽象类Base中定义了calculate方法，该方法的计算过程依赖于sum()和avg()，而后两个方法均为抽象方法。要求定义Base的子类Sub类，并实现父类的抽象方法，使得main函数中的运算逻辑得以正确执行。
- Q26: 已知接口Comparator，内部定义了max函数，用于返回两个整数中的最大值。请定义该接口的实现类，使得main方法中的比较逻辑可以正确执行，要求实现类的名称为ComparatorImpl。
- Q27: 父类Base中定义了若干get方法，以及一个sum方法，sum方法是对一组数字的求和。请在子类 Sub 中重写 getX() 方法，使得 sum 方法返回结果为 x*10+y
- Q28: Singleton类是单例的，每次调用该类的getInstance()方法都将得到相同的实例，目前该类中这个方法尚未完成，请将其补充完整，使得main()函数中的判断返回真（不考虑线程安全）。


## Basic Code 03 常用API

- Q29: 动态字符串StringBuilder: 将一个由英文字母组成的字符串转换成从末尾开始每三个字母用逗号分隔的形式。
- Q30: 给定一个字符串，随机输入一个字母，判断该字母在这个字符串中出现的次数
- Q31: 十进制数转二进制数_Integer 控制台随机输入一个十进制数，请你将它转换为二进制数并输出
- Q32: 开发一个掷骰子游戏，即每次运行程序时，产生一个[1,6]之间的随机整数（关于seed的问题可以参考题解）。
- Q33: 编写函数求出任意数的绝对值，平方根，对数，正弦值...Math.abs, sqrt, log, sin...
- Q34: 输入任意年份，输出该年份各月天数（请使用 Calendar 类中的方法）
- Q35: 已知，纽约时间比北京时间慢12小时，请根据用户输入的北京时间输出相应的纽约时间，若用户输入错误的月份或日期等信息则将其顺加。例如用户输入2021 13 32 14 43 54则生成北京时间为：2022-02-01 14:43:54 纽约时间为：2022-02-01 02:43:54
- Q36: 定义一个方法用于录入学生的考试成绩，要求考试成绩必须在0-100之间，不满足就产生一个自定义异常，控制台输出一个错误信息"分数不合法"（请输出自定义异常对象的错误信息，将错误信息设置为分数不合法）


## Basic Code 04 集合类

- Q37: 从键盘获取一串字符串，要求去除重复的字符。请使用HashSet解决这一问题
- Q38: 请使用三种方式遍历一个list集合普通for循环:1 2 3 4 5 ; 增强for循环:1 2 3 4 5 ; 迭代器遍历:1 2 3 4 5 
- Q39: 请设计一个排队程序，用户有普通客人和VIP客人之分，VIP客人不排队（即VIP客人在队列头部），目前队列中已有两位客人小明和小军在排队，请将VIP客人小红新增至队列头部。
- Q40: 现从一队学生中抽人上台演讲，为公平起见，队头队尾交替抽取，请通过程序实现这个出队的过程。交替打印队头队尾学生的名字
- Q41: 统计控制台输入的一句话中不同字⺟字符出现的次数。例如：现有字符串"Hello World!"，上述字符串中各个字符的出现的次数为：
       
       H:1
       e:1
       l:3
       o:2
       W:1
       r:1
       d:1
       （不考虑数字、空格和特殊字符的个数，按照字符在字符串中出现的顺序显示。相同字母的大小写算两个不同字符）
- Q42: 现在有一个map集合如下：

       Map<Integer,String> map = new HashMap<Integer, String>();
                  map.put(1, "Amy");
                  map.put(2, "Joe");
                  map.put(3, "Tom");
                  map.put(4, "Susan");
                  要求：
                      1.遍历集合，并将序号与对应人名打印。
                      2.向该map集合中插入一个编码为5姓名为控制台输入的人名的信息
                      3.移除该map中的编号为4的信息
                      4.将map集合中编号为3的姓名信息修改为"Tommy"
                      5.再次遍历经过上述操作后的集合，并将序号与对应人名打印。(注：第一次输出和第二次输出需用空行隔开)

- Q43: 有三个客户对象，将三个客户对象存入集合中，并将其按照消费总额从高到低排序。Collections.sort


## Basic Code 05 综合练习

- Q44: 输入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数



## HWJ Code

- HJ1: 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
       （注：字符串末尾不以空格为结尾）
- HJ2: 接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。（不区分大小写字母）
       数据范围: 1<= n <= 1000，输入的数据有可能包含大小写字母、数字和空格



