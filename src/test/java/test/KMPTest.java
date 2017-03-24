package test;

import java.util.Arrays;

/**
 * Java实现KMP算法
 * 
 * 思想：每当一趟匹配过程中出现字符比较不等，不需要回溯i指针，
 * 而是利用已经得到的“部分匹配”的结果将模式向右“滑动”尽可能远 的一段距离后，继续进行比较。
 * 
 * 时间复杂度O(n+m)
 * 
 * @author xqh
 * 
 */
public class KMPTest {
	public static void main(String[] args) {
		String s = "a1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8aaa1a3a2a4a5a6a7a8a9"; // 主串
		String t = "a1a3a2a4a5a6a7a8a9"; // 模式串
		System.out.println("s.length="+s.length());
		System.out.println("t.length="+t.length());
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		System.out.println(KMP_Index(ss, tt)); // KMP匹配字符串
		
		f(ss,tt);
	}

	/**
	 * 获得字符串的next函数值
	 * 
	 * @param t
	 *            字符串
	 * @return next函数值
	 */
	public static int[] next(char[] t) {
		int[] next = new int[t.length];
		next[0] = -1;
		int i = 0;
		int j = -1;
		while (i < t.length - 1) {
			if (j == -1 || t[i] == t[j]) {
				i++;
				j++;
				if (t[i] != t[j]) {
					next[i] = j;
				} else {
					next[i] = next[j];
				}
			} else {
				j = next[j];
			}
		}
		return next;
	}

	/**
	 * KMP匹配字符串
	 * 
	 * @param s
	 *            主串
	 * @param t
	 *            模式串
	 * @return 若匹配成功，返回下标，否则返回-1
	 */
	public static int KMP_Index(char[] s, char[] t) {
		int count=0;
		int[] next = next(t);
		System.out.println(Arrays.toString(next));
		int i = 0;
		int j = 0;
		while (i <= s.length - 1 && j <= t.length - 1) {
			count++;
			if (j == -1 || s[i] == t[j]) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		System.out.println("count="+count);
		if (j < t.length) {
			return -1;
		} else
			return i - t.length; // 返回模式串在主串中的头下标
	}
	
	public static int f(char[] s, char[] t){
		int count=0;
		int index=-1;
		boolean flag=false;
		boolean find=false;
		for(int i=0;i<=s.length-t.length;i++){
			if(find){
				break;
			}
			for(int j=0;j<t.length;j++){
				count=count+1;
				if(s[i+j]==t[j]){
					flag=true;
				}else{
					break;
				}
				if(j==t.length-1&&flag==true){
					index=i;
					find=true;
					break;
				}
			}
		}
		System.out.println("count="+count);
		System.out.println("index="+index);
		return index;
	}
}
