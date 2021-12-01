package HW;
/*请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
所有的IP地址划分为 A,B,C,D,E五类
A类地址1.0.0.0~126.255.255.255;
B类地址128.0.0.0~191.255.255.255;
C类地址192.0.0.0~223.255.255.255;
D类地址224.0.0.0~239.255.255.255；
E类地址240.0.0.0~255.255.255.255

私网IP范围是：
10.0.0.0-10.255.255.255
172.16.0.0-172.31.255.255
192.168.0.0-192.168.255.255

子网掩码为二进制下前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
注意二进制下全是1或者全是0均为非法

注意：
1. 类似于【0.*.*.*】和【127.*.*.*】的IP地址不属于上述输入的任意一类，也不属于不合法ip地址，计数时请忽略
2. 私有IP地址和A,B,C,D,E类地址是不冲突的

输入描述：
多行字符串。每行一个IP地址和掩码，用~隔开。

输出描述：
统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。

示例1
输入：
10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0

输出：
1 0 1 0 0 2 1

说明：
10.70.44.68~255.254.255.0的子网掩码非法，19..0.~255.255.255.0的IP地址非法，所以错误IP地址或错误掩码的计数为2；
1.0.0.1~255.0.0.0是无误的A类地址；
192.168.0.2~255.255.255.0是无误的C类地址且是私有IP；
所以最终的结果为1 0 1 0 0 2 1 */

/*1、如果是0...* 或 127...* 跳过
2、如果掩码错误，直接错误+1，扫描下一个
3、如果掩码正确，判断ip，如果ip错误，错误+1
4、如果ip正确，判断ip类型
5、
如果是A类型， A++ 如果是私人ip，privateIp++
如果是B类型， B++ 如果是私人ip，privateIp++
如果是C类型， C++ 如果是私人ip，privateIp++
如果是D类型， D++
如果是E类型， E++*/
import java.util.Scanner;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/12/1 15:07
 */

public class HJ18_识别有效的IP地址并进行分类统计 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ipAndMask = new String[2];
        String[] ipArr = new String[4];
        int A = 0,B = 0,C = 0,D =0,E = 0,errIpOrMask = 0,privateIp = 0;
        while (in.hasNextLine()) {
            ipAndMask = in.nextLine().split("~");
            if(ipAndMask[0].equals("end")){
                break;
            }
            ipArr = ipAndMask[0].split("\\.");
            //类似于【0.*.*.*】和【127.*.*.*】忽略，这个条件要放在最前面，否则错误掩码会统计多
            if(ipArr[0].equals("0") || ipArr[0].equals("127")){
                continue;//跳过
            }
            if(!isValidMask(ipAndMask[1])){ //判断掩码是否有效
                errIpOrMask++;
                //System.out.println(ipAndMask[1]);//输出错误掩码
            }else{
                if(!isValidIp(ipAndMask[0])){
                    errIpOrMask++;
                    //System.out.println(ipAndMask[0]);//输出错误ip
                }else{
                    if(Integer.parseInt(ipArr[0])>=1 && Integer.parseInt(ipArr[0])<=126){
                        if(Integer.parseInt(ipArr[0])==10){
                            privateIp++;
                            A++;
                        }else{
                            A++;
                        }
                    }
                    if(Integer.parseInt(ipArr[0])>=128 && Integer.parseInt(ipArr[0])<=191){
                        if(Integer.parseInt(ipArr[0])==172 && (Integer.parseInt(ipArr[1]) >=16 && Integer.parseInt(ipArr[1])<=31)){
                            privateIp++;
                            B++;
                        }else{
                            B++;
                        }
                    }
                    if(Integer.parseInt(ipArr[0])>=192 && Integer.parseInt(ipArr[0])<=223){
                        if(Integer.parseInt(ipArr[0])==192 && Integer.parseInt(ipArr[1]) ==168){
                            privateIp++;
                            C++;
                        }else{
                            C++;
                        }
                    }
                }
                if(Integer.parseInt(ipArr[0])>=224 && Integer.parseInt(ipArr[0])<=239){
                    D++;
                }
                if(Integer.parseInt(ipArr[0])>=240 && Integer.parseInt(ipArr[0])<=255){
                    E++;
                }
            }
        }
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + errIpOrMask + " " + privateIp);
    }
    public static boolean isValidMask(String mask){
        if(!isValidIp(mask)){
            return false;
        }
        String[] maskTable = mask.split("\\.");
        //mask转为32位2进制字符串
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<maskTable.length;i++){
            maskTable[i] = Integer.toBinaryString(Integer.parseInt(maskTable[i]));
            if(maskTable[i].length() < 8){//不足8位补齐0
                for(int j=0;j < 8- maskTable[i].length();j++){
                    sb.append("0");//补完零
                }
                sb.append(maskTable[i]);//再添加转换的2进制串
            }else{
                sb.append(maskTable[i]);//刚好8位直接添加，因为之前已经判断过ip的有效性，所以不可能超过8位
            }
        }
        //最后一个1在第一个0之前，有效，否则无效
        return sb.toString().lastIndexOf("1") < sb.toString().indexOf("0");
    }
    public static boolean isValidIp(String ip){
        String[] ipTable = ip.split("\\.");
        if(ipTable.length != 4){
            return false;
        }
        for(String s : ipTable){
            if(Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255){
                return false;
            }
        }
        return true;
    }
}

/*10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0
*/