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
- Q45: 个人所得税是国家对本国公民、居住在本国境内的个人的所得和境外个人来源于本国的所得征收的一种所得税。假设某地区的起征点为3500元（即月工资低于3500时不需要缴纳个人所得税），个人所得税的计算公式为：应纳税额＝（工资薪金所得－扣除数）×适用税率－速算扣除数。其中，扣除数为3500元，适用税率以及速算扣除数如下表所示（注：此表并非当前国家个人所得税缴纳标准表，且为简化逻辑个人所得税的计算方式也进行了一定修改）
       
       表－1 个人所得税缴纳标准
       
       全月应纳税所得额
       
       税率
       
       速算扣除数(元)
       
       不超过1500元
       
       3%
       
       0
       
       超过1500元至4500元
       
       10%
       
       105
       
       超过4500元至9000元
       
       20%
       
       555
       
       超过9000元至35000元
       
       25%
       
       1005
       
       超过35000元至55000元
       
       30%
       
       2755
       
       超过55000元至80000元
       
       35%
       
       5505
       
       超过80000元
       
       45%
       
       13505
       
       上表中的全月应纳税所得额=工资薪金所得－扣除数。
       
       现在请你新建三个employee对象小明，小军和小红，他们的月工资分别为2500.0，8000.0，100000.0。并将他们按照顺序存入集合中。遍历集合并计算他们应缴纳的个人所得税（个人所得税为double类型，保留一位小数）。
       
- Q46: 为了实现社区点赞功能，要求设计一个点赞记录器，该工具包含如下两个方法：
       1. like方法：该方法需要传入用户名作为参数，如果用户没点赞过，则记录本次点赞行为，若用户已经点赞过，则删除他的点赞行为。
       2. getLikeUsers方法：该方法需要返回所有点赞用户的名字，不要求顺序。
       (为保证答案正确，请使用HashSet完成本题)
       
       
       输入：
       Tom Jim Lucy Lily Tom Lucy Tom
       
       输出：
       [Tom, Lily, Jim]
       
- Q47: 请补全预设代码中判断回文数的方法，若输入的五位数字是回文是则返回true，否则返回false。回文数即个位与万位相同，十位与千位相同的数字。如：12321、89898
- Q48: 输入两个正整数，输出这两个正整数之间（左闭右闭，即判断包括这两个整数在内有多少素数）有多少个大于2的素数。如果start>end，则将start设为end，end设为start
        
        示例1
        输入：
        1 100
        
        输出：
        1到100之间有24个大于2的素数
        
        示例2
        输入：
        100 1
        
        输出：
        1到100之间有24个大于2的素数

- Q49: 已知：
       1. 图形类Shape，该类中定义了图形的周长属性，以及返回周长的方法。
       2. Area接口，该接口中定义了返回面积的方法getArea()。
       
       要求：
       1. 定义圆形类Circle，使其继承于Shape，并实现Area接口。
       2. 定义方形类Square，使其继承于Shape，并实现Area接口。
       注意：
       圆周率要使用Math类中的常量。

- Q50: 冒泡排序。有一个长度为7的无序数组，按照从小到大的顺序排序后输出。


## Advanced Code

- AC1: 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
       
       数据范围：len(s),len(t)≤100000，字符串仅由'0'~‘9’构成
       要求： 空间复杂度 O(1)（仅在传入字符串上操作）,时间复杂度 O(n)

- AC2: 重排链表 寻找链表中点 + 链表逆序 + 合并链表
       
       解题思路：
       
       1、找中点的话，可以使用快慢指针。快指针一次走两步，慢指针一次走一步，当快指针走到终点的话，慢指针会刚好到中点。如果节点个数是偶数的话，slow 走到的是左端点，利用这一点，我们可以把奇数和偶数的情况合并，不需要分开考虑。
       2、链表逆序的话，参考 https://blog.nowcoder.net/n/d259b250747b4085bc7975f102d248c4
       3、合并链表，两个指针分别向后移动就可以。

       链表：{1，2，3，4，5，6}
       
       步骤	操作	                    链表
       1	寻找链表中点，将链表分为两半  {1，2，3}     {4，5，6}
       2	将后半链表反转	            {1，2，3}     {6，5，4}
       3	合并两个链表	            {1，6，2，5，3，4}
       
       输出链表：{1，6，2，5，3，4}


## HWJ Code

- HJ1: 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
       （注：字符串末尾不以空格为结尾）
- HJ2: 接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。（不区分大小写字母）
       数据范围: 1<= n <= 1000，输入的数据有可能包含大小写字母、数字和空格



## Sort Algorithm 排序算法

- P1: 冒泡排序 bubbleSort
          
          冒泡排序思路：
          比较相邻的元素。如果第一个比第二个大，就交换他们两个。
          对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
          针对所有的元素重复以上的步骤，除了最后一个。
          持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。

- P2: 选择排序 selectSort

        在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
        从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾
        以此类推，直到所有元素均排序完毕
    
- P3: 插入排序 insertSort

        从第一个元素开始，该元素可以认为已经被排序
        取出下一个元素，在已经排序的元素序列中从后向前扫描
        如果该元素（已排序）大于新元素，将该元素移到下一位置
        重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
        将新元素插入到该位置后
        重复步骤2~5

- P4: 希尔排序 shellSort

        希尔排序这个名字，来源于它的发明者希尔，也称作“缩小增量排序”，是插入排序的一种更高效的改进版本。
        插入排序对于大规模的乱序数组的时候效率是比较慢的，因为它每次只能将数据移动一位，
        希尔排序为了加快插入的速度，让数据移动的时候可以实现跳跃移动，节省了一部分的时间开支。

- P5: 归并排序 mergeSort

        归并字面上的意思是合并，归并算法的核心思想是分治法，就是将一个数组一刀切两半，递归切，直到切成单个元素，然后重新组装合并，
        单个元素合并成小数组，两个小数组合并成大数组，直到最终合并完成，排序完毕。
        把数据分为两段，从两段中逐个选最小的元素移入新数据段的末尾。可从上到下或从下到上进行。

- P6: 快速排序 quickSort

        选取第一个数为基准
        将比基准小的数交换到前面，比基准大的数交换到后面
        对左右区间重复第二步，直到各区间只有一个数

- P7: 堆排序 heapSort

        堆排序顾名思义，是利用堆这种数据结构来进行排序的算法。
        堆是一种优先队列，两种实现，最大堆和最小堆，由于我们这里排序按升序排，所以就直接以最大堆来说吧。
        我们完全可以把堆（以下全都默认为最大堆）看成一棵完全二叉树，但是位于堆顶的元素总是整棵树的最大值，每个子节点的值都比父节点小，
        由于堆要时刻保持这样的规则特性，所以一旦堆里面的数据发生变化，我们必须对堆重新进行一次构建。

