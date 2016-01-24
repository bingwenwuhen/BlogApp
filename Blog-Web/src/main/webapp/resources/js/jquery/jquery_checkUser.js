/**
 * Created by Administrator on 2016/1/13.
 */

$(function() {
    /**
     * 检查用户名是否未注册过
     */
    $(".username").blur(function() {
        var paras = {
            username : $(".username").val()
        };
        $.get("/Blog/user/check", paras, function(data) {
            if (data.result == true) {
                $(".username").attr("class", "username-error");
            } else {
                $(".username").attr("class", "username-normal");
            }
        }, 'json');
    });

    /**
     * 检查密码是否相同
     */
    $("#confirmPassword").blur(function() {
        var password = $("input[name = 'password']").val();
        var con = $("#confirmPassword").val();
        if(password != con) {
            $("#confirmPassword").attr("class", "username-error");
        } else {
            $("#confirmPassword").attr("class", "username-normal");
        }
    });

    /**
     * 检查邮箱是否合法
     */
    $("input[name = 'email']").blur(function() {
        var email = $("input[name = 'email']").val();
        var Regex = /^(?:\w+\.?)*\w+@(?:\w+\.)*\w+$/;
        if (!Regex.test(email)) {
            $("input[name = 'email']").attr("class", "username-error");
        } else {
            $("input[name = 'email']").attr("class", "username-normal");
        }
    });
});