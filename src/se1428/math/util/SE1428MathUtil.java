/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1428.math.util;

import hieu.util.MathUtility;

/**
 *
 * @author pc
 */
public class SE1428MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        long expected = 120;
        int input = -5;
        System.out.println(input+"!? expected:" +expected+"actual: "+ MathUtility.getFactorial(input));
        
        //tao kì vọng nhận về IllegalArgumentException
        //nếu tao gọi -5!
        //thấy ngoại lệ lại mừng vì hàm chạy đc như thiết kế
        
        //cất code lên server
        //cần:
        //nhớ kho trên github là url: https://github.com/tên-mình/tên-kho.git
        //nhớ username, password
        //cần tool để đồng bộ code từ máy mình (local) lên server (Github, GitLab, Bit
        //tool có thể là: cmd, GUI (Git desktop, source tree), chính IDE (cmd, click)
        //vì ta pro, ta chơi cmd
        //file đặc biệt để nói với git tool rằng ai lên server, ai ở lại local là .gitignore (thuần text)
        //nó sẽ khác nhau tùy dự án khác nhau tùy vào IDE mình xài, ngôn ngữ lập trình mình xài
        
        //có 1 gã dev cự kì dth đã làm sẵn những file này rồi ứng với IDE, nn lập trình này rồi
        //xin anh ấy đem về https://gitignore.io  
        
        
        //env sẽ là nơi mà cmd tìm tới để thực thi câu lệnh
        //nên để file jar, war lại vì nó chỉ cần server cho chạy, repo chỉ cần lưu source code
        //thu muc chua code da tro thanh kho
        //chỉ chơi kho và kho, cbi đồng bộ, chi khai bao 1 lần
        
        //git config --global user.email hieuthomnghiep@gmail.com
        //git config --global user.name hieuthomnghiep@gmail.com
    }
    
}
