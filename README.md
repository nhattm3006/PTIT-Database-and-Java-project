# PTIT-Database-and-Java-project
 Gaming center management application

Author: Tran Minh Nhat - iamabear  
IDE: NetBeans IDE 8.0.2  
MySQL Community Server 8.0.18  

* Thêm tài khoản sử dụng app:
  - Thêm vào trong file app_account_list 
  - Định dạng: <account> <password>
 
* Cài đặt ứng dụng:
  - B1: tải toàn bộ project về
  - B2: cài đặt database:
    + Dữ liệu của database nằm trong file "data gaming center.sql"
  - B3: chỉnh sửa thông tin để ứng dụng có thể nạp dữ liệu từ database
    + Thay đổi thông tin trong file "DataBaseAcc" 
    + Dịnh dạng: <server cài đặt database>;<tên database>;<tên tài khoản truy cập database>;<mật khẩu truy cập database>
  - B4: clean & build
  
* Lấy file JDK để chạy mà không cần build lại:
  - Sau khi build ứng dụng sẽ sinh ra file .jar - có thể chạy luôn trong các lần sau
  - File .jar sẽ được tạo tại đường dẫn: PTIT-Database-and-Java-project/dist/GamingCenter.jar
