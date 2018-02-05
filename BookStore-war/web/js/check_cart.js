function check_cart_ajax(){     
      $.ajax({
         url : "page/xuly/xuly-cart.php",// gửi ajax đến file result.php
         type : "post",// chọn phương thức gửi là post
         dateType:"text",// dữ liệu trả về dạng text
         data : {       
         nguoinhan : $('#txt_nguoinhan').val(),
         phone:  $('#txt_phone').val(),
         diachi: $('#txt_diachi').val(),
         chucnang: "check"       
    },
      success : function (result){
       $('#loi-add').html(result);
    }
 });
}

function radio_cart_ajax(){     
      $.ajax({
         url : "page/xuly/xuly-cart.php",// gửi ajax đến file result.php
         type : "post",// chọn phương thức gửi là post
         dateType:"text",// dữ liệu trả về dạng text
         data : {       
         rd_phuongthuc : $('input[name="rd-thanhtoan"]:checked').val(),      
         chucnang: "radio_cart"       
    },
      success : function (result){
       $('#radio-cart').html(result);
    }
 });
}

function add_cart_ajax(){     
      $.ajax({
         url : "page/xuly/xuly-cart.php",// gửi ajax đến file result.php
         type : "post",// chọn phương thức gửi là post
         dateType:"text",// dữ liệu trả về dạng text
         data : {       
         nguoinhan : $('#txt_nguoinhan').val(),
         phone:  $('#txt_phone').val(),
         diachi: $('#txt_diachi').val(),
         rd_giaohang : $('input[name="rd-giaohang"]:checked').val(),
         loinhan: $('#txt_loinhan').val(),
         rd_phuongthuc : $('input[name="rd-thanhtoan"]:checked').val(),
         chucnang: "add_cart"       
    },
      success : function (result){
       $('#loi-add').html(result);
    }
 });
}

