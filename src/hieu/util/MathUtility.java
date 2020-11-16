/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu.util;

/**
 *
 * @author pc
 */
public class MathUtility {
    //minh se lam class nay fake y chang class math cua jdk
    //Math.PI.abs().sqrt().sin()
    //cai gi ma la do xai chung khong luu tru rieng le info ta se choi static

    public static final double PI = 3.14;

    //xai MathUtility.PI y chang Math.PI
    public static long getFactorial(int n) {
        //n phai >=0, 0! = 1 = 1!
        //n! tang nhanh lam, cho nen 21! tran long roi
        //nen ta chi tinh ! chi toi 20 và lớn hơn 0, cho du lon hon 20 thi ta cho excetion chu khong them tra tru 1 de noi rang du lieu tra ve loi
        if (n < 0 || n >= 20) {
            throw new IllegalArgumentException("n must be between 0...20");
        }

        if (n == 0 || n == 1) {
            return 1; //1 lenh trong if khong xai ngoac
        }
        long result = 1;
        for (int i = 2; i < n; i++) {
            result *= i;
        }
        return result;

    }
    //ta tu tin ham ta chay ngon, chay duoc
    //nhung: team can chung minh dieu do, nhu vay muon chung minh ham chay dung hay khong, ta can test thu
    //test nghia la dua ham ra xai, goi voi cac tham so khac nhau
    //vi du goi ham getFactorial (voi cac so khac nhau dua vao)
    //getF(-5) getF(-1) getF(20) getF(5)
    //cac gia tri dau vao dai dien cho viec xai ham, ta goi la test cases - cac tinh huong goi ham.sd ham
    //khi ta test ham, ta can quan tam 2 viec
    //1.ta du kien ham tra ve gia tri gi khi ham chay voi 1 dau vao nao đó
    //dự kiến hàm trả về giá trị thì ta gọi là expected value
    //vd: hàm sẽ trả về 120 khi gọi getF(5)
    //2. hàm khi chạy với 1 đầu vào nào đó thì nó sẽ return về 1 value
    //cái value trả về của hầm khi chậy đc gọi là ACTUAL VALUE
    //nghề test chính là nghè coi expected value có bằng ACTUAL VALUE không?
    //nếu có bằng thì hàm đúng cho case này
    //nếu không thì hàm tính sai, kì vọng sai
    //nếu hàm tốt thì expected == actual mọi tình huống
    //và nếu tốt thì ta mới đem public cộng đồng xài
    
    //làm sao để test coi hàm có tốt không có 2 kĩ thuật đc áp dụng
    
    //1. nhìn bằng mắt và so sánh từng cặp expected vs ACTUAL
    //          chính là kĩ thuật sout(expected) và sout(actual) hàm trả về khi chạy
    // kĩ thuật này đơn giản, dễ làm nhưng dễ mắc sai do có quá nhiều cặp kq phải so sánh bằng mắt
    
    //2. nhìn bằng mắt, không cần so  sánh từng cặp, để máy so sánh giùm luôn
    //          mắt chỉ nhìn 2 màu xanh đỏ duy nhất
    // nếu tất cả các cặp actual vs expectd đều thỏa, màu xanh cho tát cả
    //nếu hầu hết, có 1 or vài cái không thỏa thì kết luận ngay hàm sai, màu đỏ cho tất cả
    //điều này có nghĩa là đã đúng thì phải đúng cho mọi trường hợp
    //chỉ 1 th sai hàm sai
    //điều này tương đương, hàm tui đúng lắm 99pt, lâu lâu sai tí --- vẫn là sai, không đáng tin cậy
    //kĩ thuật 2 này dùng màu sắc và muốn làm vậy phải dùng thư viện bổ sung thêm
    //chính là các file .JAR, .DLL đc cung cấp thêm ngoài jdk
    //các thư viện này tùy thuộc ngôn ngữ lập trình, đc gọi chung là
    //Unit test framework
    //C#: thư việc cụ thể NUnit, MSUnit, xUnit
    //JAVA: thư viện cụ thể JUnit, TestNG, xUnit
    //PHP: PHPUnit
    //C++: CPPUnit
    //...
}
