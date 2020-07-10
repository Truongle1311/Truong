/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util;
/**
 *
 * @author DELL
 */
//Đây là class chứa các hàm tính toán sẽ dùng chung làm tiện ích cho các nơi khác xây dựng 
//Phàm cái gì mà mang tính chất xài chung
//ta dùng kỹ thuật STATIC
public class MathUtil {
    //hàm tính n! =1,2,3,..n
    //vì giá trị giai thừa tăng cực nhan, nên sẽ tràn vùng int rất sớm
    //do int chỉ tối đa 2 tỷ 1, nên ta xài long thì mới chứa dc n lớn
    //nhưng cũng chỉ cỡ ! thoy.
   public static long computeFactorial(int n) {
       long result = 1;
       for (int i = 1; i <= n; i++) {
           result *= i;
       }
       return result;
   } 
}